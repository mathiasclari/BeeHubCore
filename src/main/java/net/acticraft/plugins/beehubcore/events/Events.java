package net.acticraft.plugins.beehubcore.events;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.*;

public class Events implements Listener {


    @EventHandler
    public void WaterDamage(EntityDamageEvent e) {
        if(e.getCause() == EntityDamageEvent.DamageCause.DROWNING) {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void YearStats(PlayerJoinEvent e) {
        Player p = e.getPlayer();

        e.getPlayer().setLevel(2022);
        e.getPlayer().setHealthScale(10);
        e.getPlayer().setFoodLevel(20);
        p.setInvulnerable(true);

    }

    @EventHandler
    public void DropItem(PlayerDropItemEvent e) {
        if(e.getItemDrop().getItemStack().getType().equals(Material.FIREWORK_STAR)) {
            e.setCancelled(true);
            e.getPlayer().sendMessage("You can not drop this item!");
        }
    }

    @EventHandler
    public void ServerSwitch(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if(p.getItemInHand().getType() == Material.FIREWORK_STAR) {

                Bukkit.dispatchCommand(p,"gamemenu");

            }
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void PlayerVoid(PlayerMoveEvent e) {
        Player p = e.getPlayer();
        if(e.getPlayer().getLocation().getY() < 53) {
            p.teleport(p.getWorld().getSpawnLocation());
            p.sendMessage("You fell out of the world!");
        }
    }

    @EventHandler
    public void PlayerBuild(PlayerHarvestBlockEvent e) {
        Player p = e.getPlayer();
        e.setCancelled(true);
    }

    @EventHandler
    public void PlayerBuild(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        e.setCancelled(true);
    }

    @EventHandler
    public void PlayerBuild(PlayerDropItemEvent e) {
        Player p = e.getPlayer();
        e.setCancelled(true);
    }

    @EventHandler
    public void PlayerEvent1(PlayerPortalEvent e) {
        Player p = e.getPlayer();
        e.setCancelled(true);
    }

}
