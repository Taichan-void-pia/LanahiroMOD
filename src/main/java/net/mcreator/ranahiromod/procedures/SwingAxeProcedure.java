package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.init.RanahiromodModParticleTypes;
import net.mcreator.ranahiromod.init.RanahiromodModMobEffects;
import net.mcreator.ranahiromod.init.RanahiromodModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SwingAxeProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		String particle_cmd_text = "";
		String particle_cmd_parameter1 = "";
		String particle_cmd_parameter2 = "";
		double zPos = 0;
		double yPos = 0;
		double rad = 0;
		double rad_now = 0;
		double yaw_now = 0;
		double xPos = 0;
		double dis = 0;
		double rnd = 0;
		double rnd2 = 0;
		double rnd3 = 0;
		double rnd4 = 0;
		double dis_start = 0;
		double cnt = 0;
		double times = 0;
		double x_num = 0;
		double y_num = 0;
		double z_num = 0;
		double time = 0;
		if (entity.getPersistentData().getDouble("skill2") == 0) {
			if (entity.getPersistentData().getDouble("skill2_swing") != 0) {
				if (entity.getPersistentData().getDouble("skill2_swing") == 2 || entity.getPersistentData().getDouble("skill2_swing") == 3) {
					entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
					if (entity.getPersistentData().getDouble("cnt3") == 0) {
						entity.getPersistentData().putDouble("rnd", Math.random());
						entity.getPersistentData().putDouble("cnt3", 1);
					}
					if (entity.getPersistentData().getDouble("cnt1") >= 1) {
						xPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(2)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX();
						yPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(2)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY();
						zPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(2)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ();
						if (entity.getPersistentData().getDouble("skill2_swing") == 2) {
							if (entity.getPersistentData().getDouble("rnd") < 0.05) {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:axe_hit")), SoundSource.NEUTRAL, 1, (float) 1.5);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:axe_hit")), SoundSource.NEUTRAL, 1, (float) 1.5, false);
									}
								}
							} else if (entity.getPersistentData().getDouble("cnt1") == 1) {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:axe_hit")), SoundSource.NEUTRAL, 1, (float) 1.5);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:axe_hit")), SoundSource.NEUTRAL, 1, (float) 1.5, false);
									}
								}
							}
						} else if (entity.getPersistentData().getDouble("skill2_swing") == 3) {
							if (entity.getPersistentData().getDouble("rnd") < 0.05) {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:spear_swing")), SoundSource.NEUTRAL, 1, (float) 0.5);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:spear_swing")), SoundSource.NEUTRAL, 1, (float) 0.5, false);
									}
								}
							} else if (entity.getPersistentData().getDouble("cnt1") == 1) {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:spear_swing")), SoundSource.NEUTRAL, 1, (float) 0.5);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:spear_swing")), SoundSource.NEUTRAL, 1, (float) 0.5, false);
									}
								}
							}
						}
						rnd = Math.random();
						rnd2 = Math.ceil(Math.random() * 2);
						dis_start = 2 + entity.getPersistentData().getDouble("cnt1");
						if (entity.getPersistentData().getDouble("skill2_swing") == 2) {
							if (entity.getPersistentData().getDouble("rnd") < 0.05) {
								xPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
										.getX();
								yPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
										.getY();
								zPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
										.getZ();
								yPos = yPos - 2;
								for (int index0 = 0; index0 < 4; index0++) {
									if (yPos == entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
											.getBlockPos().getY() - 2) {
										if (world instanceof Level _level && !_level.isClientSide())
											_level.explode(null, xPos, yPos, zPos, 0, Level.ExplosionInteraction.NONE);
									}
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.CLOUD, xPos, yPos, zPos, 3, 0.1, 0.2, 0.1, 0.1);
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.SWEEP_ATTACK, xPos, yPos, zPos, 1, 0.1, 0.1, 0.1, 0);
									yPos = yPos + 1;
								}
							} else {
								if (entity.getPersistentData().getDouble("cnt1") == 1) {
									if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof AxeItem) {
										world.levelEvent(2001, BlockPos.containing(xPos, yPos, zPos), Block.getId(Blocks.OAK_LOG.defaultBlockState()));
									} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.MOTTIE_HAMMER.get()) {
										if (world instanceof ServerLevel _level)
											_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.MOCHI_PARTICLE.get()), xPos, yPos, zPos, 5, 0.1, 0.1, 0.1, 0.05);
									}
									if (world instanceof Level _level && !_level.isClientSide())
										_level.explode(null, xPos, yPos, zPos, 0, Level.ExplosionInteraction.NONE);
								}
							}
						} else if (entity.getPersistentData().getDouble("skill2_swing") == 3) {
							if (entity.getPersistentData().getDouble("rnd") < 0.05) {
								xPos = xPos + (Math.random() - 0.5) * 3;
								yPos = yPos + Math.random() - 0.5;
								zPos = zPos + (Math.random() - 0.5) * 3;
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.CLOUD, xPos, yPos, zPos, 1, 0.1, 0.1, 0.1, 0.2);
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.CRIT, xPos, yPos, zPos, 2, 0.1, 0.1, 0.1, 0.2);
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.ENCHANTED_HIT, xPos, yPos, zPos, 2, 0.1, 0.1, 0.1, 0.2);
							} else {
								if (entity.getPersistentData().getDouble("cnt1") == 1) {
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.CLOUD, xPos, yPos, zPos, 5, 0.1, 0.1, 0.1, 0.2);
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.CRIT, xPos, yPos, zPos, 5, 0.1, 0.1, 0.1, 0.2);
								}
							}
						}
						entity.getPersistentData().putDouble("damage", (7 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3
								+ (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.LOW_ATTACK_REINFORCED.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.LOW_ATTACK_REINFORCED.get()).getAmplifier() : 0) / 5)));
						entity.getPersistentData().putDouble("knockback", (0.25 + Math.random()));
						entity.getPersistentData().putDouble("range", (3 * (1 + Math.random() * 2)));
						entity.getPersistentData().putDouble("projectile_type", Math.ceil(Math.random() * 2));
						DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
					}
					time = entity.getPersistentData().getDouble("swing_skillcnt");
					if (entity.getPersistentData().getDouble("cnt1") > time) {
						entity.getPersistentData().putDouble("skill2_swing", 0);
					}
				}
			}
		}
	}
}
