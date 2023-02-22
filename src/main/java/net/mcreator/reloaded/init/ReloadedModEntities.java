
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

import net.mcreator.reloaded.entity.WeightedStorageCube2Entity;
import net.mcreator.reloaded.entity.WeightedCompagnonCube2Entity;
import net.mcreator.reloaded.entity.OldStorageCubeEntity;
import net.mcreator.reloaded.entity.GladosEntity;
import net.mcreator.reloaded.entity.DiscouragementRedirectionCubeEntity;
import net.mcreator.reloaded.ReloadedMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ReloadedModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ReloadedMod.MODID);
	public static final RegistryObject<EntityType<GladosEntity>> GLADOS = register("glados",
			EntityType.Builder.<GladosEntity>of(GladosEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GladosEntity::new)

					.sized(1f, 7f));
	public static final RegistryObject<EntityType<WeightedStorageCube2Entity>> WEIGHTED_STORAGE_CUBE_2 = register("weighted_storage_cube_2",
			EntityType.Builder.<WeightedStorageCube2Entity>of(WeightedStorageCube2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1).setUpdateInterval(3).setCustomClientFactory(WeightedStorageCube2Entity::new)

					.sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<WeightedCompagnonCube2Entity>> WEIGHTED_COMPAGNON_CUBE_2 = register("weighted_compagnon_cube_2",
			EntityType.Builder.<WeightedCompagnonCube2Entity>of(WeightedCompagnonCube2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1).setUpdateInterval(3)
					.setCustomClientFactory(WeightedCompagnonCube2Entity::new)

					.sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<OldStorageCubeEntity>> OLD_STORAGE_CUBE = register("old_storage_cube",
			EntityType.Builder.<OldStorageCubeEntity>of(OldStorageCubeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1).setUpdateInterval(3).setCustomClientFactory(OldStorageCubeEntity::new)

					.sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<DiscouragementRedirectionCubeEntity>> DISCOURAGEMENT_REDIRECTION_CUBE = register("discouragement_redirection_cube",
			EntityType.Builder.<DiscouragementRedirectionCubeEntity>of(DiscouragementRedirectionCubeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1).setUpdateInterval(3)
					.setCustomClientFactory(DiscouragementRedirectionCubeEntity::new)

					.sized(0.6f, 0.6f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			WeightedStorageCube2Entity.init();
			WeightedCompagnonCube2Entity.init();
			OldStorageCubeEntity.init();
			DiscouragementRedirectionCubeEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(WEIGHTED_STORAGE_CUBE_2.get(), WeightedStorageCube2Entity.createAttributes().build());
		event.put(WEIGHTED_COMPAGNON_CUBE_2.get(), WeightedCompagnonCube2Entity.createAttributes().build());
		event.put(OLD_STORAGE_CUBE.get(), OldStorageCubeEntity.createAttributes().build());
		event.put(DISCOURAGEMENT_REDIRECTION_CUBE.get(), DiscouragementRedirectionCubeEntity.createAttributes().build());
	}
}
