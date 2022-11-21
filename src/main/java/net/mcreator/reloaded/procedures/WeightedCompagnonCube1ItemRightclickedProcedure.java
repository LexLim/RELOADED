package net.mcreator.reloaded.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.reloaded.init.ReloadedModEntities;
import net.mcreator.reloaded.entity.WeightedCompagnonCube1Entity;

public class WeightedCompagnonCube1ItemRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new WeightedCompagnonCube1Entity(ReloadedModEntities.WEIGHTED_COMPAGNON_CUBE_1.get(), _level);
			entityToSpawn.moveTo(x, y, z, 0, 0);
			entityToSpawn.setYBodyRot(0);
			entityToSpawn.setYHeadRot(0);
			entityToSpawn.setDeltaMovement(0, 0, 0);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
	}
}
