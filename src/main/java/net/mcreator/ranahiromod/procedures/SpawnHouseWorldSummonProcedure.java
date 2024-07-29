package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.network.RanahiromodModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SpawnHouseWorldSummonProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double y_pos = 0;
		double x_pos = 0;
		double z_pos = 0;
		if (!RanahiromodModVariables.MapVariables.get(world).SpawnHouseSummon) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ranahiromod", "spawn_house"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x - 6, y, z - 3), BlockPos.containing(x - 6, y, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			y_pos = 63;
			x_pos = Math.round(x + (Math.random() - 0.5) * 4000);
			z_pos = Math.round(z + (Math.random() - 0.5) * 4000);
			for (int index0 = 0; index0 < 200; index0++) {
				if (!world.getBlockState(BlockPos.containing(x_pos, y_pos, z_pos)).canOcclude()) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ranahiromod", "village_ranahiro"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x_pos, y_pos, z_pos), BlockPos.containing(x_pos, y_pos, z_pos),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal((Math.round(x_pos) + "" + Math.round(y_pos) + Math.round(z_pos))), false);
					break;
				}
				y_pos = Math.round(y_pos + 1);
			}
			RanahiromodModVariables.MapVariables.get(world).SpawnHouseSummon = true;
			RanahiromodModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
