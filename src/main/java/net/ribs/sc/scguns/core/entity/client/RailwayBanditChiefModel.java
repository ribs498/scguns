package net.ribs.sc.scguns.core.entity.client;


import net.minecraft.resources.ResourceLocation;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.entity.FattyRailwayBanditEntity;
import net.ribs.sc.scguns.core.entity.RailwayBanditChiefEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RailwayBanditChiefModel extends AnimatedGeoModel<RailwayBanditChiefEntity> {
    @Override
    public ResourceLocation getModelResource(RailwayBanditChiefEntity object) {
        return new ResourceLocation(ScGuns.ID, "geo/railway_bandit_chief.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(RailwayBanditChiefEntity object) {
        return new ResourceLocation(ScGuns.ID, "textures/entity/railway_bandit_chief_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(RailwayBanditChiefEntity animatable) {
        return new ResourceLocation(ScGuns.ID, "animations/railway_bandit_chief.animation.json");
    }
}
