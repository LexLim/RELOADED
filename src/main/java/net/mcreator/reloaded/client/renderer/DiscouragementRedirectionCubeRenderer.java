
package net.mcreator.reloaded.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.reloaded.entity.DiscouragementRedirectionCubeEntity;
import net.mcreator.reloaded.client.model.Modeldiscouragement_redirection_cube;

public class DiscouragementRedirectionCubeRenderer extends MobRenderer<DiscouragementRedirectionCubeEntity, Modeldiscouragement_redirection_cube<DiscouragementRedirectionCubeEntity>> {
	public DiscouragementRedirectionCubeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldiscouragement_redirection_cube(context.bakeLayer(Modeldiscouragement_redirection_cube.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(DiscouragementRedirectionCubeEntity entity) {
		return new ResourceLocation("reloaded:textures/entities/discouragement_redirection_cube.png");
	}
}
