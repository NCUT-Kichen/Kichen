package com.ncut.kichen.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;
import net.minecraft.potion.Potion;

public class ModFoodComponents {
    public static final FoodComponent FRUIT_PUDDING =new FoodComponent.Builder().hunger(-3)
            .saturationModifier(0.8f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER,30000,5),1.0f).alwaysEdible().build();
    public static final Potion HUNGER_POTION = new Potion(new StatusEffectInstance[]{new StatusEffectInstance(StatusEffects.HUNGER,30000)});
}


