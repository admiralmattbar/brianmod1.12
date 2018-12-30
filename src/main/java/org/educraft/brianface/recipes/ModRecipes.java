package org.educraft.brianface.recipes;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.educraft.brianface.blocks.ModOre;
import org.educraft.brianface.init.BlockInit;
import org.educraft.brianface.init.ItemInit;
import org.educraft.brianface.util.EnumHandlerBlock;

public class ModRecipes {

    public static void init()
    {
        GameRegistry.addSmelting(BlockInit.BRIAN_ORE , new ItemStack(ItemInit.BRIAN_FACE , 1), 0.5f);
        BlockInit.BRIAN_ORE.initOreDict();

        GameRegistry.addSmelting(new ItemStack(BlockInit.ORE_OVERWORLD, 1, 2), new ItemStack(ItemInit.boob), 0.5f);
        GameRegistry.addSmelting(new ItemStack(BlockInit.ORE_OVERWORLD, 1, 1), new ItemStack(ItemInit.boyan), 0.5f);
        GameRegistry.addSmelting(new ItemStack(BlockInit.ORE_OVERWORLD, 1, 0), new ItemStack(ItemInit.brain), 0.5f);

        GameRegistry.addSmelting(ItemInit.RAW_BRIAN, new ItemStack(ItemInit.BRIAN_JERKY, 4), 1.0f);
    }



}
