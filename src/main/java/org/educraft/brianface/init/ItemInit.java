package org.educraft.brianface.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraftforge.common.util.EnumHelper;
import org.educraft.brianface.items.*;
import org.educraft.brianface.util.Reference;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    //Materials
    public static final ItemArmor.ArmorMaterial brian_armor = EnumHelper.addArmorMaterial("brian_armor", //Name of armor material
            Reference.MODID + ":"+"armor_brian_tex",  //Name of texture for material
            2000, //How durable the armor material is (diamond is 33), how many hits it takes before breaking
            new int[]{10, 10, 10, 10}, //Resisting damage for different parts 1. head, 2. chest, 3. legs, 4. boots
            //Number is half hearts you do not lose when hit in that spot
            25, //Enchantability of the material, this is the same as gold
            SoundEvents.ITEM_ARMOR_EQUIP_GOLD, //When equipped sounds like gold
            2.5F //Slightly tougher than diamond
    );

    public static final Item.ToolMaterial brian_material = EnumHelper.addToolMaterial("brian_material", 3, 2000, 10.0F, 3.0F, 50);

    //Misc Items
    public static final ModItem BRIAN_FACE = new ItemBrian();
    public static final Item BRIAN_POO = new ItemBrianPoo();

    //Armor
    public static final Item BRIAN_HELMET = new ItemBrianArmor("brian_helmet", brian_armor, 1,EntityEquipmentSlot.HEAD);
    public static final Item BRIAN_CHESTPLATE = new ItemBrianArmor("brian_chestplate", brian_armor, 1, EntityEquipmentSlot.CHEST);
    public static final Item BRIAN_LEGGINGS = new ItemBrianArmor("brian_leggings", brian_armor, 2 /*notice leggings are different here*/, EntityEquipmentSlot.LEGS);
    public static final Item BRIAN_BOOTS = new ItemBrianArmor("brian_boots", brian_armor, 1, EntityEquipmentSlot.FEET);

    //Tools and Weapons
    public static final ItemBrianPickaxe BRIAN_PICKAXE = new ItemBrianPickaxe();
    public static final ModHoe BRIAN_HOE = new ModHoe("brian_hoe", ItemInit.brian_material);
    public static final ItemTool BRIAN_AXE = new ItemBrianAxe(ItemInit.brian_material);
    public static final ModSpade BRIAN_SHOVEL = new ModSpade("brian_shovel", ItemInit.brian_material);
    public static final Item BRIAN_WRENCH = new ItemBrianWrench();

    //Food
    public static final Item BRIAN_JERKY = new ModFood("brian_jerky", 10, 5f, true);
    public static final Item BRAPPLE = new ModFood("brapple", 3, 2f, false);
    public static final Item RAW_BRIAN = new ModFoodRawBrian("raw_brian");

}
