
package net.mcreator.reloaded.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class PropulsionGelInABucketItem extends Item {
	public PropulsionGelInABucketItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.COMMON));
	}
}
