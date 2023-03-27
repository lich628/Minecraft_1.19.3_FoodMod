package com.jamesli.tutorial_mod1;

import com.jamesli.tutorial_mod1.item.reviewBell;
import com.jamesli.tutorial_mod1.item.ModFoodComponents;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Tutorial_mod1 implements ModInitializer {
    public static final String MOD_ID= "tutorial_mod1";
    public static final Logger LOGGER= LoggerFactory.getLogger("tutorial_mod1");
    public static final Item intestines=new Item(new Item.Settings().food(ModFoodComponents.Intestines));
    public static final Item reviewBell=new reviewBell(new Item.Settings().maxCount(1));

    @Override
    public void onInitialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(content->{content.add(intestines);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content->{content.add(reviewBell);});
        Registry.register(Registries.ITEM,new Identifier("tutorial_mod1","intestines"),intestines);
        Registry.register(Registries.ITEM,new Identifier("tutorial_mod1","reviewbell"),reviewBell);

    }
}
