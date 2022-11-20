
package net.mcreator.reloaded.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.reloaded.procedures.IndicatorLinkControllerRightclickedOnBlockProcedure;
import net.mcreator.reloaded.init.ReloadedModTabs;

public class IndicatorLinkControllerItem extends Item {
	public IndicatorLinkControllerItem() {
		super(new Item.Properties().tab(ReloadedModTabs.TAB_RELOADED_REDSTONE).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		IndicatorLinkControllerRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(),
				context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}
