package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Lorensic Natural Disasters has been enabled!");
        this.getCommand("disaster").setExecutor(new DisasterCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("Lorensic Natural Disasters has been disabled!");
    }
}