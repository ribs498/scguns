package net.ribs.sc.scguns.core.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.ribs.sc.scguns.core.ScGuns;
import net.ribs.sc.scguns.core.entity.KilnManEntity;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class KilnManRenderer extends GeoEntityRenderer<KilnManEntity> {
    public KilnManRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new KilnManModel());
        this.shadowRadius = 1.2f;
    }

    @Override
    public ResourceLocation getTextureLocation(KilnManEntity instance) {
        return new ResourceLocation(ScGuns.ID, "textures/entity/kiln_man_texture.png");
    }

    @Override
    public RenderType getRenderType(KilnManEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer,
                                    @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.4f, 1.4f, 1.4f);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
