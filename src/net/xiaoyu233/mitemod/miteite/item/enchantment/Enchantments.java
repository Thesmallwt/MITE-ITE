package net.xiaoyu233.mitemod.miteite.item.enchantment;

import net.minecraft.Enchantment;
import net.minecraft.yq;
import net.xiaoyu233.mitemod.miteite.util.Constant;

public class Enchantments {
    public static final Enchantment DEFENCED = new EnchantmentDefence(getNextEnchantmentID(), yq.c,20);
    public static final Enchantment CRIT = new EnchantmentCrit(getNextEnchantmentID(),yq.c, 10);
    public static final Enchantment EXTEND = new EnchantmentExtend(getNextEnchantmentID(),yq.c, 10);
    public static final Enchantment EMERGENCY = new EnchantmentEmergency(getNextEnchantmentID(),yq.c,15);
    public static void registerEnchantments(){
        Enchantment.registerEnchantmentsUnsafe(DEFENCED,CRIT,EXTEND,EMERGENCY);
    }
    private static int getNextEnchantmentID(){
        return Constant.nextEnchantmentID++;
    }
}
