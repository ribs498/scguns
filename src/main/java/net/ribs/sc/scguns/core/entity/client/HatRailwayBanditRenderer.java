package net.ribs.sc.scguns.core.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.entity.HatRailwayBanditEntity;
import net.ribs.sc.scguns.core.entity.RailwayBanditEntity;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class HatRailwayBanditRenderer extends GeoEntityRenderer<HatRailwayBanditEntity> {
    public HatRailwayBanditRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new HatRailwayBanditModel());
        this.shadowRadius = 0.6f;
    }

    @Override
    public ResourceLocation getTextureLocation(HatRailwayBanditEntity instance) {
        return new ResourceLocation(ScGuns.ID, "textures/entity/hat_railway_bandit_texture.png");
    }

    @Override
    public RenderType getRenderType(HatRailwayBanditEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer,
                                    @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.65f, 0.65f, 0.65f);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
