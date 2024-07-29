package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import java.util.List;
import java.util.Comparator;

public class RanahiroProtectionMathProcedure {
	public static double execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return 0;
		double PerReceiveDamageProtect = 0;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator == entity)) {
					if (entityiterator instanceof LivingEntity) {
						if (entityiterator instanceof ServerPlayer _plr2 && _plr2.level() instanceof ServerLevel
								&& _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:ranahiro_protection_1"))).isDone()) {
							PerReceiveDamageProtect = 0.05;
						}
						if (entityiterator instanceof ServerPlayer _plr3 && _plr3.level() instanceof ServerLevel
								&& _plr3.getAdvancements().getOrStartProgress(_plr3.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:ranahiro_protection_2"))).isDone()) {
							PerReceiveDamageProtect = 0.1;
						}
						if (entityiterator instanceof ServerPlayer _plr4 && _plr4.level() instanceof ServerLevel
								&& _plr4.getAdvancements().getOrStartProgress(_plr4.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:ranahiro_protection_3"))).isDone()) {
							PerReceiveDamageProtect = 0.15;
						}
						if (entityiterator instanceof ServerPlayer _plr5 && _plr5.level() instanceof ServerLevel
								&& _plr5.getAdvancements().getOrStartProgress(_plr5.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:ranahiro_protection_4"))).isDone()) {
							PerReceiveDamageProtect = 0.2;
						}
						if (entityiterator instanceof ServerPlayer _plr6 && _plr6.level() instanceof ServerLevel
								&& _plr6.getAdvancements().getOrStartProgress(_plr6.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:ranahiro_protection_5"))).isDone()) {
							PerReceiveDamageProtect = 0.25;
						}
						if (entityiterator instanceof ServerPlayer _plr7 && _plr7.level() instanceof ServerLevel
								&& _plr7.getAdvancements().getOrStartProgress(_plr7.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:ranahiro_protection_6"))).isDone()) {
							PerReceiveDamageProtect = 0.3;
						}
						if (entityiterator instanceof ServerPlayer _plr8 && _plr8.level() instanceof ServerLevel
								&& _plr8.getAdvancements().getOrStartProgress(_plr8.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:ranahiro_protection_7"))).isDone()) {
							PerReceiveDamageProtect = 0.35;
						}
						if (entityiterator instanceof ServerPlayer _plr9 && _plr9.level() instanceof ServerLevel
								&& _plr9.getAdvancements().getOrStartProgress(_plr9.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:ranahiro_protection_8"))).isDone()) {
							PerReceiveDamageProtect = 0.4;
						}
						if (entityiterator instanceof ServerPlayer _plr10 && _plr10.level() instanceof ServerLevel
								&& _plr10.getAdvancements().getOrStartProgress(_plr10.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:ranahiro_protection_9"))).isDone()) {
							PerReceiveDamageProtect = 0.45;
						}
						if (entityiterator instanceof ServerPlayer _plr11 && _plr11.level() instanceof ServerLevel
								&& _plr11.getAdvancements().getOrStartProgress(_plr11.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:ranahiro_protection_10"))).isDone()) {
							PerReceiveDamageProtect = 0.5;
						}
					}
				}
			}
		}
		return 1 - PerReceiveDamageProtect;
	}
}
