package net.mcreator.reloaded.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.reloaded.block.entity.LaserReveiverOnTileEntity;

public class LaserReveiverOnBlockModel extends AnimatedGeoModel<LaserReveiverOnTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LaserReveiverOnTileEntity animatable) {
		return new ResourceLocation("reloaded", "animations/laser_reciever_on.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LaserReveiverOnTileEntity animatable) {
		return new ResourceLocation("reloaded", "geo/laser_reciever_on.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LaserReveiverOnTileEntity entity) {
		return new ResourceLocation("reloaded", "textures/blocks/laser_receiver.png");
	}
}
