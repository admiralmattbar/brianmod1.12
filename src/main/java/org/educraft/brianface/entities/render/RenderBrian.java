package org.educraft.brianface.entities.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import org.educraft.brianface.entities.EntityBrian;
import org.educraft.brianface.entities.models.ModelBrian;

public class RenderBrian extends RenderLiving<EntityBrian> {

    public static final ResourceLocation TEXTURES = new ResourceLocation("brianface:textures/entity/brian.png");

    public RenderBrian(RenderManager manager)
    {
        super(manager, new ModelBrian(), 0.5f);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityBrian entity)
    {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityBrian entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }

}
