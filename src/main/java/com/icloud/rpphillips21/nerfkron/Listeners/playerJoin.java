package com.icloud.rpphillips21.nerfkron.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.entity.Player;


import java.util.ArrayList;

public class playerJoin implements Listener{

    @EventHandler
    public void playerJoinEvent(PlayerJoinEvent event) {

        Player player = event.getPlayer();
        String ip = player.getAddress().getAddress().getHostAddress();
        //create an arraylist of all the players on the server
        ArrayList<Player> playerList = new ArrayList<Player>();
        playerList.add(player);
        player.sendMessage("Test" + playerList);
        //if the player joining the server has the same ip address as another player on the server, send a warning message


        for (Player p : playerList) {
            if (p.getAddress().getAddress().getHostAddress().equals(ip)) {
                //send warning message
                player.sendMessage("Warning, another player with the same IP address is already online!");
            }

        }
    }}