package com.meteor.meteorcertainidea.client;

import com.meteor.meteorcertainidea.common.lib.LibMisc;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.function.Consumer;

public class MiscellaneousModels {

    public static final MiscellaneousModels INSTANCE = new MiscellaneousModels();

    public BakedModel icon0;
    public BakedModel icon1;
    public BakedModel icon2;
    public BakedModel icon3;

    public void onModelRegister(Consumer<ResourceLocation> consumer) {
        consumer.accept(new ResourceLocation(LibMisc.MOD_ID, "icon/icon0"));
        consumer.accept(new ResourceLocation(LibMisc.MOD_ID, "icon/icon1"));
        consumer.accept(new ResourceLocation(LibMisc.MOD_ID, "icon/icon2"));
        consumer.accept(new ResourceLocation(LibMisc.MOD_ID, "icon/icon3"));
    }

    public void onModelBake(ModelBakery loader, Map<ResourceLocation, BakedModel> map) {
        icon0 = map.get(new ResourceLocation(LibMisc.MOD_ID, "icon/icon0"));
        icon1 = map.get(new ResourceLocation(LibMisc.MOD_ID, "icon/icon1"));
        icon2 = map.get(new ResourceLocation(LibMisc.MOD_ID, "icon/icon2"));
        icon3 = map.get(new ResourceLocation(LibMisc.MOD_ID, "icon/icon3"));
    }

}
