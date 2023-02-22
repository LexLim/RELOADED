package net.mcreator.reloaded.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.reloaded.block.model.LaserReveiverOnBlockModel;
import net.mcreator.reloaded.block.entity.LaserReveiverOnTileEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class LaserReveiverOnTileRenderer extends GeoBlockRenderer<LaserReveiverOnTileEntity> {
	public LaserReveiverOnTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new LaserReveiverOnBlockModel());
	}

	@Override
	public RenderType getRenderType(LaserReveiverOnTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
