package com.meteor.meteorcertainidea.client.renderer;

import com.meteor.meteorcertainidea.client.model.ModModelLayers;
import com.meteor.meteorcertainidea.client.model.ModelPaimonCarriage;
import com.meteor.meteorcertainidea.common.entity.EntityMotor;
import com.meteor.meteorcertainidea.common.entity.EntityPaimonCarriage;
import com.meteor.meteorcertainidea.common.lib.LibMisc;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Vector3f;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;

public class RenderPaimonCarriage extends EntityRenderer<EntityPaimonCarriage> {

    private final ModelPaimonCarriage model;

    public RenderPaimonCarriage(EntityRendererProvider.Context ctx) {
        super(ctx);
        model = new ModelPaimonCarriage(ctx.bakeLayer(ModModelLayers.PAIMONCARRIAGE));
    }

    @Override
    public void render(EntityPaimonCarriage e, float yaw, float partialTicks, PoseStack pos, MultiBufferSource buffers, int light) {
        pos.pushPose();
        pos.translate(0.0D, 2.100D, 0.0D);
        pos.mulPose(Vector3f.YP.rotationDegrees(180.0F - yaw));
        pos.mulPose(Vector3f.ZP.rotationDegrees(e.getRotation()));
        pos.mulPose(Vector3f.XP.rotationDegrees(e.getPitch()));

        VertexConsumer vertexconsumer = buffers.getBuffer(model.renderType(getTextureLocation(e)));
        pos.scale(-1.0F, -1.0F, 1.0F);
        float s = 1.4f;
        pos.scale(s,s,s);
        model.setupAnim(e, 0, 0, 0, 0, 0);
        model.renderToBuffer(pos, vertexconsumer, light, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        pos.popPose();
        super.render(e, yaw, partialTicks, pos, buffers, light);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityPaimonCarriage p_114482_) {
        return new ResourceLocation(LibMisc.MOD_ID, "textures/model/paimoncarriage.png");
    }
}
