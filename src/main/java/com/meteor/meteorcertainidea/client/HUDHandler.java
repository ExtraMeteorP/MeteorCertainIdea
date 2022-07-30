package com.meteor.meteorcertainidea.client;

import com.meteor.meteorcertainidea.common.entity.EntityMotor;
import com.meteor.meteorcertainidea.common.lib.LibMisc;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.profiling.ProfilerFiller;
import net.minecraft.world.entity.player.Player;

import org.lwjgl.opengl.GL11;

public class HUDHandler {

    public static final ResourceLocation energyBar = new ResourceLocation(LibMisc.MOD_ID, "textures/gui/motorhud.png");

    private HUDHandler() {}

    public static void onDrawScreenPost(PoseStack ms, float partialTicks) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.options.hideGui) {
            return;
        }
        ProfilerFiller profiler = mc.getProfiler();

        profiler.push("mci-hud");

        profiler.push("manaBar");
        Player player = mc.player;
        if (!player.isSpectator() && player.getVehicle() instanceof EntityMotor) {
            EntityMotor motor = (EntityMotor) player.getVehicle();
            int totalEnergy = motor.getEnergy();
            int totalMaxEnergy = 800;
            renderEnergyBar(ms, totalEnergy, totalMaxEnergy);
        }
        profiler.pop();

        profiler.pop();

        RenderSystem.setShaderColor(1F, 1F, 1F, 1F);
    }

    private static void renderEnergyBar(PoseStack ms, int totalMana, int totalMaxMana) {
        Minecraft mc = Minecraft.getInstance();
        int width = 64;
        int x = mc.getWindow().getGuiScaledWidth() / 2 - width / 2;
        int y = mc.getWindow().getGuiScaledHeight() - 56;

        if (totalMaxMana == 0) {
            width = 0;
        } else {
            width *= (double) totalMana / (double) totalMaxMana;
        }

        if (width == 0) {
            if (totalMana > 0) {
                width = 1;
            }
        }
        RenderSystem.setShaderTexture(0, energyBar);

        RenderSystem.enableBlend();
        RenderSystem.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GuiComponent.blit(ms, x, y, 0, 0, 64, 6, 256, 256);
        GuiComponent.blit(ms, x, y, 0, 6, width, 6, 256, 256);
        RenderSystem.disableBlend();
        RenderSystem.setShaderColor(1, 1, 1, 1);
    }

}
