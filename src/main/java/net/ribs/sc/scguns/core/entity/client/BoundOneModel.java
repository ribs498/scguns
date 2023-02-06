package net.ribs.sc.scguns.core.entity.client;


import net.minecraft.resources.ResourceLocation;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.entity.BoundOneEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BoundOneModel extends AnimatedGeoModel<BoundOneEntity> {
    @Override
    public ResourceLocation getModelResource(BoundOneEntity object) {
        return new ResourceLocation(ScGuns.ID, "geo/bound_one.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BoundOneEntity object) {
        return new ResourceLocation(ScGuns.ID, "textures/entity/bound_one_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BoundOneEntity animatable) {
        return new ResourceLocation(ScGuns.ID, "animations/bound_one.animation.json");
    }
}
