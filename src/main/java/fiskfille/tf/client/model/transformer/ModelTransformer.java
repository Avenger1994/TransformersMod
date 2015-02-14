package fiskfille.tf.client.model.transformer;

import fiskfille.tf.client.model.player.ModelPlayerTF;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelTransformer
{
	public static class Base extends ModelBase
	{
		public float pi = (float)Math.PI;
		
		protected void addChildTo(ModelRenderer child, ModelRenderer parent)
		{
			child.rotationPointX -= parent.rotationPointX;
			child.rotationPointY -= parent.rotationPointY;
			child.rotationPointZ -= parent.rotationPointZ;

			child.rotateAngleX -= parent.rotateAngleX;
			child.rotateAngleY -= parent.rotateAngleY;
			child.rotateAngleZ -= parent.rotateAngleZ;
			parent.addChild(child);
		}
		
		protected void addChildToWithoutPoint(ModelRenderer child, ModelRenderer parent)
		{
			child.rotateAngleX -= parent.rotateAngleX;
			child.rotateAngleY -= parent.rotateAngleY;
			child.rotateAngleZ -= parent.rotateAngleZ;
			parent.addChild(child);
		}
	}
	
	public static class Biped extends ModelPlayerTF
	{
		public float pi = (float)Math.PI;
		
		protected void addChildTo(ModelRenderer child, ModelRenderer parent)
		{
			child.rotationPointX -= parent.rotationPointX;
			child.rotationPointY -= parent.rotationPointY;
			child.rotationPointZ -= parent.rotationPointZ;

			child.rotateAngleX -= parent.rotateAngleX;
			child.rotateAngleY -= parent.rotateAngleY;
			child.rotateAngleZ -= parent.rotateAngleZ;
			parent.addChild(child);
		}
		
		protected void addChildToWithoutPoint(ModelRenderer child, ModelRenderer parent)
		{
			child.rotateAngleX -= parent.rotateAngleX;
			child.rotateAngleY -= parent.rotateAngleY;
			child.rotateAngleZ -= parent.rotateAngleZ;
			parent.addChild(child);
		}
	}
}