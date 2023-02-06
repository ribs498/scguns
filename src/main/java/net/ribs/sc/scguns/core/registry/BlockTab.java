package net.ribs.sc.scguns.core.registry;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.ribs.sc.scguns.core.block.BlockRegistry;

public class BlockTab {

    public static final CreativeModeTab SCBLOCKS = new CreativeModeTab("block_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlockRegistry.SULFURORE.get());
        }
    };
}
