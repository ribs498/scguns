package net.ribs.sc.scguns.core.registry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.util.Tags;

import java.util.List;

public class ToolTiers {
    public static Tier SCORCHEDBRONZE;

    static {
        SCORCHEDBRONZE = TierSortingRegistry.registerTier(
                new ForgeTier(4, 850, 7.5F, 3.0F, 18,
                        Tags.Blocks.NEEDS_SCORCHED_BRONZE_TOOL, () -> Ingredient.of(ItemRegistry.SCORCHEDBRONZEINGOT.get())),
                new ResourceLocation(ScGuns.ID, "scorched_bronze"), List.of(Tiers.IRON), List.of());
    }

    public static Tier TINBRONZE;

    static {
        TINBRONZE = TierSortingRegistry.registerTier(
                new ForgeTier(4, 185, 5.5F, 1.8F, 15,
                        Tags.Blocks.NEEDS_TIN_BRONZE_TOOL, () -> Ingredient.of(ItemRegistry.TINBRONZEINGOT.get())),
                new ResourceLocation(ScGuns.ID, "tin_bronze"), List.of(Tiers.STONE), List.of());
    }

    public static Tier FLINT;

    static {
        FLINT = TierSortingRegistry.registerTier(
                new ForgeTier(2, 25, 0.5F, 1.5F, 1,
                        Tags.Blocks.NEEDS_FLINT_TOOL, () -> Ingredient.of(Items.FLINT)),
                new ResourceLocation(ScGuns.ID, "flint"), List.of(Tiers.STONE), List.of());
    }
    public static Tier COPPER;
    static {
        COPPER = TierSortingRegistry.registerTier(
                new ForgeTier(3, 60, 1.5F, 1.5F, 1,
                        Tags.Blocks.NEEDS_COPPER_TOOL, () -> Ingredient.of(Items.COPPER_INGOT)),
                new ResourceLocation(ScGuns.ID, "copper"), List.of(Tiers.STONE), List.of());
    }
}
