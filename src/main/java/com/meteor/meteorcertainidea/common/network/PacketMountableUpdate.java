package com.meteor.meteorcertainidea.common.network;

import com.meteor.meteorcertainidea.common.entity.EntityMountable;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;

public class PacketMountableUpdate {

    private boolean ctrlInput;
    private boolean upInput;

    public PacketMountableUpdate(boolean ctrlInput, boolean upInput){
        this.ctrlInput = ctrlInput;
        this.upInput = upInput;
    }

    public void encode(FriendlyByteBuf buf) {
        buf.writeBoolean(this.ctrlInput);
        buf.writeBoolean(this.upInput);
    }

    public static PacketMountableUpdate decode(FriendlyByteBuf buf) {
        return new PacketMountableUpdate(buf.readBoolean(), buf.readBoolean());
    }

    public void handle(MinecraftServer server, ServerPlayer player) {
        server.execute(() -> {
            if(player.getVehicle() instanceof EntityMountable){
                EntityMountable mountable = (EntityMountable) player.getVehicle();
                mountable.updateInput(ctrlInput, upInput);
            }
        });
    }

}
