package com.meteor.meteorcertainidea.common.entity;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

import java.util.List;

public class EntityBHPL extends EntityUfo{

    public EntityBHPL(EntityType<? extends EntityUfo> p_38290_, Level p_38291_) {
        super(p_38290_, p_38291_);
    }

    public EntityBHPL(Level level) {
        super(ModEntities.BHPL.get(), level);
    }

    @Override
    public void tick() {
        super.tick();
        if(getControllingPassenger() instanceof Player){
            List<EntityBHPR> entities = this.level.getEntitiesOfClass(EntityBHPR.class, this.getBoundingBox().inflate(0.2D));
            if(!entities.isEmpty()){
                if(this.level.isClientSide() && this.tickCount % 8 == 0){
                    this.level.addParticle(ParticleTypes.HEART, getX() - 0.25F + 0.5F * Math.random(), getY() + 1.8F + 0.3F * Math.random(), getZ() - 0.25F + 0.5F * Math.random(), 0, 0.03F, 0);
                }
            }
        }
    }

    @Override
    public double getPassengersRidingOffset() {
        return 0.325D;
    }

    @Override
    public float getSpeedModifier(){
        return 0.55F;
    }


}
