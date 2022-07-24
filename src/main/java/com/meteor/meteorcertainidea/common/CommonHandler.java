package com.meteor.meteorcertainidea.common;

import com.meteor.meteorcertainidea.common.network.NetworkHandler;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.animal.Turtle;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.IEventBus;

public class CommonHandler {

    public static void setup() {
        NetworkHandler.init();
        registerEvents();

        IEventBus bus = MinecraftForge.EVENT_BUS;
        bus.addListener((LivingEvent.LivingUpdateEvent evt) -> {
            if(evt.getEntity() instanceof Turtle){
                if(evt.getEntity().getPersistentData().getBoolean("turtle_turtle")){
                    if(evt.getEntity().getPassengers().isEmpty()){
                        evt.getEntity().remove(Entity.RemovalReason.KILLED);
                    }
                }
            }
        });
    }

    private static void registerEvents() {
        IEventBus bus = MinecraftForge.EVENT_BUS;
    }

}
