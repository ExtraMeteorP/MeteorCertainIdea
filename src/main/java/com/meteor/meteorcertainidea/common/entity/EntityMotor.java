package com.meteor.meteorcertainidea.common.entity;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class EntityMotor extends EntityMountable{

    private static final String TAG_ENERGY = "energy";

    private static final EntityDataAccessor<Integer> ENERGY = SynchedEntityData.defineId(EntityMotor.class,
            EntityDataSerializers.INT);

    private int speedUp = 0;
    private float speedModifier = 0.4f;

    public EntityMotor(EntityType<? extends EntityMotor> p_38290_, Level p_38291_) {
        super(p_38290_, p_38291_);
    }

    public EntityMotor(Level level) {
        super(ModEntities.MOTOR.get(), level);
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(ENERGY, 0);
    }

    @Override
    protected void addAdditionalSaveData(CompoundTag tag) {
        super.addAdditionalSaveData(tag);
        tag.putInt(TAG_ENERGY, getEnergy());
    }

    @Override
    protected void readAdditionalSaveData(CompoundTag tag) {
        super.readAdditionalSaveData(tag);
        setEnergy(tag.getInt(TAG_ENERGY));
    }

    @Override
    public void tick() {
        super.tick();

        if(this.inputUp){
            if(this.speedModifier < 1.0f)
                this.speedModifier += 0.02f;
            else
                this.speedModifier -= 0.08f;
        }else{
            if(this.speedModifier > 0.4f)
                this.speedModifier -= 0.03f;
        }

        if(this.speedUp > 0){
            this.speedUp--;
            if(!level.isClientSide())
                addEnergy(-5);
        }

        Player player;
        if (!this.getPassengers().isEmpty() && this.getPassengers().get(0) instanceof Player) {
            player = (Player) this.getPassengers().get(0);

            if(inputUp && this.horizontalCollision){
                this.setDeltaMovement(this.getDeltaMovement().x, 0.25D, this.getDeltaMovement().z);
                if(this.speedUp > 0)
                    this.setDeltaMovement(this.getDeltaMovement().x, 0.25D, this.getDeltaMovement().z);
            }

            if(this.ctrlInputDown && this.speedUp == 0 && (this.inputLeft || this.inputRight)){
                addEnergy(20);
            }

            if(this.spaceInputDown && this.speedUp == 0 && getEnergy() >= 200){
                this.speedUp = 40;
            }
        }
    }

    @Override
    protected void floatBoat() {
        double d0 = (double)-0.04F;
        double d1 = this.isNoGravity() || this.speedUp > 0 ? 0.0D : (double)-0.04F;
        double d2 = 0.0D;
        this.invFriction = 0.9F;

        Vec3 vec3 = this.getDeltaMovement();
        this.setDeltaMovement(vec3.x * (double)this.invFriction, vec3.y + d1, vec3.z * (double)this.invFriction);
        this.deltaRotation *= this.invFriction;
        if (d2 > 0.0D) {
            Vec3 vec31 = this.getDeltaMovement();
            this.setDeltaMovement(vec31.x, (vec31.y + d2 * 0.06153846016296973D) * 0.75D, vec31.z);
        }
    }

    @Override
    public void controlBoat() {
        if (this.isVehicle()) {
            float f = 0.0F;
            float modifier = this.ctrlInputDown ? 1.5f : 0.8f;
            if (this.inputLeft) {
                this.deltaRotation-=modifier;
            }

            if (this.inputRight) {
                this.deltaRotation+=modifier;
            }

            if (this.inputRight != this.inputLeft && !this.inputUp && !this.inputDown) {
                f += 0.005F;
            }
            if(this.speedUp > 0 && this.speedModifier <= 2.5f)
                this.speedModifier *= 1.3f;
            if(this.ctrlInputDown)
                this.speedModifier *= 0.6f;
            this.setYRot(this.getYRot() + this.deltaRotation);
            if (this.inputUp) {
                f += 0.045F * speedModifier;
            }

            if (this.inputDown) {
                f -= 0.006F;
            }

            this.setDeltaMovement(this.getDeltaMovement().add((double)(Mth.sin(-this.getYRot() * ((float)Math.PI / 180F)) * f), 0.0D, (double)(Mth.cos(this.getYRot() * ((float)Math.PI / 180F)) * f)));
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

    public void addEnergy(int i){
        setEnergy(Math.min(800, getEnergy() + i));
    }

    public int getEnergy() {
        return entityData.get(ENERGY);
    }

    public void setEnergy(int i) {
        entityData.set(ENERGY, i);
    }

}
