package net.mcreator.reloaded.block.listener;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.reloaded.block.renderer.SlidingDoor2AnimTileRenderer;
import net.mcreator.reloaded.block.renderer.SlidingDoor2AnimCloseTileRenderer;
import net.mcreator.reloaded.block.renderer.LaserReveiverOnTileRenderer;
import net.mcreator.reloaded.block.renderer.CubeDispenserTileRenderer;
import net.mcreator.reloaded.block.registry.TileRegistry;
import net.mcreator.reloaded.block.registry.DisplayRegistry;
import net.mcreator.reloaded.ReloadedMod;

@Mod.EventBusSubscriber(modid = ReloadedMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(TileRegistry.CUBE_DISPENSER.get(), CubeDispenserTileRenderer::new);
		event.registerBlockEntityRenderer(TileRegistry.LASER_REVEIVER_ON.get(), LaserReveiverOnTileRenderer::new);
		event.registerBlockEntityRenderer(TileRegistry.SLIDING_DOOR_2_ANIM.get(), SlidingDoor2AnimTileRenderer::new);
		event.registerBlockEntityRenderer(TileRegistry.SLIDING_DOOR_2_ANIM_CLOSE.get(), SlidingDoor2AnimCloseTileRenderer::new);
	}

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			TileRegistry.TILES.register(FMLJavaModLoadingContext.get().getModEventBus());
			DisplayRegistry.DISPLAY.register(FMLJavaModLoadingContext.get().getModEventBus());
		});
	}
}
