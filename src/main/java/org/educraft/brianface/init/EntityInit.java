package org.educraft.brianface.init;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import org.educraft.brianface.Main;
import org.educraft.brianface.entities.EntityBrian;
import org.educraft.brianface.util.BiomeHandler;
import org.educraft.brianface.util.Reference;

public class EntityInit {

    public static void registerEntities()
    {
        registerEntity("brian", EntityBrian.class, Reference.ENTITY_BRIAN, 50, 11437146, 000000);
    }

    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int eggPrimary, int eggSecondary)
    {
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, eggPrimary, eggSecondary);
        EntityRegistry.addSpawn(EntityBrian.class, 50, 2, 7, EnumCreatureType.CREATURE, BiomeHandler.getAllBiomes());

    }

}
