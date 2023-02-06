package net.ribs.sc.scguns.core.entity.client;


import net.minecraft.resources.ResourceLocation;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.entity.AdjudicatorEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AdjudicatorModel extends AnimatedGeoModel<AdjudicatorEntity> {
    @Override
    public ResourceLocation getModelResource(AdjudicatorEntity object) {
        return new ResourceLocation(ScGuns.ID, "geo/adjudicator.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AdjudicatorEntity object) {
        return new ResourceLocation(ScGuns.ID, "textures/entity/adjudicator_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AdjudicatorEntity animatable) {
        return new ResourceLocation(ScGuns.ID, "animations/adjudicator.animation.json");
    }
}
