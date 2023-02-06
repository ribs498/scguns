package net.ribs.sc.scguns.core.entity.client;


import net.minecraft.resources.ResourceLocation;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.entity.HatRailwayBanditEntity;
import net.ribs.sc.scguns.core.entity.RailwayBanditEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HatRailwayBanditModel extends AnimatedGeoModel<HatRailwayBanditEntity> {
    @Override
    public ResourceLocation getModelResource(HatRailwayBanditEntity object) {
        return new ResourceLocation(ScGuns.ID, "geo/hat_railway_bandit.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(HatRailwayBanditEntity object) {
        return new ResourceLocation(ScGuns.ID, "textures/entity/hat_railway_bandit_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(HatRailwayBanditEntity animatable) {
        return new ResourceLocation(ScGuns.ID, "animations/hat_railway_bandit.animation.json");
    }
}
