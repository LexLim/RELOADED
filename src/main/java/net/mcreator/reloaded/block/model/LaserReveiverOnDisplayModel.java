package net.mcreator.reloaded.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.reloaded.block.display.LaserReveiverOnDisplayItem;

public class LaserReveiverOnDisplayModel extends AnimatedGeoModel<LaserReveiverOnDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LaserReveiverOnDisplayItem animatable) {
		return new ResourceLocation("reloaded", "animations/laser_reciever_on.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LaserReveiverOnDisplayItem animatable) {
		return new ResourceLocation("reloaded", "geo/laser_reciever_on.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LaserReveiverOnDisplayItem entity) {
		return new ResourceLocation("reloaded", "textures/blocks/laser_receiver.png");
	}
}
