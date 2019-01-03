package org.educraft.brianface.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelCow - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelBrianade extends ModelBase {
    public ModelRenderer grenade_body;
    public ModelRenderer grenade_head;
    public ModelRenderer grenade_hat_rim;

    public ModelBrianade() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.grenade_body = new ModelRenderer(this, 0, 0);
        this.grenade_body.setRotationPoint(0.0F, 20.7F, -0.1F);
        this.grenade_body.addBox(-1.9F, 0.0F, -1.6F, 4, 3, 3, 0.0F);
        this.grenade_hat_rim = new ModelRenderer(this, 4, 12);
        this.grenade_hat_rim.setRotationPoint(-0.1F, 19.1F, -0.4F);
        this.grenade_hat_rim.addBox(-1.3F, 0.0F, -1.2F, 3, 1, 3, 0.0F);
        this.grenade_head = new ModelRenderer(this, 20, 8);
        this.grenade_head.setRotationPoint(0.0F, 19.8F, -0.1F);
        this.grenade_head.addBox(-0.4F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.grenade_body.render(f5);
        this.grenade_hat_rim.render(f5);
        this.grenade_head.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
