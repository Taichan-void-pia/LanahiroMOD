package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class StructureUNDProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double rnd = 0;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		xPos = x;
		yPos = y;
		zPos = z;
		for (int index0 = 0; index0 < 11; index0++) {
			xPos = x;
			for (int index1 = 0; index1 < 11; index1++) {
				rnd = Math.ceil(Math.random() * 6);
				if (Math.random() < 0.01) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ranahiromod", "dungeon_room_lavahiro"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(xPos, yPos, zPos), BlockPos.containing(xPos, yPos, zPos), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (rnd == 1) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ranahiromod", "dungeon_room1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(xPos, yPos, zPos), BlockPos.containing(xPos, yPos, zPos), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rnd == 2) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ranahiromod", "dungeon_room2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(xPos, yPos, zPos), BlockPos.containing(xPos, yPos, zPos), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rnd == 3) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ranahiromod", "dungeon_room3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(xPos, yPos, zPos), BlockPos.containing(xPos, yPos, zPos), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rnd == 4) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ranahiromod", "dungeon_room4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(xPos, yPos, zPos), BlockPos.containing(xPos, yPos, zPos), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rnd == 5) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ranahiromod", "dungeon_room5"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(xPos, yPos, zPos), BlockPos.containing(xPos, yPos, zPos), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
					if (rnd == 6) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ranahiromod", "dungeon_room6"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(xPos, yPos, zPos), BlockPos.containing(xPos, yPos, zPos), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				}
				xPos = xPos + 12;
			}
			zPos = zPos + 12;
		}
	}
}
