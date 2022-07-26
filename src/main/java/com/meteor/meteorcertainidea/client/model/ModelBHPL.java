package com.meteor.meteorcertainidea.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class ModelBHPL<T extends Entity> extends EntityModel<T>{

    private final ModelPart bone;
    private final ModelPart bone2;

    public ModelBHPL(ModelPart root) {
        this.bone = root.getChild("bone");
        this.bone2 = root.getChild("bone2");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -9.0F, -8.0F, 16.0F, 6.0F, 16.0F, new CubeDeformation(0.0F))
                .texOffs(24, 22).addBox(5.0F, -3.0F, -8.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 22).addBox(5.0F, -3.0F, 5.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 10).addBox(-8.0F, -3.0F, 5.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 4).addBox(-8.0F, -3.0F, -8.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 22).addBox(4.0F, -15.0F, -8.0F, 4.0F, 6.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition bone3 = bone.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -39.0F, 6.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(50, 52).addBox(-4.0F, -37.0F, 6.0F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(48, 0).addBox(-6.0F, -35.0F, 6.0F, 14.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(38, 42).addBox(-8.0F, -33.0F, 6.0F, 16.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 44).addBox(-6.0F, -25.0F, 6.0F, 14.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(48, 4).addBox(-4.0F, -21.0F, 6.0F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(26, 52).addBox(-2.0F, -19.0F, 6.0F, 10.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(48, 8).addBox(-4.0F, -15.0F, 6.0F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(48, 12).addBox(-4.0F, -13.0F, 6.0F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 50).addBox(-4.0F, -11.0F, 6.0F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 14.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.0F, 14.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r1 = bone2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(40, 22).addBox(-13.0F, -20.0F, 1.0F, 14.0F, 20.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, 2.0F, 6.0F, 0.0F, 0.0F, -0.3491F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.bone2.zRot = -(float) (Mth.cos(entity.tickCount * 0.15F) * Math.PI / 18F);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

}
