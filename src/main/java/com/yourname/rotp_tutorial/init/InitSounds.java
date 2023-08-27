package com.yourname.rotp_tutorial.init;

import java.util.function.Supplier;

import com.yourname.rotp_tutorial.RotpTutorialAddon;
import com.github.standobyte.jojo.init.ModSounds;
import com.github.standobyte.jojo.util.mc.OstSoundList;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InitSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, RotpTutorialAddon.MOD_ID);
    
    public static final RegistryObject<SoundEvent> USER_TUTORIAL_STAND = SOUNDS.register("user_tutorial_stand", 
            () -> new SoundEvent(new ResourceLocation(RotpTutorialAddon.MOD_ID, "user_tutorial_stand")));

    public static final Supplier<SoundEvent> TUTORIAL_STAND_SUMMON = ModSounds.STAND_SUMMON_DEFAULT;
    
    public static final Supplier<SoundEvent> TUTORIAL_STAND_UNSUMMON = ModSounds.STAND_UNSUMMON_DEFAULT;
    
    public static final Supplier<SoundEvent> TUTORIAL_STAND_PUNCH_LIGHT = ModSounds.STAND_PUNCH_LIGHT;
    
    public static final Supplier<SoundEvent> TUTORIAL_STAND_PUNCH_HEAVY = ModSounds.STAND_PUNCH_HEAVY;
    
    public static final Supplier<SoundEvent> TUTORIAL_STAND_BARRAGE = ModSounds.STAND_PUNCH_LIGHT;
    
    public static final RegistryObject<SoundEvent> TUTORIAL_STAND_ORA = SOUNDS.register("tutorial_stand_ora", 
            () -> new SoundEvent(new ResourceLocation(RotpTutorialAddon.MOD_ID, "tutorial_stand_ora")));
    
    public static final RegistryObject<SoundEvent> TUTORIAL_STAND_ORA_LONG = SOUNDS.register("tutorial_stand_ora_long", 
            () -> new SoundEvent(new ResourceLocation(RotpTutorialAddon.MOD_ID, "tutorial_stand_ora_long")));
    
    public static final RegistryObject<SoundEvent> TUTORIAL_STAND_ORA_ORA_ORA = SOUNDS.register("tutorial_stand_ora_ora_ora", 
            () -> new SoundEvent(new ResourceLocation(RotpTutorialAddon.MOD_ID, "tutorial_stand_ora_ora_ora")));
    
    static final OstSoundList TUTORIAL_STAND_OST = new OstSoundList(new ResourceLocation(RotpTutorialAddon.MOD_ID, "tutorial_stand_ost"), SOUNDS);

}
