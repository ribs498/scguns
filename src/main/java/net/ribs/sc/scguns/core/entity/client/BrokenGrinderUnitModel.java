package net.ribs.sc.scguns.core.entity.client;


import net.minecraft.resources.ResourceLocation;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.entity.BrokenGrinderUnitEntity;

import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BrokenGrinderUnitModel extends AnimatedGeoModel<BrokenGrinderUnitEntity> {
    @Override
    public ResourceLocation getModelResource(BrokenGrinderUnitEntity object) {
        return new ResourceLocation(ScGuns.ID, "geo/broken_grinder_unit.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BrokenGrinderUnitEntity object) {
        return new ResourceLocation(ScGuns.ID, "textures/entity/broken_grinder_unit_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BrokenGrinderUnitEntity animatable) {
        return new ResourceLocation(ScGuns.ID, "animations/broken_grinder_unit.animation.json");
    }
}
