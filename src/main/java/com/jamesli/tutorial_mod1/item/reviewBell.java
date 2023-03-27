package com.jamesli.tutorial_mod1.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class reviewBell extends Item{
    public reviewBell(Settings settings){
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        say(user);
        user.getItemCooldownManager().set(this,200);
        return super.use(world, user, hand);
    }
    private void say(PlayerEntity user){
        user.sendMessage(Text.literal("厨师保留了原本的味道，这样才知道吃的是大肠！"));
    }
}
