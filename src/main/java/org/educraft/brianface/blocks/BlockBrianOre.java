package org.educraft.brianface.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import org.educraft.brianface.Main;
import org.educraft.brianface.init.BlockInit;
import org.educraft.brianface.util.IHasModel;

public class BlockBrianOre extends ModBlockOre implements IHasModel {
	
	//Fields for blocks that drop things
	private Block drop;
	private int meta;
	private int least_quantity;
	private int most_quantity;
	private String oreName;
	
	protected BlockBrianOre(Block drop, int meta) {
		super("brian_ore", 5.0f, 5.0f, "oreBrian");
		setHarvestLevel("pickaxe", 2);
		setHardness(5.0F);
		setResistance(7.0F);
		
		//Setting the fields for blocks that drop things
		this.drop = drop;
		this.meta = meta;
		this.least_quantity = 1;
		this.most_quantity = 3;
		
	}

	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return Item.getItemFromBlock(BlockInit.BRIAN_ORE);
	}

	public void initOreDict()
	{
		OreDictionary.registerOre(oreName, this);
	}
	
	public BlockBrianOre(Block drop, int least_quantity, int most_quantity) {
		this(drop, 0);
	}
	
	protected BlockBrianOre(Block drop) {
		this(drop, 1, 1);
	}
	
	public Block getBlockDropped(IBlockState blockstate, Random random, int fortune) {
		return this.drop;
	}
	
	@Override
	public int damageDropped(IBlockState blockstate) {
		return this.meta;
	}
	
	@Override
	public int quantityDropped(IBlockState blockstate, int fortune, Random random) {
		if(this.least_quantity >= this.most_quantity){
			return this.least_quantity;
		}
		
		return this.least_quantity + random.nextInt(this.most_quantity - this.least_quantity + fortune + 1);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

}
