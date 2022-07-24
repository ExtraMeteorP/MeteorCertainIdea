package com.meteor.meteorcertainidea.common.entity;

import com.meteor.meteorcertainidea.common.lib.LibMisc;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> REGISTER = DeferredRegister.create(ForgeRegistries.ENTITIES, LibMisc.MOD_ID);

    public static final RegistryObject<EntityType<EntityMotor>> MOTOR = register("motor",
            EntityType.Builder.<EntityMotor>of((type, world) -> new EntityMotor(world), MobCategory.MISC)
            .sized(0.6F, 0.1F).fireImmune()
            .clientTrackingRange(4)
            .updateInterval(40));

    public static final RegistryObject<EntityType<EntityUfo>> UFO = register("ufo",
            EntityType.Builder.<EntityUfo>of((type, world) -> new EntityUfo(world), MobCategory.MISC)
                    .sized(0.6F, 0.1F).fireImmune()
                    .clientTrackingRange(4)
                    .updateInterval(40));

    public static final RegistryObject<EntityType<EntityPhoenix>> PHOENIX = register("phoenix",
            EntityType.Builder.<EntityPhoenix>of((type, world) -> new EntityPhoenix(world), MobCategory.MISC)
                    .sized(0.6F, 0.1F).fireImmune()
                    .clientTrackingRange(4)
                    .updateInterval(40));

    private static <T extends Entity> RegistryObject<EntityType<T>> register(String name, EntityType.Builder<T> builder) {
        return REGISTER.register(name, () -> builder.build(name));
    }

}
