package com.meteor.meteorcertainidea.client.renderer;

import com.meteor.meteorcertainidea.common.entity.EntityPhoenix;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class RenderPhoenix extends EntityRenderer<EntityPhoenix> {

    public RenderPhoenix(EntityRendererProvider.Context p_174008_) {
        super(p_174008_);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityPhoenix p_114482_) {
        return null;
    }
}
