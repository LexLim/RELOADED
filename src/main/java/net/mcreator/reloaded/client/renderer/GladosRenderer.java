
package net.mcreator.reloaded.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.reloaded.entity.model.GladosModel;
import net.mcreator.reloaded.entity.layer.GladosLayer;
import net.mcreator.reloaded.entity.GladosEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GladosRenderer extends GeoEntityRenderer<GladosEntity> {
	public GladosRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new GladosModel());
		this.shadowRadius = 1f;
		this.addLayer(new GladosLayer(this));
	}

	@Override
	public RenderType getRenderType(GladosEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

	@Override
	protected float getDeathMaxRotation(GladosEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
