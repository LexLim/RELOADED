
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.reloaded.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.reloaded.block.YellowSupportPipeBlock;
import net.mcreator.reloaded.block.YellowPlaneCasingBlock;
import net.mcreator.reloaded.block.YellowPanelBlock;
import net.mcreator.reloaded.block.YellowPanel2Block;
import net.mcreator.reloaded.block.YellowPanel1Block;
import net.mcreator.reloaded.block.YellowCasingBlock;
import net.mcreator.reloaded.block.WhitePanelTilesBlock;
import net.mcreator.reloaded.block.WhitePanelTiles1Block;
import net.mcreator.reloaded.block.WhitePanelSlabBlock;
import net.mcreator.reloaded.block.WhitePanelBlock;
import net.mcreator.reloaded.block.WallPanelBlock;
import net.mcreator.reloaded.block.WallMonitorTextBlock;
import net.mcreator.reloaded.block.WallMonitorLogoBlock;
import net.mcreator.reloaded.block.WallMonitorBlock;
import net.mcreator.reloaded.block.WallCableBlock;
import net.mcreator.reloaded.block.VoidBlockBlock;
import net.mcreator.reloaded.block.TransportationTubeBlock;
import net.mcreator.reloaded.block.TestingGlassTopBlock;
import net.mcreator.reloaded.block.TestingGlassBottomBlock;
import net.mcreator.reloaded.block.TestingGlassBlock;
import net.mcreator.reloaded.block.SupportBlockBlock;
import net.mcreator.reloaded.block.SupportBeamBlock;
import net.mcreator.reloaded.block.SturdySteelBlock;
import net.mcreator.reloaded.block.SmallPipeBlock;
import net.mcreator.reloaded.block.SlidingOfficeDoorTopOpenBlock;
import net.mcreator.reloaded.block.SlidingOfficeDoorTopBlock;
import net.mcreator.reloaded.block.SlidingOfficeDoorOpenBlock;
import net.mcreator.reloaded.block.SlidingOfficeDoorBlock;
import net.mcreator.reloaded.block.SlidingDoor2OpenBlock;
import net.mcreator.reloaded.block.SlidingDoor2Block;
import net.mcreator.reloaded.block.SlidingDoor2AnimCloseBlock;
import net.mcreator.reloaded.block.SlidingDoor2AnimBlock;
import net.mcreator.reloaded.block.ServerTopBlock;
import net.mcreator.reloaded.block.ServerBottomBlock;
import net.mcreator.reloaded.block.RepulsionGelSplatBlock;
import net.mcreator.reloaded.block.RepulsionGelBlockBlock;
import net.mcreator.reloaded.block.RedstoneIndicatorOnBlock;
import net.mcreator.reloaded.block.RedstoneEmitterOnBlock;
import net.mcreator.reloaded.block.RedstoneEmitterOffBlock;
import net.mcreator.reloaded.block.RedstonIndicatorOffBlock;
import net.mcreator.reloaded.block.RadioBlock;
import net.mcreator.reloaded.block.Radio45Block;
import net.mcreator.reloaded.block.PropulsionGelSplatBlock;
import net.mcreator.reloaded.block.PropulsionGelBlockBlock;
import net.mcreator.reloaded.block.PedestalButtonBlock;
import net.mcreator.reloaded.block.PedestalButtonActivatedBlock;
import net.mcreator.reloaded.block.PanelPlaceholderBlock;
import net.mcreator.reloaded.block.PanelCasingBlock;
import net.mcreator.reloaded.block.PanelBlock;
import net.mcreator.reloaded.block.OldGreenPanelBlock;
import net.mcreator.reloaded.block.OldBluePanelBlock;
import net.mcreator.reloaded.block.ObservationWallTopBlock;
import net.mcreator.reloaded.block.ObservationWallMiddleBlock;
import net.mcreator.reloaded.block.ObservationWallBottomBlock;
import net.mcreator.reloaded.block.ObservationWallBlock;
import net.mcreator.reloaded.block.LongWhitePanelTopBlock;
import net.mcreator.reloaded.block.LongWhitePanelBlock;
import net.mcreator.reloaded.block.LongPanelBlock;
import net.mcreator.reloaded.block.LongOlgGreenPanelBlock;
import net.mcreator.reloaded.block.LongOldBluePanelBlock;
import net.mcreator.reloaded.block.LaserReveiverOnBlock;
import net.mcreator.reloaded.block.LaserReceiverOffBlock;
import net.mcreator.reloaded.block.LaserEmitterOnBlock;
import net.mcreator.reloaded.block.LaserEmitterOffBlock;
import net.mcreator.reloaded.block.LampTopBlock;
import net.mcreator.reloaded.block.LampBlock;
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
import net.mcreator.reloaded.block.HardLightBridgeEmitterOnBlock;
import net.mcreator.reloaded.block.HardLightBridgeEmitterOffBlock;
import net.mcreator.reloaded.block.HardLightBridgeBlock;
import net.mcreator.reloaded.block.HangingCableBlock;
import net.mcreator.reloaded.block.GrayPlaneCasingBlock;
import net.mcreator.reloaded.block.GrayPanelBlock;
import net.mcreator.reloaded.block.GrayPanel2Block;
import net.mcreator.reloaded.block.GrayPanel1Block;
import net.mcreator.reloaded.block.GrayCasingBlock;
import net.mcreator.reloaded.block.FloorCableWiresBlock;
import net.mcreator.reloaded.block.FloorCableBlock;
import net.mcreator.reloaded.block.FlatCasingBlock;
import net.mcreator.reloaded.block.FizzlerOnBlock;
import net.mcreator.reloaded.block.FizzlerOffBlock;
import net.mcreator.reloaded.block.ElevatorTopBlock;
import net.mcreator.reloaded.block.ElevatorMiddleTopBlock;
import net.mcreator.reloaded.block.ElevatorMiddleBottomBlock;
import net.mcreator.reloaded.block.ElevatorBottomBlock;
import net.mcreator.reloaded.block.DirtyWhitePanelTilesBlock;
import net.mcreator.reloaded.block.DirtyWhitePanelSlabBlock;
import net.mcreator.reloaded.block.DirtyWhitePanelBlock;
import net.mcreator.reloaded.block.DirtyLongWhitePanelTopBlock;
import net.mcreator.reloaded.block.DirtyLongWhitePanelBlock;
import net.mcreator.reloaded.block.DirtyBlackPanelTilesBlock;
import net.mcreator.reloaded.block.DirtyBlackPanelSlabBlock;
import net.mcreator.reloaded.block.DirtyBlackPanelBlock;
import net.mcreator.reloaded.block.DirtyBigBlackPanelRightBlock;
import net.mcreator.reloaded.block.DirtyBigBlackPanelLeftBlock;
import net.mcreator.reloaded.block.DeskRightBlock;
import net.mcreator.reloaded.block.DeskMiddleBlock;
import net.mcreator.reloaded.block.DeskLeftBlock;
import net.mcreator.reloaded.block.DeskBlock;
import net.mcreator.reloaded.block.CubeDispenserOpenBlock;
import net.mcreator.reloaded.block.CubeDispenserBlock;
import net.mcreator.reloaded.block.ChairBlock;
import net.mcreator.reloaded.block.CatwalkTurnBlock;
import net.mcreator.reloaded.block.CatwalkStairsBlock;
import net.mcreator.reloaded.block.CatwalkIntersectionBlock;
import net.mcreator.reloaded.block.CatwalkCrossroadsBlock;
import net.mcreator.reloaded.block.CatwalkBlock;
import net.mcreator.reloaded.block.ButtonBlock;
import net.mcreator.reloaded.block.BrokenTestingGlassTopBlock;
import net.mcreator.reloaded.block.BrokenTestingGlassBottomBlock;
import net.mcreator.reloaded.block.BrokenTestingGlassBlock;
import net.mcreator.reloaded.block.BrokenDirtyBlackPanelTiles2Block;
import net.mcreator.reloaded.block.BrokenDirtyBlackPanelTiles1Block;
import net.mcreator.reloaded.block.BrokenDirtyBlackPanel3Block;
import net.mcreator.reloaded.block.BrokenDirtyBlackPanel2Block;
import net.mcreator.reloaded.block.BrokenDirtyBlackPanel1Block;
import net.mcreator.reloaded.block.BrokenDirtyBigBlackPanelRightBlock;
import net.mcreator.reloaded.block.BrokenDirtyBigBlackPanelLeftBlock;
import net.mcreator.reloaded.block.BrokenBlackPanelTilesBlock;
import net.mcreator.reloaded.block.BrokenBlackPanel3Block;
import net.mcreator.reloaded.block.BrokenBlackPanel2Block;
import net.mcreator.reloaded.block.BrokenBlackPanel1Block;
import net.mcreator.reloaded.block.BlueSupportPipeBlock;
import net.mcreator.reloaded.block.BlackPanelTilesBlock;
import net.mcreator.reloaded.block.BlackPanelSlabBlock;
import net.mcreator.reloaded.block.BlackPanelBlock;
import net.mcreator.reloaded.block.BlackLampRightBlock;
import net.mcreator.reloaded.block.BlackLampLeftBlock;
import net.mcreator.reloaded.block.BigPipeBlock;
import net.mcreator.reloaded.block.BigBlackPanelRightTopBlock;
import net.mcreator.reloaded.block.BigBlackPanelRightBlock;
import net.mcreator.reloaded.block.BigBlackPanelLeftTopBlock;
import net.mcreator.reloaded.block.BigBlackPanelLeftBlock;
import net.mcreator.reloaded.block.AsbestosTilesBlock;
import net.mcreator.reloaded.block.AsbestosBlockBlock;
import net.mcreator.reloaded.ReloadedMod;

public class ReloadedModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ReloadedMod.MODID);
	public static final RegistryObject<Block> PANEL = REGISTRY.register("panel", () -> new PanelBlock());
	public static final RegistryObject<Block> REDSTON_INDICATOR_OFF = REGISTRY.register("redston_indicator_off", () -> new RedstonIndicatorOffBlock());
	public static final RegistryObject<Block> REDSTONE_EMITTER_OFF = REGISTRY.register("redstone_emitter_off", () -> new RedstoneEmitterOffBlock());
	public static final RegistryObject<Block> INDICATOR_LINE_OFF_STRAIGHT = REGISTRY.register("indicator_line_off_straight", () -> new IndicatorLineOffStraightBlock());
	public static final RegistryObject<Block> BUTTON = REGISTRY.register("button", () -> new ButtonBlock());
	public static final RegistryObject<Block> PEDESTAL_BUTTON = REGISTRY.register("pedestal_button", () -> new PedestalButtonBlock());
	public static final RegistryObject<Block> HARD_LIGHT_BRIDGE_EMITTER_OFF = REGISTRY.register("hard_light_bridge_emitter_off", () -> new HardLightBridgeEmitterOffBlock());
	public static final RegistryObject<Block> SLIDING_DOOR_2 = REGISTRY.register("sliding_door_2", () -> new SlidingDoor2Block());
	public static final RegistryObject<Block> FIZZLER_OFF = REGISTRY.register("fizzler_off", () -> new FizzlerOffBlock());
	public static final RegistryObject<Block> WHITE_PANEL = REGISTRY.register("white_panel", () -> new WhitePanelBlock());
	public static final RegistryObject<Block> WHITE_PANEL_SLAB = REGISTRY.register("white_panel_slab", () -> new WhitePanelSlabBlock());
	public static final RegistryObject<Block> LONG_WHITE_PANEL = REGISTRY.register("long_white_panel", () -> new LongWhitePanelBlock());
	public static final RegistryObject<Block> WHITE_PANEL_TILES = REGISTRY.register("white_panel_tiles", () -> new WhitePanelTilesBlock());
	public static final RegistryObject<Block> DIRTY_WHITE_PANEL = REGISTRY.register("dirty_white_panel", () -> new DirtyWhitePanelBlock());
	public static final RegistryObject<Block> DIRTY_WHITE_PANEL_SLAB = REGISTRY.register("dirty_white_panel_slab", () -> new DirtyWhitePanelSlabBlock());
	public static final RegistryObject<Block> DIRTY_LONG_WHITE_PANEL = REGISTRY.register("dirty_long_white_panel", () -> new DirtyLongWhitePanelBlock());
	public static final RegistryObject<Block> DIRTY_WHITE_PANEL_TILES = REGISTRY.register("dirty_white_panel_tiles", () -> new DirtyWhitePanelTilesBlock());
	public static final RegistryObject<Block> BLACK_PANEL = REGISTRY.register("black_panel", () -> new BlackPanelBlock());
	public static final RegistryObject<Block> BLACK_PANEL_SLAB = REGISTRY.register("black_panel_slab", () -> new BlackPanelSlabBlock());
	public static final RegistryObject<Block> BIG_BLACK_PANEL_LEFT = REGISTRY.register("big_black_panel_left", () -> new BigBlackPanelLeftBlock());
	public static final RegistryObject<Block> BIG_BLACK_PANEL_RIGHT = REGISTRY.register("big_black_panel_right", () -> new BigBlackPanelRightBlock());
	public static final RegistryObject<Block> BLACK_PANEL_TILES = REGISTRY.register("black_panel_tiles", () -> new BlackPanelTilesBlock());
	public static final RegistryObject<Block> BROKEN_BLACK_PANEL_1 = REGISTRY.register("broken_black_panel_1", () -> new BrokenBlackPanel1Block());
	public static final RegistryObject<Block> BROKEN_BLACK_PANEL_TILES = REGISTRY.register("broken_black_panel_tiles", () -> new BrokenBlackPanelTilesBlock());
	public static final RegistryObject<Block> DIRTY_BLACK_PANEL = REGISTRY.register("dirty_black_panel", () -> new DirtyBlackPanelBlock());
	public static final RegistryObject<Block> DIRTY_BLACK_PANEL_SLAB = REGISTRY.register("dirty_black_panel_slab", () -> new DirtyBlackPanelSlabBlock());
	public static final RegistryObject<Block> DIRTY_BIG_BLACK_PANEL_LEFT = REGISTRY.register("dirty_big_black_panel_left", () -> new DirtyBigBlackPanelLeftBlock());
	public static final RegistryObject<Block> DIRTY_BIG_BLACK_PANEL_RIGHT = REGISTRY.register("dirty_big_black_panel_right", () -> new DirtyBigBlackPanelRightBlock());
	public static final RegistryObject<Block> DIRTY_BLACK_PANEL_TILES = REGISTRY.register("dirty_black_panel_tiles", () -> new DirtyBlackPanelTilesBlock());
	public static final RegistryObject<Block> BROKEN_DIRTY_BLACK_PANEL_1 = REGISTRY.register("broken_dirty_black_panel_1", () -> new BrokenDirtyBlackPanel1Block());
	public static final RegistryObject<Block> BROKEN_DIRTY_BLACK_PANEL_TILES_1 = REGISTRY.register("broken_dirty_black_panel_tiles_1", () -> new BrokenDirtyBlackPanelTiles1Block());
	public static final RegistryObject<Block> BROKEN_DIRTY_BIG_BLACK_PANEL_LEFT = REGISTRY.register("broken_dirty_big_black_panel_left", () -> new BrokenDirtyBigBlackPanelLeftBlock());
	public static final RegistryObject<Block> BROKEN_DIRTY_BIG_BLACK_PANEL_RIGHT = REGISTRY.register("broken_dirty_big_black_panel_right", () -> new BrokenDirtyBigBlackPanelRightBlock());
	public static final RegistryObject<Block> OLD_GREEN_PANEL = REGISTRY.register("old_green_panel", () -> new OldGreenPanelBlock());
	public static final RegistryObject<Block> LONG_OLG_GREEN_PANEL = REGISTRY.register("long_olg_green_panel", () -> new LongOlgGreenPanelBlock());
	public static final RegistryObject<Block> OLD_BLUE_PANEL = REGISTRY.register("old_blue_panel", () -> new OldBluePanelBlock());
	public static final RegistryObject<Block> LONG_OLD_BLUE_PANEL = REGISTRY.register("long_old_blue_panel", () -> new LongOldBluePanelBlock());
	public static final RegistryObject<Block> SUPPORT_BEAM = REGISTRY.register("support_beam", () -> new SupportBeamBlock());
	public static final RegistryObject<Block> ASBESTOS_BLOCK = REGISTRY.register("asbestos_block", () -> new AsbestosBlockBlock());
	public static final RegistryObject<Block> ASBESTOS_TILES = REGISTRY.register("asbestos_tiles", () -> new AsbestosTilesBlock());
	public static final RegistryObject<Block> BIG_PIPE = REGISTRY.register("big_pipe", () -> new BigPipeBlock());
	public static final RegistryObject<Block> SMALL_PIPE = REGISTRY.register("small_pipe", () -> new SmallPipeBlock());
	public static final RegistryObject<Block> SUPPORT_BLOCK = REGISTRY.register("support_block", () -> new SupportBlockBlock());
	public static final RegistryObject<Block> BLUE_SUPPORT_PIPE = REGISTRY.register("blue_support_pipe", () -> new BlueSupportPipeBlock());
	public static final RegistryObject<Block> YELLOW_SUPPORT_PIPE = REGISTRY.register("yellow_support_pipe", () -> new YellowSupportPipeBlock());
	public static final RegistryObject<Block> TRANSPORTATION_TUBE = REGISTRY.register("transportation_tube", () -> new TransportationTubeBlock());
	public static final RegistryObject<Block> LASER_EMITTER_OFF = REGISTRY.register("laser_emitter_off", () -> new LaserEmitterOffBlock());
	public static final RegistryObject<Block> LASER_RECEIVER_OFF = REGISTRY.register("laser_receiver_off", () -> new LaserReceiverOffBlock());
	public static final RegistryObject<Block> REPULSION_GEL_BLOCK = REGISTRY.register("repulsion_gel_block", () -> new RepulsionGelBlockBlock());
	public static final RegistryObject<Block> PROPULSION_GEL_BLOCK = REGISTRY.register("propulsion_gel_block", () -> new PropulsionGelBlockBlock());
	public static final RegistryObject<Block> HANGING_CABLE = REGISTRY.register("hanging_cable", () -> new HangingCableBlock());
	public static final RegistryObject<Block> WALL_CABLE = REGISTRY.register("wall_cable", () -> new WallCableBlock());
	public static final RegistryObject<Block> FLOOR_CABLE = REGISTRY.register("floor_cable", () -> new FloorCableBlock());
	public static final RegistryObject<Block> OBSERVATION_WALL = REGISTRY.register("observation_wall", () -> new ObservationWallBlock());
	public static final RegistryObject<Block> VOID_BLOCK = REGISTRY.register("void_block", () -> new VoidBlockBlock());
	public static final RegistryObject<Block> YELLOW_CASING = REGISTRY.register("yellow_casing", () -> new YellowCasingBlock());
	public static final RegistryObject<Block> GRAY_CASING = REGISTRY.register("gray_casing", () -> new GrayCasingBlock());
	public static final RegistryObject<Block> YELLOW_PLANE_CASING = REGISTRY.register("yellow_plane_casing", () -> new YellowPlaneCasingBlock());
	public static final RegistryObject<Block> GRAY_PLANE_CASING = REGISTRY.register("gray_plane_casing", () -> new GrayPlaneCasingBlock());
	public static final RegistryObject<Block> PANEL_CASING = REGISTRY.register("panel_casing", () -> new PanelCasingBlock());
	public static final RegistryObject<Block> CATWALK = REGISTRY.register("catwalk", () -> new CatwalkBlock());
	public static final RegistryObject<Block> CATWALK_TURN = REGISTRY.register("catwalk_turn", () -> new CatwalkTurnBlock());
	public static final RegistryObject<Block> CATWALK_STAIRS = REGISTRY.register("catwalk_stairs", () -> new CatwalkStairsBlock());
	public static final RegistryObject<Block> CATWALK_INTERSECTION = REGISTRY.register("catwalk_intersection", () -> new CatwalkIntersectionBlock());
	public static final RegistryObject<Block> CATWALK_CROSSROADS = REGISTRY.register("catwalk_crossroads", () -> new CatwalkCrossroadsBlock());
	public static final RegistryObject<Block> REDSTONE_INDICATOR_ON = REGISTRY.register("redstone_indicator_on", () -> new RedstoneIndicatorOnBlock());
	public static final RegistryObject<Block> REDSTONE_EMITTER_ON = REGISTRY.register("redstone_emitter_on", () -> new RedstoneEmitterOnBlock());
	public static final RegistryObject<Block> INDICATOR_LINE_OFF_TURN = REGISTRY.register("indicator_line_off_turn", () -> new IndicatorLineOffTurnBlock());
	public static final RegistryObject<Block> INDICATOR_LINE_OFF_UP = REGISTRY.register("indicator_line_off_up", () -> new IndicatorLineOffUpBlock());
	public static final RegistryObject<Block> INDICATOR_LINE_OFF_WALL = REGISTRY.register("indicator_line_off_wall", () -> new IndicatorLineOffWallBlock());
	public static final RegistryObject<Block> INDICATOR_LINE_ON_STRAIGHT = REGISTRY.register("indicator_line_on_straight", () -> new IndicatorLineOnStraightBlock());
	public static final RegistryObject<Block> INDICATOR_LINE_ON_TURN = REGISTRY.register("indicator_line_on_turn", () -> new IndicatorLineOnTurnBlock());
	public static final RegistryObject<Block> INDICATOR_LINE_ON_UP = REGISTRY.register("indicator_line_on_up", () -> new IndicatorLineOnUpBlock());
	public static final RegistryObject<Block> INDICATOR_LINE_ON_WALL = REGISTRY.register("indicator_line_on_wall", () -> new IndicatorLineOnWallBlock());
	public static final RegistryObject<Block> PEDESTAL_BUTTON_ACTIVATED = REGISTRY.register("pedestal_button_activated", () -> new PedestalButtonActivatedBlock());
	public static final RegistryObject<Block> PANEL_PLACEHOLDER = REGISTRY.register("panel_placeholder", () -> new PanelPlaceholderBlock());
	public static final RegistryObject<Block> INDICATOR_LINE_OFF_UP_CEILLING = REGISTRY.register("indicator_line_off_up_ceilling", () -> new IndicatorLineOffUpCeillingBlock());
	public static final RegistryObject<Block> INDICATOR_LINE_OFF_CEILLING = REGISTRY.register("indicator_line_off_ceilling", () -> new IndicatorLineOffCeillingBlock());
	public static final RegistryObject<Block> INDICATOR_LINE_ON_UP_CEILLING = REGISTRY.register("indicator_line_on_up_ceilling", () -> new IndicatorLineOnUpCeillingBlock());
	public static final RegistryObject<Block> INDICATOR_LINE_ON_CEILLING = REGISTRY.register("indicator_line_on_ceilling", () -> new IndicatorLineOnCeillingBlock());
	public static final RegistryObject<Block> BROKEN_BLACK_PANEL_2 = REGISTRY.register("broken_black_panel_2", () -> new BrokenBlackPanel2Block());
	public static final RegistryObject<Block> BROKEN_BLACK_PANEL_3 = REGISTRY.register("broken_black_panel_3", () -> new BrokenBlackPanel3Block());
	public static final RegistryObject<Block> LASER_EMITTER_ON = REGISTRY.register("laser_emitter_on", () -> new LaserEmitterOnBlock());
	public static final RegistryObject<Block> HARD_LIGHT_BRIDGE_EMITTER_ON = REGISTRY.register("hard_light_bridge_emitter_on", () -> new HardLightBridgeEmitterOnBlock());
	public static final RegistryObject<Block> HARD_LIGHT_BRIDGE = REGISTRY.register("hard_light_bridge", () -> new HardLightBridgeBlock());
	public static final RegistryObject<Block> BROKEN_DIRTY_BLACK_PANEL_2 = REGISTRY.register("broken_dirty_black_panel_2", () -> new BrokenDirtyBlackPanel2Block());
	public static final RegistryObject<Block> BROKEN_DIRTY_BLACK_PANEL_3 = REGISTRY.register("broken_dirty_black_panel_3", () -> new BrokenDirtyBlackPanel3Block());
	public static final RegistryObject<Block> REPULSION_GEL_SPLAT = REGISTRY.register("repulsion_gel_splat", () -> new RepulsionGelSplatBlock());
	public static final RegistryObject<Block> PROPULSION_GEL_SPLAT = REGISTRY.register("propulsion_gel_splat", () -> new PropulsionGelSplatBlock());
	public static final RegistryObject<Block> BROKEN_DIRTY_BLACK_PANEL_TILES_2 = REGISTRY.register("broken_dirty_black_panel_tiles_2", () -> new BrokenDirtyBlackPanelTiles2Block());
	public static final RegistryObject<Block> FLOOR_CABLE_WIRES = REGISTRY.register("floor_cable_wires", () -> new FloorCableWiresBlock());
	public static final RegistryObject<Block> LASER_REVEIVER_ON = REGISTRY.register("laser_reveiver_on", () -> new LaserReveiverOnBlock());
	public static final RegistryObject<Block> SLIDING_DOOR_2_ANIM = REGISTRY.register("sliding_door_2_anim", () -> new SlidingDoor2AnimBlock());
	public static final RegistryObject<Block> SLIDING_DOOR_2_OPEN = REGISTRY.register("sliding_door_2_open", () -> new SlidingDoor2OpenBlock());
	public static final RegistryObject<Block> SLIDING_DOOR_2_ANIM_CLOSE = REGISTRY.register("sliding_door_2_anim_close", () -> new SlidingDoor2AnimCloseBlock());
	public static final RegistryObject<Block> OBSERVATION_WALL_TOP = REGISTRY.register("observation_wall_top", () -> new ObservationWallTopBlock());
	public static final RegistryObject<Block> OBSERVATION_WALL_BOTTOM = REGISTRY.register("observation_wall_bottom", () -> new ObservationWallBottomBlock());
	public static final RegistryObject<Block> OBSERVATION_WALL_MIDDLE = REGISTRY.register("observation_wall_middle", () -> new ObservationWallMiddleBlock());
	public static final RegistryObject<Block> FIZZLER_ON = REGISTRY.register("fizzler_on", () -> new FizzlerOnBlock());
	public static final RegistryObject<Block> WHITE_PANEL_TILES_1 = REGISTRY.register("white_panel_tiles_1", () -> new WhitePanelTiles1Block());
	public static final RegistryObject<Block> LONG_WHITE_PANEL_TOP = REGISTRY.register("long_white_panel_top", () -> new LongWhitePanelTopBlock());
	public static final RegistryObject<Block> DIRTY_LONG_WHITE_PANEL_TOP = REGISTRY.register("dirty_long_white_panel_top", () -> new DirtyLongWhitePanelTopBlock());
	public static final RegistryObject<Block> BIG_BLACK_PANEL_LEFT_TOP = REGISTRY.register("big_black_panel_left_top", () -> new BigBlackPanelLeftTopBlock());
	public static final RegistryObject<Block> BIG_BLACK_PANEL_RIGHT_TOP = REGISTRY.register("big_black_panel_right_top", () -> new BigBlackPanelRightTopBlock());
	public static final RegistryObject<Block> CUBE_DISPENSER = REGISTRY.register("cube_dispenser", () -> new CubeDispenserBlock());
	public static final RegistryObject<Block> CUBE_DISPENSER_OPEN = REGISTRY.register("cube_dispenser_open", () -> new CubeDispenserOpenBlock());
	public static final RegistryObject<Block> FLAT_CASING = REGISTRY.register("flat_casing", () -> new FlatCasingBlock());
	public static final RegistryObject<Block> WALL_PANEL = REGISTRY.register("wall_panel", () -> new WallPanelBlock());
	public static final RegistryObject<Block> STURDY_STEEL = REGISTRY.register("sturdy_steel", () -> new SturdySteelBlock());
	public static final RegistryObject<Block> GRAY_PANEL = REGISTRY.register("gray_panel", () -> new GrayPanelBlock());
	public static final RegistryObject<Block> GRAY_PANEL_1 = REGISTRY.register("gray_panel_1", () -> new GrayPanel1Block());
	public static final RegistryObject<Block> GRAY_PANEL_2 = REGISTRY.register("gray_panel_2", () -> new GrayPanel2Block());
	public static final RegistryObject<Block> YELLOW_PANEL = REGISTRY.register("yellow_panel", () -> new YellowPanelBlock());
	public static final RegistryObject<Block> YELLOW_PANEL_1 = REGISTRY.register("yellow_panel_1", () -> new YellowPanel1Block());
	public static final RegistryObject<Block> YELLOW_PANEL_2 = REGISTRY.register("yellow_panel_2", () -> new YellowPanel2Block());
	public static final RegistryObject<Block> WALL_MONITOR = REGISTRY.register("wall_monitor", () -> new WallMonitorBlock());
	public static final RegistryObject<Block> WALL_MONITOR_TEXT = REGISTRY.register("wall_monitor_text", () -> new WallMonitorTextBlock());
	public static final RegistryObject<Block> WALL_MONITOR_LOGO = REGISTRY.register("wall_monitor_logo", () -> new WallMonitorLogoBlock());
	public static final RegistryObject<Block> SERVER_BOTTOM = REGISTRY.register("server_bottom", () -> new ServerBottomBlock());
	public static final RegistryObject<Block> SERVER_TOP = REGISTRY.register("server_top", () -> new ServerTopBlock());
	public static final RegistryObject<Block> DESK = REGISTRY.register("desk", () -> new DeskBlock());
	public static final RegistryObject<Block> DESK_RIGHT = REGISTRY.register("desk_right", () -> new DeskRightBlock());
	public static final RegistryObject<Block> DESK_LEFT = REGISTRY.register("desk_left", () -> new DeskLeftBlock());
	public static final RegistryObject<Block> DESK_MIDDLE = REGISTRY.register("desk_middle", () -> new DeskMiddleBlock());
	public static final RegistryObject<Block> CHAIR = REGISTRY.register("chair", () -> new ChairBlock());
	public static final RegistryObject<Block> TESTING_GLASS = REGISTRY.register("testing_glass", () -> new TestingGlassBlock());
	public static final RegistryObject<Block> TESTING_GLASS_BOTTOM = REGISTRY.register("testing_glass_bottom", () -> new TestingGlassBottomBlock());
	public static final RegistryObject<Block> TESTING_GLASS_TOP = REGISTRY.register("testing_glass_top", () -> new TestingGlassTopBlock());
	public static final RegistryObject<Block> BROKEN_TESTING_GLASS = REGISTRY.register("broken_testing_glass", () -> new BrokenTestingGlassBlock());
	public static final RegistryObject<Block> BROKEN_TESTING_GLASS_BOTTOM = REGISTRY.register("broken_testing_glass_bottom", () -> new BrokenTestingGlassBottomBlock());
	public static final RegistryObject<Block> BROKEN_TESTING_GLASS_TOP = REGISTRY.register("broken_testing_glass_top", () -> new BrokenTestingGlassTopBlock());
	public static final RegistryObject<Block> SLIDING_OFFICE_DOOR = REGISTRY.register("sliding_office_door", () -> new SlidingOfficeDoorBlock());
	public static final RegistryObject<Block> SLIDING_OFFICE_DOOR_TOP = REGISTRY.register("sliding_office_door_top", () -> new SlidingOfficeDoorTopBlock());
	public static final RegistryObject<Block> SLIDING_OFFICE_DOOR_OPEN = REGISTRY.register("sliding_office_door_open", () -> new SlidingOfficeDoorOpenBlock());
	public static final RegistryObject<Block> SLIDING_OFFICE_DOOR_TOP_OPEN = REGISTRY.register("sliding_office_door_top_open", () -> new SlidingOfficeDoorTopOpenBlock());
	public static final RegistryObject<Block> LONG_PANEL = REGISTRY.register("long_panel", () -> new LongPanelBlock());
	public static final RegistryObject<Block> RADIO = REGISTRY.register("radio", () -> new RadioBlock());
	public static final RegistryObject<Block> RADIO_45 = REGISTRY.register("radio_45", () -> new Radio45Block());
	public static final RegistryObject<Block> LAMP = REGISTRY.register("lamp", () -> new LampBlock());
	public static final RegistryObject<Block> LAMP_TOP = REGISTRY.register("lamp_top", () -> new LampTopBlock());
	public static final RegistryObject<Block> BLACK_LAMP_LEFT = REGISTRY.register("black_lamp_left", () -> new BlackLampLeftBlock());
	public static final RegistryObject<Block> BLACK_LAMP_RIGHT = REGISTRY.register("black_lamp_right", () -> new BlackLampRightBlock());
	public static final RegistryObject<Block> ELEVATOR_MIDDLE_BOTTOM = REGISTRY.register("elevator_middle_bottom", () -> new ElevatorMiddleBottomBlock());
	public static final RegistryObject<Block> ELEVATOR_MIDDLE_TOP = REGISTRY.register("elevator_middle_top", () -> new ElevatorMiddleTopBlock());
	public static final RegistryObject<Block> ELEVATOR_TOP = REGISTRY.register("elevator_top", () -> new ElevatorTopBlock());
	public static final RegistryObject<Block> ELEVATOR_BOTTOM = REGISTRY.register("elevator_bottom", () -> new ElevatorBottomBlock());
}
