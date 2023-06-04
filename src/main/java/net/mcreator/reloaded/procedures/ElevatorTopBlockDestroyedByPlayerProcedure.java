package net.mcreator.reloaded.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class ElevatorTopBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y - 2, z), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y - 3, z), Blocks.AIR.defaultBlockState(), 3);
	}
}
