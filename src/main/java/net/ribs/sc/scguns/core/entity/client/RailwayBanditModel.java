package net.ribs.sc.scguns.core.entity.client;


import net.minecraft.resources.ResourceLocation;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.entity.RailwayBanditEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RailwayBanditModel extends AnimatedGeoModel<RailwayBanditEntity> {
    @Override
    public ResourceLocation getModelResource(RailwayBanditEntity object) {
        return new ResourceLocation(ScGuns.ID, "geo/railway_bandit.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(RailwayBanditEntity object) {
        return new ResourceLocation(ScGuns.ID, "textures/entity/railway_bandit_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(RailwayBanditEntity animatable) {
        return new ResourceLocation(ScGuns.ID, "animations/railway_bandit.animation.json");
    }
}
