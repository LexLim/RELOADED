package net.mcreator.reloaded.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.reloaded.block.model.SlidingDoor2AnimCloseDisplayModel;
import net.mcreator.reloaded.block.display.SlidingDoor2AnimCloseDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class SlidingDoor2AnimCloseDisplayItemRenderer extends GeoItemRenderer<SlidingDoor2AnimCloseDisplayItem> {
	public SlidingDoor2AnimCloseDisplayItemRenderer() {
		super(new SlidingDoor2AnimCloseDisplayModel());
	}

	@Override
	public RenderType getRenderType(SlidingDoor2AnimCloseDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
