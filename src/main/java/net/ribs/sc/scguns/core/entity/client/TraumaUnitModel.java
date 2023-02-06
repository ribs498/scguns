package net.ribs.sc.scguns.core.entity.client;


import net.minecraft.resources.ResourceLocation;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.entity.TraumaUnitEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class TraumaUnitModel extends AnimatedGeoModel<TraumaUnitEntity> {
    @Override
    public ResourceLocation getModelResource(TraumaUnitEntity object) {
        return new ResourceLocation(ScGuns.ID, "geo/trauma_unit.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(TraumaUnitEntity object) {
        return new ResourceLocation(ScGuns.ID, "textures/entity/trauma_unit_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(TraumaUnitEntity animatable) {
        return new ResourceLocation(ScGuns.ID, "animations/trauma_unit.animation.json");
    }
}
