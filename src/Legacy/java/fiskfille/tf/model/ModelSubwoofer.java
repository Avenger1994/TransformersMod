package fiskfille.tf.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import fiskfille.tf.data.TFPlayerData;

public class ModelSubwoofer extends ModelChildBase.Biped
{
	ModelRenderer head;
	ModelRenderer helmetPiece1;
	ModelRenderer helmetPiece2;
	ModelRenderer helmetEar1;
	ModelRenderer helmetEar2;
	ModelRenderer helmet;
	ModelRenderer waist;
	ModelRenderer chestPanel1;
	ModelRenderer chestPanel2;
	ModelRenderer chestPanel3;
	ModelRenderer chestPanel4;
	ModelRenderer chestPanel5;
	ModelRenderer hipSlab1;
	ModelRenderer hipSlab2;
	ModelRenderer bumper1;
	ModelRenderer bumper2;
	ModelRenderer upperBumper1;
	ModelRenderer middleBumper1;
	ModelRenderer upperBumper2;
	ModelRenderer middleBumper2;
	ModelRenderer chest;
	ModelRenderer stomach;
	ModelRenderer leg1;
	ModelRenderer upperLegSlab1;
	ModelRenderer upperLegPanel1;
	ModelRenderer lowerLegPanel1;
	ModelRenderer foot1;
	ModelRenderer backWheel1;
	ModelRenderer leg2;
	ModelRenderer upperLegSlab2;
	ModelRenderer upperLegPanel2;
	ModelRenderer lowerLegPanel2;
	ModelRenderer foot2;
	ModelRenderer backWheel2;
	ModelRenderer upperArm1;
	ModelRenderer lowerArm1;
	ModelRenderer lowerArmPanel1;
	ModelRenderer shoulder1;
	ModelRenderer frontWheel1;
	ModelRenderer upperArm2;
	ModelRenderer lowerArm2;
	ModelRenderer lowerArmPanel2;
	ModelRenderer shoulder2;
	ModelRenderer frontWheel2;

	ModelRenderer vehichleBody;
	ModelRenderer vehichleFrontWheel1;
	ModelRenderer vehichleFrontWheel2;
	ModelRenderer vehichleBackWheel1;
	ModelRenderer vehichleBackWheel2;
	ModelRenderer vehichleRoof;
	ModelRenderer vehichleBackWindShield;
	ModelRenderer vehichleWindShield;
	ModelRenderer vehichleDoor1;
	ModelRenderer vehichleDoor2;
	ModelRenderer vehichleBumper1;
	ModelRenderer vehichleBumper2;
	ModelRenderer vehichleUpperBumper1;
	ModelRenderer vehichleUpperBumper2;
	ModelRenderer vehichleMiddleBumper;
	ModelRenderer vehichleTrunk;
	ModelRenderer vehichleHood;

	public ModelSubwoofer()
	{
		textureWidth = 64;
		textureHeight = 128;

		bipedBody = new ModelRenderer(this, 1000, 1000);
		bipedHead = new ModelRenderer(this, 1000, 1000);
		bipedHeadwear = new ModelRenderer(this, 1000, 1000);
		bipedRightLeg = new ModelRenderer(this, 1000, 1000);
		bipedLeftLeg = new ModelRenderer(this, 1000, 1000);
		bipedRightArm = new ModelRenderer(this, 1000, 1000);
		bipedLeftArm = new ModelRenderer(this, 1000, 1000);

		head = new ModelRenderer(this, 0, 0);
		head.addBox(-1.5F, -3F, -1.5F, 3, 3, 3);
		head.setRotationPoint(0F, 0F, -0.5F);
		head.setTextureSize(64, 128);
		head.mirror = true;
		setRotation(head, 0F, 0F, 0F);
		helmetPiece1 = new ModelRenderer(this, 6, 6);
		helmetPiece1.addBox(-0.5F, -0.5F, -3F, 1, 1, 3);
		helmetPiece1.setRotationPoint(-1.7F, -1.3F, 0.5F);
		helmetPiece1.setTextureSize(64, 128);
		helmetPiece1.mirror = true;
		setRotation(helmetPiece1, 0.2443461F, -0.0872665F, 0F);
		helmetPiece2 = new ModelRenderer(this, 6, 6);
		helmetPiece2.mirror = true;
		helmetPiece2.addBox(-0.5F, -0.5F, -3F, 1, 1, 3);
		helmetPiece2.setRotationPoint(1.7F, -1.3F, 0.5F);
		helmetPiece2.setTextureSize(64, 128);
		helmetPiece2.mirror = true;
		setRotation(helmetPiece2, 0.2443461F, 0.0872665F, 0F);
		helmetEar1 = new ModelRenderer(this, 0, 6);
		helmetEar1.addBox(-0.5F, -3F, -1F, 1, 3, 2);
		helmetEar1.setRotationPoint(-1.7F, -1.5F, -0.5F);
		helmetEar1.setTextureSize(64, 128);
		helmetEar1.mirror = true;
		setRotation(helmetEar1, 0.2443461F, 0F, 0.1745329F);
		helmetEar2 = new ModelRenderer(this, 0, 6);
		helmetEar2.addBox(-0.5F, -3F, -1F, 1, 3, 2);
		helmetEar2.setRotationPoint(1.7F, -1.5F, -0.5F);
		helmetEar2.setTextureSize(64, 128);
		helmetEar2.mirror = true;
		setRotation(helmetEar2, 0.2443461F, 0F, -0.1745329F);
		helmet = new ModelRenderer(this, 12, 0);
		helmet.addBox(-1.5F, -3F, -1.5F, 3, 3, 3);
		helmet.setRotationPoint(0F, -0.8F, 0F);
		helmet.setTextureSize(64, 128);
		helmet.mirror = true;
		setRotation(helmet, 0.2443461F, 0F, 0F);
		waist = new ModelRenderer(this, 0, 27);
		waist.addBox(-3F, -3F, -1.5F, 6, 3, 3);
		waist.setRotationPoint(0F, 12F, 0F);
		waist.setTextureSize(64, 128);
		waist.mirror = true;
		setRotation(waist, 0F, 0F, 0F);
		chestPanel1 = new ModelRenderer(this, 16, 24);
		chestPanel1.addBox(-1F, -4F, -1F, 2, 4, 1);
		chestPanel1.setRotationPoint(-1F, 6.5F, -1F);
		chestPanel1.setTextureSize(64, 128);
		chestPanel1.mirror = true;
		setRotation(chestPanel1, 0.2792527F, 0.2792527F, -0.4537856F);
		chestPanel2 = new ModelRenderer(this, 16, 24);
		chestPanel2.addBox(-1F, -4F, -1F, 2, 4, 1);
		chestPanel2.setRotationPoint(1F, 6.5F, -1F);
		chestPanel2.setTextureSize(64, 128);
		chestPanel2.mirror = true;
		setRotation(chestPanel2, 0.2792527F, -0.2792527F, 0.4537856F);
		chestPanel3 = new ModelRenderer(this, 22, 20);
		chestPanel3.addBox(-1F, -3F, -1F, 2, 3, 1);
		chestPanel3.setRotationPoint(0F, 6.1F, -0.9F);
		chestPanel3.setTextureSize(64, 128);
		chestPanel3.mirror = true;
		setRotation(chestPanel3, 0.2443461F, 0F, 0F);
		chestPanel4 = new ModelRenderer(this, 16, 20);
		chestPanel4.addBox(-1F, -3F, -1F, 2, 3, 1);
		chestPanel4.setRotationPoint(0F, 3.5F, -1.6F);
		chestPanel4.setTextureSize(64, 128);
		chestPanel4.mirror = true;
		setRotation(chestPanel4, 0F, 0F, 0F);
		chestPanel5 = new ModelRenderer(this, 11, 33);
		chestPanel5.addBox(-1F, -3F, -1F, 2, 3, 1);
		chestPanel5.setRotationPoint(0F, 9.2F, -0.8F);
		chestPanel5.setTextureSize(64, 128);
		chestPanel5.mirror = true;
		setRotation(chestPanel5, 0.0872665F, 0F, 0F);
		hipSlab1 = new ModelRenderer(this, 0, 45);
		hipSlab1.addBox(-4F, -0.5F, -2F, 4, 1, 4);
		hipSlab1.setRotationPoint(0.2F, 12.5F, 0F);
		hipSlab1.setTextureSize(64, 128);
		hipSlab1.mirror = true;
		setRotation(hipSlab1, 0F, 0F, 0.6981317F);
		hipSlab2 = new ModelRenderer(this, 0, 45);
		hipSlab2.addBox(0F, -0.5F, -2F, 4, 1, 4);
		hipSlab2.setRotationPoint(-0.2F, 12.5F, 0F);
		hipSlab2.setTextureSize(64, 128);
		hipSlab2.mirror = true;
		setRotation(hipSlab2, 0F, 0F, -0.6981317F);
		bumper1 = new ModelRenderer(this, 8, 42);
		bumper1.addBox(-3F, -0.5F, -1F, 3, 1, 2);
		bumper1.setRotationPoint(-1F, 2.5F, -1.8F);
		bumper1.setTextureSize(64, 128);
		bumper1.mirror = true;
		setRotation(bumper1, 0F, 0.1745329F, 0.2617994F);
		bumper2 = new ModelRenderer(this, 8, 42);
		bumper2.mirror = true;
		bumper2.addBox(0F, -0.5F, -1F, 3, 1, 2);
		bumper2.setRotationPoint(1F, 2.5F, -1.8F);
		bumper2.setTextureSize(64, 128);
		bumper2.mirror = true;
		setRotation(bumper2, 0F, -0.1745329F, -0.2617994F);
		upperBumper1 = new ModelRenderer(this, 8, 39);
		upperBumper1.addBox(-2F, -0.5F, -1F, 2, 1, 2);
		upperBumper1.setRotationPoint(-2F, 1F, -1.8F);
		upperBumper1.setTextureSize(64, 128);
		upperBumper1.mirror = true;
		setRotation(upperBumper1, 0F, 0.1745329F, 0.0872665F);
		middleBumper1 = new ModelRenderer(this, 16, 35);
		middleBumper1.addBox(-0.5F, -0.5F, -1F, 1, 1, 2);
		middleBumper1.setRotationPoint(-1.8F, 1.3F, -1.8F);
		middleBumper1.setTextureSize(64, 128);
		middleBumper1.mirror = true;
		setRotation(middleBumper1, 0F, 0F, 0.1919862F);
		upperBumper2 = new ModelRenderer(this, 8, 39);
		upperBumper2.mirror = true;
		upperBumper2.addBox(0F, -0.5F, -1F, 2, 1, 2);
		upperBumper2.setRotationPoint(2F, 1F, -1.8F);
		upperBumper2.setTextureSize(64, 128);
		upperBumper2.mirror = true;
		setRotation(upperBumper2, 0F, -0.1745329F, -0.0872665F);
		middleBumper2 = new ModelRenderer(this, 16, 35);
		middleBumper2.mirror = true;
		middleBumper2.addBox(-0.5F, -0.5F, -1F, 1, 1, 2);
		middleBumper2.setRotationPoint(1.8F, 1.3F, -1.8F);
		middleBumper2.setTextureSize(64, 128);
		middleBumper2.mirror = true;
		setRotation(middleBumper2, 0F, 0F, -0.1919862F);
		chest = new ModelRenderer(this, 0, 11);
		chest.addBox(-4F, -5F, -2F, 8, 5, 4);
		chest.setRotationPoint(0F, 5F, 0F);
		chest.setTextureSize(64, 128);
		chest.mirror = true;
		setRotation(chest, 0F, 0F, 0F);
		stomach = new ModelRenderer(this, 0, 20);
		stomach.addBox(-2.5F, -4F, -1.5F, 5, 4, 3);
		stomach.setRotationPoint(0F, 9F, 0F);
		stomach.setTextureSize(64, 128);
		stomach.mirror = true;
		setRotation(stomach, 0F, 0F, 0F);
		leg1 = new ModelRenderer(this, 28, 20);
		leg1.addBox(-1F, -12F, -1.5F, 2, 12, 3);
		leg1.setRotationPoint(-2.5F, 24F, 0F);
		leg1.setTextureSize(64, 128);
		leg1.mirror = true;
		setRotation(leg1, 0F, 0F, 0.0523599F);
		upperLegSlab1 = new ModelRenderer(this, 22, 34);
		upperLegSlab1.addBox(-1F, -3F, -1F, 1, 4, 2);
		upperLegSlab1.setRotationPoint(-2.3F, 15.5F, -1F);
		upperLegSlab1.setTextureSize(64, 128);
		upperLegSlab1.mirror = true;
		setRotation(upperLegSlab1, 0F, 0.2617994F, 0.0698132F);
		upperLegPanel1 = new ModelRenderer(this, 20, 27);
		upperLegPanel1.addBox(-1.5F, -3F, -2F, 2, 5, 2);
		upperLegPanel1.setRotationPoint(-1.1F, 15.5F, 0F);
		upperLegPanel1.setTextureSize(64, 128);
		upperLegPanel1.mirror = true;
		setRotation(upperLegPanel1, 0F, 0F, 0.0698132F);
		lowerLegPanel1 = new ModelRenderer(this, 0, 39);
		lowerLegPanel1.addBox(-1.5F, -4F, -1F, 3, 5, 1);
		lowerLegPanel1.setRotationPoint(-2.4F, 21F, -1F);
		lowerLegPanel1.setTextureSize(64, 128);
		lowerLegPanel1.mirror = true;
		setRotation(lowerLegPanel1, 0.1919862F, 0.1919862F, 0.0698132F);
		foot1 = new ModelRenderer(this, 0, 33);
		foot1.addBox(-1.5F, -1F, -4F, 3, 1, 5);
		foot1.setRotationPoint(-2.5F, 23F, 0.5F);
		foot1.setTextureSize(64, 128);
		foot1.mirror = true;
		setRotation(foot1, 0.2617994F, 0.0872665F, 0F);
		backWheel1 = new ModelRenderer(this, 44, 11);
		backWheel1.addBox(-1F, -1F, -1F, 1, 2, 2);
		backWheel1.setRotationPoint(-3F, 17F, 0F);
		backWheel1.setTextureSize(64, 128);
		backWheel1.mirror = true;
		setRotation(backWheel1, 0.1047198F, 0F, 0.0523599F);
		leg2 = new ModelRenderer(this, 28, 20);
		leg2.addBox(-1F, -12F, -1.5F, 2, 12, 3);
		leg2.setRotationPoint(2.5F, 24F, 0F);
		leg2.setTextureSize(64, 128);
		leg2.mirror = true;
		setRotation(leg2, 0F, 0F, -0.0523599F);
		upperLegSlab2 = new ModelRenderer(this, 22, 34);
		upperLegSlab2.addBox(0F, -3F, -1F, 1, 4, 2);
		upperLegSlab2.setRotationPoint(2.3F, 15.5F, -1F);
		upperLegSlab2.setTextureSize(64, 128);
		upperLegSlab2.mirror = true;
		setRotation(upperLegSlab2, 0F, -0.2617994F, -0.0698132F);
		upperLegPanel2 = new ModelRenderer(this, 20, 27);
		upperLegPanel2.addBox(-0.5F, -3F, -2F, 2, 5, 2);
		upperLegPanel2.setRotationPoint(1.1F, 15.5F, 0F);
		upperLegPanel2.setTextureSize(64, 128);
		upperLegPanel2.mirror = true;
		setRotation(upperLegPanel2, 0F, 0F, -0.0698132F);
		lowerLegPanel2 = new ModelRenderer(this, 0, 39);
		lowerLegPanel2.addBox(-1.5F, -4F, -1F, 3, 5, 1);
		lowerLegPanel2.setRotationPoint(2.4F, 21F, -1F);
		lowerLegPanel2.setTextureSize(64, 128);
		lowerLegPanel2.mirror = true;
		setRotation(lowerLegPanel2, 0.1919862F, -0.1919862F, -0.0698132F);
		foot2 = new ModelRenderer(this, 0, 33);
		foot2.addBox(-1.5F, -1F, -4F, 3, 1, 5);
		foot2.setRotationPoint(2.5F, 23F, 0.5F);
		foot2.setTextureSize(64, 128);
		foot2.mirror = true;
		setRotation(foot2, 0.2617994F, -0.0872665F, 0F);
		backWheel2 = new ModelRenderer(this, 44, 11);
		backWheel2.addBox(0F, -1F, -1F, 1, 2, 2);
		backWheel2.setRotationPoint(3F, 17F, 0F);
		backWheel2.setTextureSize(64, 128);
		backWheel2.mirror = true;
		setRotation(backWheel2, 0.1047198F, 0F, -0.0523599F);
		upperArm1 = new ModelRenderer(this, 24, 12);
		upperArm1.addBox(-2.5F, -1F, -1.5F, 3, 5, 3);
		upperArm1.setRotationPoint(-4F, 2F, 0F);
		upperArm1.setTextureSize(64, 128);
		upperArm1.mirror = true;
		setRotation(upperArm1, 0.0872665F, 0F, 0.2094395F);
		lowerArm1 = new ModelRenderer(this, 36, 11);
		lowerArm1.addBox(-1F, -0.2F, -1F, 2, 7, 2);
		lowerArm1.setRotationPoint(-5.8F, 5.2F, 0.5F);
		lowerArm1.setTextureSize(64, 128);
		lowerArm1.mirror = true;
		setRotation(lowerArm1, -0.2443461F, 0F, 0.1396263F);
		lowerArmPanel1 = new ModelRenderer(this, 38, 20);
		lowerArmPanel1.addBox(-1F, -2F, -1.5F, 1, 4, 3);
		lowerArmPanel1.setRotationPoint(-7F, 8.5F, -0.3F);
		lowerArmPanel1.setTextureSize(64, 128);
		lowerArmPanel1.mirror = true;
		setRotation(lowerArmPanel1, -0.2617994F, 0F, 0.0872665F);
		shoulder1 = new ModelRenderer(this, 44, 15);
		shoulder1.addBox(-0.5F, -3F, -1F, 1, 3, 2);
		shoulder1.setRotationPoint(-4.5F, 1.2F, 0F);
		shoulder1.setTextureSize(64, 128);
		shoulder1.mirror = true;
		setRotation(shoulder1, 0F, 0F, 0.1396263F);
		frontWheel1 = new ModelRenderer(this, 44, 11);
		frontWheel1.addBox(-0.5F, -1F, -1F, 1, 2, 2);
		frontWheel1.setRotationPoint(-5.2F, -0.4F, 0F);
		frontWheel1.setTextureSize(64, 128);
		frontWheel1.mirror = true;
		setRotation(frontWheel1, 0.1047198F, 0F, 0.1396263F);
		upperArm2 = new ModelRenderer(this, 24, 12);
		upperArm2.addBox(-0.5F, -1F, -1.5F, 3, 5, 3);
		upperArm2.setRotationPoint(4F, 2F, 0F);
		upperArm2.setTextureSize(64, 128);
		upperArm2.mirror = true;
		setRotation(upperArm2, 0.0872665F, 0F, -0.2094395F);
		lowerArm2 = new ModelRenderer(this, 36, 11);
		lowerArm2.addBox(-1F, -0.2F, -1F, 2, 7, 2);
		lowerArm2.setRotationPoint(5.8F, 5.2F, 0.5F);
		lowerArm2.setTextureSize(64, 128);
		lowerArm2.mirror = true;
		setRotation(lowerArm2, -0.2443461F, 0F, -0.1396263F);
		lowerArmPanel2 = new ModelRenderer(this, 38, 20);
		lowerArmPanel2.addBox(0F, -2F, -1.5F, 1, 4, 3);
		lowerArmPanel2.setRotationPoint(7F, 8.5F, -0.3F);
		lowerArmPanel2.setTextureSize(64, 128);
		lowerArmPanel2.mirror = true;
		setRotation(lowerArmPanel2, -0.2617994F, 0F, -0.0872665F);
		shoulder2 = new ModelRenderer(this, 44, 15);
		shoulder2.addBox(-0.5F, -3F, -1F, 1, 3, 2);
		shoulder2.setRotationPoint(4.5F, 1.2F, 0F);
		shoulder2.setTextureSize(64, 128);
		shoulder2.mirror = true;
		setRotation(shoulder2, 0F, 0F, -0.1396263F);
		frontWheel2 = new ModelRenderer(this, 44, 11);
		frontWheel2.addBox(-0.5F, -1F, -1F, 1, 2, 2);
		frontWheel2.setRotationPoint(5.2F, -0.4F, 0F);
		frontWheel2.setTextureSize(64, 128);
		frontWheel2.mirror = true;
		setRotation(frontWheel2, 0.1047198F, 0F, -0.1396263F);


		this.addChildTo(waist, bipedBody);
		this.addChildTo(hipSlab1, waist);
		this.addChildTo(hipSlab2, waist);
		this.addChildTo(stomach, waist);
		this.addChildTo(chest, stomach);
		this.addChildTo(chestPanel1, chest);
		this.addChildTo(chestPanel2, chest);
		this.addChildTo(chestPanel3, chest);
		this.addChildTo(chestPanel4, chest);
		this.addChildTo(chestPanel5, stomach);
		this.addChildTo(bumper1, chest);
		this.addChildTo(bumper2, chest);
		this.addChildTo(upperBumper1, chest);
		this.addChildTo(upperBumper2, chest);
		this.addChildTo(middleBumper1, chest);
		this.addChildTo(middleBumper2, chest);
		this.addChildTo(leg1, bipedRightLeg);
		this.addChildTo(upperLegSlab1, leg1);
		this.addChildTo(upperLegPanel1, leg1);
		this.addChildTo(lowerLegPanel1, leg1);
		this.addChildTo(foot1, leg1);
		this.addChildTo(backWheel1, leg1);
		this.addChildTo(leg2, bipedLeftLeg);
		this.addChildTo(upperLegSlab2, leg2);
		this.addChildTo(upperLegPanel2, leg2);
		this.addChildTo(lowerLegPanel2, leg2);
		this.addChildTo(foot2, leg2);
		this.addChildTo(backWheel2, leg2);
		this.addChildTo(upperArm1, bipedRightArm);
		this.addChildTo(lowerArm1, upperArm1);
		this.addChildTo(lowerArmPanel1, lowerArm1);
		this.addChildTo(shoulder1, upperArm1);
		this.addChildTo(frontWheel1, shoulder1);
		this.addChildTo(upperArm2, bipedLeftArm);
		this.addChildTo(lowerArm2, upperArm2);
		this.addChildTo(lowerArmPanel2, lowerArm2);
		this.addChildTo(shoulder2, upperArm2);
		this.addChildTo(frontWheel2, shoulder2);
		this.addChildTo(head, bipedHead);
		this.addChildTo(helmet, bipedHead);
		this.addChildTo(helmetPiece1, bipedHead);
		this.addChildTo(helmetPiece2, bipedHead);
		this.addChildTo(helmetEar1, bipedHead);
		this.addChildTo(helmetEar2, bipedHead);


		vehichleBody = new ModelRenderer(this, 0, 64);
		vehichleBody.addBox(-3F, -1F, -2F, 6, 2, 12);
		vehichleBody.setRotationPoint(0F, 22.5F, -4.2F);
		vehichleBody.setTextureSize(64, 128);
		vehichleBody.mirror = true;
		setRotation(vehichleBody, 0F, 0F, 0F);
		vehichleFrontWheel1 = new ModelRenderer(this, 0, 64);
		vehichleFrontWheel1.addBox(-1F, -1F, -1F, 1, 2, 2);
		vehichleFrontWheel1.setRotationPoint(-2.3F, 23F, -4.5F);
		vehichleFrontWheel1.setTextureSize(64, 128);
		vehichleFrontWheel1.mirror = true;
		setRotation(vehichleFrontWheel1, 0F, 0F, 0F);
		vehichleFrontWheel2 = new ModelRenderer(this, 0, 64);
		vehichleFrontWheel2.addBox(0F, -1F, -1F, 1, 2, 2);
		vehichleFrontWheel2.setRotationPoint(2.3F, 23F, -4.5F);
		vehichleFrontWheel2.setTextureSize(64, 128);
		vehichleFrontWheel2.mirror = true;
		setRotation(vehichleFrontWheel2, 0F, 0F, 0F);
		vehichleBackWheel1 = new ModelRenderer(this, 0, 64);
		vehichleBackWheel1.addBox(-1F, -1F, -1F, 1, 2, 2);
		vehichleBackWheel1.setRotationPoint(-2.3F, 23F, 4F);
		vehichleBackWheel1.setTextureSize(64, 128);
		vehichleBackWheel1.mirror = true;
		setRotation(vehichleBackWheel1, 0F, 0F, 0F);
		vehichleBackWheel2 = new ModelRenderer(this, 0, 64);
		vehichleBackWheel2.addBox(0F, -1F, -1F, 1, 2, 2);
		vehichleBackWheel2.setRotationPoint(2.3F, 23F, 4F);
		vehichleBackWheel2.setTextureSize(64, 128);
		vehichleBackWheel2.mirror = true;
		setRotation(vehichleBackWheel2, 0F, 0F, 0F);
		vehichleRoof = new ModelRenderer(this, 18, 83);
		vehichleRoof.addBox(-2.5F, -0.5F, 0F, 5, 1, 2);
		vehichleRoof.setRotationPoint(0F, 20.7F, -0.5F);
		vehichleRoof.setTextureSize(64, 128);
		vehichleRoof.mirror = true;
		setRotation(vehichleRoof, 0F, 0F, 0F);
		vehichleBackWindShield = new ModelRenderer(this, 14, 86);
		vehichleBackWindShield.addBox(-2.5F, -0.5F, 0F, 5, 1, 4);
		vehichleBackWindShield.setRotationPoint(0F, 20.7F, 1.3F);
		vehichleBackWindShield.setTextureSize(64, 128);
		vehichleBackWindShield.mirror = true;
		setRotation(vehichleBackWindShield, -0.2617994F, 0F, 0F);
		vehichleWindShield = new ModelRenderer(this, 13, 78);
		vehichleWindShield.addBox(-2.5F, -0.5F, -4F, 5, 1, 4);
		vehichleWindShield.setRotationPoint(0F, 20.7F, -0.3F);
		vehichleWindShield.setTextureSize(64, 128);
		vehichleWindShield.mirror = true;
		setRotation(vehichleWindShield, 0.3316126F, 0F, 0F);
		vehichleDoor1 = new ModelRenderer(this, 24, 64);
		vehichleDoor1.addBox(-1F, -1F, -1.5F, 1, 1, 3);
		vehichleDoor1.setRotationPoint(-1.8F, 21.7F, 0.5F);
		vehichleDoor1.setTextureSize(64, 128);
		vehichleDoor1.mirror = true;
		setRotation(vehichleDoor1, 0F, 0F, 0.2268928F);
		vehichleDoor2 = new ModelRenderer(this, 24, 64);
		vehichleDoor2.addBox(0F, -1F, -1.5F, 1, 1, 3);
		vehichleDoor2.setRotationPoint(1.8F, 21.7F, 0.5F);
		vehichleDoor2.setTextureSize(64, 128);
		vehichleDoor2.mirror = true;
		setRotation(vehichleDoor2, 0F, 0F, -0.2268928F);
		vehichleBumper1 = new ModelRenderer(this, 0, 70);
		vehichleBumper1.addBox(-2.5F, -0.5F, -2F, 3, 1, 1);
		vehichleBumper1.setRotationPoint(0F, 23F, -5.1F);
		vehichleBumper1.setTextureSize(64, 128);
		vehichleBumper1.mirror = true;
		setRotation(vehichleBumper1, 0F, 0.2443461F, 0F);
		vehichleBumper2 = new ModelRenderer(this, 0, 70);
		vehichleBumper2.mirror = true;
		vehichleBumper2.addBox(-0.5F, -0.5F, -2F, 3, 1, 1);
		vehichleBumper2.setRotationPoint(0F, 23F, -5.1F);
		vehichleBumper2.setTextureSize(64, 128);
		vehichleBumper2.mirror = true;
		setRotation(vehichleBumper2, 0F, -0.2443461F, 0F);
		vehichleUpperBumper1 = new ModelRenderer(this, 0, 68);
		vehichleUpperBumper1.addBox(-2.5F, -1.5F, -2F, 2, 1, 1);
		vehichleUpperBumper1.setRotationPoint(0F, 23.5F, -5.3F);
		vehichleUpperBumper1.setTextureSize(64, 128);
		vehichleUpperBumper1.mirror = true;
		setRotation(vehichleUpperBumper1, -0.2443461F, 0.2443461F, 0F);
		vehichleUpperBumper2 = new ModelRenderer(this, 0, 68);
		vehichleUpperBumper2.mirror = true;
		vehichleUpperBumper2.addBox(0.5F, -1.5F, -2F, 2, 1, 1);
		vehichleUpperBumper2.setRotationPoint(0F, 23.5F, -5.3F);
		vehichleUpperBumper2.setTextureSize(64, 128);
		vehichleUpperBumper2.mirror = true;
		setRotation(vehichleUpperBumper2, -0.2443461F, -0.2443461F, 0F);
		vehichleMiddleBumper = new ModelRenderer(this, 6, 68);
		vehichleMiddleBumper.addBox(-1F, -1.5F, -2F, 2, 1, 1);
		vehichleMiddleBumper.setRotationPoint(0F, 23.5F, -5.1F);
		vehichleMiddleBumper.setTextureSize(64, 128);
		vehichleMiddleBumper.mirror = true;
		setRotation(vehichleMiddleBumper, -0.2443461F, 0F, 0F);
		vehichleTrunk = new ModelRenderer(this, 0, 84);
		vehichleTrunk.addBox(-2.5F, -1F, 0F, 5, 1, 2);
		vehichleTrunk.setRotationPoint(0F, 22.2F, 3.6F);
		vehichleTrunk.setTextureSize(64, 128);
		vehichleTrunk.mirror = true;
		setRotation(vehichleTrunk, 0F, 0F, 0F);
		vehichleHood = new ModelRenderer(this, 0, 78);
		vehichleHood.addBox(-2F, -1F, 0F, 4, 1, 5);
		vehichleHood.setRotationPoint(0F, 22.5F, -6.3F);
		vehichleHood.setTextureSize(64, 128);
		vehichleHood.mirror = true;
		setRotation(vehichleHood, 0.1047198F, 0F, 0F);
		
		
		this.addChildTo(vehichleFrontWheel1, vehichleBody);
		this.addChildTo(vehichleFrontWheel2, vehichleBody);
		this.addChildTo(vehichleBackWheel1, vehichleBody);
		this.addChildTo(vehichleBackWheel2, vehichleBody);
		this.addChildTo(vehichleRoof, vehichleBody);
		this.addChildTo(vehichleBackWindShield, vehichleBody);
		this.addChildTo(vehichleWindShield, vehichleBody);
		this.addChildTo(vehichleDoor1, vehichleBody);
		this.addChildTo(vehichleDoor2, vehichleBody);
		this.addChildTo(vehichleBumper1, vehichleBody);
		this.addChildTo(vehichleBumper2, vehichleBody);
		this.addChildTo(vehichleUpperBumper1, vehichleBody);
		this.addChildTo(vehichleUpperBumper2, vehichleBody);
		this.addChildTo(vehichleMiddleBumper, vehichleBody);
		this.addChildTo(vehichleTrunk, vehichleBody);
		this.addChildTo(vehichleHood, vehichleBody);
		

		adjustPos();
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		vehichleBody.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity)
	{
		super.setRotationAngles(par1, par2, par3, par4, par5, par6, entity);

		if (entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)entity;

			if (TFPlayerData.getTransformationTimer(player) == 0)
			{
				float f = this.bipedHead.rotateAngleY - (this.bipedBody.rotateAngleY - this.bipedHead.rotateAngleY) / 3;
				if (vehichleBody.rotateAngleY < f) {vehichleBody.rotateAngleY += 0.05F;}
				if (vehichleBody.rotateAngleY > f) {vehichleBody.rotateAngleY -= 0.05F;}
				vehichleBody.rotateAngleY = f;
				vehichleBody.rotateAngleX = -(float)player.motionY - 0.0784000015258789F;
				vehichleFrontWheel1.rotateAngleX = -par1;
				vehichleFrontWheel2.rotateAngleX = -par1;
				vehichleBackWheel1.rotateAngleX = -par1;
				vehichleBackWheel2.rotateAngleX = -par1;
				
				bipedHead.offsetY = 256F;
				bipedBody.offsetY = 256F;
				bipedRightArm.offsetY = 256F;
				bipedLeftArm.offsetY = 256F;
				bipedRightLeg.offsetY = 256F;
				bipedLeftLeg.offsetY = 256F;
				vehichleBody.offsetY = 0F;
			}
			else
			{
				int t = TFPlayerData.getTransformationTimer(player);
				float f = (10 - t);
				
				vehichleBody.rotateAngleX = 0;
				chestPanel4.rotationPointY = f / 2 - 1.6F;
				bumper1.rotateAngleZ = -(f * 0.02617994F) + 0.2617994F;
				bumper2.rotateAngleZ = (f * 0.02617994F) - 0.2617994F;
				middleBumper1.rotateAngleZ = -(f * 0.01919862F) + 0.1919862F;
				middleBumper2.rotateAngleZ = (f * 0.01919862F) - 0.1919862F;
				
				bipedBody.rotationPointY = f * 2.5F;
				bipedBody.rotationPointZ = f / 10 * -7.5F;
				bipedRightArm.rotationPointZ = f / 10 * -5F;
				bipedLeftArm.rotationPointZ = f / 10 * -5F;
				chest.rotationPointZ = -3.0F / 10 * f;
				chest.rotateAngleX = -pi / 2 / 10 * f;
				bipedRightArm.rotationPointY = f * 2;
				bipedLeftArm.rotationPointY = f * 2;
				bipedRightArm.rotationPointX = f / 3.5F - 5;
				bipedLeftArm.rotationPointX = -f / 3.5F + 5;
				bipedRightLeg.rotateAngleZ = f * pi / 10;
				bipedLeftLeg.rotateAngleZ = f * pi / 10;
				bipedRightLeg.rotationPointX = -f / 7.5F;
				bipedLeftLeg.rotationPointX = -f / 7.5F;

				if (t < 10)
				{
					bipedRightLeg.rotateAngleX = f * pi / 2 / 10;
					bipedLeftLeg.rotateAngleX = f * pi / 2 / 10;
					bipedRightLeg.rotationPointY = f * 1.3F + 12;
					bipedLeftLeg.rotationPointY = f * 1.3F + 12;
					bipedRightLeg.rotationPointZ = -f / 2;
					bipedLeftLeg.rotationPointZ = -f / 2;
					bipedBody.rotateAngleX = pi / 2 / 10 * f;
					bipedHead.rotationPointY = f * 2.5F;
					bipedRightArm.rotateAngleX = f / 10 * 1.5F;
					bipedLeftArm.rotateAngleX = f / 10 * 1.5F;
				}
				
				bipedHead.offsetY = 0F;
				bipedBody.offsetY = 0F;
				bipedRightArm.offsetY = 0F;
				bipedLeftArm.offsetY = 0F;
				bipedRightLeg.offsetY = 0F;
				bipedLeftLeg.offsetY = 0F;
				vehichleBody.offsetY = 256F;
			}
		}
	}

	public void adjustPos()
	{
		// Body
		chest.rotationPointY = -4F;
		bumper1.rotationPointY = -2.5F;
		bumper2.rotationPointY = -2.5F;
		upperBumper1.rotationPointY = -4.0F;
		upperBumper2.rotationPointY = -4.0F;
		middleBumper1.rotationPointY = -3.7F;
		middleBumper2.rotationPointY = -3.7F;
		chestPanel1.rotationPointY = 1.25F;
		chestPanel2.rotationPointY = 1.25F;
		chestPanel3.rotationPointY = 1.0F;
		chestPanel4.rotationPointY = -1.6F;
		chestPanel5.rotationPointY = 0.15F;

		// Arms
		upperArm1.rotationPointX = 1F;
		lowerArm1.setRotationPoint(-1F, 3.5F, 0);
		lowerArmPanel1.setRotationPoint(-0.8F, 3.75F, 0F);
		setRotation(lowerArmPanel1, 0F, 0F, -0.0872665F);
		upperArm2.rotationPointX = -1F;
		lowerArm2.setRotationPoint(1F, 3.5F, 0);
		lowerArmPanel2.setRotationPoint(0.8F, 3.75F, 0F);
		setRotation(lowerArmPanel2, 0F, 0F, 0.0872665F);
		frontWheel1.rotationPointX = -1.0F;
		frontWheel1.rotationPointY = -1.5F;
		frontWheel1.rotateAngleZ = 0F;
		frontWheel2.rotationPointX = 1.0F;
		frontWheel2.rotationPointY = -1.5F;
		frontWheel2.rotateAngleZ = 0F;

		// Legs
		leg1.rotationPointY = 12.0F;
		upperLegSlab1.rotationPointX = -0.25F;
		upperLegPanel1.rotationPointX = 1.0F;
		leg2.rotationPointY = 12.0F;
		upperLegSlab2.rotationPointX = 0.25F;
		upperLegPanel2.rotationPointX = -1.0F;
	}
}