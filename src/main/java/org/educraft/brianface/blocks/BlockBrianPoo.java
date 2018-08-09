package org.educraft.brianface.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import org.educraft.brianface.Main;

import org.educraft.brianface.util.IHasModel;

public class BlockBrianPoo extends ModBlock implements IHasModel {


    public BlockBrianPoo(){
        super("brian_block_poo", Material.GROUND, CreativeTabs.BUILDING_BLOCKS);

    }

    public void registerModels() {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
