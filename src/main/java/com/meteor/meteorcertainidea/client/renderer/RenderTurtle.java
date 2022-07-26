package com.meteor.meteorcertainidea.client.renderer;

import com.meteor.meteorcertainidea.client.model.ModModelLayers;
import com.meteor.meteorcertainidea.client.model.ModelTurtle;
import com.meteor.meteorcertainidea.common.entity.EntityTurtle;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Vector3f;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class RenderTurtle extends EntityRenderer<EntityTurtle> {

    private final ModelTurtle model;

    public RenderTurtle(EntityRendererProvider.Context ctx) {
        super(ctx);
        model = new ModelTurtle(ctx.bakeLayer(ModModelLayers.TURTLE));
    }

    @Override
    public void render(EntityTurtle e, float yaw, float partialTicks, PoseStack pos, MultiBufferSource buffers, int light) {
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
    public ResourceLocation getTextureLocation(EntityTurtle p_114482_) {
        return new ResourceLocation("textures/entity/turtle/big_sea_turtle.png");
    }
}
