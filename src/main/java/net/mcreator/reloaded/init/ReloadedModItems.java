
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.reloaded.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.reloaded.item.WeightedStorageCube2ItemItem;
import net.mcreator.reloaded.item.WeightedStorageCube1ItemItem;
import net.mcreator.reloaded.item.WeightedCompagnonCube2ItemItem;
import net.mcreator.reloaded.item.WeightedCompagnonCube1ItemItem;
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
import net.mcreator.reloaded.ReloadedMod;

public class ReloadedModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ReloadedMod.MODID);
	public static final RegistryObject<Item> PANEL = block(ReloadedModBlocks.PANEL, ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> PANEL_WITH_BLACK = block(ReloadedModBlocks.PANEL_WITH_BLACK, ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> PANEL_WITH_WHITE = block(ReloadedModBlocks.PANEL_WITH_WHITE, ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> OPEN_PANEL = block(ReloadedModBlocks.OPEN_PANEL, ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> OPEN_PANEL_WITH_BLACK = block(ReloadedModBlocks.OPEN_PANEL_WITH_BLACK,
			ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> OPEN_PANEL_WITH_WHITE = block(ReloadedModBlocks.OPEN_PANEL_WITH_WHITE,
			ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> LONG_PANEL = block(ReloadedModBlocks.LONG_PANEL, ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> LONG_PANEL_WITH_BLACK = block(ReloadedModBlocks.LONG_PANEL_WITH_BLACK,
			ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> LONG_PANEL_WITH_WHITE = block(ReloadedModBlocks.LONG_PANEL_WITH_WHITE,
			ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> SLIDINGDOOR_2LEFT = block(ReloadedModBlocks.SLIDINGDOOR_2LEFT, ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> DIRTY_SLIDINGDOOR_2LEFT = block(ReloadedModBlocks.DIRTY_SLIDINGDOOR_2LEFT,
			ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> REDSTON_INDICATOR_OFF = block(ReloadedModBlocks.REDSTON_INDICATOR_OFF,
			ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> INDICATOR_LINK_CONTROLLER = REGISTRY.register("indicator_link_controller",
			() -> new IndicatorLinkControllerItem());
	public static final RegistryObject<Item> REDSTONE_EMITTER_OFF = block(ReloadedModBlocks.REDSTONE_EMITTER_OFF,
			ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> INDICATOR_LINE_OFF_STRAIGHT = block(ReloadedModBlocks.INDICATOR_LINE_OFF_STRAIGHT,
			ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> BUTTON = block(ReloadedModBlocks.BUTTON, ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> BUTTON_ACTIVATED = block(ReloadedModBlocks.BUTTON_ACTIVATED, ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> PEDESTAL_BUTTON = block(ReloadedModBlocks.PEDESTAL_BUTTON, ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> WEIGHTED_STORAGE_CUBE_1_ITEM = REGISTRY.register("weighted_storage_cube_1_item",
			() -> new WeightedStorageCube1ItemItem());
	public static final RegistryObject<Item> WEIGHTED_COMPAGNON_CUBE_1_ITEM = REGISTRY.register("weighted_compagnon_cube_1_item",
			() -> new WeightedCompagnonCube1ItemItem());
	public static final RegistryObject<Item> CUBE_DISPENSER = block(ReloadedModBlocks.CUBE_DISPENSER, ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> WEIGHTED_STORAGE_CUBE_2_ITEM = REGISTRY.register("weighted_storage_cube_2_item",
			() -> new WeightedStorageCube2ItemItem());
	public static final RegistryObject<Item> WEIGHTED_COMPAGNON_CUBE_2_ITEM = REGISTRY.register("weighted_compagnon_cube_2_item",
			() -> new WeightedCompagnonCube2ItemItem());
	public static final RegistryObject<Item> OLD_STORAGE_CUBE_ITEM = REGISTRY.register("old_storage_cube_item", () -> new OldStorageCubeItemItem());
	public static final RegistryObject<Item> DISCOURAGEMENT_REDIRECTION_CUBE_ITEM = REGISTRY.register("discouragement_redirection_cube_item",
			() -> new DiscouragementRedirectionCubeItemItem());
	public static final RegistryObject<Item> EMANCIPATION_GRID_LEFT_OFF = block(ReloadedModBlocks.EMANCIPATION_GRID_LEFT_OFF,
			ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> EMANCIPATION_GRID_RIGHT_OFF = block(ReloadedModBlocks.EMANCIPATION_GRID_RIGHT_OFF,
			ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> HARD_LIGHT_BRIDGE_EMITTER_OFF = block(ReloadedModBlocks.HARD_LIGHT_BRIDGE_EMITTER_OFF,
			ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> WHITE_PANEL = block(ReloadedModBlocks.WHITE_PANEL, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> LONG_WHITE_PANEL = block(ReloadedModBlocks.LONG_WHITE_PANEL, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> WHITE_PANEL_TILES = block(ReloadedModBlocks.WHITE_PANEL_TILES, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> DIRTY_WHITE_PANEL = block(ReloadedModBlocks.DIRTY_WHITE_PANEL, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> DIRTY_LONG_WHITE_PANEL = block(ReloadedModBlocks.DIRTY_LONG_WHITE_PANEL,
			ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> DIRTY_WHITE_PANEL_TILES = block(ReloadedModBlocks.DIRTY_WHITE_PANEL_TILES,
			ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> BLACK_PANEL = block(ReloadedModBlocks.BLACK_PANEL, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> BIG_BLACK_PANEL_LEFT = block(ReloadedModBlocks.BIG_BLACK_PANEL_LEFT,
			ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> BIG_BLACK_PANEL_RIGHT = block(ReloadedModBlocks.BIG_BLACK_PANEL_RIGHT,
			ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> BLACK_PANEL_TILES = block(ReloadedModBlocks.BLACK_PANEL_TILES, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> BROKEN_BLACK_PANEL_1 = block(ReloadedModBlocks.BROKEN_BLACK_PANEL_1,
			ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> BROKEN_BLACK_PANEL_TILES = block(ReloadedModBlocks.BROKEN_BLACK_PANEL_TILES,
			ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> DIRTY_BLACK_PANEL = block(ReloadedModBlocks.DIRTY_BLACK_PANEL, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> DIRTY_BIG_BLACK_PANEL_LEFT = block(ReloadedModBlocks.DIRTY_BIG_BLACK_PANEL_LEFT,
			ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> DIRTY_BIG_BLACK_PANEL_RIGHT = block(ReloadedModBlocks.DIRTY_BIG_BLACK_PANEL_RIGHT,
			ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> DIRTY_BLACK_PANEL_TILES = block(ReloadedModBlocks.DIRTY_BLACK_PANEL_TILES,
			ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> BROKEN_DIRTY_BLACK_PANEL_1 = block(ReloadedModBlocks.BROKEN_DIRTY_BLACK_PANEL_1,
			ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> BROKEN_DIRTY_BLACK_PANEL_TILES_1 = block(ReloadedModBlocks.BROKEN_DIRTY_BLACK_PANEL_TILES_1,
			ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> BROKEN_DIRTY_BIG_BLACK_PANEL_LEFT = block(ReloadedModBlocks.BROKEN_DIRTY_BIG_BLACK_PANEL_LEFT,
			ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> BROKEN_DIRTY_BIG_BLACK_PANEL_RIGHT = block(ReloadedModBlocks.BROKEN_DIRTY_BIG_BLACK_PANEL_RIGHT,
			ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> YELLOW_CASING = block(ReloadedModBlocks.YELLOW_CASING, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> GRAY_CASING = block(ReloadedModBlocks.GRAY_CASING, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> YELLOW_PLANE_CASING = block(ReloadedModBlocks.YELLOW_PLANE_CASING, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> GRAY_PLANE_CASING = block(ReloadedModBlocks.GRAY_PLANE_CASING, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> PANEL_CASING = block(ReloadedModBlocks.PANEL_CASING, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> CATWALK = block(ReloadedModBlocks.CATWALK, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> SUPPORT_BEAM = block(ReloadedModBlocks.SUPPORT_BEAM, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> ASBESTOS_BLOCK = block(ReloadedModBlocks.ASBESTOS_BLOCK, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> ASBESTOS_TILES = block(ReloadedModBlocks.ASBESTOS_TILES, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> BIG_PIPE = block(ReloadedModBlocks.BIG_PIPE, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> SMALL_PIPE = block(ReloadedModBlocks.SMALL_PIPE, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> SUPPORT_BLOCK = block(ReloadedModBlocks.SUPPORT_BLOCK, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> BLUE_SUPPORT_PIPE = block(ReloadedModBlocks.BLUE_SUPPORT_PIPE, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> YELLOW_SUPPORT_PIPE = block(ReloadedModBlocks.YELLOW_SUPPORT_PIPE, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> TRANSPORTATION_TUBE = block(ReloadedModBlocks.TRANSPORTATION_TUBE, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> TRANSPORTALTION_TUBE_ENTRANCE = block(ReloadedModBlocks.TRANSPORTALTION_TUBE_ENTRANCE,
			ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> TRANSPORTATION_TUBE_ENTRANCE_OPEN = block(ReloadedModBlocks.TRANSPORTATION_TUBE_ENTRANCE_OPEN,
			ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> LASER_EMITTER_OFF = block(ReloadedModBlocks.LASER_EMITTER_OFF, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> LASER_RECEIVER_OFF = block(ReloadedModBlocks.LASER_RECEIVER_OFF, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> REPULSION_GEL_BLOCK = block(ReloadedModBlocks.REPULSION_GEL_BLOCK, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> PROPULSION_GEL_BLOCK = block(ReloadedModBlocks.PROPULSION_GEL_BLOCK,
			ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> LAMP_LEFT = block(ReloadedModBlocks.LAMP_LEFT, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> LAMP_RIGHT = block(ReloadedModBlocks.LAMP_RIGHT, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> DEFAULT_PORTAL_GUN_LB = REGISTRY.register("default_portal_gun_lb", () -> new DefaultPortalGunLBItem());
	public static final RegistryObject<Item> DEFAULT_PORTAL_GUN_O = REGISTRY.register("default_portal_gun_o", () -> new DefaultPortalGunOItem());
	public static final RegistryObject<Item> REPULSION_GEL_IN_A_BUCKET = REGISTRY.register("repulsion_gel_in_a_bucket",
			() -> new RepulsionGelInABucketItem());
	public static final RegistryObject<Item> PROPULSION_GEL_IN_A_BUCKET = REGISTRY.register("propulsion_gel_in_a_bucket",
			() -> new PropulsionGelInABucketItem());
	public static final RegistryObject<Item> SLIDINGDOOR_2RIGHT = block(ReloadedModBlocks.SLIDINGDOOR_2RIGHT, null);
	public static final RegistryObject<Item> REDSTONE_INDICATOR_ON = block(ReloadedModBlocks.REDSTONE_INDICATOR_ON, null);
	public static final RegistryObject<Item> SLIDINGDOOR_2_LEFT_OPEN = block(ReloadedModBlocks.SLIDINGDOOR_2_LEFT_OPEN, null);
	public static final RegistryObject<Item> SLIDINGDOOR_2RIGHT_OPEN = block(ReloadedModBlocks.SLIDINGDOOR_2RIGHT_OPEN, null);
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
	public static final RegistryObject<Item> CUBE_DISPENSER_OPEN = block(ReloadedModBlocks.CUBE_DISPENSER_OPEN, null);
	public static final RegistryObject<Item> INDICATOR_LINE_OFF_UP_CEILLING = block(ReloadedModBlocks.INDICATOR_LINE_OFF_UP_CEILLING, null);
	public static final RegistryObject<Item> INDICATOR_LINE_OFF_CEILLING = block(ReloadedModBlocks.INDICATOR_LINE_OFF_CEILLING, null);
	public static final RegistryObject<Item> INDICATOR_LINE_ON_UP_CEILLING = block(ReloadedModBlocks.INDICATOR_LINE_ON_UP_CEILLING, null);
	public static final RegistryObject<Item> INDICATOR_LINE_ON_CEILLING = block(ReloadedModBlocks.INDICATOR_LINE_ON_CEILLING, null);
	public static final RegistryObject<Item> EMANCIPATION_GRID_LEFT_ON = block(ReloadedModBlocks.EMANCIPATION_GRID_LEFT_ON, null);
	public static final RegistryObject<Item> EMANCIPATION_GRID_RIGHT_ON = block(ReloadedModBlocks.EMANCIPATION_GRID_RIGHT_ON, null);
	public static final RegistryObject<Item> EMANCIPATION_GRID = block(ReloadedModBlocks.EMANCIPATION_GRID, null);
	public static final RegistryObject<Item> BROKEN_BLACK_PANEL_2 = block(ReloadedModBlocks.BROKEN_BLACK_PANEL_2, null);
	public static final RegistryObject<Item> BROKEN_BLACK_PANEL_3 = block(ReloadedModBlocks.BROKEN_BLACK_PANEL_3, null);
	public static final RegistryObject<Item> CATWALK_TURN = block(ReloadedModBlocks.CATWALK_TURN, null);
	public static final RegistryObject<Item> TRANSPORTATION_TUBE_PLACEHOLDER = block(ReloadedModBlocks.TRANSPORTATION_TUBE_PLACEHOLDER, null);
	public static final RegistryObject<Item> LASER_EMITTER_ON = block(ReloadedModBlocks.LASER_EMITTER_ON, null);
	public static final RegistryObject<Item> LASER_RECEIVER_ON = block(ReloadedModBlocks.LASER_RECEIVER_ON, null);
	public static final RegistryObject<Item> HARD_LIGHT_BRIDGE_EMITTER_ON = block(ReloadedModBlocks.HARD_LIGHT_BRIDGE_EMITTER_ON, null);
	public static final RegistryObject<Item> HARD_LIGHT_BRIDGE = block(ReloadedModBlocks.HARD_LIGHT_BRIDGE, null);
	public static final RegistryObject<Item> BROKEN_DIRTY_BLACK_PANEL_2 = block(ReloadedModBlocks.BROKEN_DIRTY_BLACK_PANEL_2, null);
	public static final RegistryObject<Item> BROKEN_DIRTY_BLACK_PANEL_3 = block(ReloadedModBlocks.BROKEN_DIRTY_BLACK_PANEL_3, null);
	public static final RegistryObject<Item> REPULSION_GEL_SPLAT = block(ReloadedModBlocks.REPULSION_GEL_SPLAT, null);
	public static final RegistryObject<Item> PROPULSION_GEL_SPLAT = block(ReloadedModBlocks.PROPULSION_GEL_SPLAT, null);
	public static final RegistryObject<Item> DIRTY_SLIDINGDOOR_2RIGHT = block(ReloadedModBlocks.DIRTY_SLIDINGDOOR_2RIGHT, null);
	public static final RegistryObject<Item> DIRTY_SLIDINGDOOR_2_LEFT_OPEN = block(ReloadedModBlocks.DIRTY_SLIDINGDOOR_2_LEFT_OPEN, null);
	public static final RegistryObject<Item> DIRTY_SLIDINGDOOR_2RIGHTOPEN = block(ReloadedModBlocks.DIRTY_SLIDINGDOOR_2RIGHTOPEN, null);
	public static final RegistryObject<Item> BROKEN_DIRTY_BLACK_PANEL_TILES_2 = block(ReloadedModBlocks.BROKEN_DIRTY_BLACK_PANEL_TILES_2, null);
	public static final RegistryObject<Item> VOID_BLOCK = block(ReloadedModBlocks.VOID_BLOCK, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> RAW_STEEL = REGISTRY.register("raw_steel", () -> new RawSteelItem());
	public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new SteelIngotItem());
	public static final RegistryObject<Item> REINFOREINFORCED_STEEL_INGOT = REGISTRY.register("reinforeinforced_steel_ingot",
			() -> new ReinforeinforcedSteelIngotItem());
	public static final RegistryObject<Item> ENERGY_PRESS = block(ReloadedModBlocks.ENERGY_PRESS, ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> MINIATURE_BLACK_HOLE_BLOCK = block(ReloadedModBlocks.MINIATURE_BLACK_HOLE_BLOCK,
			ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> HANGING_CABLE = block(ReloadedModBlocks.HANGING_CABLE, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> WALL_CABLE = block(ReloadedModBlocks.WALL_CABLE, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> FLOOR_CABLE = block(ReloadedModBlocks.FLOOR_CABLE, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> FLOOR_CABLE_WIRES = block(ReloadedModBlocks.FLOOR_CABLE_WIRES, null);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
