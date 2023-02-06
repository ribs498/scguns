package net.ribs.sc.scguns.core.entity.client;


import net.minecraft.resources.ResourceLocation;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.entity.BrokenMiningUnitEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BrokenMiningUnitModel extends AnimatedGeoModel<BrokenMiningUnitEntity> {
    @Override
    public ResourceLocation getModelResource(BrokenMiningUnitEntity object) {
        return new ResourceLocation(ScGuns.ID, "geo/broken_mining_unit.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BrokenMiningUnitEntity object) {
        return new ResourceLocation(ScGuns.ID, "textures/entity/broken_mining_unit_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BrokenMiningUnitEntity animatable) {
        return new ResourceLocation(ScGuns.ID, "animations/broken_mining_unit.animation.json");
    }
}
