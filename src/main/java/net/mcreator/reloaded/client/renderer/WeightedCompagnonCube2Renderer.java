
package net.mcreator.reloaded.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.reloaded.entity.WeightedCompagnonCube2Entity;
import net.mcreator.reloaded.client.model.Modelweighted_compagnon_cube_2;

public class WeightedCompagnonCube2Renderer extends MobRenderer<WeightedCompagnonCube2Entity, Modelweighted_compagnon_cube_2<WeightedCompagnonCube2Entity>> {
	public WeightedCompagnonCube2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelweighted_compagnon_cube_2(context.bakeLayer(Modelweighted_compagnon_cube_2.LAYER_LOCATION)), 0.6f);
		this.addLayer(new EyesLayer<WeightedCompagnonCube2Entity, Modelweighted_compagnon_cube_2<WeightedCompagnonCube2Entity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("reloaded:textures/entities/weighted_compagnon_cube_2_e.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(WeightedCompagnonCube2Entity entity) {
		return new ResourceLocation("reloaded:textures/entities/weighted_compagnon_cube_2.png");
	}
}
