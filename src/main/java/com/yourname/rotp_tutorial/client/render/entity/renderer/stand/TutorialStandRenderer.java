package com.yourname.rotp_tutorial.client.render.entity.renderer.stand;

import com.github.standobyte.jojo.client.render.entity.model.stand.StandModelRegistry;
import com.yourname.rotp_tutorial.RotpTutorialAddon;
import com.yourname.rotp_tutorial.client.render.entity.model.stand.TutorialStandModel;
import com.yourname.rotp_tutorial.entity.stand.stands.TutorialStandEntity;
import com.github.standobyte.jojo.client.render.entity.renderer.stand.StandEntityRenderer;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;

public class TutorialStandRenderer extends StandEntityRenderer<TutorialStandEntity, TutorialStandModel> {
    
    public TutorialStandRenderer(EntityRendererManager renderManager) {
        super(renderManager,
                StandModelRegistry.registerModel(new ResourceLocation(RotpTutorialAddon.MOD_ID, "tutorial_stand"), TutorialStandModel::new),
                new ResourceLocation(RotpTutorialAddon.MOD_ID, "textures/entity/stand/tutorial_stand.png"), 0);
    }
}
