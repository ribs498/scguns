package net.ribs.sc.scguns.core.entity.client;


import net.minecraft.resources.ResourceLocation;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.entity.ClubRailwayBanditEntity;
import net.ribs.sc.scguns.core.entity.ClubRailwayBanditEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ClubRailwayBanditModel extends AnimatedGeoModel<ClubRailwayBanditEntity> {
    @Override
    public ResourceLocation getModelResource(ClubRailwayBanditEntity object) {
        return new ResourceLocation(ScGuns.ID, "geo/club_railway_bandit.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ClubRailwayBanditEntity object) {
        return new ResourceLocation(ScGuns.ID, "textures/entity/club_railway_bandit_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ClubRailwayBanditEntity animatable) {
        return new ResourceLocation(ScGuns.ID, "animations/club_railway_bandit.animation.json");
    }
}
