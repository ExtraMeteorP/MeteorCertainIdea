package com.meteor.meteorcertainidea.client;

import com.meteor.meteorcertainidea.MeteorCertainIdea;
import com.meteor.meteorcertainidea.common.entity.EntityMountable;
import com.meteor.meteorcertainidea.common.network.NetworkHandler;
import com.meteor.meteorcertainidea.common.network.PacketMountableUpdate;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class KeyInputHandler {

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void onKeyInput(InputEvent.KeyInputEvent event) {
        Minecraft mc = Minecraft.getInstance();
        Player p = mc.player;
        Entity riding = p.getVehicle();
        if (riding instanceof EntityMountable) {
            EntityMountable steerable = (EntityMountable) riding;
            steerable.updateInput(MeteorCertainIdea.keyFlight.isDown(), MeteorCertainIdea.keyUp.isDown());
            NetworkHandler.CHANNEL.sendToServer(new PacketMountableUpdate(MeteorCertainIdea.keyFlight.isDown(), MeteorCertainIdea.keyUp.isDown()));
        }
    }
}
