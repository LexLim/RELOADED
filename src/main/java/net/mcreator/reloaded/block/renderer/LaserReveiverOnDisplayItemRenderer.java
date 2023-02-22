package net.mcreator.reloaded.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.reloaded.block.model.LaserReveiverOnDisplayModel;
import net.mcreator.reloaded.block.display.LaserReveiverOnDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class LaserReveiverOnDisplayItemRenderer extends GeoItemRenderer<LaserReveiverOnDisplayItem> {
	public LaserReveiverOnDisplayItemRenderer() {
		super(new LaserReveiverOnDisplayModel());
	}

	@Override
	public RenderType getRenderType(LaserReveiverOnDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
