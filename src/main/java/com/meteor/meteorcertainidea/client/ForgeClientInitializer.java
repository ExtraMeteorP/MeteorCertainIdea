package com.meteor.meteorcertainidea.client;

import com.meteor.meteorcertainidea.client.model.ModLayerDefinitions;
import com.meteor.meteorcertainidea.common.lib.LibMisc;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ForgeModelBakery;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = LibMisc.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ForgeClientInitializer {

    @SubscribeEvent
    public static void initAuxiliaryRender(EntityRenderersEvent.AddLayers evt) {
        for (var playerModelType : evt.getSkins()) {
            if (evt.getSkin(playerModelType) instanceof PlayerRenderer) {
                PlayerRenderer renderer = evt.getSkin(playerModelType);
                ClientHandler.addAuxiliaryPlayerRenders(renderer, renderer::addLayer);
            }
        }
    }

    @SubscribeEvent
    public static void registerEntityLayers(EntityRenderersEvent.RegisterLayerDefinitions evt) {
        ModLayerDefinitions.init(evt::registerLayerDefinition);
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent evt) {
        MiscellaneousModels.INSTANCE.onModelRegister(ForgeModelBakery::addSpecialModel);
    }

    @SubscribeEvent
    public static void onModelBake(ModelBakeEvent evt) {
        MiscellaneousModels.INSTANCE.onModelBake(evt.getModelLoader(), evt.getModelRegistry());
    }

}
