
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.reloaded.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.reloaded.block.entity.SlidingDoor2AnimTileEntity;
import net.mcreator.reloaded.block.entity.SlidingDoor2AnimCloseTileEntity;
import net.mcreator.reloaded.block.entity.RedstoneIndicatorOnBlockEntity;
import net.mcreator.reloaded.block.entity.RedstoneEmitterOnBlockEntity;
import net.mcreator.reloaded.block.entity.RedstoneEmitterOffBlockEntity;
import net.mcreator.reloaded.block.entity.RedstonIndicatorOffBlockEntity;
import net.mcreator.reloaded.block.entity.LaserReveiverOnTileEntity;
import net.mcreator.reloaded.block.entity.HardLightBridgeBlockEntity;
import net.mcreator.reloaded.ReloadedMod;

public class ReloadedModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ReloadedMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> REDSTON_INDICATOR_OFF = register("redston_indicator_off", ReloadedModBlocks.REDSTON_INDICATOR_OFF, RedstonIndicatorOffBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> REDSTONE_EMITTER_OFF = register("redstone_emitter_off", ReloadedModBlocks.REDSTONE_EMITTER_OFF, RedstoneEmitterOffBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> REDSTONE_INDICATOR_ON = register("redstone_indicator_on", ReloadedModBlocks.REDSTONE_INDICATOR_ON, RedstoneIndicatorOnBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> REDSTONE_EMITTER_ON = register("redstone_emitter_on", ReloadedModBlocks.REDSTONE_EMITTER_ON, RedstoneEmitterOnBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> HARD_LIGHT_BRIDGE = register("hard_light_bridge", ReloadedModBlocks.HARD_LIGHT_BRIDGE, HardLightBridgeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<LaserReveiverOnTileEntity>> LASER_REVEIVER_ON = REGISTRY.register("laser_reveiver_on",
			() -> BlockEntityType.Builder.of(LaserReveiverOnTileEntity::new, ReloadedModBlocks.LASER_REVEIVER_ON.get()).build(null));
	public static final RegistryObject<BlockEntityType<SlidingDoor2AnimTileEntity>> SLIDING_DOOR_2_ANIM = REGISTRY.register("sliding_door_2_anim",
			() -> BlockEntityType.Builder.of(SlidingDoor2AnimTileEntity::new, ReloadedModBlocks.SLIDING_DOOR_2_ANIM.get()).build(null));
	public static final RegistryObject<BlockEntityType<SlidingDoor2AnimCloseTileEntity>> SLIDING_DOOR_2_ANIM_CLOSE = REGISTRY.register("sliding_door_2_anim_close",
			() -> BlockEntityType.Builder.of(SlidingDoor2AnimCloseTileEntity::new, ReloadedModBlocks.SLIDING_DOOR_2_ANIM_CLOSE.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
