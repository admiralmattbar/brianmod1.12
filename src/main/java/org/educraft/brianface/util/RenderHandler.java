package org.educraft.brianface.util;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.educraft.brianface.entities.EntityBrian;
import org.educraft.brianface.entities.EntityBrianade;
import org.educraft.brianface.entities.render.RenderBrian;
import org.educraft.brianface.entities.render.RenderBrianade;
import org.educraft.brianface.init.ItemInit;

@SideOnly(Side.CLIENT)
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

        RenderingRegistry.registerEntityRenderingHandler(EntityBrianade.class, new IRenderFactory<EntityBrianade>()
        {
           @Override
           public Render<? super EntityBrianade> createRenderFor(RenderManager manager)
           {

               return new RenderBrianade(manager, ItemInit.BRIANADE, Minecraft.getMinecraft().getRenderItem());
           }
        });



    }

}
