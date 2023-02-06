package net.ribs.sc.scguns.core.entity.client;


import net.minecraft.resources.ResourceLocation;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.entity.KilnManEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KilnManModel extends AnimatedGeoModel<KilnManEntity> {
    @Override
    public ResourceLocation getModelResource(KilnManEntity object) {
        return new ResourceLocation(ScGuns.ID, "geo/kiln_man.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(KilnManEntity object) {
        return new ResourceLocation(ScGuns.ID, "textures/entity/kiln_man_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(KilnManEntity animatable) {
        return new ResourceLocation(ScGuns.ID, "animations/kiln_man.animation.json");
    }
}
