
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.reloaded.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.reloaded.block.entity.RedstoneIndicatorOnBlockEntity;
import net.mcreator.reloaded.block.entity.RedstoneEmitterOnBlockEntity;
import net.mcreator.reloaded.block.entity.RedstoneEmitterOffBlockEntity;
import net.mcreator.reloaded.block.entity.RedstonIndicatorOffBlockEntity;
import net.mcreator.reloaded.block.entity.HardLightBridgeBlockEntity;
import net.mcreator.reloaded.block.entity.EnergyPressBlockEntity;
import net.mcreator.reloaded.ReloadedMod;

public class ReloadedModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES,
			ReloadedMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> REDSTON_INDICATOR_OFF = register("redston_indicator_off",
			ReloadedModBlocks.REDSTON_INDICATOR_OFF, RedstonIndicatorOffBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> REDSTONE_EMITTER_OFF = register("redstone_emitter_off",
			ReloadedModBlocks.REDSTONE_EMITTER_OFF, RedstoneEmitterOffBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> REDSTONE_INDICATOR_ON = register("redstone_indicator_on",
			ReloadedModBlocks.REDSTONE_INDICATOR_ON, RedstoneIndicatorOnBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> REDSTONE_EMITTER_ON = register("redstone_emitter_on",
			ReloadedModBlocks.REDSTONE_EMITTER_ON, RedstoneEmitterOnBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> HARD_LIGHT_BRIDGE = register("hard_light_bridge", ReloadedModBlocks.HARD_LIGHT_BRIDGE,
			HardLightBridgeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ENERGY_PRESS = register("energy_press", ReloadedModBlocks.ENERGY_PRESS,
			EnergyPressBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
