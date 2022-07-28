package com.meteor.meteorcertainidea.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public class ModelPaimon<T extends Entity> extends EntityModel<T> {

    private final ModelPart bone10;

    public ModelPaimon(ModelPart root) {
        this.bone10 = root.getChild("bone10");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition bone10 = partdefinition.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition body = bone10.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 29).addBox(-2.5F, -2.4318F, -6.6703F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(51, 43).addBox(1.0F, 4.1682F, -7.1703F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(27, 50).addBox(-3.0F, 4.1682F, -7.1703F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.3F, 0.9F, 0.2182F, 0.0F, 0.0F));

        PartDefinition arms = body.addOrReplaceChild("arms", CubeListBuilder.create(), PartPose.offset(0.0F, 7.3F, -1.9F));

        PartDefinition bone8 = arms.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(8, 56).addBox(-0.9423F, -0.5081F, -4.6552F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(59, 15).addBox(-0.4423F, 3.4919F, -5.1552F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -7.75F, 0.75F, 0.0F, 0.0F, -0.7418F));

        PartDefinition bone9 = arms.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(32, 6).addBox(-1.7595F, 3.6819F, -5.4052F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(16, 56).addBox(-1.2595F, -0.3181F, -4.9052F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.25F, -8.0F, 1.0F, 0.0F, 0.0F, 0.7418F));

        PartDefinition legs = body.addOrReplaceChild("legs", CubeListBuilder.create().texOffs(0, 56).addBox(-2.25F, -3.5444F, -4.0265F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(41, 56).addBox(-2.75F, -0.0444F, -4.5265F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(13, 24).addBox(1.75F, -0.0444F, -4.5265F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(26, 55).addBox(0.25F, -3.5444F, -4.0265F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0841F, -1.0151F, 0.3927F, 0.0F, 0.0F));

        PartDefinition bone7 = body.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(56, 40).addBox(-2.0F, -8.8659F, -1.5052F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(53, 28).addBox(-3.0F, -7.8659F, -2.0052F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(56, 37).addBox(-2.0F, -5.4659F, -0.3052F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(35, 52).addBox(-3.0F, -3.8659F, -0.2052F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(34, 59).addBox(-1.5F, -3.3659F, 0.5948F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 4).addBox(-0.7F, -2.4659F, 1.0948F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(59, 56).addBox(-1.3F, 0.1341F, 0.3948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 21).addBox(-1.1F, -0.8659F, 0.7948F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(34, 56).addBox(-1.75F, -4.4659F, 0.2948F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(51, 48).addBox(-3.0F, -5.8659F, -0.9052F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 47).addBox(3.0F, -5.8659F, -1.1552F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(38, 21).addBox(-4.0F, -5.8659F, -1.1552F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(14, 56).addBox(2.5F, -6.8659F, -1.5052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(26, 51).addBox(-3.5F, -6.8659F, -1.5052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(56, 30).addBox(-2.5F, -6.8659F, -0.9052F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(49, 52).addBox(-3.0F, -7.8659F, -1.0052F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(43, 24).addBox(-3.0F, -7.8659F, -5.0052F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(56, 34).addBox(-2.0F, -8.8659F, -5.9052F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(55, 0).addBox(2.0F, -8.8659F, -5.2052F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(14, 48).addBox(-3.0F, -8.8659F, -5.2052F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.8341F, -1.5151F));

        PartDefinition cube_r1 = bone7.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(24, 43).addBox(-4.3755F, -3.8626F, -0.6552F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(49, 4).addBox(-4.9755F, -1.8626F, -0.5552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(49, 2).addBox(-4.9755F, -3.7626F, -1.0552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(49, 37).addBox(-5.1755F, -2.8626F, -0.6552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(6, 56).addBox(-4.3755F, -2.8626F, -0.1552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(59, 45).addBox(-3.3755F, -2.8626F, 0.0948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(49, 0).addBox(-5.5755F, -0.3626F, -0.8552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(22, 56).addBox(-4.5755F, -0.8626F, -0.3552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(55, 2).addBox(-4.1755F, -1.8626F, -0.0552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(46, 56).addBox(-3.1755F, -1.8626F, 0.4448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

        PartDefinition cube_r2 = bone7.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(58, 13).addBox(1.4755F, -3.8626F, -0.6552F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(59, 58).addBox(2.4755F, -0.8626F, 0.4948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(60, 5).addBox(3.4755F, -1.8626F, 0.0948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 50).addBox(3.2755F, -0.8626F, -0.3552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(7, 50).addBox(3.9755F, -1.8626F, -0.6552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(49, 39).addBox(4.2755F, -2.8626F, -1.1552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(35, 50).addBox(3.8755F, -4.8626F, -1.4552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(35, 50).addBox(4.0755F, -3.8626F, -1.4552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(55, 0).addBox(3.4755F, -2.8626F, -0.1552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(60, 7).addBox(2.4755F, -2.8626F, 0.0948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

        PartDefinition cube_r3 = bone7.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(38, 18).addBox(-0.613F, -1.8585F, -4.4052F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.8F, -4.2F, 2.85F, 0.0F, 0.0F, 0.1309F));

        PartDefinition cube_r4 = bone7.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(51, 44).addBox(1.9F, 0.1341F, 0.4948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition head = bone10.addOrReplaceChild("head", CubeListBuilder.create().texOffs(21, 19).addBox(-3.0F, -13.0F, -6.5F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-3.1221F, -0.35F, -4.2658F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 1).addBox(-1.1221F, -0.35F, -4.2658F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(13, 24).addBox(-2.1221F, -1.1F, -4.2658F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -15.5F, -4.0F, 0.0F, -0.1309F, -0.3927F));

        PartDefinition blink = head.addOrReplaceChild("blink", CubeListBuilder.create().texOffs(18, 45).addBox(3.0F, -11.0F, -6.6F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(38, 6).addBox(-4.0F, -11.0F, -6.6F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(48, 7).addBox(-3.0F, -13.0F, -6.6F, 6.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bone6 = head.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, -0.5817F, -6.3726F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(33, 62).addBox(2.5F, 0.4183F, -5.3726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(60, 18).addBox(-3.5F, 0.4183F, -1.3726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(42, 60).addBox(-3.5F, 0.4183F, -5.3726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(46, 60).addBox(2.5F, 0.4183F, -1.3726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(50, 60).addBox(1.5F, 0.4183F, -6.3726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(56, 32).addBox(-2.5F, 0.4183F, -0.3726F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(62, 9).addBox(-2.5F, 0.4183F, -6.3726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(57, 9).addBox(3.5F, 0.4183F, -4.3726F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(49, 56).addBox(-4.5F, 0.4183F, -4.3726F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -19.3167F, 0.05F, -0.2531F, 0.0F, 0.0F));

        PartDefinition bone5 = head.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(0, 8).addBox(-4.0F, -16.0F, -7.0F, 8.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(0, 16).addBox(-3.0F, -17.0F, -7.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(63, 6).addBox(-5.0F, -10.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(6.0F, -13.0F, -6.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(61, 60).addBox(7.0F, -12.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(42, 44).addBox(5.0F, -11.0F, -7.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(0, 33).addBox(-6.0F, -14.0F, -7.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(15, 40).addBox(-6.0F, -11.0F, -7.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(0, 38).addBox(3.0F, -12.0F, -7.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(18, 45).addBox(3.0F, -11.0F, -6.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(38, 6).addBox(-4.0F, -11.0F, -6.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(36, 9).addBox(-5.0F, -12.0F, -7.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-5.0F, -15.0F, -7.0F, 10.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(31, 44).addBox(-4.0F, -13.0F, -1.0F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(42, 17).addBox(-4.0F, -15.0F, 0.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(36, 29).addBox(-4.0F, -14.0F, 1.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(14, 54).addBox(-3.0F, -15.0F, 1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 54).addBox(-3.0F, -8.0F, 1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(38, 54).addBox(-3.0F, -16.0F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(23, 8).addBox(4.0F, -13.0F, -8.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(36, 36).addBox(3.0F, -10.0F, -8.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(7, 47).addBox(-4.0F, -10.0F, -8.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 24).addBox(-5.0F, -13.0F, -8.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(62, 51).addBox(-4.0F, -13.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(49, 62).addBox(3.0F, -13.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 54).addBox(-3.0F, -16.0F, -8.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(43, 15).addBox(-4.0F, -15.0F, -8.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(14, 48).addBox(0.0F, -12.0F, -8.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(4, 24).addBox(4.0F, -13.0F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(4, 16).addBox(-5.0F, -13.0F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 24).addBox(2.0F, -14.0F, -7.0F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(23, 9).addBox(-5.0F, -14.0F, -7.0F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(49, 31).addBox(4.0F, -16.0F, -6.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(27, 33).addBox(5.0F, -14.0F, -7.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(48, 1).addBox(5.0F, -15.0F, -6.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(13, 28).addBox(-5.0F, -7.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(58, 25).addBox(-6.0F, -8.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(54, 57).addBox(-6.0F, -9.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 12).addBox(-6.0F, -8.0F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(61, 2).addBox(-6.0F, -7.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 8).addBox(-7.0F, -13.0F, -4.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(57, 61).addBox(-8.0F, -12.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(53, 61).addBox(-7.0F, -8.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 47).addBox(-6.0F, -15.0F, -6.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(49, 37).addBox(3.0F, -17.0F, -6.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(7, 48).addBox(-5.0F, -16.0F, -6.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(19, 48).addBox(-4.0F, -17.0F, -6.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(9, 33).addBox(4.0F, -9.0F, -7.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(63, 21).addBox(2.0F, -4.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(24, 45).addBox(-1.0F, -13.0F, -8.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(36, 13).addBox(-5.0F, -14.0F, -8.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 33).addBox(3.0F, -8.0F, -7.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(60, 62).addBox(4.0F, -10.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(62, 57).addBox(4.0F, -7.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(9, 38).addBox(3.0F, -8.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(16, 40).addBox(3.0F, -9.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(58, 21).addBox(5.0F, -9.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(61, 0).addBox(5.0F, -8.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(19, 19).addBox(5.0F, -9.0F, -6.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(19, 16).addBox(-6.0F, -9.0F, -6.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(45, 62).addBox(3.0F, -6.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(37, 62).addBox(-4.0F, -6.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(30, 31).addBox(3.0F, -7.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 45).addBox(-4.0F, -7.0F, 0.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(59, 43).addBox(3.0F, -8.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 43).addBox(-5.0F, -8.0F, 0.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(27, 0).addBox(-5.0F, -13.0F, 0.0F, 10.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(37, 37).addBox(3.0F, -10.0F, -6.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(41, 62).addBox(-5.0F, -7.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 29).addBox(-5.0F, -9.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(30, 29).addBox(-5.0F, -8.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(36, 6).addBox(-6.0F, -10.0F, -6.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(20, 48).addBox(-4.0F, -8.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(26, 48).addBox(-5.0F, -9.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(63, 19).addBox(-3.0F, -6.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 80, 80);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.bone10.getChild("head").getChild("blink").visible = entity.tickCount % 40 >= 2 && entity.tickCount % 40 <= 5;

        this.bone10.getChild("body").getChild("arms").getChild("bone8").zRot = (float) Math.toRadians(-42.5F + 4F*Math.sin(entity.tickCount*0.1F));
        this.bone10.getChild("body").getChild("arms").getChild("bone9").zRot = (float) Math.toRadians(42.5F - 4F*Math.sin(entity.tickCount*0.1F));
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        bone10.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}
