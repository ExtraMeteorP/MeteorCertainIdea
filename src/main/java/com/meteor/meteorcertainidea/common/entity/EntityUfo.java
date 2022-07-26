package com.meteor.meteorcertainidea.common.entity;

import net.minecraft.util.Mth;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class EntityUfo extends EntityMountable{

    public EntityUfo(EntityType<? extends EntityUfo> p_38290_, Level p_38291_) {
        super(p_38290_, p_38291_);
        setNoGravity(true);
    }

    public EntityUfo(Level level) {
        super(ModEntities.UFO.get(), level);
    }

    @Override
    public void tick() {
        super.tick();
        if (this.isControlledByLocalInstance() && this.getControllingPassenger() instanceof Player) {
            Player player = (Player) getControllingPassenger();
            float speed = getSpeedModifier();
            double mx = (double) (-Mth.sin(player.getYRot() / 180.0F * (float) Math.PI)
                    * Mth.cos(player.getXRot() / 180.0F * (float) Math.PI) * speed);
            double mz = (double) (Mth.cos(player.getYRot() / 180.0F * (float) Math.PI)
                    * Mth.cos(player.getXRot() / 180.0F * (float) Math.PI) * speed);
            double my = 0;

            Vec3 f0 = new Vec3(0, 0, 0);
            Vec3 vecf = new Vec3(mx, my, mz);
            Vec3 vecl = new Vec3(mx, my, mz).yRot((float) (Math.PI * 0.5D)).scale(0.75F);
            Vec3 vecr = new Vec3(mx, my, mz).yRot(-(float) (Math.PI * 0.5D)).scale(0.75F);
            Vec3 vecb = new Vec3(mx, my, mz).yRot((float) (Math.PI)).scale(0.6F);

            if (this.inputUp) {
                f0 = f0.add(vecf);
            }
            if (this.inputLeft) {
                f0 = f0.add(vecl);
            }
            if (this.inputRight) {
                f0 = f0.add(vecr);
            }
            if (this.inputDown) {
                f0 = f0.add(vecb);
            }
            if (this.spaceInputDown)
                f0 = f0.add(0, 0.35D, 0);
            else if (this.ctrlInputDown)
                f0 = f0.add(0, -0.35D, 0);

            if (f0.length() != 0)
                this.setYRot(player.getYRot());

            this.setDeltaMovement(f0);
        }
    }

    public float getSpeedModifier(){
        return 0.65F;
    }

    @Override
    public void controlBoat() {

    }

    @Override
    public double getPassengersRidingOffset() {
        return 0.225D;
    }

}
