package net.ribs.sc.scguns.core.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.entity.FattyRailwayBanditEntity;
import net.ribs.sc.scguns.core.entity.RailwayBanditChiefEntity;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class RailwayBanditChiefRenderer extends GeoEntityRenderer<RailwayBanditChiefEntity> {
    public RailwayBanditChiefRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new RailwayBanditChiefModel());
        this.shadowRadius = 0.7f;
    }

    @Override
    public ResourceLocation getTextureLocation(RailwayBanditChiefEntity instance) {
        return new ResourceLocation(ScGuns.ID, "textures/entity/railway_bandit_chief_texture.png");
    }

    @Override
    public RenderType getRenderType(RailwayBanditChiefEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer,
                                    @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.73f, 0.73f, 0.73f);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
