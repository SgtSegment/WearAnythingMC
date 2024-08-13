package io.github.sgtsegment.wear_anything;

import org.bukkit.plugin.java.JavaPlugin;

public final class Wear_anything extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("wear").setExecutor(new Commands());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
