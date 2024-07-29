
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ranahiromod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.ranahiromod.client.model.Modelwater_dragon;
import net.mcreator.ranahiromod.client.model.Modelushiro;
import net.mcreator.ranahiromod.client.model.Modelseahorsenightmare;
import net.mcreator.ranahiromod.client.model.Modelranahiro_wing;
import net.mcreator.ranahiromod.client.model.Modelphotpn_shot;
import net.mcreator.ranahiromod.client.model.Modelphotpn_seeker;
import net.mcreator.ranahiromod.client.model.Modelmoti;
import net.mcreator.ranahiromod.client.model.Modelmechanism_wing;
import net.mcreator.ranahiromod.client.model.Modelmechanism_leggings;
import net.mcreator.ranahiromod.client.model.Modelmechanism_helmet;
import net.mcreator.ranahiromod.client.model.Modelmechanism_boots;
import net.mcreator.ranahiromod.client.model.Modelmainer_skeleton;
import net.mcreator.ranahiromod.client.model.Modellavanical_tracker;
import net.mcreator.ranahiromod.client.model.Modellavanical_golem;
import net.mcreator.ranahiromod.client.model.Modellavanic_breaker;
import net.mcreator.ranahiromod.client.model.Modelknight_of_lightning;
import net.mcreator.ranahiromod.client.model.Modelgizennsha;
import net.mcreator.ranahiromod.client.model.Modelgeneral_wither_skeleton;
import net.mcreator.ranahiromod.client.model.Modelgeneral_skeleton;
import net.mcreator.ranahiromod.client.model.Modelgaleslasher;
import net.mcreator.ranahiromod.client.model.Modelfairy_spirit_daiyousei;
import net.mcreator.ranahiromod.client.model.Modelepicdownskeleton;
import net.mcreator.ranahiromod.client.model.Modelepicdownblaze;
import net.mcreator.ranahiromod.client.model.Modelenderman_neo;
import net.mcreator.ranahiromod.client.model.Modeldorahiro_wingTail;
import net.mcreator.ranahiromod.client.model.Modelbrezoldier;
import net.mcreator.ranahiromod.client.model.Modelbosshiro_phase2;
import net.mcreator.ranahiromod.client.model.Modelarrow_taichan;
import net.mcreator.ranahiromod.client.model.Modelarmor_animated2;
import net.mcreator.ranahiromod.client.model.Modelarmor_animated1;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class RanahiromodModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelphotpn_shot.LAYER_LOCATION, Modelphotpn_shot::createBodyLayer);
		event.registerLayerDefinition(Modelgizennsha.LAYER_LOCATION, Modelgizennsha::createBodyLayer);
		event.registerLayerDefinition(Modelphotpn_seeker.LAYER_LOCATION, Modelphotpn_seeker::createBodyLayer);
		event.registerLayerDefinition(Modelarmor_animated1.LAYER_LOCATION, Modelarmor_animated1::createBodyLayer);
		event.registerLayerDefinition(Modelwater_dragon.LAYER_LOCATION, Modelwater_dragon::createBodyLayer);
		event.registerLayerDefinition(Modelmechanism_helmet.LAYER_LOCATION, Modelmechanism_helmet::createBodyLayer);
		event.registerLayerDefinition(Modelepicdownblaze.LAYER_LOCATION, Modelepicdownblaze::createBodyLayer);
		event.registerLayerDefinition(Modellavanic_breaker.LAYER_LOCATION, Modellavanic_breaker::createBodyLayer);
		event.registerLayerDefinition(Modeldorahiro_wingTail.LAYER_LOCATION, Modeldorahiro_wingTail::createBodyLayer);
		event.registerLayerDefinition(Modelmainer_skeleton.LAYER_LOCATION, Modelmainer_skeleton::createBodyLayer);
		event.registerLayerDefinition(Modelfairy_spirit_daiyousei.LAYER_LOCATION, Modelfairy_spirit_daiyousei::createBodyLayer);
		event.registerLayerDefinition(Modelepicdownskeleton.LAYER_LOCATION, Modelepicdownskeleton::createBodyLayer);
		event.registerLayerDefinition(Modelgeneral_skeleton.LAYER_LOCATION, Modelgeneral_skeleton::createBodyLayer);
		event.registerLayerDefinition(Modelushiro.LAYER_LOCATION, Modelushiro::createBodyLayer);
		event.registerLayerDefinition(Modelmechanism_leggings.LAYER_LOCATION, Modelmechanism_leggings::createBodyLayer);
		event.registerLayerDefinition(Modelmoti.LAYER_LOCATION, Modelmoti::createBodyLayer);
		event.registerLayerDefinition(Modelknight_of_lightning.LAYER_LOCATION, Modelknight_of_lightning::createBodyLayer);
		event.registerLayerDefinition(Modelranahiro_wing.LAYER_LOCATION, Modelranahiro_wing::createBodyLayer);
		event.registerLayerDefinition(Modelbosshiro_phase2.LAYER_LOCATION, Modelbosshiro_phase2::createBodyLayer);
		event.registerLayerDefinition(Modelarrow_taichan.LAYER_LOCATION, Modelarrow_taichan::createBodyLayer);
		event.registerLayerDefinition(Modelarmor_animated2.LAYER_LOCATION, Modelarmor_animated2::createBodyLayer);
		event.registerLayerDefinition(Modelseahorsenightmare.LAYER_LOCATION, Modelseahorsenightmare::createBodyLayer);
		event.registerLayerDefinition(Modelmechanism_boots.LAYER_LOCATION, Modelmechanism_boots::createBodyLayer);
		event.registerLayerDefinition(Modellavanical_tracker.LAYER_LOCATION, Modellavanical_tracker::createBodyLayer);
		event.registerLayerDefinition(Modelbrezoldier.LAYER_LOCATION, Modelbrezoldier::createBodyLayer);
		event.registerLayerDefinition(Modelmechanism_wing.LAYER_LOCATION, Modelmechanism_wing::createBodyLayer);
		event.registerLayerDefinition(Modelgeneral_wither_skeleton.LAYER_LOCATION, Modelgeneral_wither_skeleton::createBodyLayer);
		event.registerLayerDefinition(Modelgaleslasher.LAYER_LOCATION, Modelgaleslasher::createBodyLayer);
		event.registerLayerDefinition(Modellavanical_golem.LAYER_LOCATION, Modellavanical_golem::createBodyLayer);
		event.registerLayerDefinition(Modelenderman_neo.LAYER_LOCATION, Modelenderman_neo::createBodyLayer);
	}
}
