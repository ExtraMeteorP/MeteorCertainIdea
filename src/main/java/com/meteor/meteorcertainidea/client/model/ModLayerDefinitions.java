package com.meteor.meteorcertainidea.client.model;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class ModLayerDefinitions {

    public static void init(BiConsumer<ModelLayerLocation, Supplier<LayerDefinition>> consumer) {
        consumer.accept(ModModelLayers.MOTOR, () -> ModelMotor.createBodyLayer());
        consumer.accept(ModModelLayers.UFO, () -> ModelUfo.createBodyLayer());
        consumer.accept(ModModelLayers.LIFADIAN, () -> ModelLifadian.createBodyLayer());
        consumer.accept(ModModelLayers.TURTLE, () -> ModelTurtle.createBodyLayer());
        consumer.accept(ModModelLayers.BHPL, () -> ModelBHPL.createBodyLayer());
        consumer.accept(ModModelLayers.BHPR, () -> ModelBHPR.createBodyLayer());
    }

}
