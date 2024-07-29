
package net.mcreator.ranahiromod.command;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.common.util.FakePlayerFactory;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.commands.arguments.coordinates.BlockPosArgument;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.Commands;

import net.mcreator.ranahiromod.procedures.NBTItemStringSetProcedure;
import net.mcreator.ranahiromod.procedures.NBTItemStringSet6Procedure;
import net.mcreator.ranahiromod.procedures.NBTItemStringSet5Procedure;
import net.mcreator.ranahiromod.procedures.NBTItemStringSet4Procedure;
import net.mcreator.ranahiromod.procedures.NBTItemStringSet3Procedure;
import net.mcreator.ranahiromod.procedures.NBTItemStringSet2Procedure;
import net.mcreator.ranahiromod.procedures.NBTItemNumberSetProcedure;
import net.mcreator.ranahiromod.procedures.NBTItemNumberSet6Procedure;
import net.mcreator.ranahiromod.procedures.NBTItemNumberSet5Procedure;
import net.mcreator.ranahiromod.procedures.NBTItemNumberSet4Procedure;
import net.mcreator.ranahiromod.procedures.NBTItemNumberSet3Procedure;
import net.mcreator.ranahiromod.procedures.NBTItemNumberSet2Procedure;
import net.mcreator.ranahiromod.procedures.NBTItemLogicSetProcedure;
import net.mcreator.ranahiromod.procedures.NBTItemLogicSet6Procedure;
import net.mcreator.ranahiromod.procedures.NBTItemLogicSet5Procedure;
import net.mcreator.ranahiromod.procedures.NBTItemLogicSet4Procedure;
import net.mcreator.ranahiromod.procedures.NBTItemLogicSet3Procedure;
import net.mcreator.ranahiromod.procedures.NBTItemLogicSet2Procedure;
import net.mcreator.ranahiromod.procedures.NBTEntityStringSetProcedure;
import net.mcreator.ranahiromod.procedures.NBTEntityNumberSetProcedure;
import net.mcreator.ranahiromod.procedures.NBTEntityLogicSetProcedure;
import net.mcreator.ranahiromod.procedures.NBTBlockStringSetProcedure;
import net.mcreator.ranahiromod.procedures.NBTBlockNumberSetProcedure;
import net.mcreator.ranahiromod.procedures.NBTBlockLogicSetProcedure;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;

@Mod.EventBusSubscriber
public class NBTEditCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("nbtedit")

				.then(Commands.literal("entity").then(Commands.argument("selector", EntityArgument.entities())
						.then(Commands.argument("tagname", StringArgumentType.string()).then(Commands.literal("logic").then(Commands.argument("logic", BoolArgumentType.bool()).executes(arguments -> {
							Level world = arguments.getSource().getUnsidedLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null && world instanceof ServerLevel _servLevel)
								entity = FakePlayerFactory.getMinecraft(_servLevel);
							Direction direction = Direction.DOWN;
							if (entity != null)
								direction = entity.getDirection();

							NBTEntityLogicSetProcedure.execute(arguments, entity);
							return 0;
						}))).then(Commands.literal("number").then(Commands.argument("number", DoubleArgumentType.doubleArg()).executes(arguments -> {
							Level world = arguments.getSource().getUnsidedLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null && world instanceof ServerLevel _servLevel)
								entity = FakePlayerFactory.getMinecraft(_servLevel);
							Direction direction = Direction.DOWN;
							if (entity != null)
								direction = entity.getDirection();

							NBTEntityNumberSetProcedure.execute(arguments, entity);
							return 0;
						}))).then(Commands.literal("string").then(Commands.argument("string", StringArgumentType.string()).executes(arguments -> {
							Level world = arguments.getSource().getUnsidedLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null && world instanceof ServerLevel _servLevel)
								entity = FakePlayerFactory.getMinecraft(_servLevel);
							Direction direction = Direction.DOWN;
							if (entity != null)
								direction = entity.getDirection();

							NBTEntityStringSetProcedure.execute(arguments, entity);
							return 0;
						}))))))
				.then(Commands.literal("item").then(Commands.argument("selector", EntityArgument.entities())
						.then(Commands.argument("tagname", StringArgumentType.string()).then(Commands.literal("mainhand").then(Commands.literal("logic").then(Commands.argument("logic", BoolArgumentType.bool()).executes(arguments -> {
							Level world = arguments.getSource().getUnsidedLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null && world instanceof ServerLevel _servLevel)
								entity = FakePlayerFactory.getMinecraft(_servLevel);
							Direction direction = Direction.DOWN;
							if (entity != null)
								direction = entity.getDirection();

							NBTItemLogicSetProcedure.execute(arguments, entity);
							return 0;
						}))).then(Commands.literal("number").then(Commands.argument("number", DoubleArgumentType.doubleArg()).executes(arguments -> {
							Level world = arguments.getSource().getUnsidedLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null && world instanceof ServerLevel _servLevel)
								entity = FakePlayerFactory.getMinecraft(_servLevel);
							Direction direction = Direction.DOWN;
							if (entity != null)
								direction = entity.getDirection();

							NBTItemNumberSetProcedure.execute(arguments, entity);
							return 0;
						}))).then(Commands.literal("string").then(Commands.argument("string", StringArgumentType.string()).executes(arguments -> {
							Level world = arguments.getSource().getUnsidedLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null && world instanceof ServerLevel _servLevel)
								entity = FakePlayerFactory.getMinecraft(_servLevel);
							Direction direction = Direction.DOWN;
							if (entity != null)
								direction = entity.getDirection();

							NBTItemStringSetProcedure.execute(arguments, entity);
							return 0;
						})))).then(Commands.literal("offhand").then(Commands.literal("logic").then(Commands.argument("logic", BoolArgumentType.bool()).executes(arguments -> {
							Level world = arguments.getSource().getUnsidedLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null && world instanceof ServerLevel _servLevel)
								entity = FakePlayerFactory.getMinecraft(_servLevel);
							Direction direction = Direction.DOWN;
							if (entity != null)
								direction = entity.getDirection();

							NBTItemLogicSet2Procedure.execute(arguments, entity);
							return 0;
						}))).then(Commands.literal("number").then(Commands.argument("number", DoubleArgumentType.doubleArg()).executes(arguments -> {
							Level world = arguments.getSource().getUnsidedLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null && world instanceof ServerLevel _servLevel)
								entity = FakePlayerFactory.getMinecraft(_servLevel);
							Direction direction = Direction.DOWN;
							if (entity != null)
								direction = entity.getDirection();

							NBTItemNumberSet2Procedure.execute(arguments, entity);
							return 0;
						}))).then(Commands.literal("string").then(Commands.argument("string", StringArgumentType.string()).executes(arguments -> {
							Level world = arguments.getSource().getUnsidedLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null && world instanceof ServerLevel _servLevel)
								entity = FakePlayerFactory.getMinecraft(_servLevel);
							Direction direction = Direction.DOWN;
							if (entity != null)
								direction = entity.getDirection();

							NBTItemStringSet2Procedure.execute(arguments, entity);
							return 0;
						})))).then(Commands.literal("head").then(Commands.literal("logic").then(Commands.argument("logic", BoolArgumentType.bool()).executes(arguments -> {
							Level world = arguments.getSource().getUnsidedLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null && world instanceof ServerLevel _servLevel)
								entity = FakePlayerFactory.getMinecraft(_servLevel);
							Direction direction = Direction.DOWN;
							if (entity != null)
								direction = entity.getDirection();

							NBTItemLogicSet3Procedure.execute(arguments, entity);
							return 0;
						}))).then(Commands.literal("number").then(Commands.argument("number", DoubleArgumentType.doubleArg()).executes(arguments -> {
							Level world = arguments.getSource().getUnsidedLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null && world instanceof ServerLevel _servLevel)
								entity = FakePlayerFactory.getMinecraft(_servLevel);
							Direction direction = Direction.DOWN;
							if (entity != null)
								direction = entity.getDirection();

							NBTItemNumberSet3Procedure.execute(arguments, entity);
							return 0;
						}))).then(Commands.literal("string").then(Commands.argument("string", StringArgumentType.string()).executes(arguments -> {
							Level world = arguments.getSource().getUnsidedLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null && world instanceof ServerLevel _servLevel)
								entity = FakePlayerFactory.getMinecraft(_servLevel);
							Direction direction = Direction.DOWN;
							if (entity != null)
								direction = entity.getDirection();

							NBTItemStringSet3Procedure.execute(arguments, entity);
							return 0;
						})))).then(Commands.literal("body").then(Commands.literal("logic").then(Commands.argument("logic", BoolArgumentType.bool()).executes(arguments -> {
							Level world = arguments.getSource().getUnsidedLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null && world instanceof ServerLevel _servLevel)
								entity = FakePlayerFactory.getMinecraft(_servLevel);
							Direction direction = Direction.DOWN;
							if (entity != null)
								direction = entity.getDirection();

							NBTItemLogicSet4Procedure.execute(arguments, entity);
							return 0;
						}))).then(Commands.literal("number").then(Commands.argument("number", DoubleArgumentType.doubleArg()).executes(arguments -> {
							Level world = arguments.getSource().getUnsidedLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null && world instanceof ServerLevel _servLevel)
								entity = FakePlayerFactory.getMinecraft(_servLevel);
							Direction direction = Direction.DOWN;
							if (entity != null)
								direction = entity.getDirection();

							NBTItemNumberSet4Procedure.execute(arguments, entity);
							return 0;
						}))).then(Commands.literal("string").then(Commands.argument("string", StringArgumentType.string()).executes(arguments -> {
							Level world = arguments.getSource().getUnsidedLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null && world instanceof ServerLevel _servLevel)
								entity = FakePlayerFactory.getMinecraft(_servLevel);
							Direction direction = Direction.DOWN;
							if (entity != null)
								direction = entity.getDirection();

							NBTItemStringSet4Procedure.execute(arguments, entity);
							return 0;
						})))).then(Commands.literal("legs").then(Commands.literal("logic").then(Commands.argument("logic", BoolArgumentType.bool()).executes(arguments -> {
							Level world = arguments.getSource().getUnsidedLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null && world instanceof ServerLevel _servLevel)
								entity = FakePlayerFactory.getMinecraft(_servLevel);
							Direction direction = Direction.DOWN;
							if (entity != null)
								direction = entity.getDirection();

							NBTItemLogicSet5Procedure.execute(arguments, entity);
							return 0;
						}))).then(Commands.literal("number").then(Commands.argument("number", DoubleArgumentType.doubleArg()).executes(arguments -> {
							Level world = arguments.getSource().getUnsidedLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null && world instanceof ServerLevel _servLevel)
								entity = FakePlayerFactory.getMinecraft(_servLevel);
							Direction direction = Direction.DOWN;
							if (entity != null)
								direction = entity.getDirection();

							NBTItemNumberSet5Procedure.execute(arguments, entity);
							return 0;
						}))).then(Commands.literal("string").then(Commands.argument("string", StringArgumentType.string()).executes(arguments -> {
							Level world = arguments.getSource().getUnsidedLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null && world instanceof ServerLevel _servLevel)
								entity = FakePlayerFactory.getMinecraft(_servLevel);
							Direction direction = Direction.DOWN;
							if (entity != null)
								direction = entity.getDirection();

							NBTItemStringSet5Procedure.execute(arguments, entity);
							return 0;
						})))).then(Commands.literal("foots").then(Commands.literal("logic").then(Commands.argument("logic", BoolArgumentType.bool()).executes(arguments -> {
							Level world = arguments.getSource().getUnsidedLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null && world instanceof ServerLevel _servLevel)
								entity = FakePlayerFactory.getMinecraft(_servLevel);
							Direction direction = Direction.DOWN;
							if (entity != null)
								direction = entity.getDirection();

							NBTItemLogicSet6Procedure.execute(arguments, entity);
							return 0;
						}))).then(Commands.literal("number").then(Commands.argument("number", DoubleArgumentType.doubleArg()).executes(arguments -> {
							Level world = arguments.getSource().getUnsidedLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null && world instanceof ServerLevel _servLevel)
								entity = FakePlayerFactory.getMinecraft(_servLevel);
							Direction direction = Direction.DOWN;
							if (entity != null)
								direction = entity.getDirection();

							NBTItemNumberSet6Procedure.execute(arguments, entity);
							return 0;
						}))).then(Commands.literal("string").then(Commands.argument("string", StringArgumentType.string()).executes(arguments -> {
							Level world = arguments.getSource().getUnsidedLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null && world instanceof ServerLevel _servLevel)
								entity = FakePlayerFactory.getMinecraft(_servLevel);
							Direction direction = Direction.DOWN;
							if (entity != null)
								direction = entity.getDirection();

							NBTItemStringSet6Procedure.execute(arguments, entity);
							return 0;
						})))))))
				.then(Commands.literal("block").then(Commands.argument("position", BlockPosArgument.blockPos())
						.then(Commands.argument("tagname", StringArgumentType.string()).then(Commands.literal("logic").then(Commands.argument("logic", BoolArgumentType.bool()).executes(arguments -> {
							Level world = arguments.getSource().getUnsidedLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null && world instanceof ServerLevel _servLevel)
								entity = FakePlayerFactory.getMinecraft(_servLevel);
							Direction direction = Direction.DOWN;
							if (entity != null)
								direction = entity.getDirection();

							NBTBlockLogicSetProcedure.execute(world, arguments, entity);
							return 0;
						}))).then(Commands.literal("number").then(Commands.argument("number", DoubleArgumentType.doubleArg()).executes(arguments -> {
							Level world = arguments.getSource().getUnsidedLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null && world instanceof ServerLevel _servLevel)
								entity = FakePlayerFactory.getMinecraft(_servLevel);
							Direction direction = Direction.DOWN;
							if (entity != null)
								direction = entity.getDirection();

							NBTBlockNumberSetProcedure.execute(world, arguments, entity);
							return 0;
						}))).then(Commands.literal("string").then(Commands.argument("string", StringArgumentType.string()).executes(arguments -> {
							Level world = arguments.getSource().getUnsidedLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null && world instanceof ServerLevel _servLevel)
								entity = FakePlayerFactory.getMinecraft(_servLevel);
							Direction direction = Direction.DOWN;
							if (entity != null)
								direction = entity.getDirection();

							NBTBlockStringSetProcedure.execute(world, arguments, entity);
							return 0;
						})))))));
	}
}
