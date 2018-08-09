package org.educraft.brianface.util;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import org.educraft.brianface.entities.EntityBrian;
import org.educraft.brianface.entities.render.RenderBrian;

public class RenderHandler {

    public static void registerEntityRenders()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityBrian.class, new IRenderFactory<EntityBrian>()
        {
            @Override
            public Render<? super EntityBrian> createRenderFor(RenderManager manager)
            {
                return new RenderBrian(manager);
            }
        });
    }

}
