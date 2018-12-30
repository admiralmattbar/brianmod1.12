package org.educraft.brianface.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import org.educraft.brianface.blocks.*;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    //public static Block BRIAN_BUSH_EMPTY = new BlockBrianBushEmpty();
    //public static Block BRIAN_BUSH_FULL = new BlockBrianBushFull();
    public static BlockBrianOre BRIAN_ORE = new BlockBrianOre(BlockInit.BRIAN_ORE, 1, 1);
    public static Block BRIAN_BLOCK = new BlockBrian();
    public static ModBlock DIFF_BLOCK = new ModBlock("diff_block", Material.ROCK, CreativeTabs.BUILDING_BLOCKS);
    public static ModBlock WEIRD_BLOCK = new ModBlock("weird_block", Material.ROCK, CreativeTabs.DECORATIONS);
    public static final ModBlock BRIAN_BLOCK_POO = new BlockBrianPoo();
    public static final ModOre ORE_OVERWORLD = new ModOre("ore_overworld", "overworld");




}
