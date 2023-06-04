
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.reloaded.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.reloaded.item.WeightedStorageCube2ItemItem;
import net.mcreator.reloaded.item.WeightedCompagnonCube2ItemItem;
import net.mcreator.reloaded.item.SteelIngotItem;
import net.mcreator.reloaded.item.RepulsionGelInABucketItem;
import net.mcreator.reloaded.item.ReinforeinforcedSteelIngotItem;
import net.mcreator.reloaded.item.RawSteelItem;
import net.mcreator.reloaded.item.PropulsionGelInABucketItem;
import net.mcreator.reloaded.item.OldStorageCubeItemItem;
import net.mcreator.reloaded.item.IndicatorLinkControllerItem;
import net.mcreator.reloaded.item.DiscouragementRedirectionCubeItemItem;
import net.mcreator.reloaded.item.DefaultPortalGunOItem;
import net.mcreator.reloaded.item.DefaultPortalGunLBItem;
import net.mcreator.reloaded.block.display.SlidingDoor2AnimDisplayItem;
import net.mcreator.reloaded.block.display.SlidingDoor2AnimCloseDisplayItem;
import net.mcreator.reloaded.block.display.LaserReveiverOnDisplayItem;
import net.mcreator.reloaded.ReloadedMod;

public class ReloadedModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ReloadedMod.MODID);
	public static final RegistryObject<Item> PANEL = block(ReloadedModBlocks.PANEL, ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> REDSTON_INDICATOR_OFF = block(ReloadedModBlocks.REDSTON_INDICATOR_OFF, ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> INDICATOR_LINK_CONTROLLER = REGISTRY.register("indicator_link_controller", () -> new IndicatorLinkControllerItem());
	public static final RegistryObject<Item> REDSTONE_EMITTER_OFF = block(ReloadedModBlocks.REDSTONE_EMITTER_OFF, ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> INDICATOR_LINE_OFF_STRAIGHT = block(ReloadedModBlocks.INDICATOR_LINE_OFF_STRAIGHT, ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> BUTTON = block(ReloadedModBlocks.BUTTON, ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> PEDESTAL_BUTTON = block(ReloadedModBlocks.PEDESTAL_BUTTON, ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> WEIGHTED_STORAGE_CUBE_2_ITEM = REGISTRY.register("weighted_storage_cube_2_item", () -> new WeightedStorageCube2ItemItem());
	public static final RegistryObject<Item> WEIGHTED_COMPAGNON_CUBE_2_ITEM = REGISTRY.register("weighted_compagnon_cube_2_item", () -> new WeightedCompagnonCube2ItemItem());
	public static final RegistryObject<Item> OLD_STORAGE_CUBE_ITEM = REGISTRY.register("old_storage_cube_item", () -> new OldStorageCubeItemItem());
	public static final RegistryObject<Item> DISCOURAGEMENT_REDIRECTION_CUBE_ITEM = REGISTRY.register("discouragement_redirection_cube_item", () -> new DiscouragementRedirectionCubeItemItem());
	public static final RegistryObject<Item> HARD_LIGHT_BRIDGE_EMITTER_OFF = block(ReloadedModBlocks.HARD_LIGHT_BRIDGE_EMITTER_OFF, ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> SLIDING_DOOR_2 = block(ReloadedModBlocks.SLIDING_DOOR_2, ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> FIZZLER_OFF = block(ReloadedModBlocks.FIZZLER_OFF, ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> WHITE_PANEL = block(ReloadedModBlocks.WHITE_PANEL, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> WHITE_PANEL_SLAB = block(ReloadedModBlocks.WHITE_PANEL_SLAB, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> LONG_WHITE_PANEL = block(ReloadedModBlocks.LONG_WHITE_PANEL, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> WHITE_PANEL_TILES = block(ReloadedModBlocks.WHITE_PANEL_TILES, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> DIRTY_WHITE_PANEL = block(ReloadedModBlocks.DIRTY_WHITE_PANEL, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> DIRTY_WHITE_PANEL_SLAB = block(ReloadedModBlocks.DIRTY_WHITE_PANEL_SLAB, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> DIRTY_LONG_WHITE_PANEL = block(ReloadedModBlocks.DIRTY_LONG_WHITE_PANEL, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> DIRTY_WHITE_PANEL_TILES = block(ReloadedModBlocks.DIRTY_WHITE_PANEL_TILES, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> BLACK_PANEL = block(ReloadedModBlocks.BLACK_PANEL, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> BLACK_PANEL_SLAB = block(ReloadedModBlocks.BLACK_PANEL_SLAB, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> BIG_BLACK_PANEL_LEFT = block(ReloadedModBlocks.BIG_BLACK_PANEL_LEFT, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> BIG_BLACK_PANEL_RIGHT = block(ReloadedModBlocks.BIG_BLACK_PANEL_RIGHT, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> BLACK_PANEL_TILES = block(ReloadedModBlocks.BLACK_PANEL_TILES, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> BROKEN_BLACK_PANEL_1 = block(ReloadedModBlocks.BROKEN_BLACK_PANEL_1, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> BROKEN_BLACK_PANEL_TILES = block(ReloadedModBlocks.BROKEN_BLACK_PANEL_TILES, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> DIRTY_BLACK_PANEL = block(ReloadedModBlocks.DIRTY_BLACK_PANEL, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> DIRTY_BLACK_PANEL_SLAB = block(ReloadedModBlocks.DIRTY_BLACK_PANEL_SLAB, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> DIRTY_BIG_BLACK_PANEL_LEFT = block(ReloadedModBlocks.DIRTY_BIG_BLACK_PANEL_LEFT, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> DIRTY_BIG_BLACK_PANEL_RIGHT = block(ReloadedModBlocks.DIRTY_BIG_BLACK_PANEL_RIGHT, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> DIRTY_BLACK_PANEL_TILES = block(ReloadedModBlocks.DIRTY_BLACK_PANEL_TILES, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> BROKEN_DIRTY_BLACK_PANEL_1 = block(ReloadedModBlocks.BROKEN_DIRTY_BLACK_PANEL_1, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> BROKEN_DIRTY_BLACK_PANEL_TILES_1 = block(ReloadedModBlocks.BROKEN_DIRTY_BLACK_PANEL_TILES_1, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> BROKEN_DIRTY_BIG_BLACK_PANEL_LEFT = block(ReloadedModBlocks.BROKEN_DIRTY_BIG_BLACK_PANEL_LEFT, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> BROKEN_DIRTY_BIG_BLACK_PANEL_RIGHT = block(ReloadedModBlocks.BROKEN_DIRTY_BIG_BLACK_PANEL_RIGHT, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> OLD_GREEN_PANEL = block(ReloadedModBlocks.OLD_GREEN_PANEL, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> LONG_OLG_GREEN_PANEL = block(ReloadedModBlocks.LONG_OLG_GREEN_PANEL, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> OLD_BLUE_PANEL = block(ReloadedModBlocks.OLD_BLUE_PANEL, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> LONG_OLD_BLUE_PANEL = block(ReloadedModBlocks.LONG_OLD_BLUE_PANEL, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> SUPPORT_BEAM = block(ReloadedModBlocks.SUPPORT_BEAM, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> ASBESTOS_BLOCK = block(ReloadedModBlocks.ASBESTOS_BLOCK, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> ASBESTOS_TILES = block(ReloadedModBlocks.ASBESTOS_TILES, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> BIG_PIPE = block(ReloadedModBlocks.BIG_PIPE, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> SMALL_PIPE = block(ReloadedModBlocks.SMALL_PIPE, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> SUPPORT_BLOCK = block(ReloadedModBlocks.SUPPORT_BLOCK, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> BLUE_SUPPORT_PIPE = block(ReloadedModBlocks.BLUE_SUPPORT_PIPE, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> YELLOW_SUPPORT_PIPE = block(ReloadedModBlocks.YELLOW_SUPPORT_PIPE, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> TRANSPORTATION_TUBE = block(ReloadedModBlocks.TRANSPORTATION_TUBE, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> LASER_EMITTER_OFF = block(ReloadedModBlocks.LASER_EMITTER_OFF, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> LASER_RECEIVER_OFF = block(ReloadedModBlocks.LASER_RECEIVER_OFF, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> REPULSION_GEL_BLOCK = block(ReloadedModBlocks.REPULSION_GEL_BLOCK, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> PROPULSION_GEL_BLOCK = block(ReloadedModBlocks.PROPULSION_GEL_BLOCK, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> HANGING_CABLE = block(ReloadedModBlocks.HANGING_CABLE, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> WALL_CABLE = block(ReloadedModBlocks.WALL_CABLE, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> FLOOR_CABLE = block(ReloadedModBlocks.FLOOR_CABLE, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> OBSERVATION_WALL = block(ReloadedModBlocks.OBSERVATION_WALL, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> VOID_BLOCK = block(ReloadedModBlocks.VOID_BLOCK, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> YELLOW_CASING = block(ReloadedModBlocks.YELLOW_CASING, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> GRAY_CASING = block(ReloadedModBlocks.GRAY_CASING, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> YELLOW_PLANE_CASING = block(ReloadedModBlocks.YELLOW_PLANE_CASING, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> GRAY_PLANE_CASING = block(ReloadedModBlocks.GRAY_PLANE_CASING, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> PANEL_CASING = block(ReloadedModBlocks.PANEL_CASING, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> CATWALK = block(ReloadedModBlocks.CATWALK, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> CATWALK_TURN = block(ReloadedModBlocks.CATWALK_TURN, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> CATWALK_STAIRS = block(ReloadedModBlocks.CATWALK_STAIRS, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> CATWALK_INTERSECTION = block(ReloadedModBlocks.CATWALK_INTERSECTION, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> CATWALK_CROSSROADS = block(ReloadedModBlocks.CATWALK_CROSSROADS, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> DEFAULT_PORTAL_GUN_LB = REGISTRY.register("default_portal_gun_lb", () -> new DefaultPortalGunLBItem());
	public static final RegistryObject<Item> DEFAULT_PORTAL_GUN_O = REGISTRY.register("default_portal_gun_o", () -> new DefaultPortalGunOItem());
	public static final RegistryObject<Item> REPULSION_GEL_IN_A_BUCKET = REGISTRY.register("repulsion_gel_in_a_bucket", () -> new RepulsionGelInABucketItem());
	public static final RegistryObject<Item> PROPULSION_GEL_IN_A_BUCKET = REGISTRY.register("propulsion_gel_in_a_bucket", () -> new PropulsionGelInABucketItem());
	public static final RegistryObject<Item> RAW_STEEL = REGISTRY.register("raw_steel", () -> new RawSteelItem());
	public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new SteelIngotItem());
	public static final RegistryObject<Item> REINFOREINFORCED_STEEL_INGOT = REGISTRY.register("reinforeinforced_steel_ingot", () -> new ReinforeinforcedSteelIngotItem());
	public static final RegistryObject<Item> GLADOS_SPAWN_EGG = REGISTRY.register("glados_spawn_egg", () -> new ForgeSpawnEggItem(ReloadedModEntities.GLADOS, -3355444, -26368, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> REDSTONE_INDICATOR_ON = block(ReloadedModBlocks.REDSTONE_INDICATOR_ON, null);
	public static final RegistryObject<Item> REDSTONE_EMITTER_ON = block(ReloadedModBlocks.REDSTONE_EMITTER_ON, null);
	public static final RegistryObject<Item> INDICATOR_LINE_OFF_TURN = block(ReloadedModBlocks.INDICATOR_LINE_OFF_TURN, null);
	public static final RegistryObject<Item> INDICATOR_LINE_OFF_UP = block(ReloadedModBlocks.INDICATOR_LINE_OFF_UP, null);
	public static final RegistryObject<Item> INDICATOR_LINE_OFF_WALL = block(ReloadedModBlocks.INDICATOR_LINE_OFF_WALL, null);
	public static final RegistryObject<Item> INDICATOR_LINE_ON_STRAIGHT = block(ReloadedModBlocks.INDICATOR_LINE_ON_STRAIGHT, null);
	public static final RegistryObject<Item> INDICATOR_LINE_ON_TURN = block(ReloadedModBlocks.INDICATOR_LINE_ON_TURN, null);
	public static final RegistryObject<Item> INDICATOR_LINE_ON_UP = block(ReloadedModBlocks.INDICATOR_LINE_ON_UP, null);
	public static final RegistryObject<Item> INDICATOR_LINE_ON_WALL = block(ReloadedModBlocks.INDICATOR_LINE_ON_WALL, null);
	public static final RegistryObject<Item> PEDESTAL_BUTTON_ACTIVATED = block(ReloadedModBlocks.PEDESTAL_BUTTON_ACTIVATED, null);
	public static final RegistryObject<Item> PANEL_PLACEHOLDER = block(ReloadedModBlocks.PANEL_PLACEHOLDER, null);
	public static final RegistryObject<Item> INDICATOR_LINE_OFF_UP_CEILLING = block(ReloadedModBlocks.INDICATOR_LINE_OFF_UP_CEILLING, null);
	public static final RegistryObject<Item> INDICATOR_LINE_OFF_CEILLING = block(ReloadedModBlocks.INDICATOR_LINE_OFF_CEILLING, null);
	public static final RegistryObject<Item> INDICATOR_LINE_ON_UP_CEILLING = block(ReloadedModBlocks.INDICATOR_LINE_ON_UP_CEILLING, null);
	public static final RegistryObject<Item> INDICATOR_LINE_ON_CEILLING = block(ReloadedModBlocks.INDICATOR_LINE_ON_CEILLING, null);
	public static final RegistryObject<Item> BROKEN_BLACK_PANEL_2 = block(ReloadedModBlocks.BROKEN_BLACK_PANEL_2, null);
	public static final RegistryObject<Item> BROKEN_BLACK_PANEL_3 = block(ReloadedModBlocks.BROKEN_BLACK_PANEL_3, null);
	public static final RegistryObject<Item> LASER_EMITTER_ON = block(ReloadedModBlocks.LASER_EMITTER_ON, null);
	public static final RegistryObject<Item> HARD_LIGHT_BRIDGE_EMITTER_ON = block(ReloadedModBlocks.HARD_LIGHT_BRIDGE_EMITTER_ON, null);
	public static final RegistryObject<Item> HARD_LIGHT_BRIDGE = block(ReloadedModBlocks.HARD_LIGHT_BRIDGE, null);
	public static final RegistryObject<Item> BROKEN_DIRTY_BLACK_PANEL_2 = block(ReloadedModBlocks.BROKEN_DIRTY_BLACK_PANEL_2, null);
	public static final RegistryObject<Item> BROKEN_DIRTY_BLACK_PANEL_3 = block(ReloadedModBlocks.BROKEN_DIRTY_BLACK_PANEL_3, null);
	public static final RegistryObject<Item> REPULSION_GEL_SPLAT = block(ReloadedModBlocks.REPULSION_GEL_SPLAT, null);
	public static final RegistryObject<Item> PROPULSION_GEL_SPLAT = block(ReloadedModBlocks.PROPULSION_GEL_SPLAT, null);
	public static final RegistryObject<Item> BROKEN_DIRTY_BLACK_PANEL_TILES_2 = block(ReloadedModBlocks.BROKEN_DIRTY_BLACK_PANEL_TILES_2, null);
	public static final RegistryObject<Item> FLOOR_CABLE_WIRES = block(ReloadedModBlocks.FLOOR_CABLE_WIRES, null);
	public static final RegistryObject<Item> LASER_REVEIVER_ON = REGISTRY.register(ReloadedModBlocks.LASER_REVEIVER_ON.getId().getPath(),
			() -> new LaserReveiverOnDisplayItem(ReloadedModBlocks.LASER_REVEIVER_ON.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> SLIDING_DOOR_2_ANIM = REGISTRY.register(ReloadedModBlocks.SLIDING_DOOR_2_ANIM.getId().getPath(),
			() -> new SlidingDoor2AnimDisplayItem(ReloadedModBlocks.SLIDING_DOOR_2_ANIM.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> SLIDING_DOOR_2_OPEN = block(ReloadedModBlocks.SLIDING_DOOR_2_OPEN, null);
	public static final RegistryObject<Item> SLIDING_DOOR_2_ANIM_CLOSE = REGISTRY.register(ReloadedModBlocks.SLIDING_DOOR_2_ANIM_CLOSE.getId().getPath(),
			() -> new SlidingDoor2AnimCloseDisplayItem(ReloadedModBlocks.SLIDING_DOOR_2_ANIM_CLOSE.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> OBSERVATION_WALL_TOP = block(ReloadedModBlocks.OBSERVATION_WALL_TOP, null);
	public static final RegistryObject<Item> OBSERVATION_WALL_BOTTOM = block(ReloadedModBlocks.OBSERVATION_WALL_BOTTOM, null);
	public static final RegistryObject<Item> OBSERVATION_WALL_MIDDLE = block(ReloadedModBlocks.OBSERVATION_WALL_MIDDLE, null);
	public static final RegistryObject<Item> FIZZLER_ON = block(ReloadedModBlocks.FIZZLER_ON, null);
	public static final RegistryObject<Item> WHITE_PANEL_TILES_1 = block(ReloadedModBlocks.WHITE_PANEL_TILES_1, null);
	public static final RegistryObject<Item> LONG_WHITE_PANEL_TOP = block(ReloadedModBlocks.LONG_WHITE_PANEL_TOP, null);
	public static final RegistryObject<Item> DIRTY_LONG_WHITE_PANEL_TOP = block(ReloadedModBlocks.DIRTY_LONG_WHITE_PANEL_TOP, null);
	public static final RegistryObject<Item> BIG_BLACK_PANEL_LEFT_TOP = block(ReloadedModBlocks.BIG_BLACK_PANEL_LEFT_TOP, null);
	public static final RegistryObject<Item> BIG_BLACK_PANEL_RIGHT_TOP = block(ReloadedModBlocks.BIG_BLACK_PANEL_RIGHT_TOP, null);
	public static final RegistryObject<Item> CUBE_DISPENSER = block(ReloadedModBlocks.CUBE_DISPENSER, ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> CUBE_DISPENSER_OPEN = block(ReloadedModBlocks.CUBE_DISPENSER_OPEN, null);
	public static final RegistryObject<Item> FLAT_CASING = block(ReloadedModBlocks.FLAT_CASING, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> WALL_PANEL = block(ReloadedModBlocks.WALL_PANEL, ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> STURDY_STEEL = block(ReloadedModBlocks.STURDY_STEEL, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> GRAY_PANEL = block(ReloadedModBlocks.GRAY_PANEL, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> GRAY_PANEL_1 = block(ReloadedModBlocks.GRAY_PANEL_1, null);
	public static final RegistryObject<Item> GRAY_PANEL_2 = block(ReloadedModBlocks.GRAY_PANEL_2, null);
	public static final RegistryObject<Item> YELLOW_PANEL = block(ReloadedModBlocks.YELLOW_PANEL, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> YELLOW_PANEL_1 = block(ReloadedModBlocks.YELLOW_PANEL_1, null);
	public static final RegistryObject<Item> YELLOW_PANEL_2 = block(ReloadedModBlocks.YELLOW_PANEL_2, null);
	public static final RegistryObject<Item> WALL_MONITOR = block(ReloadedModBlocks.WALL_MONITOR, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> WALL_MONITOR_TEXT = block(ReloadedModBlocks.WALL_MONITOR_TEXT, null);
	public static final RegistryObject<Item> WALL_MONITOR_LOGO = block(ReloadedModBlocks.WALL_MONITOR_LOGO, null);
	public static final RegistryObject<Item> SERVER_BOTTOM = block(ReloadedModBlocks.SERVER_BOTTOM, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> SERVER_TOP = block(ReloadedModBlocks.SERVER_TOP, null);
	public static final RegistryObject<Item> DESK = block(ReloadedModBlocks.DESK, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> DESK_RIGHT = block(ReloadedModBlocks.DESK_RIGHT, null);
	public static final RegistryObject<Item> DESK_LEFT = block(ReloadedModBlocks.DESK_LEFT, null);
	public static final RegistryObject<Item> DESK_MIDDLE = block(ReloadedModBlocks.DESK_MIDDLE, null);
	public static final RegistryObject<Item> CHAIR = block(ReloadedModBlocks.CHAIR, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> TESTING_GLASS = block(ReloadedModBlocks.TESTING_GLASS, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> TESTING_GLASS_BOTTOM = block(ReloadedModBlocks.TESTING_GLASS_BOTTOM, null);
	public static final RegistryObject<Item> TESTING_GLASS_TOP = block(ReloadedModBlocks.TESTING_GLASS_TOP, null);
	public static final RegistryObject<Item> BROKEN_TESTING_GLASS = block(ReloadedModBlocks.BROKEN_TESTING_GLASS, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> BROKEN_TESTING_GLASS_BOTTOM = block(ReloadedModBlocks.BROKEN_TESTING_GLASS_BOTTOM, null);
	public static final RegistryObject<Item> BROKEN_TESTING_GLASS_TOP = block(ReloadedModBlocks.BROKEN_TESTING_GLASS_TOP, null);
	public static final RegistryObject<Item> SLIDING_OFFICE_DOOR = block(ReloadedModBlocks.SLIDING_OFFICE_DOOR, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> SLIDING_OFFICE_DOOR_TOP = block(ReloadedModBlocks.SLIDING_OFFICE_DOOR_TOP, null);
	public static final RegistryObject<Item> SLIDING_OFFICE_DOOR_OPEN = block(ReloadedModBlocks.SLIDING_OFFICE_DOOR_OPEN, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> SLIDING_OFFICE_DOOR_TOP_OPEN = block(ReloadedModBlocks.SLIDING_OFFICE_DOOR_TOP_OPEN, null);
	public static final RegistryObject<Item> LONG_PANEL = block(ReloadedModBlocks.LONG_PANEL, null);
	public static final RegistryObject<Item> RADIO = block(ReloadedModBlocks.RADIO, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> RADIO_45 = block(ReloadedModBlocks.RADIO_45, null);
	public static final RegistryObject<Item> LAMP = block(ReloadedModBlocks.LAMP, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> LAMP_TOP = block(ReloadedModBlocks.LAMP_TOP, null);
	public static final RegistryObject<Item> BLACK_LAMP_LEFT = block(ReloadedModBlocks.BLACK_LAMP_LEFT, null);
	public static final RegistryObject<Item> BLACK_LAMP_RIGHT = block(ReloadedModBlocks.BLACK_LAMP_RIGHT, null);
	public static final RegistryObject<Item> ELEVATOR_MIDDLE_BOTTOM = block(ReloadedModBlocks.ELEVATOR_MIDDLE_BOTTOM, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> ELEVATOR_MIDDLE_TOP = block(ReloadedModBlocks.ELEVATOR_MIDDLE_TOP, null);
	public static final RegistryObject<Item> ELEVATOR_TOP = block(ReloadedModBlocks.ELEVATOR_TOP, null);
	public static final RegistryObject<Item> ELEVATOR_BOTTOM = block(ReloadedModBlocks.ELEVATOR_BOTTOM, null);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
