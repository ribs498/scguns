package net.ribs.sc.scguns.core.entity.client;


import net.minecraft.resources.ResourceLocation;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.entity.WoolManEntity;

import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WoolManModel extends AnimatedGeoModel<WoolManEntity> {
    @Override
    public ResourceLocation getModelResource(WoolManEntity object) {
        return new ResourceLocation(ScGuns.ID, "geo/wool_man.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WoolManEntity object) {
        return new ResourceLocation(ScGuns.ID, "textures/entity/wool_man_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(WoolManEntity animatable) {
        return new ResourceLocation(ScGuns.ID, "animations/wool_man.animation.json");
    }
}
