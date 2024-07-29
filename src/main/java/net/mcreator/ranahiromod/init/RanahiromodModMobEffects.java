
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ranahiromod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.ranahiromod.potion.VoidpotionMobEffect;
import net.mcreator.ranahiromod.potion.UndefinedPotionMobEffect;
import net.mcreator.ranahiromod.potion.TargetPlayerMobEffect;
import net.mcreator.ranahiromod.potion.SpeedDamageMobEffect;
import net.mcreator.ranahiromod.potion.RotationyachMobEffect;
import net.mcreator.ranahiromod.potion.PunchRoughMobEffect;
import net.mcreator.ranahiromod.potion.PoisonGasMobEffect;
import net.mcreator.ranahiromod.potion.NullPotionMobEffect;
import net.mcreator.ranahiromod.potion.NoDamageMobEffect;
import net.mcreator.ranahiromod.potion.NeutralizationMobEffect;
import net.mcreator.ranahiromod.potion.MagicPotionMobEffect;
import net.mcreator.ranahiromod.potion.LowAttackReinforcedMobEffect;
import net.mcreator.ranahiromod.potion.HiSlownessMobEffect;
import net.mcreator.ranahiromod.potion.GuardProtectionMobEffect;
import net.mcreator.ranahiromod.potion.FlightMobEffect;
import net.mcreator.ranahiromod.potion.DropVectorMobEffect;
import net.mcreator.ranahiromod.potion.DoubleJumpCoolDownMobEffect;
import net.mcreator.ranahiromod.potion.DoubleJumpCoolDown2MobEffect;
import net.mcreator.ranahiromod.potion.DomainExpansionMobEffect;
import net.mcreator.ranahiromod.potion.DiscordRanahiroMobEffect;
import net.mcreator.ranahiromod.potion.CooldownMobEffect;
import net.mcreator.ranahiromod.potion.Cooldown2MobEffect;
import net.mcreator.ranahiromod.potion.ChangeTimeMobEffect;
import net.mcreator.ranahiromod.potion.AddictionMobEffect;
import net.mcreator.ranahiromod.RanahiromodMod;

public class RanahiromodModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, RanahiromodMod.MODID);
	public static final RegistryObject<MobEffect> COOLDOWN = REGISTRY.register("cooldown", () -> new CooldownMobEffect());
	public static final RegistryObject<MobEffect> NO_DAMAGE = REGISTRY.register("no_damage", () -> new NoDamageMobEffect());
	public static final RegistryObject<MobEffect> PUNCH_ROUGH = REGISTRY.register("punch_rough", () -> new PunchRoughMobEffect());
	public static final RegistryObject<MobEffect> HI_SLOWNESS = REGISTRY.register("hi_slowness", () -> new HiSlownessMobEffect());
	public static final RegistryObject<MobEffect> LOW_ATTACK_REINFORCED = REGISTRY.register("low_attack_reinforced", () -> new LowAttackReinforcedMobEffect());
	public static final RegistryObject<MobEffect> POISON_GAS = REGISTRY.register("poison_gas", () -> new PoisonGasMobEffect());
	public static final RegistryObject<MobEffect> DOUBLE_JUMP_COOL_DOWN = REGISTRY.register("double_jump_cool_down", () -> new DoubleJumpCoolDownMobEffect());
	public static final RegistryObject<MobEffect> DOUBLE_JUMP_COOL_DOWN_2 = REGISTRY.register("double_jump_cool_down_2", () -> new DoubleJumpCoolDown2MobEffect());
	public static final RegistryObject<MobEffect> DROP_VECTOR = REGISTRY.register("drop_vector", () -> new DropVectorMobEffect());
	public static final RegistryObject<MobEffect> SPEED_DAMAGE = REGISTRY.register("speed_damage", () -> new SpeedDamageMobEffect());
	public static final RegistryObject<MobEffect> FLIGHT = REGISTRY.register("flight", () -> new FlightMobEffect());
	public static final RegistryObject<MobEffect> DISCORD_RANAHIRO = REGISTRY.register("discord_ranahiro", () -> new DiscordRanahiroMobEffect());
	public static final RegistryObject<MobEffect> GUARD_PROTECTION = REGISTRY.register("guard_protection", () -> new GuardProtectionMobEffect());
	public static final RegistryObject<MobEffect> NULL_POTION = REGISTRY.register("null_potion", () -> new NullPotionMobEffect());
	public static final RegistryObject<MobEffect> UNDEFINED_POTION = REGISTRY.register("undefined_potion", () -> new UndefinedPotionMobEffect());
	public static final RegistryObject<MobEffect> ROTATIONYACH = REGISTRY.register("rotationyach", () -> new RotationyachMobEffect());
	public static final RegistryObject<MobEffect> MAGIC_POTION = REGISTRY.register("magic_potion", () -> new MagicPotionMobEffect());
	public static final RegistryObject<MobEffect> DOMAIN_EXPANSION = REGISTRY.register("domain_expansion", () -> new DomainExpansionMobEffect());
	public static final RegistryObject<MobEffect> NEUTRALIZATION = REGISTRY.register("neutralization", () -> new NeutralizationMobEffect());
	public static final RegistryObject<MobEffect> COOLDOWN_2 = REGISTRY.register("cooldown_2", () -> new Cooldown2MobEffect());
	public static final RegistryObject<MobEffect> TARGET_PLAYER = REGISTRY.register("target_player", () -> new TargetPlayerMobEffect());
	public static final RegistryObject<MobEffect> CHANGE_TIME = REGISTRY.register("change_time", () -> new ChangeTimeMobEffect());
	public static final RegistryObject<MobEffect> VOIDPOTION = REGISTRY.register("voidpotion", () -> new VoidpotionMobEffect());
	public static final RegistryObject<MobEffect> ADDICTION = REGISTRY.register("addiction", () -> new AddictionMobEffect());
}
