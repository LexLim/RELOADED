
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
import net.mcreator.reloaded.block.YellowCasingBlock;
import net.mcreator.reloaded.block.WhitePanelTilesBlock;
import net.mcreator.reloaded.block.WhitePanelBlock;
import net.mcreator.reloaded.block.WallCableBlock;
import net.mcreator.reloaded.block.VoidBlockBlock;
import net.mcreator.reloaded.block.TransportationTubePlaceholderBlock;
import net.mcreator.reloaded.block.TransportationTubeEntranceOpenBlock;
import net.mcreator.reloaded.block.TransportationTubeBlock;
import net.mcreator.reloaded.block.TransportaltionTubeEntranceBlock;
import net.mcreator.reloaded.block.SupportBlockBlock;
import net.mcreator.reloaded.block.SupportBeamBlock;
import net.mcreator.reloaded.block.SmallPipeBlock;
import net.mcreator.reloaded.block.Slidingdoor2rightOpenBlock;
import net.mcreator.reloaded.block.Slidingdoor2rightBlock;
import net.mcreator.reloaded.block.Slidingdoor2leftBlock;
import net.mcreator.reloaded.block.Slidingdoor2LeftOpenBlock;
import net.mcreator.reloaded.block.RepulsionGelSplatBlock;
import net.mcreator.reloaded.block.RepulsionGelBlockBlock;
import net.mcreator.reloaded.block.RedstoneIndicatorOnBlock;
import net.mcreator.reloaded.block.RedstoneEmitterOnBlock;
import net.mcreator.reloaded.block.RedstoneEmitterOffBlock;
import net.mcreator.reloaded.block.RedstonIndicatorOffBlock;
import net.mcreator.reloaded.block.PropulsionGelSplatBlock;
import net.mcreator.reloaded.block.PropulsionGelBlockBlock;
import net.mcreator.reloaded.block.PedestalButtonBlock;
import net.mcreator.reloaded.block.PedestalButtonActivatedBlock;
import net.mcreator.reloaded.block.PanelWithWhiteBlock;
import net.mcreator.reloaded.block.PanelWithBlackBlock;
import net.mcreator.reloaded.block.PanelPlaceholderBlock;
import net.mcreator.reloaded.block.PanelCasingBlock;
import net.mcreator.reloaded.block.PanelBlock;
import net.mcreator.reloaded.block.OpenPanelWithWhiteBlock;
import net.mcreator.reloaded.block.OpenPanelWithBlackBlock;
import net.mcreator.reloaded.block.OpenPanelBlock;
import net.mcreator.reloaded.block.MiniatureBlackHoleBlockBlock;
import net.mcreator.reloaded.block.LongWhitePanelBlock;
import net.mcreator.reloaded.block.LongPanelWithWhiteBlock;
import net.mcreator.reloaded.block.LongPanelWithBlackBlock;
import net.mcreator.reloaded.block.LongPanelBlock;
import net.mcreator.reloaded.block.LaserReceiverOnBlock;
import net.mcreator.reloaded.block.LaserReceiverOffBlock;
import net.mcreator.reloaded.block.LaserEmitterOnBlock;
import net.mcreator.reloaded.block.LaserEmitterOffBlock;
import net.mcreator.reloaded.block.LampRightBlock;
import net.mcreator.reloaded.block.LampLeftBlock;
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
import net.mcreator.reloaded.block.GrayCasingBlock;
import net.mcreator.reloaded.block.FloorCableWiresBlock;
import net.mcreator.reloaded.block.FloorCableBlock;
import net.mcreator.reloaded.block.EnergyPressBlock;
import net.mcreator.reloaded.block.EmancipationGridRightOnBlock;
import net.mcreator.reloaded.block.EmancipationGridRightOffBlock;
import net.mcreator.reloaded.block.EmancipationGridLeftOnBlock;
import net.mcreator.reloaded.block.EmancipationGridLeftOffBlock;
import net.mcreator.reloaded.block.EmancipationGridBlock;
import net.mcreator.reloaded.block.DirtyWhitePanelTilesBlock;
import net.mcreator.reloaded.block.DirtyWhitePanelBlock;
import net.mcreator.reloaded.block.DirtySlidingdoor2rightopenBlock;
import net.mcreator.reloaded.block.DirtySlidingdoor2rightBlock;
import net.mcreator.reloaded.block.DirtySlidingdoor2leftBlock;
import net.mcreator.reloaded.block.DirtySlidingdoor2LeftOpenBlock;
import net.mcreator.reloaded.block.DirtyLongWhitePanelBlock;
import net.mcreator.reloaded.block.DirtyBlackPanelTilesBlock;
import net.mcreator.reloaded.block.DirtyBlackPanelBlock;
import net.mcreator.reloaded.block.DirtyBigBlackPanelRightBlock;
import net.mcreator.reloaded.block.DirtyBigBlackPanelLeftBlock;
import net.mcreator.reloaded.block.CubeDispenserOpenBlock;
import net.mcreator.reloaded.block.CubeDispenserBlock;
import net.mcreator.reloaded.block.CatwalkTurnBlock;
import net.mcreator.reloaded.block.CatwalkBlock;
import net.mcreator.reloaded.block.ButtonBlock;
import net.mcreator.reloaded.block.ButtonActivatedBlock;
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
import net.mcreator.reloaded.block.BlackPanelBlock;
import net.mcreator.reloaded.block.BigPipeBlock;
import net.mcreator.reloaded.block.BigBlackPanelRightBlock;
import net.mcreator.reloaded.block.BigBlackPanelLeftBlock;
import net.mcreator.reloaded.block.AsbestosTilesBlock;
import net.mcreator.reloaded.block.AsbestosBlockBlock;
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
	public static final RegistryObject<Block> SLIDINGDOOR_2LEFT = REGISTRY.register("slidingdoor_2left", () -> new Slidingdoor2leftBlock());
	public static final RegistryObject<Block> DIRTY_SLIDINGDOOR_2LEFT = REGISTRY.register("dirty_slidingdoor_2left",
			() -> new DirtySlidingdoor2leftBlock());
	public static final RegistryObject<Block> REDSTON_INDICATOR_OFF = REGISTRY.register("redston_indicator_off",
			() -> new RedstonIndicatorOffBlock());
	public static final RegistryObject<Block> REDSTONE_EMITTER_OFF = REGISTRY.register("redstone_emitter_off", () -> new RedstoneEmitterOffBlock());
	public static final RegistryObject<Block> INDICATOR_LINE_OFF_STRAIGHT = REGISTRY.register("indicator_line_off_straight",
			() -> new IndicatorLineOffStraightBlock());
	public static final RegistryObject<Block> BUTTON = REGISTRY.register("button", () -> new ButtonBlock());
	public static final RegistryObject<Block> BUTTON_ACTIVATED = REGISTRY.register("button_activated", () -> new ButtonActivatedBlock());
	public static final RegistryObject<Block> PEDESTAL_BUTTON = REGISTRY.register("pedestal_button", () -> new PedestalButtonBlock());
	public static final RegistryObject<Block> CUBE_DISPENSER = REGISTRY.register("cube_dispenser", () -> new CubeDispenserBlock());
	public static final RegistryObject<Block> EMANCIPATION_GRID_LEFT_OFF = REGISTRY.register("emancipation_grid_left_off",
			() -> new EmancipationGridLeftOffBlock());
	public static final RegistryObject<Block> EMANCIPATION_GRID_RIGHT_OFF = REGISTRY.register("emancipation_grid_right_off",
			() -> new EmancipationGridRightOffBlock());
	public static final RegistryObject<Block> HARD_LIGHT_BRIDGE_EMITTER_OFF = REGISTRY.register("hard_light_bridge_emitter_off",
			() -> new HardLightBridgeEmitterOffBlock());
	public static final RegistryObject<Block> WHITE_PANEL = REGISTRY.register("white_panel", () -> new WhitePanelBlock());
	public static final RegistryObject<Block> LONG_WHITE_PANEL = REGISTRY.register("long_white_panel", () -> new LongWhitePanelBlock());
	public static final RegistryObject<Block> WHITE_PANEL_TILES = REGISTRY.register("white_panel_tiles", () -> new WhitePanelTilesBlock());
	public static final RegistryObject<Block> DIRTY_WHITE_PANEL = REGISTRY.register("dirty_white_panel", () -> new DirtyWhitePanelBlock());
	public static final RegistryObject<Block> DIRTY_LONG_WHITE_PANEL = REGISTRY.register("dirty_long_white_panel",
			() -> new DirtyLongWhitePanelBlock());
	public static final RegistryObject<Block> DIRTY_WHITE_PANEL_TILES = REGISTRY.register("dirty_white_panel_tiles",
			() -> new DirtyWhitePanelTilesBlock());
	public static final RegistryObject<Block> BLACK_PANEL = REGISTRY.register("black_panel", () -> new BlackPanelBlock());
	public static final RegistryObject<Block> BIG_BLACK_PANEL_LEFT = REGISTRY.register("big_black_panel_left", () -> new BigBlackPanelLeftBlock());
	public static final RegistryObject<Block> BIG_BLACK_PANEL_RIGHT = REGISTRY.register("big_black_panel_right", () -> new BigBlackPanelRightBlock());
	public static final RegistryObject<Block> BLACK_PANEL_TILES = REGISTRY.register("black_panel_tiles", () -> new BlackPanelTilesBlock());
	public static final RegistryObject<Block> BROKEN_BLACK_PANEL_1 = REGISTRY.register("broken_black_panel_1", () -> new BrokenBlackPanel1Block());
	public static final RegistryObject<Block> BROKEN_BLACK_PANEL_TILES = REGISTRY.register("broken_black_panel_tiles",
			() -> new BrokenBlackPanelTilesBlock());
	public static final RegistryObject<Block> DIRTY_BLACK_PANEL = REGISTRY.register("dirty_black_panel", () -> new DirtyBlackPanelBlock());
	public static final RegistryObject<Block> DIRTY_BIG_BLACK_PANEL_LEFT = REGISTRY.register("dirty_big_black_panel_left",
			() -> new DirtyBigBlackPanelLeftBlock());
	public static final RegistryObject<Block> DIRTY_BIG_BLACK_PANEL_RIGHT = REGISTRY.register("dirty_big_black_panel_right",
			() -> new DirtyBigBlackPanelRightBlock());
	public static final RegistryObject<Block> DIRTY_BLACK_PANEL_TILES = REGISTRY.register("dirty_black_panel_tiles",
			() -> new DirtyBlackPanelTilesBlock());
	public static final RegistryObject<Block> BROKEN_DIRTY_BLACK_PANEL_1 = REGISTRY.register("broken_dirty_black_panel_1",
			() -> new BrokenDirtyBlackPanel1Block());
	public static final RegistryObject<Block> BROKEN_DIRTY_BLACK_PANEL_TILES_1 = REGISTRY.register("broken_dirty_black_panel_tiles_1",
			() -> new BrokenDirtyBlackPanelTiles1Block());
	public static final RegistryObject<Block> BROKEN_DIRTY_BIG_BLACK_PANEL_LEFT = REGISTRY.register("broken_dirty_big_black_panel_left",
			() -> new BrokenDirtyBigBlackPanelLeftBlock());
	public static final RegistryObject<Block> BROKEN_DIRTY_BIG_BLACK_PANEL_RIGHT = REGISTRY.register("broken_dirty_big_black_panel_right",
			() -> new BrokenDirtyBigBlackPanelRightBlock());
	public static final RegistryObject<Block> YELLOW_CASING = REGISTRY.register("yellow_casing", () -> new YellowCasingBlock());
	public static final RegistryObject<Block> GRAY_CASING = REGISTRY.register("gray_casing", () -> new GrayCasingBlock());
	public static final RegistryObject<Block> YELLOW_PLANE_CASING = REGISTRY.register("yellow_plane_casing", () -> new YellowPlaneCasingBlock());
	public static final RegistryObject<Block> GRAY_PLANE_CASING = REGISTRY.register("gray_plane_casing", () -> new GrayPlaneCasingBlock());
	public static final RegistryObject<Block> PANEL_CASING = REGISTRY.register("panel_casing", () -> new PanelCasingBlock());
	public static final RegistryObject<Block> CATWALK = REGISTRY.register("catwalk", () -> new CatwalkBlock());
	public static final RegistryObject<Block> SUPPORT_BEAM = REGISTRY.register("support_beam", () -> new SupportBeamBlock());
	public static final RegistryObject<Block> ASBESTOS_BLOCK = REGISTRY.register("asbestos_block", () -> new AsbestosBlockBlock());
	public static final RegistryObject<Block> ASBESTOS_TILES = REGISTRY.register("asbestos_tiles", () -> new AsbestosTilesBlock());
	public static final RegistryObject<Block> BIG_PIPE = REGISTRY.register("big_pipe", () -> new BigPipeBlock());
	public static final RegistryObject<Block> SMALL_PIPE = REGISTRY.register("small_pipe", () -> new SmallPipeBlock());
	public static final RegistryObject<Block> SUPPORT_BLOCK = REGISTRY.register("support_block", () -> new SupportBlockBlock());
	public static final RegistryObject<Block> BLUE_SUPPORT_PIPE = REGISTRY.register("blue_support_pipe", () -> new BlueSupportPipeBlock());
	public static final RegistryObject<Block> YELLOW_SUPPORT_PIPE = REGISTRY.register("yellow_support_pipe", () -> new YellowSupportPipeBlock());
	public static final RegistryObject<Block> TRANSPORTATION_TUBE = REGISTRY.register("transportation_tube", () -> new TransportationTubeBlock());
	public static final RegistryObject<Block> TRANSPORTALTION_TUBE_ENTRANCE = REGISTRY.register("transportaltion_tube_entrance",
			() -> new TransportaltionTubeEntranceBlock());
	public static final RegistryObject<Block> TRANSPORTATION_TUBE_ENTRANCE_OPEN = REGISTRY.register("transportation_tube_entrance_open",
			() -> new TransportationTubeEntranceOpenBlock());
	public static final RegistryObject<Block> LASER_EMITTER_OFF = REGISTRY.register("laser_emitter_off", () -> new LaserEmitterOffBlock());
	public static final RegistryObject<Block> LASER_RECEIVER_OFF = REGISTRY.register("laser_receiver_off", () -> new LaserReceiverOffBlock());
	public static final RegistryObject<Block> REPULSION_GEL_BLOCK = REGISTRY.register("repulsion_gel_block", () -> new RepulsionGelBlockBlock());
	public static final RegistryObject<Block> PROPULSION_GEL_BLOCK = REGISTRY.register("propulsion_gel_block", () -> new PropulsionGelBlockBlock());
	public static final RegistryObject<Block> LAMP_LEFT = REGISTRY.register("lamp_left", () -> new LampLeftBlock());
	public static final RegistryObject<Block> LAMP_RIGHT = REGISTRY.register("lamp_right", () -> new LampRightBlock());
	public static final RegistryObject<Block> SLIDINGDOOR_2RIGHT = REGISTRY.register("slidingdoor_2right", () -> new Slidingdoor2rightBlock());
	public static final RegistryObject<Block> REDSTONE_INDICATOR_ON = REGISTRY.register("redstone_indicator_on",
			() -> new RedstoneIndicatorOnBlock());
	public static final RegistryObject<Block> SLIDINGDOOR_2_LEFT_OPEN = REGISTRY.register("slidingdoor_2_left_open",
			() -> new Slidingdoor2LeftOpenBlock());
	public static final RegistryObject<Block> SLIDINGDOOR_2RIGHT_OPEN = REGISTRY.register("slidingdoor_2right_open",
			() -> new Slidingdoor2rightOpenBlock());
	public static final RegistryObject<Block> REDSTONE_EMITTER_ON = REGISTRY.register("redstone_emitter_on", () -> new RedstoneEmitterOnBlock());
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
	public static final RegistryObject<Block> PEDESTAL_BUTTON_ACTIVATED = REGISTRY.register("pedestal_button_activated",
			() -> new PedestalButtonActivatedBlock());
	public static final RegistryObject<Block> PANEL_PLACEHOLDER = REGISTRY.register("panel_placeholder", () -> new PanelPlaceholderBlock());
	public static final RegistryObject<Block> CUBE_DISPENSER_OPEN = REGISTRY.register("cube_dispenser_open", () -> new CubeDispenserOpenBlock());
	public static final RegistryObject<Block> INDICATOR_LINE_OFF_UP_CEILLING = REGISTRY.register("indicator_line_off_up_ceilling",
			() -> new IndicatorLineOffUpCeillingBlock());
	public static final RegistryObject<Block> INDICATOR_LINE_OFF_CEILLING = REGISTRY.register("indicator_line_off_ceilling",
			() -> new IndicatorLineOffCeillingBlock());
	public static final RegistryObject<Block> INDICATOR_LINE_ON_UP_CEILLING = REGISTRY.register("indicator_line_on_up_ceilling",
			() -> new IndicatorLineOnUpCeillingBlock());
	public static final RegistryObject<Block> INDICATOR_LINE_ON_CEILLING = REGISTRY.register("indicator_line_on_ceilling",
			() -> new IndicatorLineOnCeillingBlock());
	public static final RegistryObject<Block> EMANCIPATION_GRID_LEFT_ON = REGISTRY.register("emancipation_grid_left_on",
			() -> new EmancipationGridLeftOnBlock());
	public static final RegistryObject<Block> EMANCIPATION_GRID_RIGHT_ON = REGISTRY.register("emancipation_grid_right_on",
			() -> new EmancipationGridRightOnBlock());
	public static final RegistryObject<Block> EMANCIPATION_GRID = REGISTRY.register("emancipation_grid", () -> new EmancipationGridBlock());
	public static final RegistryObject<Block> BROKEN_BLACK_PANEL_2 = REGISTRY.register("broken_black_panel_2", () -> new BrokenBlackPanel2Block());
	public static final RegistryObject<Block> BROKEN_BLACK_PANEL_3 = REGISTRY.register("broken_black_panel_3", () -> new BrokenBlackPanel3Block());
	public static final RegistryObject<Block> CATWALK_TURN = REGISTRY.register("catwalk_turn", () -> new CatwalkTurnBlock());
	public static final RegistryObject<Block> TRANSPORTATION_TUBE_PLACEHOLDER = REGISTRY.register("transportation_tube_placeholder",
			() -> new TransportationTubePlaceholderBlock());
	public static final RegistryObject<Block> LASER_EMITTER_ON = REGISTRY.register("laser_emitter_on", () -> new LaserEmitterOnBlock());
	public static final RegistryObject<Block> LASER_RECEIVER_ON = REGISTRY.register("laser_receiver_on", () -> new LaserReceiverOnBlock());
	public static final RegistryObject<Block> HARD_LIGHT_BRIDGE_EMITTER_ON = REGISTRY.register("hard_light_bridge_emitter_on",
			() -> new HardLightBridgeEmitterOnBlock());
	public static final RegistryObject<Block> HARD_LIGHT_BRIDGE = REGISTRY.register("hard_light_bridge", () -> new HardLightBridgeBlock());
	public static final RegistryObject<Block> BROKEN_DIRTY_BLACK_PANEL_2 = REGISTRY.register("broken_dirty_black_panel_2",
			() -> new BrokenDirtyBlackPanel2Block());
	public static final RegistryObject<Block> BROKEN_DIRTY_BLACK_PANEL_3 = REGISTRY.register("broken_dirty_black_panel_3",
			() -> new BrokenDirtyBlackPanel3Block());
	public static final RegistryObject<Block> REPULSION_GEL_SPLAT = REGISTRY.register("repulsion_gel_splat", () -> new RepulsionGelSplatBlock());
	public static final RegistryObject<Block> PROPULSION_GEL_SPLAT = REGISTRY.register("propulsion_gel_splat", () -> new PropulsionGelSplatBlock());
	public static final RegistryObject<Block> DIRTY_SLIDINGDOOR_2RIGHT = REGISTRY.register("dirty_slidingdoor_2right",
			() -> new DirtySlidingdoor2rightBlock());
	public static final RegistryObject<Block> DIRTY_SLIDINGDOOR_2_LEFT_OPEN = REGISTRY.register("dirty_slidingdoor_2_left_open",
			() -> new DirtySlidingdoor2LeftOpenBlock());
	public static final RegistryObject<Block> DIRTY_SLIDINGDOOR_2RIGHTOPEN = REGISTRY.register("dirty_slidingdoor_2rightopen",
			() -> new DirtySlidingdoor2rightopenBlock());
	public static final RegistryObject<Block> BROKEN_DIRTY_BLACK_PANEL_TILES_2 = REGISTRY.register("broken_dirty_black_panel_tiles_2",
			() -> new BrokenDirtyBlackPanelTiles2Block());
	public static final RegistryObject<Block> VOID_BLOCK = REGISTRY.register("void_block", () -> new VoidBlockBlock());
	public static final RegistryObject<Block> ENERGY_PRESS = REGISTRY.register("energy_press", () -> new EnergyPressBlock());
	public static final RegistryObject<Block> MINIATURE_BLACK_HOLE_BLOCK = REGISTRY.register("miniature_black_hole_block",
			() -> new MiniatureBlackHoleBlockBlock());
	public static final RegistryObject<Block> HANGING_CABLE = REGISTRY.register("hanging_cable", () -> new HangingCableBlock());
	public static final RegistryObject<Block> WALL_CABLE = REGISTRY.register("wall_cable", () -> new WallCableBlock());
	public static final RegistryObject<Block> FLOOR_CABLE = REGISTRY.register("floor_cable", () -> new FloorCableBlock());
	public static final RegistryObject<Block> FLOOR_CABLE_WIRES = REGISTRY.register("floor_cable_wires", () -> new FloorCableWiresBlock());
}
