package com.meteor.meteorcertainidea;

import com.meteor.meteorcertainidea.client.ClientHandler;
import com.meteor.meteorcertainidea.common.CommonHandler;
import com.meteor.meteorcertainidea.common.entity.ModEntities;
import com.meteor.meteorcertainidea.common.item.ModItems;
import com.meteor.meteorcertainidea.common.lib.LibMisc;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(LibMisc.MOD_ID)
public class MeteorCertainIdea {

    @OnlyIn(Dist.CLIENT)
    public static KeyMapping keyForward;
    @OnlyIn(Dist.CLIENT)
    public static KeyMapping keyBackward;
    @OnlyIn(Dist.CLIENT)
    public static KeyMapping keyLeft;
    @OnlyIn(Dist.CLIENT)
    public static KeyMapping keyRight;
    @OnlyIn(Dist.CLIENT)
    public static KeyMapping keyUp;
    @OnlyIn(Dist.CLIENT)
    public static KeyMapping keyFlight;

    public MeteorCertainIdea(){
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.REGISTER.register(eventBus);
        ModEntities.REGISTER.register(eventBus);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onCommonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onClientSetup);
    }

    private void onCommonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(CommonHandler::setup);
    }

    private void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(ClientHandler::setup);
    }

}
