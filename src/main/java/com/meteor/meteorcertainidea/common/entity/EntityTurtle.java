package com.meteor.meteorcertainidea.common.entity;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class EntityTurtle extends EntityMountable{

    public EntityTurtle(EntityType<? extends Entity> p_38290_, Level p_38291_) {
        super(p_38290_, p_38291_);
    }

    public EntityTurtle(Level level) {
        super(ModEntities.TURTLE.get(), level);
    }

}
