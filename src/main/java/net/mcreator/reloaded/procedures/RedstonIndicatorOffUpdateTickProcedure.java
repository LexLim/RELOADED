package net.mcreator.reloaded.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class RedstonIndicatorOffUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(
					new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(),
							null).withSuppressedOutput(),
					"/fill ~-3 ~-3 ~-3 ~3 ~3 ~3 reloaded:slidingdoor_2left replace reloaded:slidingdoor_2_left_open");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(
					new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(),
							null).withSuppressedOutput(),
					"/fill ~-3 ~-3 ~-3 ~3 ~3 ~3 reloaded:slidingdoor_2right replace reloaded:slidingdoor_2_right_open");
	}
}
