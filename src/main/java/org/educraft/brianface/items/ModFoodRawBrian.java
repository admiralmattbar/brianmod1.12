package org.educraft.brianface.items;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import org.educraft.brianface.Main;
import org.educraft.brianface.util.IHasModel;

public class ModFoodRawBrian extends ModFood implements IHasModel {


    private PotionEffect potionId;
    private float potionEffectProbability;

    public ModFoodRawBrian(String name) {
        super(name, 3, 1f, true);
        this.setPotionEffect(new PotionEffect(Potion.getPotionById(19), 5, 5, true, true), 10f);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
