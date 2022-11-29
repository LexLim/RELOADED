
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
import net.mcreator.reloaded.item.OldStorageCubeItemItem;
import net.mcreator.reloaded.item.IndicatorLinkControllerItem;
import net.mcreator.reloaded.item.DiscouragementRedirectionCubeItemItem;
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
	public static final RegistryObject<Item> BLACK_PANEL = block(ReloadedModBlocks.BLACK_PANEL, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> BLACK_PANEL_TILES = block(ReloadedModBlocks.BLACK_PANEL_TILES, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> LONG_BLACK_PANEL = block(ReloadedModBlocks.LONG_BLACK_PANEL, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> BIG_BLACK_PANEL = block(ReloadedModBlocks.BIG_BLACK_PANEL, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> WHITE_PANEL = block(ReloadedModBlocks.WHITE_PANEL, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> WHITE_PANEL_TILES = block(ReloadedModBlocks.WHITE_PANEL_TILES, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> LONG_WHITE_PANEL = block(ReloadedModBlocks.LONG_WHITE_PANEL, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> YELLOW_CASING = block(ReloadedModBlocks.YELLOW_CASING, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> GRAY_CASING = block(ReloadedModBlocks.GRAY_CASING, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> YELLOW_PLANE_CASING = block(ReloadedModBlocks.YELLOW_PLANE_CASING, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> GRAY_PLANE_CASING = block(ReloadedModBlocks.GRAY_PLANE_CASING, ReloadedModTabs.TAB_RELOADED_BLOCKS);
	public static final RegistryObject<Item> SLIDINGDOOR_2LEFT = block(ReloadedModBlocks.SLIDINGDOOR_2LEFT, ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> SLIDINGDOOR_2RIGHT = block(ReloadedModBlocks.SLIDINGDOOR_2RIGHT, null);
	public static final RegistryObject<Item> REDSTON_INDICATOR_OFF = block(ReloadedModBlocks.REDSTON_INDICATOR_OFF,
			ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> REDSTONE_INDICATOR_ON = block(ReloadedModBlocks.REDSTONE_INDICATOR_ON, null);
	public static final RegistryObject<Item> INDICATOR_LINK_CONTROLLER = REGISTRY.register("indicator_link_controller",
			() -> new IndicatorLinkControllerItem());
	public static final RegistryObject<Item> REDSTONE_EMITTER_OFF = block(ReloadedModBlocks.REDSTONE_EMITTER_OFF,
			ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> SLIDINGDOOR_2_LEFT_OPEN = block(ReloadedModBlocks.SLIDINGDOOR_2_LEFT_OPEN, null);
	public static final RegistryObject<Item> SLIDINGDOOR_2RIGHT_OPEN = block(ReloadedModBlocks.SLIDINGDOOR_2RIGHT_OPEN, null);
	public static final RegistryObject<Item> REDSTONE_EMITTER_ON = block(ReloadedModBlocks.REDSTONE_EMITTER_ON, null);
	public static final RegistryObject<Item> INDICATOR_LINE_OFF_STRAIGHT = block(ReloadedModBlocks.INDICATOR_LINE_OFF_STRAIGHT,
			ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> INDICATOR_LINE_OFF_TURN = block(ReloadedModBlocks.INDICATOR_LINE_OFF_TURN, null);
	public static final RegistryObject<Item> INDICATOR_LINE_OFF_UP = block(ReloadedModBlocks.INDICATOR_LINE_OFF_UP, null);
	public static final RegistryObject<Item> INDICATOR_LINE_OFF_WALL = block(ReloadedModBlocks.INDICATOR_LINE_OFF_WALL, null);
	public static final RegistryObject<Item> INDICATOR_LINE_ON_STRAIGHT = block(ReloadedModBlocks.INDICATOR_LINE_ON_STRAIGHT, null);
	public static final RegistryObject<Item> INDICATOR_LINE_ON_TURN = block(ReloadedModBlocks.INDICATOR_LINE_ON_TURN, null);
	public static final RegistryObject<Item> INDICATOR_LINE_ON_UP = block(ReloadedModBlocks.INDICATOR_LINE_ON_UP, null);
	public static final RegistryObject<Item> INDICATOR_LINE_ON_WALL = block(ReloadedModBlocks.INDICATOR_LINE_ON_WALL, null);
	public static final RegistryObject<Item> BUTTON = block(ReloadedModBlocks.BUTTON, ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> BUTTON_ACTIVATED = block(ReloadedModBlocks.BUTTON_ACTIVATED, ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> PEDESTAL_BUTTON = block(ReloadedModBlocks.PEDESTAL_BUTTON, ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> PEDESTAL_BUTTON_ACTIVATED = block(ReloadedModBlocks.PEDESTAL_BUTTON_ACTIVATED, null);
	public static final RegistryObject<Item> PANEL_PLACEHOLDER = block(ReloadedModBlocks.PANEL_PLACEHOLDER, null);
	public static final RegistryObject<Item> WEIGHTED_STORAGE_CUBE_1_ITEM = REGISTRY.register("weighted_storage_cube_1_item",
			() -> new WeightedStorageCube1ItemItem());
	public static final RegistryObject<Item> WEIGHTED_COMPAGNON_CUBE_1_ITEM = REGISTRY.register("weighted_compagnon_cube_1_item",
			() -> new WeightedCompagnonCube1ItemItem());
	public static final RegistryObject<Item> CUBE_DISPENSER = block(ReloadedModBlocks.CUBE_DISPENSER, ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> CUBE_DISPENSER_OPEN = block(ReloadedModBlocks.CUBE_DISPENSER_OPEN, null);
	public static final RegistryObject<Item> INDICATOR_LINE_OFF_UP_CEILLING = block(ReloadedModBlocks.INDICATOR_LINE_OFF_UP_CEILLING, null);
	public static final RegistryObject<Item> INDICATOR_LINE_OFF_CEILLING = block(ReloadedModBlocks.INDICATOR_LINE_OFF_CEILLING, null);
	public static final RegistryObject<Item> INDICATOR_LINE_ON_UP_CEILLING = block(ReloadedModBlocks.INDICATOR_LINE_ON_UP_CEILLING, null);
	public static final RegistryObject<Item> INDICATOR_LINE_ON_CEILLING = block(ReloadedModBlocks.INDICATOR_LINE_ON_CEILLING, null);
	public static final RegistryObject<Item> WEIGHTED_STORAGE_CUBE_2_ITEM = REGISTRY.register("weighted_storage_cube_2_item",
			() -> new WeightedStorageCube2ItemItem());
	public static final RegistryObject<Item> WEIGHTED_COMPAGNON_CUBE_2_ITEM = REGISTRY.register("weighted_compagnon_cube_2_item",
			() -> new WeightedCompagnonCube2ItemItem());
	public static final RegistryObject<Item> OLD_STORAGE_CUBE_ITEM = REGISTRY.register("old_storage_cube_item", () -> new OldStorageCubeItemItem());
	public static final RegistryObject<Item> DISCOURAGEMENT_REDIRECTION_CUBE_ITEM = REGISTRY.register("discouragement_redirection_cube_item",
			() -> new DiscouragementRedirectionCubeItemItem());
	public static final RegistryObject<Item> EMANCIPATION_GRID_LEFT_OFF = block(ReloadedModBlocks.EMANCIPATION_GRID_LEFT_OFF,
			ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> EMANCIPATION_GRID_LEFT_ON = block(ReloadedModBlocks.EMANCIPATION_GRID_LEFT_ON, null);
	public static final RegistryObject<Item> EMANCIPATION_GRID_RIGHT_OFF = block(ReloadedModBlocks.EMANCIPATION_GRID_RIGHT_OFF,
			ReloadedModTabs.TAB_RELOADED_REDSTONE);
	public static final RegistryObject<Item> EMANCIPATION_GRID_RIGHT_ON = block(ReloadedModBlocks.EMANCIPATION_GRID_RIGHT_ON, null);
	public static final RegistryObject<Item> EMANCIPATION_GRID = block(ReloadedModBlocks.EMANCIPATION_GRID, null);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
