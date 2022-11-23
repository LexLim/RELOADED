
package net.mcreator.reloaded.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.reloaded.entity.OldStorageCubeEntity;
import net.mcreator.reloaded.client.model.Modelold_storage_cube;

public class OldStorageCubeRenderer extends MobRenderer<OldStorageCubeEntity, Modelold_storage_cube<OldStorageCubeEntity>> {
	public OldStorageCubeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelold_storage_cube(context.bakeLayer(Modelold_storage_cube.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(OldStorageCubeEntity entity) {
		return new ResourceLocation("reloaded:textures/entities/old_storage_cube.png");
	}
}
