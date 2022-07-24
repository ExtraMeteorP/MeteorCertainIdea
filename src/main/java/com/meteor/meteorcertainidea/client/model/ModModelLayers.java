package com.meteor.meteorcertainidea.client.model;

import com.meteor.meteorcertainidea.common.lib.LibMisc;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ModModelLayers {

    public static final ModelLayerLocation MOTOR = make("motor");
    public static final ModelLayerLocation UFO = make("ufo");
    public static final ModelLayerLocation LIFADIAN = make("lifadian");

    private static ModelLayerLocation make(String name) {
        return make(name, "main");
    }

    private static ModelLayerLocation make(String name, String layer) {
        return new ModelLayerLocation(new ResourceLocation(LibMisc.MOD_ID, name), layer);
    }

    public static void init() {}

}
