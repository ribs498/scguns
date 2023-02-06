package net.ribs.sc.scguns.core.world.feature;


import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.ribs.sc.scguns.core.ScGuns;

import java.util.List;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, ScGuns.ID);


    public static final RegistryObject<PlacedFeature> SULFUR_ORE_PLACED = PLACED_FEATURES.register("sulfur_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.SULFUR_ORE.getHolder().get(),
                    commonOrePlacement(15, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-50), VerticalAnchor.aboveBottom(120)))));

    public static final RegistryObject<PlacedFeature> END_ETHERIUM_ORE_PLACED = PLACED_FEATURES.register("end_stone_etherium_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.END_STONE_ETHERIUM_ORE.getHolder().get(), commonOrePlacement(3,
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> NETHER_SULFUR_ORE_PLACED = PLACED_FEATURES.register("nether_sulfur_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.NETHER_SULFUR.getHolder().get(), commonOrePlacement(19,
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-120), VerticalAnchor.aboveBottom(120)))));


    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}
