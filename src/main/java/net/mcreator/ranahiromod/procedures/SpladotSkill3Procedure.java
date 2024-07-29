package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class SpladotSkill3Procedure {
	public static void execute(LevelAccessor world, double y, Entity entity) {
		if (entity == null)
			return;
		boolean logic_a = false;
		double zPos = 0;
		double yPos = 0;
		double xPos = 0;
		double dmg = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
			if (entity.getPersistentData().getDouble("cnt1") == 1) {
				entity.getPersistentData().putDouble("x_pos", ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()));
				entity.getPersistentData().putDouble("z_pos", ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ()));
			}
			xPos = entity.getPersistentData().getDouble("x_pos") + (Math.random() - 0.5) * 10;
			zPos = entity.getPersistentData().getDouble("z_pos") + (Math.random() - 0.5) * 10;
		} else {
			if (entity.getPersistentData().getDouble("cnt1") == 1) {
				entity.getPersistentData().putDouble("x_pos",
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(15)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()));
				entity.getPersistentData().putDouble("z_pos",
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(15)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
			}
			xPos = entity.getPersistentData().getDouble("x_pos") + (Math.random() - 0.5) * 10;
			zPos = entity.getPersistentData().getDouble("z_pos") + (Math.random() - 0.5) * 10;
		}
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
			if (entity.getPersistentData().getDouble("cnt1") == 1) {
				entity.getPersistentData().putDouble("y_pos", ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()));
			}
		} else {
			if (entity.getPersistentData().getDouble("cnt1") == 1) {
				entity.getPersistentData().putDouble("y_pos",
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(15)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()));
			}
			yPos = entity.getPersistentData().getDouble("y_pos");
			for (int index0 = 0; index0 < 25; index0++) {
				if (world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
					logic_a = true;
					break;
				} else {
					yPos = yPos - 1;
				}
			}
			if (!logic_a) {
				entity.getPersistentData().putDouble("y_pos", y);
				logic_a = true;
			}
		}
		yPos = entity.getPersistentData().getDouble("y_pos");
		yPos = yPos + 50;
		if (logic_a) {
			if (entity.getPersistentData().getDouble("cnt1") <= 80) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CLOUD, xPos, yPos, zPos, 5, 0.3, 0.3, 0.3, 0.45);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.END_ROD, xPos, yPos, zPos, 20, 0.3, 0.3, 0.3, 0.45);
				entity.getPersistentData().putDouble("damage", (30 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
				dmg = entity.getPersistentData().getDouble("damage");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("summon falling_block ~ ~ ~ {BlockState:{Name:\"minecraft:packed_ice\"},Time:100,DropItem:0b,HurtEntities:1b,FallHurtMax:" + "" + Math.round(dmg) + ",FallDistance:50f,FallHurtAmount:" + Math.round(dmg) + "f}"));
			}
		}
		if (entity.getPersistentData().getDouble("cnt1") > 180) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands()
						.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getPersistentData().getDouble("x_pos")), (entity.getPersistentData().getDouble("y_pos")), (entity.getPersistentData().getDouble("z_pos"))),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "fill ~-15 ~-2 ~-15 ~15 ~10 ~15 air replace packed_ice");
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
