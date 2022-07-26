package com.meteor.meteorcertainidea.common.network;

import com.meteor.meteorcertainidea.common.entity.EntityMountable;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;

public class PacketMountableUpdate {

    private boolean inputUp;
    private boolean inputDown;
    private boolean inputLeft;
    private boolean inputRight;
    private boolean ctrlInput;
    private boolean upInput;

    public PacketMountableUpdate(boolean inputUp, boolean inputDown, boolean inputLeft, boolean inputRight, boolean ctrlInput, boolean upInput){
        this.inputUp = inputUp;
        this.inputDown = inputDown;
        this.inputLeft = inputLeft;
        this.inputRight = inputRight;
        this.ctrlInput = ctrlInput;
        this.upInput = upInput;
    }

    public void encode(FriendlyByteBuf buf) {
        buf.writeBoolean(this.inputUp);
        buf.writeBoolean(this.inputDown);
        buf.writeBoolean(this.inputLeft);
        buf.writeBoolean(this.inputRight);
        buf.writeBoolean(this.ctrlInput);
        buf.writeBoolean(this.upInput);
    }

    public static PacketMountableUpdate decode(FriendlyByteBuf buf) {
        return new PacketMountableUpdate(buf.readBoolean(), buf.readBoolean(), buf.readBoolean(), buf.readBoolean(), buf.readBoolean(), buf.readBoolean());
    }

    public void handle(MinecraftServer server, ServerPlayer player) {
        server.execute(() -> {
            if(player.getVehicle() instanceof EntityMountable){
                EntityMountable mountable = (EntityMountable) player.getVehicle();
                mountable.updateInput(inputUp, inputDown, inputLeft, inputRight, ctrlInput, upInput);
            }
        });
    }

}
