package com.notscammer.onlyzombie;

import org.bukkit.plugin.java.JavaPlugin;

public final class OnlyZombie extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EventListen(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
