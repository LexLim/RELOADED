package net.mcreator.reloaded.init;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.mcreator.reloaded.entity.spawneggs.GeckoLibSpawnEggs;
import net.mcreator.reloaded.entity.GladosEntity;
import net.mcreator.reloaded.ReloadedMod;

@Mod.EventBusSubscriber(modid = ReloadedMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ReloadedModGeckoLibEntities {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			GeckoLibSpawnEggs.REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
		});
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			GladosEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ReloadedModEntities.GLADOS.get(), GladosEntity.createAttributes().build());
	}
}
