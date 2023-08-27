package com.yourname.rotp_tutorial.init;

import com.yourname.rotp_tutorial.RotpTutorialAddon;
import com.yourname.rotp_tutorial.entity.stand.stands.TutorialStandEntity;
import com.github.standobyte.jojo.action.Action;
import com.github.standobyte.jojo.action.stand.StandAction;
import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.action.stand.StandEntityAction.Phase;
import com.github.standobyte.jojo.action.stand.StandEntityBlock;
import com.github.standobyte.jojo.action.stand.StandEntityHeavyAttack;
import com.github.standobyte.jojo.action.stand.StandEntityLightAttack;
import com.github.standobyte.jojo.action.stand.StandEntityMeleeBarrage;
import com.github.standobyte.jojo.entity.stand.StandEntityType;
import com.github.standobyte.jojo.entity.stand.StandPose;
import com.github.standobyte.jojo.init.power.stand.EntityStandRegistryObject;
import com.github.standobyte.jojo.init.power.stand.ModStandsInit;
import com.github.standobyte.jojo.power.impl.stand.StandInstance.StandPart;
import com.github.standobyte.jojo.power.impl.stand.stats.StandStats;
import com.github.standobyte.jojo.power.impl.stand.type.EntityStandType;
import com.github.standobyte.jojo.power.impl.stand.type.StandType;

import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

public class InitStands {
    @SuppressWarnings("unchecked")
    public static final DeferredRegister<Action<?>> ACTIONS = DeferredRegister.create(
            (Class<Action<?>>) ((Class<?>) Action.class), RotpTutorialAddon.MOD_ID);
    @SuppressWarnings("unchecked")
    public static final DeferredRegister<StandType<?>> STANDS = DeferredRegister.create(
            (Class<StandType<?>>) ((Class<?>) StandType.class), RotpTutorialAddon.MOD_ID);
    
 // ======================================== Tutorial Stand ========================================
    
    public static final RegistryObject<StandEntityAction> TUTORIAL_STAND_PUNCH = ACTIONS.register("tutorial_stand_punch", 
            () -> new StandEntityLightAttack(new StandEntityLightAttack.Builder()
                    .punchSound(InitSounds.TUTORIAL_STAND_PUNCH_LIGHT)
                    .standSound(Phase.WINDUP, InitSounds.TUTORIAL_STAND_ORA)));
    
    public static final RegistryObject<StandEntityAction> TUTORIAL_STAND_BARRAGE = ACTIONS.register("tutorial_stand_barrage", 
            () -> new StandEntityMeleeBarrage(new StandEntityMeleeBarrage.Builder()
                    .barrageHitSound(InitSounds.TUTORIAL_STAND_BARRAGE)
                    .standSound(InitSounds.TUTORIAL_STAND_ORA_ORA_ORA)));
    
    public static final RegistryObject<StandEntityHeavyAttack> TUTORIAL_STAND_COMBO_PUNCH = ACTIONS.register("tutorial_stand_combo_punch", 
            () -> new StandEntityHeavyAttack(new StandEntityHeavyAttack.Builder()
                    .punchSound(InitSounds.TUTORIAL_STAND_PUNCH_HEAVY)
                    .standSound(Phase.WINDUP, InitSounds.TUTORIAL_STAND_ORA_LONG)
                    .partsRequired(StandPart.ARMS)));
    
    public static final RegistryObject<StandEntityHeavyAttack> TUTORIAL_STAND_HEAVY_PUNCH = ACTIONS.register("tutorial_stand_heavy_punch", 
            () -> new StandEntityHeavyAttack(new StandEntityHeavyAttack.Builder()
                    .punchSound(InitSounds.TUTORIAL_STAND_PUNCH_HEAVY)
                    .standSound(Phase.WINDUP, InitSounds.TUTORIAL_STAND_ORA_LONG)
                    .partsRequired(StandPart.ARMS)
                    .setFinisherVariation(TUTORIAL_STAND_COMBO_PUNCH)
                    .shiftVariationOf(TUTORIAL_STAND_PUNCH).shiftVariationOf(TUTORIAL_STAND_BARRAGE)));
    
    public static final RegistryObject<StandEntityAction> TUTORIAL_STAND_BLOCK = ACTIONS.register("tutorial_stand_block", 
            () -> new StandEntityBlock());
    
    
    public static final EntityStandRegistryObject<EntityStandType<StandStats>, StandEntityType<TutorialStandEntity>> STAND_TUTORIAL_STAND = 
            new EntityStandRegistryObject<>("tutorial_stand", 
                    STANDS, 
                    () -> new EntityStandType<StandStats>(
                            0xFFFFFF, ModStandsInit.PART_6_NAME,

                            new StandAction[] {
                                    TUTORIAL_STAND_PUNCH.get(), 
                                    TUTORIAL_STAND_BARRAGE.get()},
                            new StandAction[] {
                                    TUTORIAL_STAND_BLOCK.get()},

                            StandStats.class, new StandStats.Builder()
                            .tier(6)
                            .power(16.0)
                            .speed(16.0)
                            .range(50.0, 100.0)
                            .durability(16.0)
                            .precision(16.0)
                            .build("Tutorial Stand"), 

                            new StandType.StandTypeOptionals()
                            .addSummonShout(InitSounds.USER_TUTORIAL_STAND)
                            .addOst(InitSounds.TUTORIAL_STAND_OST)), 

                    InitEntities.ENTITIES, 
                    () -> new StandEntityType<TutorialStandEntity>(TutorialStandEntity::new, 0.65F, 1.95F)
                    .summonSound(InitSounds.TUTORIAL_STAND_SUMMON)
                    .unsummonSound(InitSounds.TUTORIAL_STAND_UNSUMMON))
            .withDefaultStandAttributes();
}
