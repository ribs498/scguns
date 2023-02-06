package net.ribs.sc.scguns.core.registry;

import net.ribs.sc.scguns.core.ScGuns;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SoundRegistry {
    // Deferred Register for sound registration.
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ScGuns.ID);



    public static final RegistryObject<SoundEvent> PISTOL_FIRE = register("item.pistol.fire");
    public static final RegistryObject<SoundEvent> PISTOL_SUPPRESSED = register("item.pistol.suppressed");
    public static final RegistryObject<SoundEvent> HEAVY_FIRE = register("item.heavy.fire");
    public static final RegistryObject<SoundEvent> MAGNUM_FIRE = register("item.magnum.fire");
    public static final RegistryObject<SoundEvent> HEAVY_SUPPRESSION = register("item.heavy.suppressed");
    public static final RegistryObject<SoundEvent> FLAMETHROWER = register("item.flamethrower.fire");
    public static final RegistryObject<SoundEvent> SHOTGUN_FIRE = register("item.shotgun.fire");
    private static RegistryObject<SoundEvent> register(String name) {
        return SOUNDS.register(name, () -> new SoundEvent(new ResourceLocation(ScGuns.ID, name)));
    }
}
