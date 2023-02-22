package net.mcreator.reloaded.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.reloaded.init.ReloadedModItems;

public class FizzlerOnEntityCollidesInTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ReloadedModItems.DEFAULT_PORTAL_GUN_LB.get())) : false) == true) {
			if (entity instanceof Player _player)
				_player.getInventory().clearContent();
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ReloadedModItems.DEFAULT_PORTAL_GUN_LB.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ReloadedModItems.DEFAULT_PORTAL_GUN_O.get())) : false) == true) {
			if (entity instanceof Player _player)
				_player.getInventory().clearContent();
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ReloadedModItems.DEFAULT_PORTAL_GUN_O.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else {
			if (entity instanceof Player _player)
				_player.getInventory().clearContent();
		}
	}
}
