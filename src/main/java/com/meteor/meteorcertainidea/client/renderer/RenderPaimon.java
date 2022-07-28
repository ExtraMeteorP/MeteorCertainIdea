package com.meteor.meteorcertainidea.client.renderer;

import com.meteor.meteorcertainidea.client.model.ModModelLayers;
import com.meteor.meteorcertainidea.client.model.ModelPaimon;
import com.meteor.meteorcertainidea.common.entity.EntityPaimon;
import com.meteor.meteorcertainidea.common.lib.LibMisc;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Vector3f;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;

public class RenderPaimon extends EntityRenderer<EntityPaimon> {

    private final ModelPaimon model;

    public RenderPaimon(EntityRendererProvider.Context ctx) {
        super(ctx);
        model = new ModelPaimon(ctx.bakeLayer(ModModelLayers.PAIMON));
    }

    @Override
    public void render(EntityPaimon e, float yaw, float partialTicks, PoseStack pos, MultiBufferSource buffers, int light) {
        pos.pushPose();
        pos.translate(0.0D, 1.500D, 0.0D);
        pos.mulPose(Vector3f.YP.rotationDegrees(180.0F - yaw));
        pos.mulPose(Vector3f.ZP.rotationDegrees(e.getRotation()));
        pos.mulPose(Vector3f.XP.rotationDegrees(e.getPitch()));

        VertexConsumer vertexconsumer = buffers.getBuffer(model.renderType(getTextureLocation(e)));
        pos.scale(-1.0F, -1.0F, 1.0F);
        model.setupAnim(e, 0, 0, 0, 0, 0);
        model.renderToBuffer(pos, vertexconsumer, light, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        pos.popPose();
        super.render(e, yaw, partialTicks, pos, buffers, light);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityPaimon p_114482_) {
        return new ResourceLocation(LibMisc.MOD_ID, "textures/model/paimon.png");
    }
}
