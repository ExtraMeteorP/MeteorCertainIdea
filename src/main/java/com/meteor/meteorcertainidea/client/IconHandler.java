package com.meteor.meteorcertainidea.client;

import com.meteor.meteorcertainidea.client.model.ModModelLayers;
import com.meteor.meteorcertainidea.client.model.ModelLifadian;
import com.meteor.meteorcertainidea.common.entity.EntityTurtle;
import com.meteor.meteorcertainidea.common.lib.LibMisc;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Vector3f;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Turtle;

public final class IconHandler extends RenderLayer<AbstractClientPlayer, PlayerModel<AbstractClientPlayer>> {

    public IconHandler(RenderLayerParent<AbstractClientPlayer, PlayerModel<AbstractClientPlayer>> p_117346_) {
        super(p_117346_);
    }

    @Override
    public void render(PoseStack ms, MultiBufferSource buffers, int light, AbstractClientPlayer player, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        Minecraft mc = Minecraft.getInstance();
        if (player.isInvisible()) {
            return;
        }

        if(player.getVehicle() instanceof EntityTurtle){
            ms.pushPose();
            double time = player.tickCount + partialTicks;
            getParentModel().head.translateAndRotate(ms);
            ms.translate(0D,-2D,0D);
            ms.mulPose(Vector3f.YP.rotationDegrees((float) time*4.5f));
            ModelLifadian model = new ModelLifadian(mc.getEntityModels().bakeLayer(ModModelLayers.LIFADIAN));
            VertexConsumer buffer = buffers.getBuffer(model.renderType(new ResourceLocation(LibMisc.MOD_ID, "textures/model/lifadian.png")));
            model.renderToBuffer(ms, buffer, light, OverlayTexture.NO_OVERLAY, 1f, 1f, 1f, 1f);
            ms.popPose();
        }

        BakedModel model = MiscellaneousModels.INSTANCE.icon0;

        ms.pushPose();
        getParentModel().head.translateAndRotate(ms);
        ms.mulPose(Vector3f.XN.rotationDegrees(180F));
        float s = 0.5f;
        ms.scale(s,s,s);
        ms.translate(-0.5D, 0.8D, -0.5D);
        Minecraft.getInstance().getBlockRenderer().getModelRenderer().renderModel(ms.last(), buffers.getBuffer(Sheets.translucentItemSheet()), null, model, 1, 1, 1, 0xF000F0, OverlayTexture.NO_OVERLAY);
        ms.popPose();
    }

}
