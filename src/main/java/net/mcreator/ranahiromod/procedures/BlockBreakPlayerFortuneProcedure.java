package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.SimpleContainer;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.init.RanahiromodModItems;
import net.mcreator.ranahiromod.init.RanahiromodModBlocks;

public class BlockBreakPlayerFortuneProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean logic_fortune = false;
		boolean logic_fortune2 = false;
		ItemStack item_drop = ItemStack.EMPTY;
		double fortune_math = 0;
		double fortune = 0;
		double drop_count = 0;
		double rnd = 0;
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.BLOCK_FORTUNE) != 0) {
				if (entity instanceof ServerPlayer _plr4 && _plr4.level() instanceof ServerLevel && _plr4.getAdvancements().getOrStartProgress(_plr4.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:auto_smelt"))).isDone()) {
					logic_fortune = (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.COAL_ORE || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.IRON_ORE
							|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GOLD_ORE || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DIAMOND_ORE
							|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.EMERALD_ORE || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.NETHER_QUARTZ_ORE;
				} else {
					logic_fortune = (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.COAL_ORE || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DIAMOND_ORE
							|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.EMERALD_ORE || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.NETHER_QUARTZ_ORE;
				}
				logic_fortune2 = (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.RUBY_ORE.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.SAPPHIRE_ORE.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.PINK_DIAMOND_ORE.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.TOPAZ_ORE.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.CRYSTAL_ORE.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.LAPIS_ORE
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.REDSTONE_ORE || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.REDSTONE_ORE
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.NETHER_GOLD_ORE || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GILDED_BLACKSTONE
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.JEWEL_ORE.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.DEEPSLATE_JEWEL_ORE.get();
				if (logic_fortune) {
					item_drop = (world instanceof Level _lvlSmeltResult
							? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer((new ItemStack((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()))), _lvlSmeltResult)
									.map(recipe -> recipe.getResultItem(_lvlSmeltResult.registryAccess()).copy()).orElse(ItemStack.EMPTY)
							: ItemStack.EMPTY);
					drop_count = 1;
				} else if (logic_fortune2) {
					if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.LAPIS_ORE) {
						item_drop = new ItemStack(Items.LAPIS_LAZULI);
						drop_count = Mth.nextInt(RandomSource.create(), 4, 9);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.REDSTONE_ORE || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.REDSTONE_ORE) {
						item_drop = new ItemStack(Items.REDSTONE);
						drop_count = Mth.nextInt(RandomSource.create(), 4, 8);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.NETHER_GOLD_ORE || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GILDED_BLACKSTONE) {
						item_drop = new ItemStack(Items.GOLD_NUGGET);
						drop_count = Mth.nextInt(RandomSource.create(), 2, 6);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.RUBY_ORE.get()) {
						item_drop = new ItemStack(RanahiromodModItems.RUBY.get());
						drop_count = 1;
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.SAPPHIRE_ORE.get()) {
						item_drop = new ItemStack(RanahiromodModItems.SAPPHIRE.get());
						drop_count = 1;
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.PINK_DIAMOND_ORE.get()) {
						item_drop = new ItemStack(RanahiromodModItems.PINK_DIAMOND.get());
						drop_count = 1;
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.CRYSTAL_ORE.get()) {
						item_drop = new ItemStack(RanahiromodModItems.CRYSTAL.get());
						drop_count = 1;
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.TOPAZ_ORE.get()) {
						item_drop = new ItemStack(RanahiromodModItems.TOPAZ.get());
						drop_count = 1;
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.JEWEL_ORE.get()
							|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.DEEPSLATE_JEWEL_ORE.get()) {
						rnd = Math.ceil(Math.random() * 12);
						drop_count = 1;
						if (rnd == 1) {
							item_drop = new ItemStack(RanahiromodModItems.RUBY.get());
						} else if (rnd == 2) {
							item_drop = new ItemStack(RanahiromodModItems.SAPPHIRE.get());
						} else if (rnd == 3) {
							item_drop = new ItemStack(RanahiromodModItems.PINK_DIAMOND.get());
						} else if (rnd == 4) {
							item_drop = new ItemStack(RanahiromodModItems.CRYSTAL.get());
						} else if (rnd == 5) {
							item_drop = new ItemStack(RanahiromodModItems.TOPAZ.get());
						} else if (rnd == 6) {
							item_drop = new ItemStack(Blocks.REDSTONE_BLOCK);
						} else if (rnd == 7) {
							item_drop = new ItemStack(Blocks.GOLD_BLOCK);
						} else if (rnd == 8) {
							item_drop = new ItemStack(Blocks.LAPIS_BLOCK);
						} else if (rnd == 9) {
							item_drop = new ItemStack(Blocks.DIAMOND_BLOCK);
						} else if (rnd == 10) {
							item_drop = new ItemStack(Blocks.EMERALD_BLOCK);
						} else if (rnd == 11) {
							item_drop = new ItemStack(Blocks.COAL_BLOCK);
						} else if (rnd == 12) {
							item_drop = new ItemStack(Blocks.IRON_BLOCK);
						}
					}
				}
			}
		}
		if (logic_fortune || logic_fortune2) {
			world.destroyBlock(BlockPos.containing(x, y, z), false);
			fortune = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.BLOCK_FORTUNE);
			fortune_math = Math.round(1 / (fortune + 2) + (fortune + 1) / 2);
			for (int index0 = 0; index0 < (int) fortune_math; index0++) {
				for (int index1 = 0; index1 < (int) drop_count; index1++) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), item_drop);
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.IRON_ORE || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GOLD_ORE) {
					break;
				}
			}
		} else {
			{
				BlockPos _pos = BlockPos.containing(x, y, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 0.5, y + 0.5, z + 0.5), null);
				world.destroyBlock(_pos, false);
			}
		}
	}
}
