package net.acticraft.plugins.beehubcore.hubregion;

import fun.mcbee.api.honeyapi.Regions.PlayerExitRegionEvent;
import fun.mcbee.api.honeyapi.Regions.Region;
import fun.mcbee.api.honeyapi.Regions.Regions;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;

import java.util.List;

public class HubRegion implements Listener {

    @EventHandler
    public void leave(PlayerExitRegionEvent event) {
        if(event.getFrom().getName().equals("hub")) {
            Player p = event.getPlayer();
            Location l = p.getWorld().getSpawnLocation();
            p.teleport(l);
           event.setCanceled(true);
        }
    }
}
