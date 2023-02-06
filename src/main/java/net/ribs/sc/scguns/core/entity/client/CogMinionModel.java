package net.ribs.sc.scguns.core.entity.client;


import net.minecraft.resources.ResourceLocation;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.entity.CogMinionEntity;

import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CogMinionModel extends AnimatedGeoModel<CogMinionEntity> {
    @Override
    public ResourceLocation getModelResource(CogMinionEntity object) {
        return new ResourceLocation(ScGuns.ID, "geo/cog_minion.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CogMinionEntity object) {
        return new ResourceLocation(ScGuns.ID, "textures/entity/cog_minion_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CogMinionEntity animatable) {
        return new ResourceLocation(ScGuns.ID, "animations/cog_minion.animation.json");
    }
}
