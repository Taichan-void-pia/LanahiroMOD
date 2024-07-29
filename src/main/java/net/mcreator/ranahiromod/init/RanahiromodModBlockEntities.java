
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ranahiromod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.ranahiromod.block.entity.AirConditionBlockBlockEntity;
import net.mcreator.ranahiromod.RanahiromodMod;

public class RanahiromodModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, RanahiromodMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> AIR_CONDITION_BLOCK = register("air_condition_block", RanahiromodModBlocks.AIR_CONDITION_BLOCK, AirConditionBlockBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
