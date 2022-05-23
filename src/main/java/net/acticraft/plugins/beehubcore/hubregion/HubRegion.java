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
    Location loc1 = new Location(Bukkit.getWorld("PartyRunner"), 193, 28, -369);
    Location loc2 = new Location(Bukkit.getWorld("PartyRunner"), -503, 250, -369);
    Region hub = new Region("void", loc1, loc2);




    @EventHandler
    public void onRegionEnter(PlayerMoveEvent event) {
        List<Region> VseRegjeNaLokaciji =  Regions.getRegionsInLocation(event.getPlayer().getLocation());
    if(VseRegjeNaLokaciji.contains("hub")){

        }
    }

    @EventHandler
    public void leave(PlayerExitRegionEvent event) {
        if(event.getPlayer().hasPermission("neki")){

        } else {
            event.setCanceled(true);
        }
    }
}
