package com.meteor.meteorcertainidea.common.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Turtle;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ItemTurtle extends Item {

    public ItemTurtle(Properties prop) {
        super(prop);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(player.getVehicle() == null){
            Turtle turtle = new Turtle(EntityType.TURTLE, level);
            turtle.getPersistentData().putBoolean("turtle_turtle", true);
            turtle.setPos(player.getX(), player.getY(), player.getZ());
            if(!level.isClientSide()){
                level.addFreshEntity(turtle);
                player.startRiding(turtle);
            }
        }
        return InteractionResultHolder.pass(player.getItemInHand(hand));
    }

}
