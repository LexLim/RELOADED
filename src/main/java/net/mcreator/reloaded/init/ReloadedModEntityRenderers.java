
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.reloaded.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.reloaded.client.renderer.WeightedStorageCube1Renderer;
import net.mcreator.reloaded.client.renderer.WeightedCompagnonCube1Renderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ReloadedModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ReloadedModEntities.WEIGHTED_STORAGE_CUBE_1.get(), WeightedStorageCube1Renderer::new);
		event.registerEntityRenderer(ReloadedModEntities.WEIGHTED_COMPAGNON_CUBE_1.get(), WeightedCompagnonCube1Renderer::new);
	}
}
