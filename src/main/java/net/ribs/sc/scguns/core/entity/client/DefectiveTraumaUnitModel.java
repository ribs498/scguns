package net.ribs.sc.scguns.core.entity.client;


import net.minecraft.resources.ResourceLocation;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.entity.DefectiveTraumaUnitEntity;
import net.ribs.sc.scguns.core.entity.TraumaUnitEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DefectiveTraumaUnitModel extends AnimatedGeoModel<DefectiveTraumaUnitEntity> {
    @Override
    public ResourceLocation getModelResource(DefectiveTraumaUnitEntity object) {
        return new ResourceLocation(ScGuns.ID, "geo/defective_trauma_unit.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DefectiveTraumaUnitEntity object) {
        return new ResourceLocation(ScGuns.ID, "textures/entity/defective_trauma_unit_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(DefectiveTraumaUnitEntity animatable) {
        return new ResourceLocation(ScGuns.ID, "animations/defective_trauma_unit.animation.json");
    }
}
