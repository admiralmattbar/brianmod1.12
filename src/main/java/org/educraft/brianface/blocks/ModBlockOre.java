package org.educraft.brianface.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.oredict.OreDictionary;
import org.educraft.brianface.Main;
import org.educraft.brianface.util.IHasModel;

public class ModBlockOre extends ModBlock implements IHasModel {

    private String oreName;

    protected String name;

    public ModBlockOre(String name, float hardness, float resistance, String oreName)
    {
        super(name, Material.ROCK, CreativeTabs.BUILDING_BLOCKS);
        this.oreName = oreName;
        setHardness(hardness);
        setResistance(resistance);
    }

    public void initOreDict()
    {
        OreDictionary.registerOre(oreName, this);
    }

    @Override
    public ModBlockOre setCreativeTab(CreativeTabs tab)
    {
        super.setCreativeTab(tab);
        return this;
    }

    public void registerItemModel(Item itemBlock)
    {
        Main.proxy.registerItemRenderer(itemBlock, 0, name);
    }

    public Item createItemBlock()
    {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }
}
