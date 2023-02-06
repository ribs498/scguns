package net.ribs.sc.scguns.core.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.entity.RailwayBanditEntity;
import net.ribs.sc.scguns.core.entity.TrainingDummyEntity;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class RailwayBanditRenderer extends GeoEntityRenderer<RailwayBanditEntity> {
    public RailwayBanditRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new RailwayBanditModel());
        this.shadowRadius = 0.5f;
    }

    @Override
    public ResourceLocation getTextureLocation(RailwayBanditEntity instance) {
        return new ResourceLocation(ScGuns.ID, "textures/entity/railway_bandit_texture.png");
    }

    @Override
    public RenderType getRenderType(RailwayBanditEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer,
                                    @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.6f, 0.6f, 0.6f);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
