package net.ribs.sc.scguns.core.fluid;

import com.mojang.math.Vector3f;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ribs.sc.scguns.core.ScGuns;

public class ModFluidTypes {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");


    public static final ResourceLocation ASTRAL_OIL_OVERLAY_RL = new ResourceLocation(ScGuns.ID, "misc/in_astral_fuel");
    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, ScGuns.ID);

    public static final RegistryObject<FluidType> ASTRAL_OIL_FLUID_TYPE = register("astral_oil_fluid",
            FluidType.Properties.create().lightLevel(7).density(8).viscosity(5).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK));




    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, ASTRAL_OIL_OVERLAY_RL,
                0xA1E038D0, new Vector3f(224f / 255f, 56f / 255f, 208f / 255f), properties));


    }


    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }




}
