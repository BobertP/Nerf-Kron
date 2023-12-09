package com.icloud.rpphillips21.nerfkron.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.SpawnerSpawnEvent;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import java.util.List;

public class spawnEvent implements Listener{

    @EventHandler
    public void SpawnerSpawnEvent(SpawnerSpawnEvent event) {

        Entity entity = event.getEntity();
        List<Entity> entities = entity.getNearbyEntities(50, 50, 50);
        for (Entity e : entities) {
            if (e instanceof Player) {
                Player player = (Player) e;
                String ip = player.getAddress().getAddress().getHostAddress();

                List<Player> playerList = player.getWorld().getPlayers();

                for (Player p : playerList) {
                    if (p.getAddress().getAddress().getHostAddress().equals(ip)) {
                        //only cancel the event for the first player with the same ip address
                        if (player != p) {
                            event.setCancelled(true);
                            player.sendMessage("You have been caught using an alt account to farm spawners!");
                        }
                        else{
                            player.sendMessage("You are farming spawners, please stop");
                        }
                        //player.sendMessage("Warning, another player with the same IP address is already online!");
                        //
                        player.sendMessage("haha no lets not break the economy with fifty alt accounts");
                    }
                }
            }

        }
    }}
