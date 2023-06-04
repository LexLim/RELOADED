package net.mcreator.reloaded.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class SlidingOfficeDoorTopBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			BlockPos _pos = new BlockPos(x, y - 1, z);
			Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y - 0.5, z), null);
			world.destroyBlock(_pos, false);
		}
	}
}
