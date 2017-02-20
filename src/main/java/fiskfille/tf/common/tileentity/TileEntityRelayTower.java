package fiskfille.tf.common.tileentity;

import java.util.Set;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Vec3;
import net.minecraftforge.common.ForgeChunkManager.Ticket;
import net.minecraftforge.common.util.Constants.NBT;
import fiskfille.tf.common.chunk.ForcedChunk;
import fiskfille.tf.common.chunk.SubTicket;
import fiskfille.tf.common.chunk.TFChunkManager;
import fiskfille.tf.common.data.tile.TileData;
import fiskfille.tf.common.data.tile.TileDataRelay;
import fiskfille.tf.common.energon.power.EnergyStorage;
import fiskfille.tf.common.energon.power.EnergyStorageRelay;
import fiskfille.tf.common.energon.power.IEnergyReceiver;
import fiskfille.tf.common.energon.power.IEnergyTransmitter;
import fiskfille.tf.common.energon.power.ReceiverEntry;
import fiskfille.tf.common.energon.power.ReceiverHandler;
import fiskfille.tf.common.energon.power.TransmissionHandler;
import fiskfille.tf.common.item.ItemCSD.DimensionalCoords;
import fiskfille.tf.helper.TFEnergyHelper;
import fiskfille.tf.helper.TFTileHelper;

public class TileEntityRelayTower extends TileEntityTF implements IEnergyTransmitter, IEnergyReceiver, IChunkLoaderTile, IMultiTile
{
    public ReceiverHandler receiverHandler = new ReceiverHandler(this);
    public TileDataRelay data = new TileDataRelay();

    public EnergyStorage storage = new EnergyStorageRelay(this);

    public int animationTimer;

    public Ticket chunkTicket;

    @Override
    public void updateEntity()
    {
        ++animationTimer;

        if (!data.isInitialized())
        {
            data.initialize(this);
        }

        if (isValid(getBlockMetadata()))
        {
            if (!worldObj.isRemote)
            {
                if (chunkTicket == null)
                {
                    Ticket ticket = TFChunkManager.getTicketForChunk(ForcedChunk.fromTile(this));

                    if (ticket != null)
                    {
                        SubTicket subTicket = SubTicket.fromTile(this);
                        forceChunks(subTicket.assign(ticket));
                    }
                }

                data.serverTickPre();
                data.isPowered = TFEnergyHelper.canPowerChainReach(this);
                data.serverTick();
            }

            TileData prevData = TFTileHelper.getTileData(new DimensionalCoords(this));

            if (prevData instanceof TileDataRelay)
            {
                data = new TileDataRelay((TileDataRelay) prevData);
            }
        }
    }

    public boolean isValid(int metadata)
    {
        return metadata < 4;
    }

    @Override
    public AxisAlignedBB getRenderBoundingBox()
    {
        AxisAlignedBB bounds = AxisAlignedBB.getBoundingBox(xCoord, yCoord, zCoord, xCoord + 1, yCoord + 1, zCoord + 1).addCoord(0, 1.25F, 0);

        if (isValid(getBlockMetadata()))
        {
            Set<ReceiverEntry> receivers = data.transmissionHandler.getReceivers();

            for (ReceiverEntry entry : receivers)
            {
                TileEntity tile = entry.getTile();

                if (tile != null)
                {
                    bounds = bounds.func_111270_a(tile.getRenderBoundingBox());
                }
            }
        }

        return bounds;
    }

    @Override
    public void readCustomNBT(NBTTagCompound nbt)
    {
        if (nbt.getBoolean("Base"))
        {
            if (nbt.hasKey("ConfigDataTF", NBT.TAG_COMPOUND))
            {
                NBTTagCompound config = nbt.getCompoundTag("ConfigDataTF");
                data.transmissionHandler.readFromNBT(config);
            }
        }
    }

    @Override
    public void writeCustomNBT(NBTTagCompound nbt)
    {
        boolean base = isValid(getBlockMetadata());
        nbt.setBoolean("Base", base);

        if (base)
        {
            if (!data.transmissionHandler.getReceivers().isEmpty())
            {
                NBTTagCompound config = new NBTTagCompound();
                data.transmissionHandler.writeToNBT(config);
                nbt.setTag("ConfigDataTF", config);
            }
        }
    }

    @Override
    public ReceiverHandler getReceiverHandler()
    {
        return receiverHandler;
    }

    @Override
    public TransmissionHandler getTransmissionHandler()
    {
        return data.transmissionHandler;
    }

    @Override
    public float getTransmissionRate()
    {
        return 350;
    }

    @Override
    public float getRange()
    {
        return 15;
    }

    @Override
    public boolean canReceiveEnergy(TileEntity from)
    {
        return isValid(getBlockMetadata());
    }

    @Override
    public Vec3 getEnergyOutputOffset()
    {
        return getEnergyInputOffset();
    }

    @Override
    public Vec3 getEnergyInputOffset()
    {
        return Vec3.createVectorHelper(0, 1.5F, 0);
    }

    @Override
    public int getMapColor()
    {
        return 0x0077CC;
    }

    @Override
    public float receiveEnergy(float amount, boolean simulate)
    {
        return storage.add(amount, simulate);
    }

    @Override
    public float extractEnergy(float amount, boolean simulate)
    {
        return storage.remove(amount, simulate);
    }

    @Override
    public float getEnergy()
    {
        return storage.getEnergy();
    }

    @Override
    public float getMaxEnergy()
    {
        return storage.getMaxEnergy();
    }

    @Override
    public float setEnergy(float energy)
    {
        return storage.set(energy);
    }

    @Override
    public float getEnergyUsage()
    {
        return storage.getUsage();
    }

    @Override
    public void setEnergyUsage(float usage)
    {
        storage.setUsage(usage);
    }

    @Override
    public void invalidate()
    {
        super.invalidate();

        if (!worldObj.isRemote)
        {
            data.kill();
            releaseChunks();
        }
    }

    @Override
    public void forceChunks(SubTicket subTicket)
    {
        releaseChunks();
        chunkTicket = subTicket.owner;
        TFChunkManager.forceChunk(subTicket.owner, ForcedChunk.fromTile(this));
    }

    public void releaseChunks()
    {
        if (chunkTicket != null)
        {
            TFChunkManager.releaseChunk(SubTicket.fromTile(chunkTicket, this), ForcedChunk.fromTile(this));
            chunkTicket = null;
        }
    }

    @Override
    public int[] getBaseOffsets(int metadata)
    {
        return new int[] {0, -metadata / 4, 0};
    }
}
