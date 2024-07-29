package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerTickProcedureProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		SkillBosshiroTickProcedure.execute(world, x, y, z, entity);
		ActiveStatsProcedure.execute(entity);
		FullSetLogicProcedure.execute(entity);
		SkillLavahiroTickProcedure.execute(world, x, y, z, entity);
		SkillWaterhiroTickProcedure.execute(world, x, y, z, entity);
		SkillWindhiroTickProcedure.execute(world, x, y, z, entity);
		SkilldragonhiroTickProcedure.execute(world, x, y, z, entity);
		SkillOnihiroTickProcedure.execute(world, x, y, z, entity);
		SkillVolthiroTickProcedure.execute(world, x, y, z, entity);
		FossilaoiSwordTickProcedure.execute(world, x, y, z, entity);
		SkillSKLinerTickProcedure.execute(world, x, y, z, entity);
		SkillWardenhiroTickProcedure.execute(world, x, y, z, entity);
		SkillVazafilaTickProcedure.execute(world, x, y, z, entity);
		SkillWeaponhiroTickProcedure.execute(world, x, y, z, entity);
		SkillMottieTickProcedure.execute(world, x, y, z, entity);
		OffsetShockWaveProcedure.execute(world, x, y, z, entity);
		SkillSwordPlayerTickProcedure.execute(world, x, y, z, entity);
		SkillMelamainTickProcedure.execute(world, x, y, z, entity);
		DoubleJumpPerkFallDamageOffProcedure.execute(entity);
		GameruleWorldSetProcedure.execute(world, x, y, z, entity);
		ArcherPlayerTickProcedure.execute(world, x, y, z, entity);
		WizardPlayerTickProcedure.execute(world, x, y, z, entity);
		ThiefPlayerTickProcedure.execute(world, x, y, z, entity);
		AssassinPlayerTickProcedure.execute(world, x, y, z, entity);
		AnimalLootTableOFFProcedure.execute(entity);
		SkillNyaguuTickProcedure.execute(world, x, y, z, entity);
		SkillSpladotTickProcedure.execute(world, x, y, z, entity);
		ElderGuardianEffectChangeProcedure.execute(entity);
		SkillHoroshaTickProcedure.execute(world, x, y, z, entity);
		ClearItemHoroshaProcedure.execute(entity);
		WeaponhiroEnchantsProcedure.execute(entity);
		SkillGroundhiroTickProcedure.execute(world, x, y, z, entity);
		SumahiroPhoneBatteryProcedure.execute(entity);
		RepopulationTriggerProcedure.execute(entity);
		OnARailTrigger2Procedure.execute(world, x, y, z, entity);
		BeaconatorTriggerProcedure.execute(entity);
		AchivementUnlockGamerScoreProcedure.execute(world, x, y, z, entity);
		SummonerPlayerTickProcedure.execute(world, x, y, z, entity);
	}
}
