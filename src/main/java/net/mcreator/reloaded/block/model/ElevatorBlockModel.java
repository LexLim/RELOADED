package net.mcreator.reloaded.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.reloaded.block.entity.ElevatorTileEntity;

public class ElevatorBlockModel extends AnimatedGeoModel<ElevatorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ElevatorTileEntity animatable) {
		return new ResourceLocation("reloaded", "animations/elevator.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ElevatorTileEntity animatable) {
		return new ResourceLocation("reloaded", "geo/elevator.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ElevatorTileEntity entity) {
		return new ResourceLocation("reloaded", "textures/blocks/evevator.png");
	}
}
