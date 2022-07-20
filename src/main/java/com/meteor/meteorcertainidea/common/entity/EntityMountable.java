package com.meteor.meteorcertainidea.common.entity;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;

public class EntityMountable extends Boat {

    private static final String TAG_PITCH = "pitch";
    private static final String TAG_ROTATION = "rotation";

    private static final EntityDataAccessor<Float> PITCH = SynchedEntityData.defineId(EntityMountable.class,
            EntityDataSerializers.FLOAT);
    private static final EntityDataAccessor<Float> ROTATION = SynchedEntityData.defineId(EntityMountable.class,
            EntityDataSerializers.FLOAT);

    public boolean ctrlInputDown = false;
    public boolean spaceInputDown = false;

    public EntityMountable(EntityType<? extends Boat> p_38290_, Level p_38291_) {
        super(p_38290_, p_38291_);
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(ROTATION, 0F);
        this.entityData.define(PITCH, 0F);
    }

    @Override
    protected SoundEvent getPaddleSound() {
        return null;
    }

    @Override
    public Item getDropItem(){
        return null;
    }

    public void updateInput(boolean ctrlInputDown, boolean spaceInputDown) {
        this.ctrlInputDown = ctrlInputDown;
        this.spaceInputDown = spaceInputDown;
    }

    @Override
    protected void addAdditionalSaveData(CompoundTag tag) {
        super.addAdditionalSaveData(tag);
        tag.putFloat(TAG_ROTATION, getRotation());
        tag.putFloat(TAG_PITCH, getPitch());
    }

    @Override
    protected void readAdditionalSaveData(CompoundTag tag) {
        super.readAdditionalSaveData(tag);
        setRotation(tag.getFloat(TAG_ROTATION));
        setPitch(tag.getFloat(TAG_PITCH));
    }

    public float getRotation() {
        return entityData.get(ROTATION);
    }

    public void setRotation(float rot) {
        entityData.set(ROTATION, rot);
    }

    public float getPitch() {
        return entityData.get(PITCH);
    }

    public void setPitch(float rot) {
        entityData.set(PITCH, rot);
    }
}
