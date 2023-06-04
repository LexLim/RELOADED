package net.mcreator.reloaded.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.reloaded.init.ReloadedModBlocks;

import java.util.Map;

public class SouthScriptProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Direction direction, Entity entity, double hitX, double hitY) {
		if (direction == null || entity == null)
			return;
		if (!world.isClientSide()) {
			if (direction == Direction.SOUTH) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ReloadedModBlocks.BLACK_PANEL_TILES.get().asItem()
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ReloadedModBlocks.BLACK_PANEL_TILES.get().asItem()) {
					if (hitX >= x + 0 && hitX <= x + 0.5 && hitY > y + 0 && hitY <= y + 0.5) {
						{
							BlockPos _bp = new BlockPos(x, y, z);
							BlockState _bs = ReloadedModBlocks.BLACK_LAMP_RIGHT.get().defaultBlockState();
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
					} else if (hitX > x + 0.5 && hitX <= x + 1 && hitY > y + 0 && hitY <= y + 0.5) {
						{
							BlockPos _bp = new BlockPos(x, y, z);
							BlockState _bs = ReloadedModBlocks.BLACK_LAMP_LEFT.get().defaultBlockState();
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
					} else if (hitX > x + 0.5 && hitX <= x + 1 && hitY > y + 0.5 && hitY <= y + 1) {
						{
							BlockPos _bp = new BlockPos(x, y, z);
							BlockState _bs = ReloadedModBlocks.BLACK_LAMP_LEFT.get().defaultBlockState();
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
					} else if (hitX >= x + 0 && hitX <= x + 0.5 && hitY > y + 0.5 && hitY <= y + 1) {
						{
							BlockPos _bp = new BlockPos(x, y, z);
							BlockState _bs = ReloadedModBlocks.BLACK_LAMP_RIGHT.get().defaultBlockState();
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
		}
	}
}
