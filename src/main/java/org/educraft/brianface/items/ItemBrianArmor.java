package org.educraft.brianface.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import org.educraft.brianface.Main;
import org.educraft.brianface.init.ItemInit;
import org.educraft.brianface.util.IHasModel;

public class ItemBrianArmor extends ItemArmor implements IHasModel {

	public ItemBrianArmor(String name, ArmorMaterial materialIn, int renderIndex, EntityEquipmentSlot equipmentSlot) {
		super(materialIn, renderIndex, equipmentSlot);
		setCreativeTab(CreativeTabs.COMBAT);
		setUnlocalizedName(name);
		setRegistryName(name);

		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
