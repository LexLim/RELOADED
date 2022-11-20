package net.mcreator.reloaded.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.mcreator.reloaded.init.ReloadedModBlocks;

import java.util.Map;

public class IndicatorLineOnStraightNeighbourBlockChangesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == ReloadedModBlocks.INDICATOR_LINE_OFF_STRAIGHT.get()
				|| (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == ReloadedModBlocks.INDICATOR_LINE_OFF_STRAIGHT.get()
				|| (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == ReloadedModBlocks.INDICATOR_LINE_OFF_STRAIGHT.get()
				|| (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == ReloadedModBlocks.INDICATOR_LINE_OFF_STRAIGHT.get()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == ReloadedModBlocks.INDICATOR_LINE_OFF_STRAIGHT.get()
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == ReloadedModBlocks.INDICATOR_LINE_OFF_STRAIGHT.get()
				|| (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == ReloadedModBlocks.INDICATOR_LINE_OFF_TURN.get()
				|| (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == ReloadedModBlocks.INDICATOR_LINE_OFF_TURN.get()
				|| (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == ReloadedModBlocks.INDICATOR_LINE_OFF_TURN.get()
				|| (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == ReloadedModBlocks.INDICATOR_LINE_OFF_TURN.get()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == ReloadedModBlocks.INDICATOR_LINE_OFF_TURN.get()
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == ReloadedModBlocks.INDICATOR_LINE_OFF_TURN.get()
				|| (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == ReloadedModBlocks.INDICATOR_LINE_OFF_UP.get()
				|| (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == ReloadedModBlocks.INDICATOR_LINE_OFF_UP.get()
				|| (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == ReloadedModBlocks.INDICATOR_LINE_OFF_UP.get()
				|| (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == ReloadedModBlocks.INDICATOR_LINE_OFF_UP.get()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == ReloadedModBlocks.INDICATOR_LINE_OFF_UP.get()
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == ReloadedModBlocks.INDICATOR_LINE_OFF_UP.get()
				|| (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == ReloadedModBlocks.INDICATOR_LINE_OFF_WALL.get()
				|| (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == ReloadedModBlocks.INDICATOR_LINE_OFF_WALL.get()
				|| (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == ReloadedModBlocks.INDICATOR_LINE_OFF_WALL.get()
				|| (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == ReloadedModBlocks.INDICATOR_LINE_OFF_WALL.get()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == ReloadedModBlocks.INDICATOR_LINE_OFF_WALL.get()
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == ReloadedModBlocks.INDICATOR_LINE_OFF_WALL.get()
				|| (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == ReloadedModBlocks.PEDESTAL_BUTTON.get()
				|| (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == ReloadedModBlocks.PEDESTAL_BUTTON.get()
				|| (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == ReloadedModBlocks.PEDESTAL_BUTTON.get()
				|| (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == ReloadedModBlocks.PEDESTAL_BUTTON.get()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == ReloadedModBlocks.PEDESTAL_BUTTON.get()
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == ReloadedModBlocks.PEDESTAL_BUTTON.get()
				|| (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == ReloadedModBlocks.BUTTON.get()
				|| (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == ReloadedModBlocks.BUTTON.get()
				|| (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == ReloadedModBlocks.BUTTON.get()
				|| (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == ReloadedModBlocks.BUTTON.get()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == ReloadedModBlocks.BUTTON.get()
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == ReloadedModBlocks.BUTTON.get()) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = ReloadedModBlocks.INDICATOR_LINE_OFF_STRAIGHT.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				BlockEntity _be = world.getBlockEntity(_bp);
				CompoundTag _bnbt = null;
				if (_be != null) {
					_bnbt = _be.saveWithFullMetadata();
					_be.setRemoved();
				}
				world.setBlock(_bp, _bs, 3);
				if (_bnbt != null) {
					_be = world.getBlockEntity(_bp);
					if (_be != null) {
						try {
							_be.load(_bnbt);
						} catch (Exception ignored) {
						}
					}
				}
			}
		}
	}
}
