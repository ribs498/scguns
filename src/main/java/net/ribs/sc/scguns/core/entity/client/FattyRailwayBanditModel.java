package net.ribs.sc.scguns.core.entity.client;


import net.minecraft.resources.ResourceLocation;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.entity.FattyRailwayBanditEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FattyRailwayBanditModel extends AnimatedGeoModel<FattyRailwayBanditEntity> {
    @Override
    public ResourceLocation getModelResource(FattyRailwayBanditEntity object) {
        return new ResourceLocation(ScGuns.ID, "geo/fatty_railway_bandit.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FattyRailwayBanditEntity object) {
        return new ResourceLocation(ScGuns.ID, "textures/entity/fatty_railway_bandit_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(FattyRailwayBanditEntity animatable) {
        return new ResourceLocation(ScGuns.ID, "animations/fatty_railway_bandit.animation.json");
    }
}
