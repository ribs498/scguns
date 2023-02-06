package net.ribs.sc.scguns.core.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.entity.GirlRailwayBanditEntity;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class GirlRailwayBanditRenderer extends GeoEntityRenderer<GirlRailwayBanditEntity> {
    public GirlRailwayBanditRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new GirlRailwayBanditModel());
        this.shadowRadius = 0.4f;
    }

    @Override
    public ResourceLocation getTextureLocation(GirlRailwayBanditEntity instance) {
        return new ResourceLocation(ScGuns.ID, "textures/entity/girl_railway_bandit_texture.png");
    }

    @Override
    public RenderType getRenderType(GirlRailwayBanditEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer,
                                    @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.54f, 0.54f, 0.54f);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
