package net.mcreator.reloaded.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.reloaded.block.model.SlidingDoor2AnimDisplayModel;
import net.mcreator.reloaded.block.display.SlidingDoor2AnimDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class SlidingDoor2AnimDisplayItemRenderer extends GeoItemRenderer<SlidingDoor2AnimDisplayItem> {
	public SlidingDoor2AnimDisplayItemRenderer() {
		super(new SlidingDoor2AnimDisplayModel());
	}

	@Override
	public RenderType getRenderType(SlidingDoor2AnimDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
