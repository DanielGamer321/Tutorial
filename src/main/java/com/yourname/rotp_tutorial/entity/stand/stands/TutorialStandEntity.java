package com.yourname.rotp_tutorial.entity.stand.stands;

import com.github.standobyte.jojo.entity.stand.StandEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityType;

import net.minecraft.world.World;

public class TutorialStandEntity extends StandEntity {
    
    public TutorialStandEntity(StandEntityType<TutorialStandEntity> type, World world) {
        super(type, world);
    }
}
