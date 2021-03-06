package fiskfille.tf.client.gui;

import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fiskfille.tf.TransformersAPI;
import fiskfille.tf.TransformersMod;
import fiskfille.tf.common.container.ContainerDisplayStation;
import fiskfille.tf.common.item.TFItems;
import fiskfille.tf.common.network.MessageTransformDisplayStation;
import fiskfille.tf.common.network.base.TFNetworkManager;
import fiskfille.tf.common.tileentity.TileEntityDisplayStation;

@SideOnly(Side.CLIENT)
public class GuiDisplayStation extends GuiContainer
{
    private static final ResourceLocation guiTextures = new ResourceLocation(TransformersMod.modid, "textures/gui/container/display_station.png");
    private TileEntityDisplayStation tileentity;
    
    public void initGui()
    {
        super.initGui();
        buttonList.add(new GuiButton(0, width / 2 - 18, height / 2 - 28, 70, 20, StatCollector.translateToLocal("gui.display_station.transform")));
    }

    public GuiDisplayStation(InventoryPlayer inventoryPlayer, TileEntityDisplayStation tile)
    {
        super(new ContainerDisplayStation(inventoryPlayer, tile));
        tileentity = tile;
        ySize = 186;
    }
    
    protected void actionPerformed(GuiButton button)
    {
        int id = button.id;
        
        if (id == 0)
        {
            TFNetworkManager.networkWrapper.sendToServer(new MessageTransformDisplayStation(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord));
            TFNetworkManager.networkWrapper.sendToAll(new MessageTransformDisplayStation(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord));
        }
    }

    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
    {
        String s = tileentity.hasCustomInventoryName() ? tileentity.getInventoryName() : I18n.format(tileentity.getInventoryName(), new Object[0]);
        fontRendererObj.drawString(s, xSize / 2 - fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
        fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8, ySize - 94, 4210752);
        
        if (tileentity.getStackInSlot(4) == null)
        {
            int i = mc.thePlayer.ticksExisted / 20;
            ItemStack itemstack = new ItemStack(TFItems.displayVehicle, 1, i % TransformersAPI.getTransformers().size());
            
            RenderItem itemRenderer = new RenderItem();
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glEnable(GL12.GL_RESCALE_NORMAL);
            GL11.glEnable(GL11.GL_COLOR_MATERIAL);
            GL11.glEnable(GL11.GL_LIGHTING);
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            GL11.glColor4f(0, 0, 0, 0.5F);
            itemRenderer.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.getTextureManager(), itemstack, 111, 45);
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glDepthMask(true);
            GL11.glEnable(GL11.GL_DEPTH_TEST);
        }
    }

    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.getTextureManager().bindTexture(guiTextures);
        int k = (width - xSize) / 2;
        int l = (height - ySize) / 2;
        drawTexturedModalRect(k, l, 0, 0, xSize, ySize);
    }
}
