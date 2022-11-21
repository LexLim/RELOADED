
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.reloaded.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.reloaded.client.model.Modelweighted_storage_cube_1;
import net.mcreator.reloaded.client.model.Modelweighted_compagnon_cube_1;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ReloadedModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelweighted_compagnon_cube_1.LAYER_LOCATION, Modelweighted_compagnon_cube_1::createBodyLayer);
		event.registerLayerDefinition(Modelweighted_storage_cube_1.LAYER_LOCATION, Modelweighted_storage_cube_1::createBodyLayer);
	}
}
