package net.ribs.sc.scguns.core.entity.client;


import net.minecraft.resources.ResourceLocation;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.entity.SupplyScampEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SupplyScampModel extends AnimatedGeoModel<SupplyScampEntity> {
    @Override
    public ResourceLocation getModelResource(SupplyScampEntity object) {
        return new ResourceLocation(ScGuns.ID, "geo/supply_scamp.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SupplyScampEntity object) {
        return new ResourceLocation(ScGuns.ID, "textures/entity/supply_scamp_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SupplyScampEntity animatable) {
        return new ResourceLocation(ScGuns.ID, "animations/supply_scamp.animation.json");
    }
}
