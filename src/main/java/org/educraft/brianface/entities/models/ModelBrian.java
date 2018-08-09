package org.educraft.brianface.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelBrian extends ModelBase {

    public ModelRenderer BrianRightArm;
    public ModelRenderer BrianRightLeg;
    public ModelRenderer BrianHead2;
    public ModelRenderer BrianTorso;
    public ModelRenderer BrianLeftArm;
    public ModelRenderer BrianLeftLeg;
    public ModelRenderer BrianHead;

    public ModelBrian() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.BrianHead2 = new ModelRenderer(this, 0, 0);
        this.BrianHead2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BrianHead2.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.BrianRightLeg = new ModelRenderer(this, 0, 16);
        this.BrianRightLeg.setRotationPoint(-1.9F, 12.0F, 0.1F);
        this.BrianRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.BrianTorso = new ModelRenderer(this, 16, 16);
        this.BrianTorso.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BrianTorso.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.BrianLeftLeg = new ModelRenderer(this, 0, 16);
        this.BrianLeftLeg.mirror = true;
        this.BrianLeftLeg.setRotationPoint(1.9F, 12.0F, 0.1F);
        this.BrianLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.BrianLeftArm = new ModelRenderer(this, 40, 16);
        this.BrianLeftArm.mirror = true;
        this.BrianLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.BrianLeftArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(BrianLeftArm, -1.3962634015954636F, 0.10000736613927509F, -0.10000736613927509F);
        this.BrianHead = new ModelRenderer(this, 32, 0);
        this.BrianHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BrianHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F);
        this.BrianRightArm = new ModelRenderer(this, 40, 16);
        this.BrianRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.BrianRightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(BrianRightArm, -1.3962634015954636F, -0.10000736613927509F, 0.10000736613927509F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.BrianHead2.render(f5);
        this.BrianRightLeg.render(f5);
        this.BrianTorso.render(f5);
        this.BrianLeftLeg.render(f5);
        this.BrianLeftArm.render(f5);
        this.BrianHead.render(f5);
        this.BrianRightArm.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
        this.BrianLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.BrianRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.BrianRightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount;
        this.BrianLeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 2.0F * limbSwingAmount;

        this.BrianHead.rotateAngleY = netHeadYaw * 0.017453292F;
        this.BrianHead.rotateAngleX = headPitch * 0.017453292F;
    }

}
