package com.github.ipecter.rtu.langLib.enums;


import org.bukkit.entity.EntityType;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum EnumEntity {
    AREA_EFFECT_CLOUD(EntityType.AREA_EFFECT_CLOUD , "entity.minecraft.area_effect_cloud"),
    ARMOR_STAND(EntityType.ARMOR_STAND , "entity.minecraft.armor_stand"),
    ARROW(EntityType.ARROW , "entity.minecraft.arrow"),
    AXOLOTL(EntityType.AXOLOTL , "entity.minecraft.axolotl"),
    BAT(EntityType.BAT , "entity.minecraft.bat"),
    BEE(EntityType.BEE , "entity.minecraft.bee"),
    BLAZE(EntityType.BLAZE , "entity.minecraft.blaze"),
    BOAT(EntityType.BOAT , "entity.minecraft.boat"),
    CAT(EntityType.CAT , "entity.minecraft.cat"),
    CAVE_SPIDER(EntityType.CAVE_SPIDER , "entity.minecraft.cave_spider"),
    MINECART_WITH_CHEST(EntityType.MINECART_CHEST , "entity.minecraft.chest_minecart"),
    CHICKEN(EntityType.CHICKEN , "entity.minecraft.chicken"),
    MINECART_WITH_COMMAND_BLOCK(EntityType.MINECART_COMMAND , "entity.minecraft.command_block_minecart"),
    COD(EntityType.COD , "entity.minecraft.cod"),
    COW(EntityType.COW , "entity.minecraft.cow"),
    CREEPER(EntityType.CREEPER , "entity.minecraft.creeper"),
    DOLPHIN(EntityType.DOLPHIN , "entity.minecraft.dolphin"),
    DONKEY(EntityType.DONKEY , "entity.minecraft.donkey"),
    DROWNED(EntityType.DROWNED , "entity.minecraft.drowned"),
    DRAGON_FIREBALL(EntityType.DRAGON_FIREBALL , "entity.minecraft.dragon_fireball"),
    THROWN_EGG(EntityType.EGG , "entity.minecraft.egg"),
    ELDER_GUARDIAN(EntityType.ELDER_GUARDIAN , "entity.minecraft.elder_guardian"),
    END_CRYSTAL(EntityType.ENDER_CRYSTAL , "entity.minecraft.end_crystal"),
    ENDER_DRAGON(EntityType.ENDER_DRAGON , "entity.minecraft.ender_dragon"),
    THROWN_ENDER_PEARL(EntityType.ENDER_PEARL , "entity.minecraft.ender_pearl"),
    ENDERMAN(EntityType.ENDERMAN , "entity.minecraft.enderman"),
    ENDERMITE(EntityType.ENDERMITE , "entity.minecraft.endermite"),
    EVOKER_FANGS(EntityType.EVOKER_FANGS , "entity.minecraft.evoker_fangs"),
    EVOKER(EntityType.EVOKER , "entity.minecraft.evoker"),
    EYE_OF_ENDER(EntityType.ENDER_SIGNAL , "entity.minecraft.eye_of_ender"),
    FALLING_BLOCK(EntityType.FALLING_BLOCK , "entity.minecraft.falling_block"),
    FIREBALL(EntityType.FIREBALL , "entity.minecraft.fireball"),
    FIREWORK_ROCKET(EntityType.FIREWORK , "entity.minecraft.firework_rocket"),
    FISHING_BOBBER(EntityType.FISHING_HOOK , "entity.minecraft.fishing_bobber"),
    FOX(EntityType.FOX , "entity.minecraft.fox"),
    MINECART_WITH_FURNACE(EntityType.MINECART_FURNACE , "entity.minecraft.furnace_minecart"),
    GHAST(EntityType.GHAST , "entity.minecraft.ghast"),
    GIANT(EntityType.GIANT , "entity.minecraft.giant"),
    GLOW_ITEM_FRAME(EntityType.GLOW_ITEM_FRAME , "entity.minecraft.glow_item_frame"),
    GLOW_SQUID(EntityType.GLOW_SQUID , "entity.minecraft.glow_squid"),
    GOAT(EntityType.GOAT , "entity.minecraft.goat"),
    GUARDIAN(EntityType.GUARDIAN , "entity.minecraft.guardian"),
    HOGLIN(EntityType.HOGLIN , "entity.minecraft.hoglin"),
    MINECART_WITH_HOPPER(EntityType.MINECART_HOPPER , "entity.minecraft.hopper_minecart"),
    HORSE(EntityType.HORSE , "entity.minecraft.horse"),
    HUSK(EntityType.HUSK , "entity.minecraft.husk"),
    RAVAGER(EntityType.RAVAGER , "entity.minecraft.ravager"),
    ILLUSIONER(EntityType.ILLUSIONER , "entity.minecraft.illusioner"),
    ITEM(EntityType.DROPPED_ITEM , "entity.minecraft.item"),
    ITEM_FRAME(EntityType.ITEM_FRAME , "entity.minecraft.item_frame"),
    //THE_KILLER_BUNNY(EntityType. , "entity.minecraft.killer_bunny"),
    LEASH_KNOT(EntityType.LEASH_HITCH , "entity.minecraft.leash_knot"),
    LIGHTNING_BOLT(EntityType.LIGHTNING , "entity.minecraft.lightning_bolt"),
    LLAMA(EntityType.LLAMA , "entity.minecraft.llama"),
    LLAMA_SPIT(EntityType.LLAMA_SPIT , "entity.minecraft.llama_spit"),
    MAGMA_CUBE(EntityType.MAGMA_CUBE , "entity.minecraft.magma_cube"),
    MARKER(EntityType.MARKER , "entity.minecraft.marker"),
    MINECART(EntityType.MINECART , "entity.minecraft.minecart"),
    MOOSHROOM(EntityType.MUSHROOM_COW , "entity.minecraft.mooshroom"),
    MULE(EntityType.MULE , "entity.minecraft.mule"),
    OCELOT(EntityType.OCELOT , "entity.minecraft.ocelot"),
    PAINTING(EntityType.PAINTING , "entity.minecraft.painting"),
    PANDA(EntityType.PANDA , "entity.minecraft.panda"),
    PARROT(EntityType.PARROT , "entity.minecraft.parrot"),
    PHANTOM(EntityType.PHANTOM , "entity.minecraft.phantom"),
    PIG(EntityType.PIG , "entity.minecraft.pig"),
    PIGLIN(EntityType.PIGLIN , "entity.minecraft.piglin"),
    PIGLIN_BRUTE(EntityType.PIGLIN_BRUTE , "entity.minecraft.piglin_brute"),
    PILLAGER(EntityType.PILLAGER , "entity.minecraft.pillager"),
    PLAYER(EntityType.PLAYER , "entity.minecraft.player"),
    POLAR_BEAR(EntityType.POLAR_BEAR , "entity.minecraft.polar_bear"),
    POTION(EntityType.SPLASH_POTION , "entity.minecraft.potion"),
    PUFFERFISH(EntityType.PUFFERFISH , "entity.minecraft.pufferfish"),
    RABBIT(EntityType.RABBIT , "entity.minecraft.rabbit"),
    SALMON(EntityType.SALMON , "entity.minecraft.salmon"),
    SHEEP(EntityType.SHEEP , "entity.minecraft.sheep"),
    SHULKER(EntityType.SHULKER , "entity.minecraft.shulker"),
    SHULKER_BULLET(EntityType.SHULKER_BULLET , "entity.minecraft.shulker_bullet"),
    SILVERFISH(EntityType.SILVERFISH , "entity.minecraft.silverfish"),
    SKELETON(EntityType.SKELETON , "entity.minecraft.skeleton"),
    SKELETON_HORSE(EntityType.SKELETON_HORSE , "entity.minecraft.skeleton_horse"),
    SLIME(EntityType.SLIME , "entity.minecraft.slime"),
    SMALL_FIREBALL(EntityType.SMALL_FIREBALL , "entity.minecraft.small_fireball"),
    SNOWBALL(EntityType.SNOWBALL , "entity.minecraft.snowball"),
    SNOW_GOLEM(EntityType.SNOWMAN , "entity.minecraft.snow_golem"),
    MINECART_WITH_SPAWNER(EntityType.MINECART_MOB_SPAWNER , "entity.minecraft.spawner_minecart"),
    SPECTRAL_ARROW(EntityType.SPECTRAL_ARROW , "entity.minecraft.spectral_arrow"),
    SPIDER(EntityType.SPIDER , "entity.minecraft.spider"),
    SQUID(EntityType.SQUID , "entity.minecraft.squid"),
    STRAY(EntityType.STRAY , "entity.minecraft.stray"),
    STRIDER(EntityType.STRIDER , "entity.minecraft.strider"),
    PRIMED_TNT(EntityType.PRIMED_TNT , "entity.minecraft.tnt"),
    MINECART_WITH_TNT(EntityType.MINECART_TNT , "entity.minecraft.tnt_minecart"),
    TRADER_LLAMA(EntityType.TRADER_LLAMA , "entity.minecraft.trader_llama"),
    TRIDENT(EntityType.TRIDENT , "entity.minecraft.trident"),
    /*need tool filter*/TROPICAL_FISH(EntityType.TROPICAL_FISH  , "entity.minecraft.tropical_fish"),
    TURTLE(EntityType.TURTLE , "entity.minecraft.turtle"),
    VEX(EntityType.VEX , "entity.minecraft.vex"),
    /*need tool filter*/VILLAGER(EntityType.VILLAGER , "entity.minecraft.villager"),
    WANDERING_TRADER(EntityType.WANDERING_TRADER , "entity.minecraft.wandering_trader"),
    IRON_GOLEM(EntityType.IRON_GOLEM , "entity.minecraft.iron_golem"),
    VINDICATOR(EntityType.VINDICATOR , "entity.minecraft.vindicator"),
    WITCH(EntityType.WITCH , "entity.minecraft.witch"),
    WITHER(EntityType.WITHER , "entity.minecraft.wither"),
    WITHER_SKELETON(EntityType.WITHER_SKELETON , "entity.minecraft.wither_skeleton"),
    WITHER_SKULL(EntityType.WITHER_SKULL , "entity.minecraft.wither_skull"),
    WOLF(EntityType.WOLF , "entity.minecraft.wolf"),
    THROWN_BOTTLE_O_ENCHANTING(EntityType.THROWN_EXP_BOTTLE , "entity.minecraft.experience_bottle"),
    EXPERIENCE_ORB(EntityType.EXPERIENCE_ORB , "entity.minecraft.experience_orb"),
    ZOGLIN(EntityType.ZOGLIN , "entity.minecraft.zoglin"),
    ZOMBIE(EntityType.ZOMBIE , "entity.minecraft.zombie"),
    ZOMBIE_HORSE(EntityType.ZOMBIE_HORSE , "entity.minecraft.zombie_horse"),
    ZOMBIFIED_PIGLIN(EntityType.ZOMBIFIED_PIGLIN , "entity.minecraft.zombified_piglin"),
    ZOMBIE_VILLAGER(EntityType.ZOMBIE_VILLAGER , "entity.minecraft.zombie_villager");

    private static final Map<EntityType, EnumEntity> lookup = new HashMap<>();

    static {
        for (EnumEntity entity : EnumSet.allOf(EnumEntity.class))
            lookup.put(entity.getType(), entity);
    }

    private EntityType type;
    private String unlocalizedName;

    EnumEntity(EntityType type, String unlocalizedName) {
        this.type = type;
        this.unlocalizedName = unlocalizedName;
    }


    public static EnumEntity get(EntityType entityType) {
        return lookup.get(entityType);
    }


    public String getUnlocalizedName() {
        return unlocalizedName;
    }

    public EntityType getType() {
        return type;
    }
}
