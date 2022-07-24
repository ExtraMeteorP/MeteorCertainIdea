package com.meteor.meteorcertainidea.common.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class EntityPhoenix extends EntityMountable{

    public EntityPhoenix(EntityType<? extends EntityPhoenix> p_38290_, Level p_38291_) {
        super(p_38290_, p_38291_);
    }

    public EntityPhoenix(Level level) {
        super(ModEntities.PHOENIX.get(), level);
    }

}
