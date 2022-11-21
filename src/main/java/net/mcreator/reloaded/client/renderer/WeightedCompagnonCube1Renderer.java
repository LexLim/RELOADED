
package net.mcreator.reloaded.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.reloaded.entity.WeightedCompagnonCube1Entity;
import net.mcreator.reloaded.client.model.Modelweighted_compagnon_cube_1;

public class WeightedCompagnonCube1Renderer
		extends
			MobRenderer<WeightedCompagnonCube1Entity, Modelweighted_compagnon_cube_1<WeightedCompagnonCube1Entity>> {
	public WeightedCompagnonCube1Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelweighted_compagnon_cube_1(context.bakeLayer(Modelweighted_compagnon_cube_1.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(WeightedCompagnonCube1Entity entity) {
		return new ResourceLocation("reloaded:textures/entities/weighted_compagnon_cube_1.png");
	}
}
