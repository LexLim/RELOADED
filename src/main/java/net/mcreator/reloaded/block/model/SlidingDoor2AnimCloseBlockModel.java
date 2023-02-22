package net.mcreator.reloaded.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.reloaded.block.entity.SlidingDoor2AnimCloseTileEntity;

public class SlidingDoor2AnimCloseBlockModel extends AnimatedGeoModel<SlidingDoor2AnimCloseTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SlidingDoor2AnimCloseTileEntity animatable) {
		return new ResourceLocation("reloaded", "animations/sliding_door_2_anim_close.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SlidingDoor2AnimCloseTileEntity animatable) {
		return new ResourceLocation("reloaded", "geo/sliding_door_2_anim_close.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SlidingDoor2AnimCloseTileEntity entity) {
		return new ResourceLocation("reloaded", "textures/blocks/sliding_door_2.png");
	}
}
