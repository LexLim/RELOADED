package net.mcreator.reloaded.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.reloaded.init.ReloadedModItems;

public class EmancipationGridLeftOnEntityCollidesInTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.level.isClientSide())
			entity.discard();
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ReloadedModItems.DEFAULT_PORTAL_GUN_LB
				.get()) {
			if (entity instanceof Player _player)
				_player.getInventory().clearContent();
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(ReloadedModItems.DEFAULT_PORTAL_GUN_LB.get());
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getItem() == ReloadedModItems.DEFAULT_PORTAL_GUN_O.get()) {
			if (entity instanceof Player _player)
				_player.getInventory().clearContent();
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(ReloadedModItems.DEFAULT_PORTAL_GUN_O.get());
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else {
			if (entity instanceof Player _player)
				_player.getInventory().clearContent();
		}
	}
}
