package net.ribs.sc.scguns.core.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.entity.SupplyScampEntity;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class SupplyScampRenderer extends GeoEntityRenderer<SupplyScampEntity> {
    public SupplyScampRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SupplyScampModel());
        this.shadowRadius = 0.6f;
    }

    @Override
    public ResourceLocation getTextureLocation(SupplyScampEntity instance) {
        return new ResourceLocation(ScGuns.ID, "textures/entity/supply_scamp_texture.png");
    }

    @Override
    public RenderType getRenderType(SupplyScampEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer,
                                    @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8f, 0.8f, 0.8f);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
