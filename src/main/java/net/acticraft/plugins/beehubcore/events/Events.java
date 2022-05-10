package net.acticraft.plugins.beehubcore.events;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Difficulty;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.*;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.util.Vector;

public class Events implements Listener {

    ItemStack menu = new ItemStack(Material.FIREWORK_STAR, 1);


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
        e.getPlayer().getWorld().setDifficulty(Difficulty.PEACEFUL);
        e.getPlayer().setVelocity(Vector.getRandom().multiply(1.5));
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

    @EventHandler
    public void PlayerGetMenu(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        if(!p.getInventory().contains(Material.FIREWORK_STAR)) {
            ItemMeta menu_meta = menu.getItemMeta();
            menu_meta.setDisplayName(ChatColor.of("#F1981E") + "" + ChatColor.BOLD + "GAME SELECTOR");
            menu.setItemMeta(menu_meta);
            e.getPlayer().getInventory().addItem(menu);
        }else {

        }

    }

}
