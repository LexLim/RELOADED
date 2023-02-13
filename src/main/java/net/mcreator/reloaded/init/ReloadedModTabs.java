
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.reloaded.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ReloadedModTabs {
	public static CreativeModeTab TAB_RELOADED_BLOCKS;
	public static CreativeModeTab TAB_RELOADED_REDSTONE;

	public static void load() {
		TAB_RELOADED_BLOCKS = new CreativeModeTab("tabreloaded_blocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ReloadedModBlocks.REPULSION_GEL_BLOCK.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_RELOADED_REDSTONE = new CreativeModeTab("tabreloaded_redstone") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ReloadedModBlocks.REDSTON_INDICATOR_OFF.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
