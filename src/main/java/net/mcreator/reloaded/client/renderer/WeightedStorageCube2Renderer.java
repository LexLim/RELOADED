
package net.mcreator.reloaded.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.reloaded.entity.WeightedStorageCube2Entity;
import net.mcreator.reloaded.client.model.Modelweighted_storage_cube_2;

public class WeightedStorageCube2Renderer extends MobRenderer<WeightedStorageCube2Entity, Modelweighted_storage_cube_2<WeightedStorageCube2Entity>> {
	public WeightedStorageCube2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelweighted_storage_cube_2(context.bakeLayer(Modelweighted_storage_cube_2.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(WeightedStorageCube2Entity entity) {
		return new ResourceLocation("reloaded:textures/entities/weighted_storage_cube_2.png");
	}
}
