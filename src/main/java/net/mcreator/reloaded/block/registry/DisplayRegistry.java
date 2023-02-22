package net.mcreator.reloaded.block.registry;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.reloaded.init.ReloadedModBlocks;
import net.mcreator.reloaded.block.display.SlidingDoor2AnimDisplayItem;
import net.mcreator.reloaded.block.display.SlidingDoor2AnimCloseDisplayItem;
import net.mcreator.reloaded.block.display.LaserReveiverOnDisplayItem;
import net.mcreator.reloaded.block.display.CubeDispenserDisplayItem;
import net.mcreator.reloaded.ReloadedMod;

public class DisplayRegistry {
	public static final DeferredRegister<Item> DISPLAY = DeferredRegister.create(ForgeRegistries.ITEMS, ReloadedMod.MODID);
	public static final RegistryObject<Item> CUBE_DISPENSER_ITEM = DISPLAY.register("cube_dispenser_item", () -> new CubeDispenserDisplayItem(ReloadedModBlocks.CUBE_DISPENSER.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> LASER_REVEIVER_ON_ITEM = DISPLAY.register("laser_reveiver_on_item", () -> new LaserReveiverOnDisplayItem(ReloadedModBlocks.LASER_REVEIVER_ON.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> SLIDING_DOOR_2_ANIM_ITEM = DISPLAY.register("sliding_door_2_anim_item", () -> new SlidingDoor2AnimDisplayItem(ReloadedModBlocks.SLIDING_DOOR_2_ANIM.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> SLIDING_DOOR_2_ANIM_CLOSE_ITEM = DISPLAY.register("sliding_door_2_anim_close_item",
			() -> new SlidingDoor2AnimCloseDisplayItem(ReloadedModBlocks.SLIDING_DOOR_2_ANIM_CLOSE.get(), new Item.Properties().tab(null)));
}
