package org.educraft.brianface.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import org.educraft.brianface.Main;
import org.educraft.brianface.init.ItemInit;
import org.educraft.brianface.util.IHasModel;

public class ModItem extends Item implements IHasModel {
    public ModItem(String name, CreativeTabs ct)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ct);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
