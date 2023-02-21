package com.rfapi;

import org.bukkit.entity.Player;

public final class RFApiMain {
    public static void main(String[] args) {
        System.out.println(new RFApiMain().test("world"));
    }

    public String test(String name) {
        return "Hello " + name;
    }
    public String testPlayer(Player player) {
        String nick = player.getName();
        player.sendMessage("A principio supimpa.");
        return "Ok" + nick;
    }
}
