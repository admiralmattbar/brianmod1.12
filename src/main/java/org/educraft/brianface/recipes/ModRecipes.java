package org.educraft.brianface.recipes;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.educraft.brianface.init.BlockInit;
import org.educraft.brianface.init.ItemInit;

public class ModRecipes {

    public static void init()
    {
        GameRegistry.addSmelting(BlockInit.BRIAN_ORE , new ItemStack(ItemInit.BRIAN_FACE , 5), 0.5f);
        BlockInit.BRIAN_ORE.initOreDict();

        GameRegistry.addSmelting(ItemInit.RAW_BRIAN, new ItemStack(ItemInit.BRIAN_JERKY, 4), 1.0f);
    }



}
