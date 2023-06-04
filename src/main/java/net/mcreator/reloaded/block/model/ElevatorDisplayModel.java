package net.mcreator.reloaded.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.reloaded.block.display.ElevatorDisplayItem;

public class ElevatorDisplayModel extends AnimatedGeoModel<ElevatorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ElevatorDisplayItem animatable) {
		return new ResourceLocation("reloaded", "animations/elevator.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ElevatorDisplayItem animatable) {
		return new ResourceLocation("reloaded", "geo/elevator.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ElevatorDisplayItem entity) {
		return new ResourceLocation("reloaded", "textures/blocks/evevator.png");
	}
}
