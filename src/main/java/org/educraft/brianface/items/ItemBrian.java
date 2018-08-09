/*
 * This is what a typical item class looks like. The peculiar things about your items go in their own class that your item inherits from.
 * If you want your item to be in the game be sure to include it in ModItems.
 */

package org.educraft.brianface.items;

import net.minecraft.creativetab.CreativeTabs;
import org.educraft.brianface.Main;
import org.educraft.brianface.util.IHasModel;

public class ItemBrian extends ModItem implements IHasModel {
	
	public ItemBrian() {
		super("brian_face", CreativeTabs.MISC);
		this.setFull3D();
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}