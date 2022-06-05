package net.acticraft.plugins.beehubcore.playerlisteners;

import net.acticraft.plugins.beehubcore.BeeHubCore;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.awt.*;

public class JoinMessageListener implements Listener {

    @EventHandler
    private void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        e.setJoinMessage(ChatColor.of("#738291")+"» "+ChatColor.of("#FFBF00")+ p.getDisplayName()+ ChatColor.of("#F28C28")+ " has entered the " + BeeHubCore.getInstance().servername);
        Location l = p.getWorld().getSpawnLocation();
        p.teleport(l);

    }

    @EventHandler
    private void onLeave(PlayerQuitEvent e1){
        Player p = e1.getPlayer();
        e1.setQuitMessage(ChatColor.of("#738291")+"» "+ChatColor.of("#FFBF00")+ p.getDisplayName()+ ChatColor.of("#F28C28")+ " left! ");
    }
}
