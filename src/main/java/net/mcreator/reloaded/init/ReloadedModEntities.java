
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.reloaded.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.reloaded.entity.WeightedStorageCube1Entity;
import net.mcreator.reloaded.entity.WeightedCompagnonCube1Entity;
import net.mcreator.reloaded.ReloadedMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ReloadedModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ReloadedMod.MODID);
	public static final RegistryObject<EntityType<WeightedStorageCube1Entity>> WEIGHTED_STORAGE_CUBE_1 = register("weighted_storage_cube_1",
			EntityType.Builder.<WeightedStorageCube1Entity>of(WeightedStorageCube1Entity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(1).setUpdateInterval(3)
					.setCustomClientFactory(WeightedStorageCube1Entity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<WeightedCompagnonCube1Entity>> WEIGHTED_COMPAGNON_CUBE_1 = register("weighted_compagnon_cube_1",
			EntityType.Builder.<WeightedCompagnonCube1Entity>of(WeightedCompagnonCube1Entity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(1).setUpdateInterval(3)
					.setCustomClientFactory(WeightedCompagnonCube1Entity::new)

					.sized(1f, 1f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			WeightedStorageCube1Entity.init();
			WeightedCompagnonCube1Entity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(WEIGHTED_STORAGE_CUBE_1.get(), WeightedStorageCube1Entity.createAttributes().build());
		event.put(WEIGHTED_COMPAGNON_CUBE_1.get(), WeightedCompagnonCube1Entity.createAttributes().build());
	}
}
