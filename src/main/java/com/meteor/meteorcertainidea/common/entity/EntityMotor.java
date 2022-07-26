package com.meteor.meteorcertainidea.common.entity;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class EntityMotor extends EntityMountable{

    public EntityMotor(EntityType<? extends EntityMotor> p_38290_, Level p_38291_) {
        super(p_38290_, p_38291_);
    }

    public EntityMotor(Level level) {
        super(ModEntities.MOTOR.get(), level);
    }

    @Override
    public void tick() {
        super.tick();
        Player player = null;
        if (!this.getPassengers().isEmpty() && this.getPassengers().get(0) instanceof Player) {
            player = (Player) this.getPassengers().get(0);

        }
    }

    @Override
    protected boolean canAddPassenger(Entity p_38390_) {
        return this.getPassengers().size() < 2;
    }

    @Override
    public double getPassengersRidingOffset() {
        return 0.225D;
    }

}
