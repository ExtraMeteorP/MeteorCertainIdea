package com.meteor.meteorcertainidea.common.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class EntityMotor extends EntityMountable{

    public EntityMotor(EntityType<? extends EntityMotor> p_38290_, Level p_38291_) {
        super(p_38290_, p_38291_);
    }

    public EntityMotor(Level level) {
        super(ModEntities.MOTOR.get(), level);
    }

}
