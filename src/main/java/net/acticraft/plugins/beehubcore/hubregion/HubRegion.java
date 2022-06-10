package net.acticraft.plugins.beehubcore.hubregion;

import fun.mcbee.api.honeyapi.Regions.PlayerExitRegionEvent;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

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
