package com.meteor.meteorcertainidea.common.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class EntityUfo extends EntityMountable{

    public EntityUfo(EntityType<? extends EntityUfo> p_38290_, Level p_38291_) {
        super(p_38290_, p_38291_);
    }

    public EntityUfo(Level level) {
        super(ModEntities.UFO.get(), level);
    }

}
