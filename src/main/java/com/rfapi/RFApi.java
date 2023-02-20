package com.rfapi;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class RFApi extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void test(Player player) {
        player.sendMessage("Working!");
    }

}
