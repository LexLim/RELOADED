package net.mcreator.reloaded.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.reloaded.init.ReloadedModBlocks;

import java.util.Map;

public class PedestalButtonBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double posX = 0;
		double posY = 0;
		double posZ = 0;
		if ((world.getBlockState(new BlockPos(x, y - 2, z))).getBlock() == ReloadedModBlocks.INDICATOR_LINE_ON_STRAIGHT.get()) {
			{
				BlockPos _bp = new BlockPos(x, y - 2, z);
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
				world.setBlock(_bp, _bs, 3);
			}
		}
	}
}
