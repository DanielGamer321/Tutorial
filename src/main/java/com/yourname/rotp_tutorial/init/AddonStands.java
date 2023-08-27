package com.yourname.rotp_tutorial.init;

import com.yourname.rotp_tutorial.entity.stand.stands.TutorialStandEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityType;
import com.github.standobyte.jojo.init.power.stand.EntityStandRegistryObject.EntityStandSupplier;
import com.github.standobyte.jojo.power.impl.stand.stats.StandStats;
import com.github.standobyte.jojo.power.impl.stand.type.EntityStandType;

public class AddonStands {

    public static final EntityStandSupplier<EntityStandType<StandStats>, StandEntityType<TutorialStandEntity>> 
    TUTORIAL_STAND = new EntityStandSupplier<>(InitStands.STAND_TUTORIAL_STAND);
}
