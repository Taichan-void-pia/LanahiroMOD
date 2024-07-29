package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fluids.FluidType;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.List;
import java.util.Comparator;

public class WizardSkill7Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double zPos = 0;
		double yPos = 0;
		double xPos = 0;
		double distance = 0;
		double rad = 0;
		double rad_now = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		if (entity.getPersistentData().getDouble("cnt1") >= 1) {
			if (entity.getPersistentData().getDouble("cnt1") == 1) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			distance = new Object() {
				public double getSubmergedHeight(Entity _entity) {
					for (FluidType fluidType : ForgeRegistries.FLUID_TYPES.get().getValues()) {
						if (_entity.level().getFluidState(_entity.blockPosition()).getFluidType() == fluidType)
							return _entity.getFluidTypeHeight(fluidType);
					}
					return 0;
				}
			}.getSubmergedHeight(entity) >= 0.1 || world.getLevelData().isRaining() ? 40 : 20;
			if (entity.getPersistentData().getDouble("cnt1") == 1) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(distance / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator == entity) && entityiterator instanceof LivingEntity) {
							rad = Math.toRadians(entityiterator.getYRot());
							for (int index0 = 0; index0 < 72; index0++) {
								xPos = entityiterator.getX() + Math.cos(rad) * (entityiterator.getBbWidth() / 1.5);
								yPos = entityiterator.getY() + 0.05;
								zPos = entityiterator.getZ() + Math.sin(rad) * (entityiterator.getBbWidth() / 1.5);
								rad = rad + Math.toRadians(5);
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"particle dust_color_transition 1.000 0.835 0.000 1 1.000 0.200 0.200 ~ ~ ~ 0 0 0 0 1 force");
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.enchantment_table.use")), SoundSource.NEUTRAL, 1, (float) 1.3);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.enchantment_table.use")), SoundSource.NEUTRAL, 1, (float) 1.3, false);
								}
							}
						}
					}
				}
			} else {
				if (entity.getPersistentData().getDouble("cnt1") >= 4) {
					entity.getPersistentData().putDouble("damage", (35 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
					entity.getPersistentData().putDouble("knockback", 0);
					entity.getPersistentData().putDouble("range", distance);
					entity.getPersistentData().putDouble("effect", 9);
					AllTargetDamage3Procedure.execute(world, x, y, z, entity);
					if (entity.getPersistentData().getDouble("cnt1") > 6) {
						entity.getPersistentData().putDouble("skill2", 0);
					}
				}
			}
		}
	}
}
