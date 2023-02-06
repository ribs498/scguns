package net.ribs.sc.scguns.core.entity.client;


import net.minecraft.resources.ResourceLocation;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.entity.SkyCarrierEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SkyCarrierModel extends AnimatedGeoModel<SkyCarrierEntity> {
    @Override
    public ResourceLocation getModelResource(SkyCarrierEntity object) {
        return new ResourceLocation(ScGuns.ID, "geo/sky_carrier.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SkyCarrierEntity object) {
        return new ResourceLocation(ScGuns.ID, "textures/entity/sky_carrier_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SkyCarrierEntity animatable) {
        return new ResourceLocation(ScGuns.ID, "animations/sky_carrier.animation.json");
    }
}
