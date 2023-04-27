package com.p5ina.hrizolighteconomy;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class HrizolightEconomy extends JavaPlugin {



    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("[Hrizolight Economy] Enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("[Hrizolight Economy] Disabled!");
    }
}
