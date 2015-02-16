package fiskfille.tf.common.packet.base;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

public abstract class AbstractPacket<REQ extends AbstractPacket> implements IMessage, IMessageHandler<REQ, IMessage>
{
    public IMessage onMessage(REQ message, MessageContext ctx)
    {
        if (ctx.side.isClient()) handleClientSide(message, Minecraft.getMinecraft().thePlayer);
        else handleServerSide(message, ctx.getServerHandler().playerEntity);
        return null;
    }

    public abstract void handleClientSide(REQ message, EntityPlayer player);

    public abstract void handleServerSide(REQ message, EntityPlayer player);
}
