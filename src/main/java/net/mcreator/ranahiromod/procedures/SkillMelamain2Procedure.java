package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class SkillMelamain2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double range = 0;
		double data = 0;
		double rad = 0;
		double rad_now = 0;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		double yaw_now = 0;
		double dis = 0;
		double rotate = 0;
		double dis_start = 0;
		boolean UseSK = false;
		boolean logic_attack = false;
		boolean UseVazafila = false;
		boolean muki = false;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		if (entity.getPersistentData().getDouble("cnt1") == 1) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.enchantment_table.use")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.enchantment_table.use")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			entity.getPersistentData().putDouble("start_r", (entity.getYRot() + 90));
			entity.getPersistentData().putDouble("x_pos", x);
			entity.getPersistentData().putDouble("y_pos", y);
			entity.getPersistentData().putDouble("z_pos", z);
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
		}
		rad = Math.toRadians(entity.getPersistentData().getDouble("start_r"));
		dis = (entity.getPersistentData().getDouble("cnt1") + 1) * 2;
		xPos = entity.getPersistentData().getDouble("x_pos") + Math.cos(rad) * dis;
		yPos = entity.getPersistentData().getDouble("y_pos");
		zPos = entity.getPersistentData().getDouble("z_pos") + Math.sin(rad) * dis;
		logic_attack = true;
		if (world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
			yPos = entity.getPersistentData().getDouble("y_pos");
			for (int index0 = 0; index0 < (int) Math.round(dis * 5); index0++) {
				logic_attack = true;
				yPos = yPos + 0.5;
				if (!world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
					break;
				}
				logic_attack = false;
			}
		} else if (!world.getBlockState(BlockPos.containing(xPos, yPos - 0.3, zPos)).canOcclude()) {
			yPos = entity.getPersistentData().getDouble("y_pos");
			for (int index1 = 0; index1 < (int) Math.round(dis); index1++) {
				yPos = yPos - 1;
				if (world.getBlockState(BlockPos.containing(xPos, yPos - 0.3, zPos)).canOcclude()) {
					break;
				}
			}
		}
		if (logic_attack) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, xPos, yPos, zPos, 0, Level.ExplosionInteraction.NONE);
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle dust 0.824 0.412 1.000 1 ~ ~ ~ 0.1 0.1 0.1 1 15 normal");
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SWEEP_ATTACK, xPos, yPos, zPos, 1, 0, 0.25, 0, 0);
			entity.getPersistentData().putDouble("damage", (14 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
			entity.getPersistentData().putDouble("knockback", 1);
			entity.getPersistentData().putDouble("range", 2);
			entity.getPersistentData().putDouble("projectile_type", 2);
			DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
		}
		if (entity.getPersistentData().getDouble("cnt1") > 12) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
