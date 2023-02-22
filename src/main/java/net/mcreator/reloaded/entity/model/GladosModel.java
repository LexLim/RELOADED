package net.mcreator.reloaded.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.reloaded.entity.GladosEntity;

public class GladosModel extends AnimatedGeoModel<GladosEntity> {
	@Override
	public ResourceLocation getAnimationResource(GladosEntity entity) {
		return new ResourceLocation("reloaded", "animations/glados.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GladosEntity entity) {
		return new ResourceLocation("reloaded", "geo/glados.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GladosEntity entity) {
		return new ResourceLocation("reloaded", "textures/entities/" + entity.getTexture() + ".png");
	}

}
