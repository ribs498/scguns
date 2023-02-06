package net.ribs.sc.scguns.core.entity.client;


import net.minecraft.resources.ResourceLocation;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.entity.GunRailwayBanditEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GunRailwayBanditModel extends AnimatedGeoModel<GunRailwayBanditEntity> {
    @Override
    public ResourceLocation getModelResource(GunRailwayBanditEntity object) {
        return new ResourceLocation(ScGuns.ID, "geo/gun_railway_bandit.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GunRailwayBanditEntity object) {
        return new ResourceLocation(ScGuns.ID, "textures/entity/gun_railway_bandit_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GunRailwayBanditEntity animatable) {
        return new ResourceLocation(ScGuns.ID, "animations/gun_railway_bandit.animation.json");
    }
}
