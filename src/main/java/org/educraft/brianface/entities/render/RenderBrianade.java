package org.educraft.brianface.entities.render;

import net.minecraft.client.renderer.entity.RenderEntity;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import org.educraft.brianface.entities.EntityBrian;
import org.educraft.brianface.entities.models.ModelBrian;


public class RenderBrianade extends RenderEntity {

    public static final ResourceLocation TEXTURES = new ResourceLocation("brianface:textures/entity/brianaid.png");

    public RenderBrianade(RenderManager manager)
    {
        super(manager);
    }

    protected ResourceLocation getEntityTexture(EntityBrian entity)
    {
        return TEXTURES;
    }

}
