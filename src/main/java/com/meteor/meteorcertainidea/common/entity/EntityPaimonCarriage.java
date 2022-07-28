package com.meteor.meteorcertainidea.common.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class EntityPaimonCarriage extends EntityUfo{

    public EntityPaimonCarriage(EntityType<? extends EntityUfo> p_38290_, Level p_38291_) {
        super(p_38290_, p_38291_);
    }

    public EntityPaimonCarriage(Level level) {
        super(ModEntities.PAIMONCARRIAGE.get(), level);
    }

    @Override
    public double getPassengersRidingOffset() {
        return 1.225D;
    }

}
