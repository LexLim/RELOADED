package net.mcreator.reloaded.block.registry;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;

import net.mcreator.reloaded.init.ReloadedModBlocks;
import net.mcreator.reloaded.block.entity.SlidingDoor2AnimTileEntity;
import net.mcreator.reloaded.block.entity.SlidingDoor2AnimCloseTileEntity;
import net.mcreator.reloaded.block.entity.LaserReveiverOnTileEntity;
import net.mcreator.reloaded.block.entity.CubeDispenserTileEntity;
import net.mcreator.reloaded.ReloadedMod;

public class TileRegistry {
	public static final DeferredRegister<BlockEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ReloadedMod.MODID);
	public static final RegistryObject<BlockEntityType<CubeDispenserTileEntity>> CUBE_DISPENSER = TILES.register("cube_dispenser_block",
			() -> BlockEntityType.Builder.of(CubeDispenserTileEntity::new, ReloadedModBlocks.CUBE_DISPENSER.get()).build(null));
	public static final RegistryObject<BlockEntityType<LaserReveiverOnTileEntity>> LASER_REVEIVER_ON = TILES.register("laser_reveiver_on_block",
			() -> BlockEntityType.Builder.of(LaserReveiverOnTileEntity::new, ReloadedModBlocks.LASER_REVEIVER_ON.get()).build(null));
	public static final RegistryObject<BlockEntityType<SlidingDoor2AnimTileEntity>> SLIDING_DOOR_2_ANIM = TILES.register("sliding_door_2_anim_block",
			() -> BlockEntityType.Builder.of(SlidingDoor2AnimTileEntity::new, ReloadedModBlocks.SLIDING_DOOR_2_ANIM.get()).build(null));
	public static final RegistryObject<BlockEntityType<SlidingDoor2AnimCloseTileEntity>> SLIDING_DOOR_2_ANIM_CLOSE = TILES.register("sliding_door_2_anim_close_block",
			() -> BlockEntityType.Builder.of(SlidingDoor2AnimCloseTileEntity::new, ReloadedModBlocks.SLIDING_DOOR_2_ANIM_CLOSE.get()).build(null));
}
