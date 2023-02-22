package net.mcreator.reloaded.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.reloaded.block.entity.CubeDispenserTileEntity;

public class CubeDispenserBlockModel extends AnimatedGeoModel<CubeDispenserTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CubeDispenserTileEntity animatable) {
		return new ResourceLocation("reloaded", "animations/cube_dispenser_anim.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CubeDispenserTileEntity animatable) {
		return new ResourceLocation("reloaded", "geo/cube_dispenser_anim.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CubeDispenserTileEntity entity) {
		return new ResourceLocation("reloaded", "textures/blocks/cube_dispenser.png");
	}
}
