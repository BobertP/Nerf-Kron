package com.icloud.rpphillips21.nerfkron;

import com.icloud.rpphillips21.nerfkron.Listeners.playerJoin;
import com.icloud.rpphillips21.nerfkron.Listeners.spawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new spawnEvent(), this);
        getServer().getPluginManager().registerEvents(new playerJoin(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
