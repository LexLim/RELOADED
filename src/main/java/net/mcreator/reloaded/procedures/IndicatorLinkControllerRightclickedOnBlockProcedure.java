package net.mcreator.reloaded.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.reloaded.init.ReloadedModBlocks;

public class IndicatorLinkControllerRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ReloadedModBlocks.SLIDING_DOOR_2.get() || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == ReloadedModBlocks.LASER_EMITTER_OFF.get()
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == ReloadedModBlocks.CUBE_DISPENSER.get()) {
			itemstack.getOrCreateTag().putDouble("BlockPosX", x);
			itemstack.getOrCreateTag().putDouble("BlockPosY", y);
			itemstack.getOrCreateTag().putDouble("BlockPosZ", z);
			itemstack.getOrCreateTag().putBoolean("HasPos", (true));
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Saved Position"), (true));
		} else if (itemstack.getOrCreateTag().getBoolean("HasPos") && (world.getBlockState(new BlockPos(x, y, z))).getBlock() == ReloadedModBlocks.REDSTON_INDICATOR_OFF.get()) {
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("BlockPosX", (itemstack.getOrCreateTag().getDouble("BlockPosX")));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("BlockPosY", (itemstack.getOrCreateTag().getDouble("BlockPosY")));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("BlockPosZ", (itemstack.getOrCreateTag().getDouble("BlockPosZ")));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Linked the \"Redstone Emitter\" to the \"Testing Element\""), (true));
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Right-click on a \"Testing Element\" to save the position"), (true));
		}
	}
}
