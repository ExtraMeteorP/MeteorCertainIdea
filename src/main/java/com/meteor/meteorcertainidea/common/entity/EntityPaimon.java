package com.meteor.meteorcertainidea.common.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class EntityPaimon extends EntityUfo{

    public EntityPaimon(EntityType<? extends EntityUfo> p_38290_, Level p_38291_) {
        super(p_38290_, p_38291_);
    }

    public EntityPaimon(Level level) {
        super(ModEntities.PAIMON.get(), level);
    }

    @Override
    public double getPassengersRidingOffset() {
        return 0.725D;
    }

}
