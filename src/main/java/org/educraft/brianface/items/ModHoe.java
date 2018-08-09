package org.educraft.brianface.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import org.educraft.brianface.Main;
import org.educraft.brianface.init.ItemInit;
import org.educraft.brianface.util.IHasModel;

public class ModHoe extends ItemHoe implements IHasModel {

    public ModHoe(String name, ToolMaterial material)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.TOOLS);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
