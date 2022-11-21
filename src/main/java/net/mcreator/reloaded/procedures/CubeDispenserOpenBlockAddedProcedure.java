package net.mcreator.reloaded.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.mcreator.reloaded.init.ReloadedModEntities;
import net.mcreator.reloaded.init.ReloadedModBlocks;
import net.mcreator.reloaded.entity.WeightedStorageCube1Entity;
import net.mcreator.reloaded.ReloadedMod;

import java.util.Map;
import java.util.Comparator;

public class CubeDispenserOpenBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!((Entity) world.getEntitiesOfClass(WeightedStorageCube1Entity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream()
				.sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.isClientSide())
			((Entity) world.getEntitiesOfClass(WeightedStorageCube1Entity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream()
					.sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).discard();
		ReloadedMod.queueServerWork(5, () -> {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new WeightedStorageCube1Entity(ReloadedModEntities.WEIGHTED_STORAGE_CUBE_1.get(), _level);
				entityToSpawn.moveTo(x, y, z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		});
		ReloadedMod.queueServerWork(40, () -> {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = ReloadedModBlocks.CUBE_DISPENSER.get().defaultBlockState();
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
		});
	}
}
