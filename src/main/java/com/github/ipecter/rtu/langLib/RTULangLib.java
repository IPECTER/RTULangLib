package com.github.ipecter.rtu.langLib;


import com.github.ipecter.rtu.langLib.manager.RTULangManager;
import org.bukkit.plugin.java.JavaPlugin;

public class RTULangLib extends JavaPlugin {
    
    private RTULangLib(){
    }
    private static class LazyHolder {
        public static final RTULangManager INSTANCE = new RTULangManager();
    }
    public static RTULangManager getManager() {
        return RTULangLib.LazyHolder.INSTANCE;
    }
    


        @Override
        public void onEnable() {
            getManager().init();
        }

        @Override
        public void onDisable() {
            //Bukkit.getLogger().info(title2 + "RTULangLib Disable");
        }
}