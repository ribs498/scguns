package net.ribs.sc.scguns.core.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.ribs.sc.scguns.core.ScGuns;

public class Tags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_SCORCHED_BRONZE_TOOL
                = tag("needs_scorched_bronze_tool");
        public static final TagKey<Block> NEEDS_TIN_BRONZE_TOOL
                = tag("needs_tin_bronze_tool");

        public static final TagKey<Block> NEEDS_FLINT_TOOL
                = tag("needs_flint_tool");
        public static final TagKey<Block> NEEDS_COPPER_TOOL
                = tag("needs_copper_tool");
        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(ScGuns.ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
}
