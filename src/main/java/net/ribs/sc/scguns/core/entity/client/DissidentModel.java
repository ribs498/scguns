package net.ribs.sc.scguns.core.entity.client;


import net.minecraft.resources.ResourceLocation;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.entity.DissidentEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DissidentModel extends AnimatedGeoModel<DissidentEntity> {
    @Override
    public ResourceLocation getModelResource(DissidentEntity object) {
        return new ResourceLocation(ScGuns.ID, "geo/dissident.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DissidentEntity object) {
        return new ResourceLocation(ScGuns.ID, "textures/entity/dissident_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(DissidentEntity animatable) {
        return new ResourceLocation(ScGuns.ID, "animations/dissident.animation.json");
    }
}
