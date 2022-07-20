package com.meteor.meteorcertainidea.client;

import com.meteor.meteorcertainidea.MeteorCertainIdea;
import net.minecraft.client.Minecraft;
import net.minecraft.client.Options;

public class ClientHandler {

    public static void setup() {
        Minecraft mc = Minecraft.getInstance();
        Options gameSettings = mc.options;
        MeteorCertainIdea.keyForward = gameSettings.keyUp;
        MeteorCertainIdea.keyBackward = gameSettings.keyDown;
        MeteorCertainIdea.keyLeft = gameSettings.keyLeft;
        MeteorCertainIdea.keyRight = gameSettings.keyRight;
        MeteorCertainIdea.keyUp = gameSettings.keyJump;
        MeteorCertainIdea.keyFlight = gameSettings.keySprint;
    }

}
