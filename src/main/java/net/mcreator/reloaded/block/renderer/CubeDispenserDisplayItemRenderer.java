package net.mcreator.reloaded.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.reloaded.block.model.CubeDispenserDisplayModel;
import net.mcreator.reloaded.block.display.CubeDispenserDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CubeDispenserDisplayItemRenderer extends GeoItemRenderer<CubeDispenserDisplayItem> {
	public CubeDispenserDisplayItemRenderer() {
		super(new CubeDispenserDisplayModel());
	}

	@Override
	public RenderType getRenderType(CubeDispenserDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
