package net.mcreator.reloaded.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.reloaded.block.display.SlidingDoor2AnimCloseDisplayItem;

public class SlidingDoor2AnimCloseDisplayModel extends AnimatedGeoModel<SlidingDoor2AnimCloseDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SlidingDoor2AnimCloseDisplayItem animatable) {
		return new ResourceLocation("reloaded", "animations/sliding_door_2_anim_close.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SlidingDoor2AnimCloseDisplayItem animatable) {
		return new ResourceLocation("reloaded", "geo/sliding_door_2_anim_close.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SlidingDoor2AnimCloseDisplayItem entity) {
		return new ResourceLocation("reloaded", "textures/blocks/sliding_door_2.png");
	}
}
