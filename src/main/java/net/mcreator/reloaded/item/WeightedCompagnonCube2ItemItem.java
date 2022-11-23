
package net.mcreator.reloaded.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.reloaded.procedures.WeightedCompagnonCube2ItemRightclickedProcedure;
import net.mcreator.reloaded.init.ReloadedModTabs;

public class WeightedCompagnonCube2ItemItem extends Item {
	public WeightedCompagnonCube2ItemItem() {
		super(new Item.Properties().tab(ReloadedModTabs.TAB_RELOADED_REDSTONE).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		WeightedCompagnonCube2ItemRightclickedProcedure.execute(world, x, y, z);
		return ar;
	}
}
