package com.yourname.rotp_tutorial.client;

import com.yourname.rotp_tutorial.RotpTutorialAddon;
import com.yourname.rotp_tutorial.client.render.entity.renderer.stand.TutorialStandRenderer;
import com.yourname.rotp_tutorial.init.AddonStands;
import com.yourname.rotp_tutorial.init.InitEntities;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = RotpTutorialAddon.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientInit {
    
    @SubscribeEvent
    public static void onFMLClientSetup(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(AddonStands.TUTORIAL_STAND.getEntityType(), TutorialStandRenderer::new);
    }
}
