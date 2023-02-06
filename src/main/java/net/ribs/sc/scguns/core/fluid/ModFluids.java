package net.ribs.sc.scguns.core.fluid;


import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.block.BlockRegistry;
import net.ribs.sc.scguns.core.registry.ItemRegistry;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, ScGuns.ID);

    public static final RegistryObject<FlowingFluid> SOURCE_ASTRAL_OIL = FLUIDS.register("astral_oil_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.ASTRAL_OIL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_ASTRAL_OIL = FLUIDS.register("flowing_astral_oil",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.ASTRAL_OIL_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties ASTRAL_OIL_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.ASTRAL_OIL_FLUID_TYPE, SOURCE_ASTRAL_OIL, FLOWING_ASTRAL_OIL)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(BlockRegistry.ASTRAL_OIL_BLOCK)
            .bucket(ItemRegistry.ASTRAL_OIL_BUCKET);


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
