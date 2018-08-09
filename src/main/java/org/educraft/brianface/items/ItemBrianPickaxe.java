package org.educraft.brianface.items;

import java.util.Set;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.educraft.brianface.Main;
import org.educraft.brianface.init.BlockInit;
import org.educraft.brianface.init.ItemInit;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import org.educraft.brianface.util.IHasModel;

public class ItemBrianPickaxe extends ItemPickaxe implements IHasModel {

	public ItemBrianPickaxe() {
	    super(ItemInit.brian_material);
		this.setCreativeTab(CreativeTabs.TOOLS);
		this.setUnlocalizedName("brian_pickaxe");
		this.setRegistryName("brian_pickaxe");

        ItemInit.ITEMS.add(this);
	}


    @Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {
        if (worldIn.getBlockState(pos) == BlockInit.BRIAN_ORE.getDefaultState()) {
            worldIn.createExplosion(entityLiving, pos.getX(), pos.getY(), pos.getZ(), 10f, true);
        }
        return true;
    }


    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
