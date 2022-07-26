package com.meteor.meteorcertainidea.common.item;

import com.meteor.meteorcertainidea.common.entity.EntityMotor;
import com.meteor.meteorcertainidea.common.entity.ModEntities;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Turtle;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ItemMotor extends Item {

    public ItemMotor(Properties prop) {
        super(prop);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(player.getVehicle() == null){
            EntityMotor mount = new EntityMotor(ModEntities.MOTOR.get(), level);
            mount.setPos(player.getX(), player.getY(), player.getZ());
            if(!level.isClientSide()){
                level.addFreshEntity(mount);
                player.startRiding(mount);
            }
        }
        return InteractionResultHolder.pass(player.getItemInHand(hand));
    }

}
