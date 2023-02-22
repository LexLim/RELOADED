
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.reloaded.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.reloaded.ReloadedMod;

public class ReloadedModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, ReloadedMod.MODID);
	public static final RegistryObject<SimpleParticleType> MINIATURE_BLACK_HOLE = REGISTRY.register("miniature_black_hole", () -> new SimpleParticleType(true));
}
