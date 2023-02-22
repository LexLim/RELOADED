
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.reloaded.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.reloaded.client.model.Modelweighted_storage_cube_2;
import net.mcreator.reloaded.client.model.Modelweighted_compagnon_cube_2;
import net.mcreator.reloaded.client.model.Modelold_storage_cube;
import net.mcreator.reloaded.client.model.Modeldiscouragement_redirection_cube;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ReloadedModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelweighted_compagnon_cube_2.LAYER_LOCATION, Modelweighted_compagnon_cube_2::createBodyLayer);
		event.registerLayerDefinition(Modeldiscouragement_redirection_cube.LAYER_LOCATION, Modeldiscouragement_redirection_cube::createBodyLayer);
		event.registerLayerDefinition(Modelweighted_storage_cube_2.LAYER_LOCATION, Modelweighted_storage_cube_2::createBodyLayer);
		event.registerLayerDefinition(Modelold_storage_cube.LAYER_LOCATION, Modelold_storage_cube::createBodyLayer);
	}
}
