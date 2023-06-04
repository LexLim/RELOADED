package net.mcreator.reloaded.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.reloaded.block.model.ElevatorDisplayModel;
import net.mcreator.reloaded.block.display.ElevatorDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ElevatorDisplayItemRenderer extends GeoItemRenderer<ElevatorDisplayItem> {
	public ElevatorDisplayItemRenderer() {
		super(new ElevatorDisplayModel());
	}

	@Override
	public RenderType getRenderType(ElevatorDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
