package com.github.ipecter.rtu.langlib;


import com.github.ipecter.rtu.langlib.manager.RTULangManager;
import com.google.common.io.ByteStreams;
import com.iridium.iridiumcolorapi.IridiumColorAPI;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class RTULangLib extends JavaPlugin {

    public static EnumLang defaultEnumLang = EnumLang.EN_US;

    private String prefix = IridiumColorAPI.process("<GRADIENT:cc811f>[ RTULangLib ]</GRADIENT:a3a3a3>");

    @Override
    public void onEnable() {
        init();
        Bukkit.getLogger().info(ChatColor.translateAlternateColorCodes('&', prefix + " &fRTULangLib &aEnable"));
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info(ChatColor.translateAlternateColorCodes('&', prefix + " &fRTULangLib &cDisable"));
    }

    public void init() {
        File setting = copyResource("setting.yml");
        YamlConfiguration config = YamlConfiguration.loadConfiguration(setting);

        String defaultLang = config.getString("defaultLang");
        if (defaultLang == null) {
            config.set("defaultLang", "en_us");
            defaultLang = "en_us";
        }
        List<String> loadLangList = config.getStringList("loadLangList");
        if (loadLangList == null || (loadLangList != null && loadLangList.isEmpty())) {
            config.set("loadLangList", Arrays.asList("ko_kr", "ja_jp"));
            loadLangList = Arrays.asList("ko_kr", "ja_jp");
        }
        try {
            config.save(setting);
        } catch (Exception e) {
            e.printStackTrace();
        }
        loadLangs(defaultLang, loadLangList);
    }

    private void loadLangs(String defaultLang, List<String> loadLangList) {
        defaultEnumLang = EnumLang.get(defaultLang);
        try {
            readFile(defaultEnumLang, new BufferedReader(new InputStreamReader(RTULangManager.class.getResourceAsStream("/langs/" + defaultEnumLang.getLocale() + ".lang"), StandardCharsets.UTF_8)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String loadLang : loadLangList) {
            try {
                readFile(EnumLang.get(loadLang), new BufferedReader(new InputStreamReader(RTULangManager.class.getResourceAsStream("/langs/" + EnumLang.get(loadLang).getLocale() + ".lang"), StandardCharsets.UTF_8)));
            } catch (IOException e) {
                e.printStackTrace();
            }
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

    private File getResourceFolder(File folder) {
        File resourceFolder = folder;
        if (!resourceFolder.exists()) {
            try {
                resourceFolder.mkdir();

            } catch (Exception e) {
                Bukkit.getLogger().severe("Error creating folder " + folder);
                e.printStackTrace();
            }
        }
        return resourceFolder;
    }

    private File copyResource(String sourceFile) {
        File targetFoler = getResourceFolder(RTULangLib.getPlugin(RTULangLib.class).getDataFolder());
        File resultFile = new File(targetFoler, sourceFile);
        if (!resultFile.exists()) {
            try {
                resultFile.createNewFile();
                InputStream in = RTULangLib.getPlugin(RTULangLib.class).getResource(sourceFile);
                OutputStream out = new FileOutputStream(resultFile);
                ByteStreams.copy(in, out);
                out.close();
                in.close();
            } catch (Exception e) {
                Bukkit.getLogger().severe("Error copying content " + sourceFile);
                e.printStackTrace();
            }
        }
        return resultFile;
    }
}