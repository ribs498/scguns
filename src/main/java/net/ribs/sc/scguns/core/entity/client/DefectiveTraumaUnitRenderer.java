package net.ribs.sc.scguns.core.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.entity.DefectiveTraumaUnitEntity;
import net.ribs.sc.scguns.core.entity.TraumaUnitEntity;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class DefectiveTraumaUnitRenderer extends GeoEntityRenderer<DefectiveTraumaUnitEntity> {
    public DefectiveTraumaUnitRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new DefectiveTraumaUnitModel());
        this.shadowRadius = 0.6f;
    }

    @Override
    public ResourceLocation getTextureLocation(DefectiveTraumaUnitEntity instance) {
        return new ResourceLocation(ScGuns.ID, "textures/entity/defective_trauma_unit_texture.png");
    }

    @Override
    public RenderType getRenderType(DefectiveTraumaUnitEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer,
                                    @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.0f, 1.0f, 1.0f);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
