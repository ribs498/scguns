package net.ribs.sc.scguns.core.entity.client;


import net.minecraft.resources.ResourceLocation;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.entity.TrainingDummyEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class TrainingDummyModel extends AnimatedGeoModel<TrainingDummyEntity> {
    @Override
    public ResourceLocation getModelResource(TrainingDummyEntity object) {
        return new ResourceLocation(ScGuns.ID, "geo/training_dummy.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(TrainingDummyEntity object) {
        return new ResourceLocation(ScGuns.ID, "textures/entity/training_dummy_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(TrainingDummyEntity animatable) {
        return new ResourceLocation(ScGuns.ID, "animations/training_dummy.animation.json");
    }
}
