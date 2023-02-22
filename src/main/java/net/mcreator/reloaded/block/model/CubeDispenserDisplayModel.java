package net.mcreator.reloaded.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.reloaded.block.display.CubeDispenserDisplayItem;

public class CubeDispenserDisplayModel extends AnimatedGeoModel<CubeDispenserDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CubeDispenserDisplayItem animatable) {
		return new ResourceLocation("reloaded", "animations/cube_dispenser_anim.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CubeDispenserDisplayItem animatable) {
		return new ResourceLocation("reloaded", "geo/cube_dispenser_anim.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CubeDispenserDisplayItem entity) {
		return new ResourceLocation("reloaded", "textures/blocks/cube_dispenser.png");
	}
}
