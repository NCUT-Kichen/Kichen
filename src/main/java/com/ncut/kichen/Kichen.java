package com.ncut.kichen;

import com.ncut.kichen.item.ModFoodComponents;
import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionUtil;
import net.minecraft.potion.Potions;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Kichen implements ModInitializer {

    public static final String MOD_ID="Kichen";

    public static final Item FRUIT_PUDDING = new Item(new Item.Settings()
            .group(ItemGroup.FOOD).food(ModFoodComponents.FRUIT_PUDDING)
    );

    @Override
    public void onInitialize() {
        //ModItems.init();
        //TODO 音响事件
        //ModSoundEvents.init();
        //TODO 出生事件
        //ServerLivingEntityEvents.ALLOW_DEATH.register();
        Registry.register(Registry.ITEM,new Identifier("kichen","fruit_pudding"),FRUIT_PUDDING);
        Registry.register(Registry.POTION,"hunger_potion",new Potion(new StatusEffectInstance(StatusEffects.HUNGER,30000)));


    }

    public static Identifier id(String value){
        return new Identifier(MOD_ID,value);
    }



}
