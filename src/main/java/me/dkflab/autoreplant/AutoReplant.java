package me.dkflab.autoreplant;

import me.dkflab.autoreplant.listeners.BlockBreak;
import me.dkflab.autoreplant.listeners.RightClick;
import org.bukkit.plugin.java.JavaPlugin;

public final class AutoReplant extends JavaPlugin {

    @Override
    public void onEnable() {
        // Config
        saveDefaultConfig();
        // Listeners
        if (getConfig().getBoolean("AutoReplantEnabled")) {
            getServer().getPluginManager().registerEvents(new BlockBreak(this), this);
            System.out.println("AutoReplant enabling...");
        }
        if (getConfig().getBoolean("AutoPlantEnabled")) {
            getServer().getPluginManager().registerEvents(new RightClick(this), this);
            System.out.println("AutoPlant enabling...");
        }
        System.out.println("dkf-lab's AutoReplant Enabled.");
    }

    @Override
    public void onDisable() {
        System.out.println("AutoReplant disabled.");
    }
}
