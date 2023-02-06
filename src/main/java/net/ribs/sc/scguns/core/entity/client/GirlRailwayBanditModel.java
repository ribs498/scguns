package net.ribs.sc.scguns.core.entity.client;


import net.minecraft.resources.ResourceLocation;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.entity.GirlRailwayBanditEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GirlRailwayBanditModel extends AnimatedGeoModel<GirlRailwayBanditEntity> {
    @Override
    public ResourceLocation getModelResource(GirlRailwayBanditEntity object) {
        return new ResourceLocation(ScGuns.ID, "geo/girl_railway_bandit.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GirlRailwayBanditEntity object) {
        return new ResourceLocation(ScGuns.ID, "textures/entity/girl_railway_bandit_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GirlRailwayBanditEntity animatable) {
        return new ResourceLocation(ScGuns.ID, "animations/girl_railway_bandit.animation.json");
    }
}
