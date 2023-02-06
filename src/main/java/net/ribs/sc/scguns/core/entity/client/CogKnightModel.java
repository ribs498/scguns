package net.ribs.sc.scguns.core.entity.client;


import net.minecraft.resources.ResourceLocation;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.entity.CogKnightEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CogKnightModel extends AnimatedGeoModel<CogKnightEntity> {
    @Override
    public ResourceLocation getModelResource(CogKnightEntity object) {
        return new ResourceLocation(ScGuns.ID, "geo/cog_knight.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CogKnightEntity object) {
        return new ResourceLocation(ScGuns.ID, "textures/entity/cog_knight_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CogKnightEntity animatable) {
        return new ResourceLocation(ScGuns.ID, "animations/cog_knight.animation.json");
    }
}
