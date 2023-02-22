package net.mcreator.reloaded.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.reloaded.block.display.SlidingDoor2AnimDisplayItem;

public class SlidingDoor2AnimDisplayModel extends AnimatedGeoModel<SlidingDoor2AnimDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SlidingDoor2AnimDisplayItem animatable) {
		return new ResourceLocation("reloaded", "animations/sliding_door_2_anim.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SlidingDoor2AnimDisplayItem animatable) {
		return new ResourceLocation("reloaded", "geo/sliding_door_2_anim.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SlidingDoor2AnimDisplayItem entity) {
		return new ResourceLocation("reloaded", "textures/blocks/sliding_door_2.png");
	}
}
