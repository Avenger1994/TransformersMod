package fiskfille.tf.common.block;

import static net.minecraftforge.common.util.ForgeDirection.EAST;
import static net.minecraftforge.common.util.ForgeDirection.NORTH;
import static net.minecraftforge.common.util.ForgeDirection.SOUTH;
import static net.minecraftforge.common.util.ForgeDirection.WEST;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import fiskfille.tf.TransformersMod;
import fiskfille.tf.common.tileentity.TileEntityRelayTorch;

public class BlockRelayTorch extends BlockRelayTower
{
    @Override
    public void addCollisionBoxesToList(World world, int x, int y, int z, AxisAlignedBB aabb, List list, Entity entity)
    {
        int metadata = world.getBlockMetadata(x, y, z);
        float f = 0.0625F;
        float width = f * 8;
        float height = f * 4.75F;
        
        for (int i = 0; i < 2; ++i)
        {
            if (metadata == 1)
            {
                addBox(0, 0.5F - width / 2, 0.5F - width / 2, height, 0.5F + width / 2, 0.5F + width / 2, world, x, y, z, aabb, list, entity);
            }
            else if (metadata == 2)
            {
                addBox(1 - height, 0.5F - width / 2, 0.5F - width / 2, 1, 0.5F + width / 2, 0.5F + width / 2, world, x, y, z, aabb, list, entity);
            }
            else if (metadata == 3)
            {
                addBox(0.5F - width / 2, 0.5F - width / 2, 0, 0.5F + width / 2, 0.5F + width / 2, height, world, x, y, z, aabb, list, entity);
            }
            else if (metadata == 4)
            {
                addBox(0.5F - width / 2, 0.5F - width / 2, 1 - height, 0.5F + width / 2, 0.5F + width / 2, 1, world, x, y, z, aabb, list, entity);
            }
            else if (metadata == 5)
            {
                addBox(0.5F - width / 2, 0, 0.5F - width / 2, 0.5F + width / 2, height, 0.5F + width / 2, world, x, y, z, aabb, list, entity);
            }
            else
            {
                addBox(0.5F - width / 2, 1 - height, 0.5F - width / 2, 0.5F + width / 2, 1, 0.5F + width / 2, world, x, y, z, aabb, list, entity);
            }
            
            width = f * 2.25F;
            height = f * 12;
        }

        setBlockBoundsBasedOnState(world, x, y, z);
    }

    @Override
    public void setBounds(int metadata)
    {
        float f = 0.0625F;
        float width = f * 8;
        float height = f * 12;

        if (metadata == 1)
        {
            setBlockBounds(0, 0.5F - width / 2, 0.5F - width / 2, height, 0.5F + width / 2, 0.5F + width / 2);
        }
        else if (metadata == 2)
        {
            setBlockBounds(1 - height, 0.5F - width / 2, 0.5F - width / 2, 1, 0.5F + width / 2, 0.5F + width / 2);
        }
        else if (metadata == 3)
        {
            setBlockBounds(0.5F - width / 2, 0.5F - width / 2, 0, 0.5F + width / 2, 0.5F + width / 2, height);
        }
        else if (metadata == 4)
        {
            setBlockBounds(0.5F - width / 2, 0.5F - width / 2, 1 - height, 0.5F + width / 2, 0.5F + width / 2, 1);
        }
        else if (metadata == 5)
        {
            setBlockBounds(0.5F - width / 2, 0, 0.5F - width / 2, 0.5F + width / 2, height, 0.5F + width / 2);
        }
        else
        {
            setBlockBounds(0.5F - width / 2, 1 - height, 0.5F - width / 2, 0.5F + width / 2, 1, 0.5F + width / 2);
        }
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
    {
        if (!player.isSneaking())
        {
            if (world.getTileEntity(x, y, z) instanceof TileEntityRelayTorch)
            {
                player.openGui(TransformersMod.instance, 5, world, x, y, z);
            }

            return true;
        }

        return false;
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block block)
    {
        func_150108_b(world, x, y, z, block);
    }

    public boolean canPlaceBlockAt(World world, int x, int y, int z)
    {
        return world.isSideSolid(x - 1, y, z, EAST,  true) ||
                world.isSideSolid(x + 1, y, z, WEST,  true) ||
                world.isSideSolid(x, y, z - 1, SOUTH, true) ||
                world.isSideSolid(x, y, z + 1, NORTH, true) ||
                func_150107_m(world, x, y - 1, z) ||
                func_150107_m(world, x, y + 1, z);
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemstack)
    {

    }

    public int onBlockPlaced(World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ, int metadata)
    {
        int j1 = metadata;

        if (side == 0 && func_150107_m(world, x, y + 1, z))
        {
            j1 = 6;
        }

        if (side == 1 && func_150107_m(world, x, y - 1, z))
        {
            j1 = 5;
        }

        if (side == 2 && world.isSideSolid(x, y, z + 1, NORTH, true))
        {
            j1 = 4;
        }

        if (side == 3 && world.isSideSolid(x, y, z - 1, SOUTH, true))
        {
            j1 = 3;
        }

        if (side == 4 && world.isSideSolid(x + 1, y, z, WEST, true))
        {
            j1 = 2;
        }

        if (side == 5 && world.isSideSolid(x - 1, y, z, EAST, true))
        {
            j1 = 1;
        }

        return j1;
    }

    private boolean func_150107_m(World world, int x, int y, int z)
    {
        if (World.doesBlockHaveSolidTopSurface(world, x, y, z))
        {
            return true;
        }
        else
        {
            Block block = world.getBlock(x, y, z);
            return block.canPlaceTorchOnTop(world, x, y, z);
        }
    }

    public void onBlockAdded(World world, int x, int y, int z)
    {
        if (world.getBlockMetadata(x, y, z) == 0)
        {
            if (world.isSideSolid(x - 1, y, z, EAST, true))
            {
                world.setBlockMetadataWithNotify(x, y, z, 1, 2);
            }
            else if (world.isSideSolid(x + 1, y, z, WEST, true))
            {
                world.setBlockMetadataWithNotify(x, y, z, 2, 2);
            }
            else if (world.isSideSolid(x, y, z - 1, SOUTH, true))
            {
                world.setBlockMetadataWithNotify(x, y, z, 3, 2);
            }
            else if (world.isSideSolid(x, y, z + 1, NORTH, true))
            {
                world.setBlockMetadataWithNotify(x, y, z, 4, 2);
            }
            else if (func_150107_m(world, x, y - 1, z))
            {
                world.setBlockMetadataWithNotify(x, y, z, 5, 2);
            }
            else if (func_150107_m(world, x, y + 1, z))
            {
                world.setBlockMetadataWithNotify(x, y, z, 6, 2);
            }
        }

        func_150109_e(world, x, y, z);
    }

    protected boolean func_150108_b(World world, int x, int y, int z, Block block)
    {
        if (func_150109_e(world, x, y, z))
        {
            int l = world.getBlockMetadata(x, y, z);
            boolean flag = false;

            if (!world.isSideSolid(x - 1, y, z, EAST, true) && l == 1)
            {
                flag = true;
            }

            if (!world.isSideSolid(x + 1, y, z, WEST, true) && l == 2)
            {
                flag = true;
            }

            if (!world.isSideSolid(x, y, z - 1, SOUTH, true) && l == 3)
            {
                flag = true;
            }

            if (!world.isSideSolid(x, y, z + 1, NORTH, true) && l == 4)
            {
                flag = true;
            }

            if (!func_150107_m(world, x, y - 1, z) && l == 5)
            {
                flag = true;
            }

            if (!func_150107_m(world, x, y + 1, z) && l == 6)
            {
                flag = true;
            }

            if (flag)
            {
                dropBlockAsItem(world, x, y, z, world.getBlockMetadata(x, y, z), 0);
                world.setBlockToAir(x, y, z);
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return true;
        }
    }

    protected boolean func_150109_e(World world, int x, int y, int z)
    {
        if (!canPlaceBlockAt(world, x, y, z))
        {
            if (world.getBlock(x, y, z) == this)
            {
                dropBlockAsItem(world, x, y, z, world.getBlockMetadata(x, y, z), 0);
                world.setBlockToAir(x, y, z);
            }

            return false;
        }
        else
        {
            return true;
        }
    }

    @Override
    public TileEntity createNewTileEntity(World world, int metadata)
    {
        return new TileEntityRelayTorch();
    }
}