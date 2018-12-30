package org.educraft.brianface.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;
import org.educraft.brianface.Main;
import org.educraft.brianface.blocks.itemvariants.ItemBlockVariants;
import org.educraft.brianface.init.BlockInit;
import org.educraft.brianface.init.ItemInit;
import org.educraft.brianface.util.EnumHandlerBlock;
import org.educraft.brianface.util.IHasModel;
import org.educraft.brianface.util.IMetaName;

public class ModOre extends Block implements IHasModel, IMetaName {

    public static final PropertyEnum<EnumHandlerBlock.EnumType> VARIANT = PropertyEnum.<EnumHandlerBlock.EnumType>create("variant", EnumHandlerBlock.EnumType.class);

    private String name, dimension;

    public ModOre(String name, String dimension){
        super(Material.ROCK);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumHandlerBlock.EnumType.BRAIN));

        this.name = name;
        this.dimension = dimension;

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlockVariants(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public int damageDropped(IBlockState state) {
        return ((EnumHandlerBlock.EnumType)state.getValue(VARIANT)).getMeta();
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((EnumHandlerBlock.EnumType)state.getValue(VARIANT)).getMeta();
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, EnumHandlerBlock.EnumType.byMetadata(meta));
    }

    @Override
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
        return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
    }

    @Override
    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) {
        for(EnumHandlerBlock.EnumType variant : EnumHandlerBlock.EnumType.values()){
            items.add(new ItemStack(this, 1, variant.getMeta()));
        }
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[]{VARIANT});
    }

    @Override
    public String getSpecialName(ItemStack stack){
        return EnumHandlerBlock.EnumType.values()[stack.getItemDamage()].getName();
    }

    @Override
    public void registerModels() {
        //Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
        for(int i = 0; i < EnumHandlerBlock.EnumType.values().length; i++){
            Main.proxy.registerVariantRenderer(Item.getItemFromBlock(this), i, "ore_" + this.dimension + "_" + EnumHandlerBlock.EnumType.values()[i].getName(), "inventory");
        }
    }
}
