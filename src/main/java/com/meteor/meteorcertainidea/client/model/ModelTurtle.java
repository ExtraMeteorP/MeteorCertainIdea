package com.meteor.meteorcertainidea.client.model;

import com.meteor.meteorcertainidea.common.entity.EntityMountable;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ModelTurtle<T extends Entity> extends EntityModel<T> {

    private final ModelPart all;
    private final ModelPart rightHindLeg;
    private final ModelPart leftHindLeg;
    private final ModelPart rightFrontLeg;
    private final ModelPart leftFrontLeg;

    public ModelTurtle(ModelPart root) {
        this.all = root;
        this.rightHindLeg = root.getChild("right_hind_leg");
        this.leftHindLeg = root.getChild("left_hind_leg");
        this.rightFrontLeg = root.getChild("right_front_leg");
        this.leftFrontLeg = root.getChild("left_front_leg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(3, 0).addBox(-3.0F, -1.0F, -3.0F, 6.0F, 5.0F, 6.0F), PartPose.offset(0.0F, 19.0F, -10.0F));
        partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(7, 37).addBox("shell", -9.5F, 3.0F, -10.0F, 19.0F, 20.0F, 6.0F).texOffs(31, 1).addBox("belly", -5.5F, 3.0F, -13.0F, 11.0F, 18.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 11.0F, -10.0F, ((float)Math.PI / 2F), 0.0F, 0.0F));
        partdefinition.addOrReplaceChild("egg_belly", CubeListBuilder.create().texOffs(70, 33).addBox(-4.5F, 3.0F, -14.0F, 9.0F, 18.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 11.0F, -10.0F, ((float)Math.PI / 2F), 0.0F, 0.0F));
        partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create().texOffs(1, 23).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 10.0F), PartPose.offset(-3.5F, 22.0F, 11.0F));
        partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create().texOffs(1, 12).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 10.0F), PartPose.offset(3.5F, 22.0F, 11.0F));
        partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create().texOffs(27, 30).addBox(-13.0F, 0.0F, -2.0F, 13.0F, 1.0F, 5.0F), PartPose.offset(-5.0F, 21.0F, -4.0F));
        partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create().texOffs(27, 24).addBox(0.0F, 0.0F, -2.0F, 13.0F, 1.0F, 5.0F), PartPose.offset(5.0F, 21.0F, -4.0F));
        return LayerDefinition.create(meshdefinition, 128, 64);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        if(entity instanceof EntityMountable){
            EntityMountable mount = (EntityMountable) entity;
            this.rightHindLeg.xRot = Mth.cos(mount.ridingTicks * 0.6662F * 1F) * 0.5F * 1;
            this.leftHindLeg.xRot = Mth.cos(mount.ridingTicks * 0.6662F * 1F + (float)Math.PI) * 0.5F * 1;
            this.rightFrontLeg.yRot = Mth.cos(mount.ridingTicks * 0.6662F * 1F + (float)Math.PI) * 0.5F * 1;
            this.leftFrontLeg.yRot = Mth.cos(mount.ridingTicks * 0.6662F * 1F) * 0.5F * 1;
            this.rightFrontLeg.xRot = 0.0F;
            this.leftFrontLeg.xRot = 0.0F;
            this.rightFrontLeg.zRot = 0.0F;
            this.leftFrontLeg.zRot = 0.0F;
            //this.rightHindLeg.yRot = 0.0F;
            //this.leftHindLeg.yRot = 0.0F;
        }
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        all.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}
