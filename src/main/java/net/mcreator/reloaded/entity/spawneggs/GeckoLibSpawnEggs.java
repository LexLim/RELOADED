package net.mcreator.reloaded.entity.spawneggs;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.reloaded.init.ReloadedModEntities;
import net.mcreator.reloaded.ReloadedMod;

public class GeckoLibSpawnEggs {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ReloadedMod.MODID);

	public static final RegistryObject<Item> GLADOS = REGISTRY.register("glados_spawn_egg", () -> new ForgeSpawnEggItem(ReloadedModEntities.GLADOS, -3355444, -26368, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
