package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.ranahiromod.init.RanahiromodModItems;

public class SumahiroPhonePlace2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ItemStack hand_item = ItemStack.EMPTY;
		String place = "";
		place = "place2";
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.SUMAHIRO_PHONE.get()) {
			hand_item = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
			if (!hand_item.getOrCreateTag().getBoolean((place + "_pos"))) {
				hand_item.getOrCreateTag().putBoolean((place + "_pos"), true);
				hand_item.getOrCreateTag().putDouble(("x_pos_" + place), (entity.getX()));
				hand_item.getOrCreateTag().putDouble(("y_pos_" + place), (entity.getY()));
				hand_item.getOrCreateTag().putDouble(("z_pos_" + place), (entity.getZ()));
			} else if (hand_item.getOrCreateTag().getBoolean((place + "_pos"))) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.GLOW, x, y, z, 100, 0.2, 1, 0.2, 0.1);
				{
					Entity _ent = entity;
					_ent.teleportTo((hand_item.getOrCreateTag().getDouble(("x_pos_" + place))), (hand_item.getOrCreateTag().getDouble(("y_pos_" + place))), (hand_item.getOrCreateTag().getDouble(("z_pos_" + place))));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((hand_item.getOrCreateTag().getDouble(("x_pos_" + place))), (hand_item.getOrCreateTag().getDouble(("y_pos_" + place))), (hand_item.getOrCreateTag().getDouble(("z_pos_" + place))),
								_ent.getYRot(), _ent.getXRot());
				}
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.SUMAHIRO_PHONE.get()) {
			hand_item = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
			if (!hand_item.getOrCreateTag().getBoolean((place + "_pos"))) {
				hand_item.getOrCreateTag().putBoolean((place + "_pos"), true);
				hand_item.getOrCreateTag().putDouble(("x_pos_" + place), (entity.getX()));
				hand_item.getOrCreateTag().putDouble(("y_pos_" + place), (entity.getY()));
				hand_item.getOrCreateTag().putDouble(("z_pos_" + place), (entity.getZ()));
			} else if (hand_item.getOrCreateTag().getBoolean((place + "_pos"))) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.GLOW, x, y, z, 100, 0.2, 1, 0.2, 0.1);
				{
					Entity _ent = entity;
					_ent.teleportTo((hand_item.getOrCreateTag().getDouble(("x_pos_" + place))), (hand_item.getOrCreateTag().getDouble(("y_pos_" + place))), (hand_item.getOrCreateTag().getDouble(("z_pos_" + place))));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((hand_item.getOrCreateTag().getDouble(("x_pos_" + place))), (hand_item.getOrCreateTag().getDouble(("y_pos_" + place))), (hand_item.getOrCreateTag().getDouble(("z_pos_" + place))),
								_ent.getYRot(), _ent.getXRot());
				}
			}
		}
	}
}
