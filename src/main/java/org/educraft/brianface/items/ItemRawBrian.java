package org.educraft.brianface.items;

import net.minecraft.item.ItemFood;
import org.educraft.brianface.Main;
import org.educraft.brianface.init.ItemInit;
import org.educraft.brianface.util.IHasModel;

public class ItemRawBrian extends ItemFood implements IHasModel {

    public ItemRawBrian() {
        super(2, 1.0F, true);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
