
package net.mcreator.reloaded.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.reloaded.entity.WeightedStorageCube1Entity;
import net.mcreator.reloaded.client.model.Modelweighted_storage_cube_1;

public class WeightedStorageCube1Renderer extends MobRenderer<WeightedStorageCube1Entity, Modelweighted_storage_cube_1<WeightedStorageCube1Entity>> {
	public WeightedStorageCube1Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelweighted_storage_cube_1(context.bakeLayer(Modelweighted_storage_cube_1.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(WeightedStorageCube1Entity entity) {
		return new ResourceLocation("reloaded:textures/entities/weighted_storage_cube_1.png");
	}
}
