package com.github.ipecter.rtu.langLib.manager;

import com.github.ipecter.rtu.langLib.enums.EnumEntity;
import com.github.ipecter.rtu.langLib.enums.EnumLang;
import org.apache.commons.lang.StringEscapeUtils;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class RTULangManager {
    /***
     * Only use this method when enabling plugin
     */
    public void init() {
        try {
            for (EnumLang enumLang : EnumLang.values()) {
                readFile(enumLang, new BufferedReader(new InputStreamReader(RTULangManager.class.getResourceAsStream("/langs/" + enumLang.getLocale() + ".lang"), StandardCharsets.UTF_8)));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readFile(EnumLang enumLang, BufferedReader reader) throws IOException {
        String temp;
        String[] tempStringArr;
        try {
            temp = reader.readLine();
            while (temp != null) {
                if (temp.startsWith("#")) continue;
                if (temp.contains("=")) {
                    tempStringArr = temp.split("=");
                    enumLang.getMap().put(tempStringArr[0], tempStringArr.length > 1 ? tempStringArr[1] : "");
                }
                temp = reader.readLine();
            }
        } finally {
            reader.close();
        }
    }

    public String translateToLocal(String unlocalizedName, String locale) {
        String result = EnumLang.get(locale.toLowerCase()).getMap().get(unlocalizedName);
        return result != null ? StringEscapeUtils.unescapeJava(result) : "Unknown: " + unlocalizedName;
    }

    public String getEntityName(Entity entity, Player player) {
        return getEntityName(entity.getType(), player.getLocale());
    }

    public String getEntityName(Entity entity, String locale) {
        return getEntityName(entity.getType(), locale);
    }

    public String getEntityName(EntityType entityType, Player player) {
        return getEntityName(entityType, player.getLocale());
    }

    public String getEntityName(EntityType entityType, String locale) {
        return translateToLocal(EnumEntity.get(entityType).getUnlocalizedName(), locale);
    }

    public String getEntityDisplayName(Entity entity, Player player) {
        return getEntityDisplayName(entity, player.getLocale());
    }

    public String getEntityDisplayName(Entity entity, String locale) {
        return entity.getCustomName() != null ? entity.getCustomName() :
                getEntityName(entity.getType(), locale);
    }


}