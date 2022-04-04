package com.github.ipecter.rtu.langLib.enums;

import org.bukkit.enchantments.Enchantment;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum EnumEnchantment {
    SHARPNESS(Enchantment.DAMAGE_ALL, "enchantment.minecraft.sharpness"),
    SMITE(Enchantment.DAMAGE_UNDEAD, "enchantment.minecraft.smite"),
    BANE_OF_ARTHROPODS(Enchantment.DAMAGE_ARTHROPODS, "enchantment.minecraft.bane_of_arthropods"),
    KNOCKBACK(Enchantment.KNOCKBACK, "enchantment.minecraft.knockback"),
    FIRE_ASPECT(Enchantment.FIRE_ASPECT, "enchantment.minecraft.fire_aspect"),
    SWEEPING_EDGE(Enchantment.SWEEPING_EDGE, "enchantment.minecraft.sweeping"),
    PROTECTION(Enchantment.PROTECTION_ENVIRONMENTAL, "enchantment.minecraft.protection"),
    FIRE_PROTECTION(Enchantment.PROTECTION_FIRE, "enchantment.minecraft.fire_protection"),
    FEATHER_FALLING(Enchantment.PROTECTION_FALL, "enchantment.minecraft.feather_falling"),
    BLAST_PROTECTION(Enchantment.PROTECTION_EXPLOSIONS, "enchantment.minecraft.blast_protection"),
    PROJECTILE_PROTECTION(Enchantment.PROTECTION_PROJECTILE, "enchantment.minecraft.projectile_protection"),
    RESPIRATION(Enchantment.OXYGEN, "enchantment.minecraft.respiration"),
    AQUA_AFFINITY(Enchantment.WATER_WORKER, "enchantment.minecraft.aqua_affinity"),
    DEPTH_STRIDER(Enchantment.DEPTH_STRIDER, "enchantment.minecraft.depth_strider"),
    FROST_WALKER(Enchantment.FROST_WALKER, "enchantment.minecraft.frost_walker"),
    SOUL_SPEED(Enchantment.SOUL_SPEED, "enchantment.minecraft.soul_speed"),
    EFFICIENCY(Enchantment.DIG_SPEED, "enchantment.minecraft.efficiency"),
    SILK_TOUCH(Enchantment.SILK_TOUCH, "enchantment.minecraft.silk_touch"),
    UNBREAKING(Enchantment.DURABILITY, "enchantment.minecraft.unbreaking"),
    LOOTING(Enchantment.LOOT_BONUS_MOBS, "enchantment.minecraft.looting"),
    FORTUNE(Enchantment.LOOT_BONUS_BLOCKS, "enchantment.minecraft.fortune"),
    LUCK_OF_THE_SEA(Enchantment.LUCK, "enchantment.minecraft.luck_of_the_sea"),
    LURE(Enchantment.LURE, "enchantment.minecraft.lure"),
    POWER(Enchantment.ARROW_DAMAGE, "enchantment.minecraft.power"),
    FLAME(Enchantment.ARROW_FIRE, "enchantment.minecraft.flame"),
    PUNCH(Enchantment.ARROW_KNOCKBACK, "enchantment.minecraft.punch"),
    INFINITY(Enchantment.ARROW_INFINITE, "enchantment.minecraft.infinity"),
    THORNS(Enchantment.THORNS, "enchantment.minecraft.thorns"),
    MENDING(Enchantment.MENDING, "enchantment.minecraft.mending"),
    CURSE_OF_BINDING(Enchantment.BINDING_CURSE, "enchantment.minecraft.binding_curse"),
    CURSE_OF_VANISHING(Enchantment.VANISHING_CURSE, "enchantment.minecraft.vanishing_curse"),
    LOYALTY(Enchantment.LOYALTY, "enchantment.minecraft.loyalty"),
    IMPALING(Enchantment.IMPALING, "enchantment.minecraft.impaling"),
    RIPTIDE(Enchantment.RIPTIDE, "enchantment.minecraft.riptide"),
    CHANNELING(Enchantment.CHANNELING, "enchantment.minecraft.channeling"),
    MULTISHOT(Enchantment.MULTISHOT, "enchantment.minecraft.multishot"),
    QUICK_CHARGE(Enchantment.QUICK_CHARGE, "enchantment.minecraft.quick_charge"),
    PIERCING(Enchantment.PIERCING, "enchantment.minecraft.piercing");

    private static final Map<Enchantment, EnumEnchantment> lookup = new HashMap<>();

    static {
        for (EnumEnchantment enchantment : EnumSet.allOf(EnumEnchantment.class))
            lookup.put(enchantment.enchantment, enchantment);
    }

    private Enchantment enchantment;
    private String unlocalizedName;


    EnumEnchantment(Enchantment enchantment, String unlocalizedName) {
        this.enchantment = enchantment;
        this.unlocalizedName = unlocalizedName;
    }


    public static EnumEnchantment get(Enchantment enchantment) {
        return lookup.get(enchantment);
    }


    public Enchantment getEnchantment() {
        return enchantment;
    }


    public String getUnlocalizedName() {
        return unlocalizedName;
    }
}
