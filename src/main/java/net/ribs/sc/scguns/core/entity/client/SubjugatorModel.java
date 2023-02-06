package net.ribs.sc.scguns.core.entity.client;


import net.minecraft.resources.ResourceLocation;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.entity.SubjugatorEntity;

import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SubjugatorModel extends AnimatedGeoModel<SubjugatorEntity> {
    @Override
    public ResourceLocation getModelResource(SubjugatorEntity object) {
        return new ResourceLocation(ScGuns.ID, "geo/subjugator.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SubjugatorEntity object) {
        return new ResourceLocation(ScGuns.ID, "textures/entity/subjugator_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SubjugatorEntity animatable) {
        return new ResourceLocation(ScGuns.ID, "animations/subjugator.animation.json");
    }
}
