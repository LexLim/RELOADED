
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.reloaded.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.reloaded.block.YellowPlaneCasingBlock;
import net.mcreator.reloaded.block.YellowCasingBlock;
import net.mcreator.reloaded.block.WhitePanelTilesBlock;
import net.mcreator.reloaded.block.WhitePanelBlock;
import net.mcreator.reloaded.block.Slidingdoor2rightOpenBlock;
import net.mcreator.reloaded.block.Slidingdoor2rightBlock;
import net.mcreator.reloaded.block.Slidingdoor2leftBlock;
import net.mcreator.reloaded.block.Slidingdoor2LeftOpenBlock;
import net.mcreator.reloaded.block.RedstoneIndicatorOnBlock;
import net.mcreator.reloaded.block.RedstoneEmitterOnBlock;
import net.mcreator.reloaded.block.RedstoneEmitterOffBlock;
import net.mcreator.reloaded.block.RedstonIndicatorOffBlock;
import net.mcreator.reloaded.block.PedestalButtonBlock;
import net.mcreator.reloaded.block.PedestalButtonActivatedBlock;
import net.mcreator.reloaded.block.PanelWithWhiteBlock;
import net.mcreator.reloaded.block.PanelWithBlackBlock;
import net.mcreator.reloaded.block.PanelPlaceholderBlock;
import net.mcreator.reloaded.block.PanelBlock;
import net.mcreator.reloaded.block.OpenPanelWithWhiteBlock;
import net.mcreator.reloaded.block.OpenPanelWithBlackBlock;
import net.mcreator.reloaded.block.OpenPanelBlock;
import net.mcreator.reloaded.block.LongWhitePanelBlock;
import net.mcreator.reloaded.block.LongPanelWithWhiteBlock;
import net.mcreator.reloaded.block.LongPanelWithBlackBlock;
import net.mcreator.reloaded.block.LongPanelBlock;
import net.mcreator.reloaded.block.LongBlackPanelBlock;
import net.mcreator.reloaded.block.IndicatorLineOnWallBlock;
import net.mcreator.reloaded.block.IndicatorLineOnUpCeillingBlock;
import net.mcreator.reloaded.block.IndicatorLineOnUpBlock;
import net.mcreator.reloaded.block.IndicatorLineOnTurnBlock;
import net.mcreator.reloaded.block.IndicatorLineOnStraightBlock;
import net.mcreator.reloaded.block.IndicatorLineOnCeillingBlock;
import net.mcreator.reloaded.block.IndicatorLineOffWallBlock;
import net.mcreator.reloaded.block.IndicatorLineOffUpCeillingBlock;
import net.mcreator.reloaded.block.IndicatorLineOffUpBlock;
import net.mcreator.reloaded.block.IndicatorLineOffTurnBlock;
import net.mcreator.reloaded.block.IndicatorLineOffStraightBlock;
import net.mcreator.reloaded.block.IndicatorLineOffCeillingBlock;
import net.mcreator.reloaded.block.GrayPlaneCasingBlock;
import net.mcreator.reloaded.block.GrayCasingBlock;
import net.mcreator.reloaded.block.CubeDispenserOpenBlock;
import net.mcreator.reloaded.block.CubeDispenserBlock;
import net.mcreator.reloaded.block.ButtonBlock;
import net.mcreator.reloaded.block.ButtonActivatedBlock;
import net.mcreator.reloaded.block.BlackPanelTilesBlock;
import net.mcreator.reloaded.block.BlackPanelBlock;
import net.mcreator.reloaded.block.BigBlackPanelBlock;
import net.mcreator.reloaded.ReloadedMod;

public class ReloadedModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ReloadedMod.MODID);
	public static final RegistryObject<Block> PANEL = REGISTRY.register("panel", () -> new PanelBlock());
	public static final RegistryObject<Block> PANEL_WITH_BLACK = REGISTRY.register("panel_with_black", () -> new PanelWithBlackBlock());
	public static final RegistryObject<Block> PANEL_WITH_WHITE = REGISTRY.register("panel_with_white", () -> new PanelWithWhiteBlock());
	public static final RegistryObject<Block> OPEN_PANEL = REGISTRY.register("open_panel", () -> new OpenPanelBlock());
	public static final RegistryObject<Block> OPEN_PANEL_WITH_BLACK = REGISTRY.register("open_panel_with_black", () -> new OpenPanelWithBlackBlock());
	public static final RegistryObject<Block> OPEN_PANEL_WITH_WHITE = REGISTRY.register("open_panel_with_white", () -> new OpenPanelWithWhiteBlock());
	public static final RegistryObject<Block> LONG_PANEL = REGISTRY.register("long_panel", () -> new LongPanelBlock());
	public static final RegistryObject<Block> LONG_PANEL_WITH_BLACK = REGISTRY.register("long_panel_with_black", () -> new LongPanelWithBlackBlock());
	public static final RegistryObject<Block> LONG_PANEL_WITH_WHITE = REGISTRY.register("long_panel_with_white", () -> new LongPanelWithWhiteBlock());
	public static final RegistryObject<Block> BLACK_PANEL = REGISTRY.register("black_panel", () -> new BlackPanelBlock());
	public static final RegistryObject<Block> BLACK_PANEL_TILES = REGISTRY.register("black_panel_tiles", () -> new BlackPanelTilesBlock());
	public static final RegistryObject<Block> LONG_BLACK_PANEL = REGISTRY.register("long_black_panel", () -> new LongBlackPanelBlock());
	public static final RegistryObject<Block> BIG_BLACK_PANEL = REGISTRY.register("big_black_panel", () -> new BigBlackPanelBlock());
	public static final RegistryObject<Block> WHITE_PANEL = REGISTRY.register("white_panel", () -> new WhitePanelBlock());
	public static final RegistryObject<Block> WHITE_PANEL_TILES = REGISTRY.register("white_panel_tiles", () -> new WhitePanelTilesBlock());
	public static final RegistryObject<Block> LONG_WHITE_PANEL = REGISTRY.register("long_white_panel", () -> new LongWhitePanelBlock());
	public static final RegistryObject<Block> YELLOW_CASING = REGISTRY.register("yellow_casing", () -> new YellowCasingBlock());
	public static final RegistryObject<Block> GRAY_CASING = REGISTRY.register("gray_casing", () -> new GrayCasingBlock());
	public static final RegistryObject<Block> YELLOW_PLANE_CASING = REGISTRY.register("yellow_plane_casing", () -> new YellowPlaneCasingBlock());
	public static final RegistryObject<Block> GRAY_PLANE_CASING = REGISTRY.register("gray_plane_casing", () -> new GrayPlaneCasingBlock());
	public static final RegistryObject<Block> SLIDINGDOOR_2LEFT = REGISTRY.register("slidingdoor_2left", () -> new Slidingdoor2leftBlock());
	public static final RegistryObject<Block> SLIDINGDOOR_2RIGHT = REGISTRY.register("slidingdoor_2right", () -> new Slidingdoor2rightBlock());
	public static final RegistryObject<Block> REDSTON_INDICATOR_OFF = REGISTRY.register("redston_indicator_off",
			() -> new RedstonIndicatorOffBlock());
	public static final RegistryObject<Block> REDSTONE_INDICATOR_ON = REGISTRY.register("redstone_indicator_on",
			() -> new RedstoneIndicatorOnBlock());
	public static final RegistryObject<Block> REDSTONE_EMITTER_OFF = REGISTRY.register("redstone_emitter_off", () -> new RedstoneEmitterOffBlock());
	public static final RegistryObject<Block> SLIDINGDOOR_2_LEFT_OPEN = REGISTRY.register("slidingdoor_2_left_open",
			() -> new Slidingdoor2LeftOpenBlock());
	public static final RegistryObject<Block> SLIDINGDOOR_2RIGHT_OPEN = REGISTRY.register("slidingdoor_2right_open",
			() -> new Slidingdoor2rightOpenBlock());
	public static final RegistryObject<Block> REDSTONE_EMITTER_ON = REGISTRY.register("redstone_emitter_on", () -> new RedstoneEmitterOnBlock());
	public static final RegistryObject<Block> INDICATOR_LINE_OFF_STRAIGHT = REGISTRY.register("indicator_line_off_straight",
			() -> new IndicatorLineOffStraightBlock());
	public static final RegistryObject<Block> INDICATOR_LINE_OFF_TURN = REGISTRY.register("indicator_line_off_turn",
			() -> new IndicatorLineOffTurnBlock());
	public static final RegistryObject<Block> INDICATOR_LINE_OFF_UP = REGISTRY.register("indicator_line_off_up", () -> new IndicatorLineOffUpBlock());
	public static final RegistryObject<Block> INDICATOR_LINE_OFF_WALL = REGISTRY.register("indicator_line_off_wall",
			() -> new IndicatorLineOffWallBlock());
	public static final RegistryObject<Block> INDICATOR_LINE_ON_STRAIGHT = REGISTRY.register("indicator_line_on_straight",
			() -> new IndicatorLineOnStraightBlock());
	public static final RegistryObject<Block> INDICATOR_LINE_ON_TURN = REGISTRY.register("indicator_line_on_turn",
			() -> new IndicatorLineOnTurnBlock());
	public static final RegistryObject<Block> INDICATOR_LINE_ON_UP = REGISTRY.register("indicator_line_on_up", () -> new IndicatorLineOnUpBlock());
	public static final RegistryObject<Block> INDICATOR_LINE_ON_WALL = REGISTRY.register("indicator_line_on_wall",
			() -> new IndicatorLineOnWallBlock());
	public static final RegistryObject<Block> BUTTON = REGISTRY.register("button", () -> new ButtonBlock());
	public static final RegistryObject<Block> BUTTON_ACTIVATED = REGISTRY.register("button_activated", () -> new ButtonActivatedBlock());
	public static final RegistryObject<Block> PEDESTAL_BUTTON = REGISTRY.register("pedestal_button", () -> new PedestalButtonBlock());
	public static final RegistryObject<Block> PEDESTAL_BUTTON_ACTIVATED = REGISTRY.register("pedestal_button_activated",
			() -> new PedestalButtonActivatedBlock());
	public static final RegistryObject<Block> PANEL_PLACEHOLDER = REGISTRY.register("panel_placeholder", () -> new PanelPlaceholderBlock());
	public static final RegistryObject<Block> CUBE_DISPENSER = REGISTRY.register("cube_dispenser", () -> new CubeDispenserBlock());
	public static final RegistryObject<Block> CUBE_DISPENSER_OPEN = REGISTRY.register("cube_dispenser_open", () -> new CubeDispenserOpenBlock());
	public static final RegistryObject<Block> INDICATOR_LINE_OFF_UP_CEILLING = REGISTRY.register("indicator_line_off_up_ceilling",
			() -> new IndicatorLineOffUpCeillingBlock());
	public static final RegistryObject<Block> INDICATOR_LINE_OFF_CEILLING = REGISTRY.register("indicator_line_off_ceilling",
			() -> new IndicatorLineOffCeillingBlock());
	public static final RegistryObject<Block> INDICATOR_LINE_ON_UP_CEILLING = REGISTRY.register("indicator_line_on_up_ceilling",
			() -> new IndicatorLineOnUpCeillingBlock());
	public static final RegistryObject<Block> INDICATOR_LINE_ON_CEILLING = REGISTRY.register("indicator_line_on_ceilling",
			() -> new IndicatorLineOnCeillingBlock());
}
