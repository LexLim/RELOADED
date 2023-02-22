
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.reloaded.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.reloaded.client.renderer.WeightedStorageCube2Renderer;
import net.mcreator.reloaded.client.renderer.WeightedCompagnonCube2Renderer;
import net.mcreator.reloaded.client.renderer.OldStorageCubeRenderer;
import net.mcreator.reloaded.client.renderer.GladosRenderer;
import net.mcreator.reloaded.client.renderer.DiscouragementRedirectionCubeRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ReloadedModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ReloadedModEntities.GLADOS.get(), GladosRenderer::new);
		event.registerEntityRenderer(ReloadedModEntities.WEIGHTED_STORAGE_CUBE_2.get(), WeightedStorageCube2Renderer::new);
		event.registerEntityRenderer(ReloadedModEntities.WEIGHTED_COMPAGNON_CUBE_2.get(), WeightedCompagnonCube2Renderer::new);
		event.registerEntityRenderer(ReloadedModEntities.OLD_STORAGE_CUBE.get(), OldStorageCubeRenderer::new);
		event.registerEntityRenderer(ReloadedModEntities.DISCOURAGEMENT_REDIRECTION_CUBE.get(), DiscouragementRedirectionCubeRenderer::new);
	}
}
