package com.rfapi;

import org.bukkit.entity.Player;

public final class RFApiMain {
    public static void main(String[] args) {
        new RFApiMain().test(null);
        new RFApiMain().testPlayer(null);
    }

    public String test(String test) {
        if (test != null) {
            return "Hello " + test;
        }
        return null;
    }

    public String testPlayer(Player player) {
        if (player != null) {
            String nick = player.getName();
            player.sendMessage("A principio supimpa.");
            return "Ok" + nick;
        }
        return null;
    }
}
