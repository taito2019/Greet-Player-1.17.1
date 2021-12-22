package de.taitopvp.joinmessage;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


    PluginManager pluginManager = Bukkit.getPluginManager();


    private void listenerRegistration() {
        Bukkit.getServer().getPluginManager().registerEvents(new JoinListener(), this);


    }}