package com.meteor.meteorcertainidea.client;

import com.meteor.meteorcertainidea.MeteorCertainIdea;
import com.meteor.meteorcertainidea.client.renderer.*;
import com.meteor.meteorcertainidea.common.entity.EntityMountable;
import com.meteor.meteorcertainidea.common.entity.ModEntities;
import com.meteor.meteorcertainidea.common.network.NetworkHandler;
import com.meteor.meteorcertainidea.common.network.PacketMountableUpdate;
import net.minecraft.client.Minecraft;
import net.minecraft.client.Options;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
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
        bus.addListener((InputEvent.KeyInputEvent evt)->{
            Player p = mc.player;
            if(p != null){
                Entity riding = p.getVehicle();
                if (riding instanceof EntityMountable) {
                    EntityMountable steerable = (EntityMountable) riding;
                    steerable.updateInput(MeteorCertainIdea.keyForward.isDown(), MeteorCertainIdea.keyBackward.isDown(), MeteorCertainIdea.keyLeft.isDown(), MeteorCertainIdea.keyRight.isDown(), MeteorCertainIdea.keyFlight.isDown(), MeteorCertainIdea.keyUp.isDown());
                    NetworkHandler.CHANNEL.sendToServer(new PacketMountableUpdate(MeteorCertainIdea.keyForward.isDown(), MeteorCertainIdea.keyBackward.isDown(), MeteorCertainIdea.keyLeft.isDown(), MeteorCertainIdea.keyRight.isDown(),MeteorCertainIdea.keyFlight.isDown(), MeteorCertainIdea.keyUp.isDown()));
                }
            }
        });
        bus.addListener((RenderGameOverlayEvent.Post e) -> {
            if (e.getType() == RenderGameOverlayEvent.ElementType.ALL) {
                HUDHandler.onDrawScreenPost(e.getMatrixStack(), e.getPartialTicks());
            }
        });
    }

    private static void registerEntityRenderers() {
        EntityRenderers.register(ModEntities.MOTOR.get(), RenderMotor::new);
        EntityRenderers.register(ModEntities.UFO.get(), RenderUfo::new);
        EntityRenderers.register(ModEntities.PHOENIX.get(), RenderPhoenix::new);
        EntityRenderers.register(ModEntities.TURTLE.get(), RenderTurtle::new);
        EntityRenderers.register(ModEntities.BHPL.get(), RenderBHPL::new);
        EntityRenderers.register(ModEntities.BHPR.get(), RenderBHPR::new);
        EntityRenderers.register(ModEntities.PAIMON.get(), RenderPaimon::new);
        EntityRenderers.register(ModEntities.PAIMONCARRIAGE.get(), RenderPaimonCarriage::new);
    }

}
