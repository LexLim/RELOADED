
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.reloaded.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.reloaded.world.inventory.EnergyPressGUIMenu;
import net.mcreator.reloaded.ReloadedMod;

public class ReloadedModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ReloadedMod.MODID);
	public static final RegistryObject<MenuType<EnergyPressGUIMenu>> ENERGY_PRESS_GUI = REGISTRY.register("energy_press_gui",
			() -> IForgeMenuType.create(EnergyPressGUIMenu::new));
}
