package com.meteor.meteorcertainidea.client;

import com.meteor.meteorcertainidea.MeteorCertainIdea;
import com.meteor.meteorcertainidea.client.renderer.RenderMotor;
import com.meteor.meteorcertainidea.client.renderer.RenderPhoenix;
import com.meteor.meteorcertainidea.client.renderer.RenderUfo;
import com.meteor.meteorcertainidea.common.entity.ModEntities;
import net.minecraft.client.Minecraft;
import net.minecraft.client.Options;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;

import java.util.function.Consumer;

public class ClientHandler {

    public static void addAuxiliaryPlayerRenders(PlayerRenderer renderer,
                                                 Consumer<RenderLayer<AbstractClientPlayer, PlayerModel<AbstractClientPlayer>>> consumer) {
        consumer.accept(new IconHandler(renderer));
    }

    public static void setup() {
        Minecraft mc = Minecraft.getInstance();
        Options gameSettings = mc.options;
        MeteorCertainIdea.keyForward = gameSettings.keyUp;
        MeteorCertainIdea.keyBackward = gameSettings.keyDown;
        MeteorCertainIdea.keyLeft = gameSettings.keyLeft;
        MeteorCertainIdea.keyRight = gameSettings.keyRight;
        MeteorCertainIdea.keyUp = gameSettings.keyJump;
        MeteorCertainIdea.keyFlight = gameSettings.keySprint;

        registerEntityRenderers();

        IEventBus bus = MinecraftForge.EVENT_BUS;
    }

    private static void registerEntityRenderers() {
        EntityRenderers.register(ModEntities.MOTOR.get(), RenderMotor::new);
        EntityRenderers.register(ModEntities.UFO.get(), RenderUfo::new);
        EntityRenderers.register(ModEntities.PHOENIX.get(), RenderPhoenix::new);
    }

}
