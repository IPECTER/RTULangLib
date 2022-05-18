package com.github.ipecter.rtu.langlib.manager;

import com.github.ipecter.rtu.langlib.EnumLang;
import com.github.ipecter.rtu.langlib.RTULangLib;
import org.apache.commons.lang.StringEscapeUtils;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class RTULangManager {

    private RTULangManager() {
    }

    private static class LazyHolder {
        public static final RTULangManager INSTANCE = new RTULangManager();
    }

    public static RTULangManager getManager() {
        return RTULangManager.LazyHolder.INSTANCE;
    }

    public String registerEntry(EnumLang lang, String unlocalizedName, String localizedName) {
        return lang.getMap().put(unlocalizedName, localizedName);
    }
    public String translateToLocal(String unlocalizedName, String locale) {
        return translateToLocal(unlocalizedName, EnumLang.get(locale));
    }
    public String translateToLocal(String unlocalizedName, EnumLang enumLang) {
        String result = enumLang.getMap().get(unlocalizedName);
        if (result == null){
            result = RTULangLib.defaultEnumLang.getMap().get(unlocalizedName);
        }
        return result != null ? StringEscapeUtils.unescapeJava(result) : "Unknown: " + unlocalizedName;
    }
    /************************** Item **************************/

    /***
     * Item Translation Method
     * @param itemStack
     * @param locale
     * @return ItemStack's localized Name
     */
    public String getItemName(ItemStack itemStack, EnumLang locale) {
        return translateToLocal(itemStack.translationKey(), locale);
    }

    /***
     * Item Translation Method
     * @param itemStack
     * @param locale
     * @return ItemStack's localized Name
     */
    public String getItemName(ItemStack itemStack, String locale) {
        return translateToLocal(itemStack.translationKey(), locale);
    }

    /***
     * Item Translation Method
     * @param itemStack
     * @param player
     * @return ItemStack's localized Name
     */
    public String getItemName(ItemStack itemStack, Player player) {
        return getItemName(itemStack, player.getLocale());
    }
    /***
     * Item Translation Method
     * @param material
     * @param locale
     * @return Material's localized Name
     */
    public String getItemName(Material material, EnumLang locale) {
        return translateToLocal(material.translationKey(), locale);
    }

    /***
     * Item Translation Method
     * @param material
     * @param locale
     * @return Material's localized Name
     */
    public String getItemName(Material material, String locale) {
        return translateToLocal(material.translationKey(), locale);
    }

    /***
     * Item Translation Method
     * @param material
     * @param player
     * @return Material's localized Name
     */
    public String getItemName(Material material, Player player) {
        return getItemName(material, player.getLocale());
    }

    /***
     * Entity Translation Method
     * @param itemStack
     * @param locale
     * @return ItemStack's localized Name *if ItemStack has Display Name, return display name
     */
    public String getItemDisplayName(ItemStack itemStack, EnumLang locale) {
        return itemStack.getItemMeta().hasDisplayName() ? itemStack.getItemMeta().getDisplayName() :
                translateToLocal(itemStack.translationKey(), locale);
    }

    /***
     * Entity Translation Method
     * @param itemStack
     * @param locale
     * @return ItemStack's localized Name *if ItemStack has Display Name, return display name
     */
    public String getItemDisplayName(ItemStack itemStack, String locale) {
        return itemStack.getItemMeta().hasDisplayName() ? itemStack.getItemMeta().getDisplayName() :
                translateToLocal(itemStack.translationKey(), locale);
    }

    /***
     * Item Translation Method
     * @param itemStack
     * @param player
     * @return ItemStack's localized Name *if ItemStack has Display Name, return display name
     */
    public String getItemDisplayName(ItemStack itemStack, Player player) {
        return getItemDisplayName(itemStack, player.getLocale());
    }


    /************************** Entity **************************/

    /***
     * Entity Translation Method
     * @param entityType
     * @param locale
     * @return EntityType's localized Name
     */
    public String getEntityName(EntityType entityType, EnumLang locale) {
        return translateToLocal(entityType.translationKey(), locale);
    }

    /***
     * Entity Translation Method
     * @param entityType
     * @param locale
     * @return EntityType's localized Name
     */
    public String getEntityName(EntityType entityType, String locale) {
        return translateToLocal(entityType.translationKey(), locale);
    }

    /***
     * Entity Translation Method
     * @param entityType
     * @param player
     * @return EntityType's localized Name
     */
    public String getEntityName(EntityType entityType, Player player) {
        return getEntityName(entityType, player.getLocale());
    }

    /***
     * Entity Translation Method
     * @param entity
     * @param locale
     * @return Entity(Type)'s localized Name
     */
    public String getEntityName(Entity entity, EnumLang locale) {
        return getEntityName(entity.getType(), locale);
    }

    /***
     * Entity Translation Method
     * @param entity
     * @param locale
     * @return Entity(Type)'s localized Name
     */
    public String getEntityName(Entity entity, String locale) {
        return getEntityName(entity.getType(), locale);
    }

    /***
     * Entity Translation Method
     * @param entity
     * @param player
     * @return Entity(Type)'s localized Name
     */
    public String getEntityName(Entity entity, Player player) {
        return getEntityName(entity, player.getLocale());
    }

    /***
     * Entity Translation Method
     * @param entity
     * @param locale
     * @return Entity's localized Name *if Entity has Custom Name, return custom name
     */
    public String getEntityDisplayName(Entity entity, EnumLang locale) {
        return entity.getCustomName() != null ? entity.getCustomName() :
                translateToLocal(entity.getType().translationKey(), locale);
    }

    /***
     * Entity Translation Method
     * @param entity
     * @param locale
     * @return Entity's localized Name *if Entity has Custom Name, return custom name
     */
    public String getEntityDisplayName(Entity entity, String locale) {
        return entity.getCustomName() != null ? entity.getCustomName() :
                translateToLocal(entity.getType().translationKey(), locale);
    }

    /***
     * Entity Translation Method
     * @param entity
     * @param player
     * @return Entity's localized Name *if Entity has Custom Name, return custom name
     */
    public String getEntityDisplayName(Entity entity, Player player) {
        return getEntityDisplayName(entity, player.getLocale());
    }


}