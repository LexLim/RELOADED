package net.mcreator.reloaded.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.reloaded.block.model.SlidingDoor2AnimBlockModel;
import net.mcreator.reloaded.block.entity.SlidingDoor2AnimTileEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class SlidingDoor2AnimTileRenderer extends GeoBlockRenderer<SlidingDoor2AnimTileEntity> {
	public SlidingDoor2AnimTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new SlidingDoor2AnimBlockModel());
	}

	@Override
	public RenderType getRenderType(SlidingDoor2AnimTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
