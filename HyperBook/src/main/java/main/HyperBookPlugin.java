package com.hyperbook;

import com.hyperbook.commands.HyperBookCommand;
import com.hyperbook.listeners.GUIListener;
import org.bukkit.plugin.java.JavaPlugin;

public class HyperBookPlugin extends JavaPlugin {

    @Override
    public void onEnable() {

        saveDefaultConfig();

        getCommand("hyperbook").setExecutor(new HyperBookCommand());

        getServer().getPluginManager().registerEvents(new GUIListener(), this);

        getLogger().info("HyperBook Enabled!");
    }
}
