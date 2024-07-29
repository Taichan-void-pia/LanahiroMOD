package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ranahiromod.init.RanahiromodModItems;

public class SkillFossilaoi2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double zPos = 0;
		double yPos = 0;
		double rad = 0;
		double rad_now = 0;
		double yaw_now = 0;
		double xPos = 0;
		double dis = 0;
		double yaw = 0;
		double pitch = 0;
		double yaw2 = 0;
		double pitch2 = 0;
		double xPos2 = 0;
		double yPos2 = 0;
		double zPos2 = 0;
		boolean logic_a = false;
		boolean logic_player = false;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		xPos = x;
		yPos = y;
		zPos = z;
		{
			Entity _ent = entity;
			_ent.setYRot(entity.getYRot());
			_ent.setXRot(90);
			_ent.setYBodyRot(_ent.getYRot());
			_ent.setYHeadRot(_ent.getYRot());
			_ent.yRotO = _ent.getYRot();
			_ent.xRotO = _ent.getXRot();
			if (_ent instanceof LivingEntity _entity) {
				_entity.yBodyRotO = _entity.getYRot();
				_entity.yHeadRotO = _entity.getYRot();
			}
		}
		if (entity.getPersistentData().getDouble("cnt1") % 2 == 0) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(Items.SPLASH_POTION).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			if (entity.getPersistentData().getDouble("cnt2") == 0) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"summon potion ~ ~ ~ {Motion:[0.0,-1.0,0.0],Item:{id:\"minecraft:splash_potion\",Count:1b,tag:{Potion:\"minecraft:fire_resistance\"}}}");
				entity.getPersistentData().putDouble("cnt2", 1);
			} else if (entity.getPersistentData().getDouble("cnt2") == 1) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"summon potion ~ ~ ~ {Motion:[0.0,-1.0,0.0],Item:{id:\"minecraft:splash_potion\",Count:1b,tag:{Potion:\"minecraft:strong_healing\"}}}");
				entity.getPersistentData().putDouble("cnt2", 2);
			} else if (entity.getPersistentData().getDouble("cnt2") == 2) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"summon potion ~ ~ ~ {Motion:[0.0,-1.0,0.0],Item:{id:\"minecraft:splash_potion\",Count:1b,tag:{Potion:\"minecraft:strong_regeneration\"}}}");
				entity.getPersistentData().putDouble("cnt2", 3);
			} else if (entity.getPersistentData().getDouble("cnt2") == 3) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"summon potion ~ ~ ~ {Motion:[0.0,-1.0,0.0],Item:{id:\"minecraft:splash_potion\",Count:1b,tag:{Potion:\"minecraft:empty\",CustomPotionColor:16769577,CustomPotionEffects:[{Id:22b,Amplifier:1b,Duration:1800}]}}}");
				entity.getPersistentData().putDouble("cnt2", 4);
			}
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
		if (entity.getPersistentData().getDouble("cnt1") > 10) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RanahiromodModItems.FOSSILAOI_SWORD_ITEM.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
