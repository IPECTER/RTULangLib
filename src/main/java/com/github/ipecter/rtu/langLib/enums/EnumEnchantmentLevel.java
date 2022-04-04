package com.github.ipecter.rtu.langLib.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum EnumEnchantmentLevel {
    LEVEL1(1, "enchantment.level.1"),
    LEVEL2(2, "enchantment.level.2"),
    LEVEL3(3, "enchantment.level.3"),
    LEVEL4(4, "enchantment.level.4"),
    LEVEL5(5, "enchantment.level.5"),
    LEVEL6(6, "enchantment.level.6"),
    LEVEL7(7, "enchantment.level.7"),
    LEVEL8(8, "enchantment.level.8"),
    LEVEL9(9, "enchantment.level.9"),
    LEVEL10(10, "enchantment.level.10");

    private static final Map<Integer, EnumEnchantmentLevel> lookup = new HashMap<>();

    static {
        for (EnumEnchantmentLevel level : EnumSet.allOf(EnumEnchantmentLevel.class))
            lookup.put(level.getLevel(), level);
    }

    private int level;
    private String unlocalizedName;

    EnumEnchantmentLevel(int level, String unlocalizedName) {
        this.level = level;
        this.unlocalizedName = unlocalizedName;
    }


    public static EnumEnchantmentLevel get(Integer level) {
        return lookup.get(level);
    }

    public int getLevel() {
        return level;
    }


    public String getUnlocalizedName() {
        return unlocalizedName;
    }
}
