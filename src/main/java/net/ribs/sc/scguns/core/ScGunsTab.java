package net.ribs.sc.scguns.core;

import net.ribs.sc.scguns.core.item.ScGunItem;
import net.ribs.sc.scguns.core.registry.ItemRegistry;
import com.mrcrayfish.guns.client.CustomGunManager;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.NonNullList;

/**
 * Author: Autovw
 */
public class ScGunsTab extends CreativeModeTab {
    public ScGunsTab(String label) {
        super(label);
    }

    @Override
    public ItemStack makeIcon() {
        ScGunItem gunItem = (ScGunItem) ItemRegistry.EOKAPISTOL.get();
        ItemStack stack = gunItem.getDefaultInstance();
        stack.getOrCreateTag().putInt("AmmoCount", gunItem.getGun().getGeneral().getMaxAmmo());
        return stack;
    }

    @Override
    public void fillItemList(NonNullList<ItemStack> items) {
        super.fillItemList(items);
        CustomGunManager.fill(items);
    }
}
