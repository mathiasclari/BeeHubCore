package net.acticraft.plugins.beehubcore.guis;

import net.acticraft.plugin.api.beeapi.bungeesendplayer.Bungee;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.awt.*;
import java.util.ArrayList;

public class GameMenuGUI implements CommandExecutor, Listener {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("acti_hub.gamemenu")) {


                Inventory GameMenu = Bukkit.createInventory(null, 27, ChatColor.of("#78B5DA") + "GameMenu");

                // SetItems
                ItemStack none = new ItemStack(Material.BROWN_STAINED_GLASS_PANE, 1);
                ItemStack none1 = new ItemStack(Material.YELLOW_STAINED_GLASS_PANE, 1);
                ItemStack game1 = new ItemStack(Material.GRASS_BLOCK, 1);
                ItemStack game2 = new ItemStack(Material.BRICKS, 1);
                ItemStack game3 = new ItemStack(Material.HONEYCOMB_BLOCK, 1);
                ItemStack game4 = new ItemStack(Material.AMETHYST_BLOCK, 1);
                ItemStack game5 = new ItemStack(Material.SPONGE, 1);


                ItemMeta none_meta = none.getItemMeta();
                none_meta.setDisplayName(ChatColor.of("#DA7878") + "");
                none.setItemMeta(none_meta);

                ItemMeta none1_meta = none1.getItemMeta();
                none1_meta.setDisplayName(ChatColor.of("#DA7878") + "");
                none1.setItemMeta(none1_meta);

                ItemMeta game1_meta = game1.getItemMeta();
                game1_meta.setDisplayName(ChatColor.of("#F1981E") +""+ChatColor.BOLD + "SKYBLOCK");
                ArrayList<String> game1_lore = new ArrayList<>();
                game1_lore.add(ChatColor.of("#E8977F") + "Category: SMP");
                game1_meta.setLore(game1_lore);
                game1.setItemMeta(game1_meta);

                ItemMeta game2_meta = game2.getItemMeta();
                game2_meta.setDisplayName(ChatColor.of("#F1981E") +""+ChatColor.BOLD + "BUILD BATTLE");
                ArrayList<String> game2_lore = new ArrayList<>();
                game2_lore.add(ChatColor.of("#E8977F") + "Category: BUILD");
                game2_meta.setLore(game2_lore);
                game2.setItemMeta(game2_meta);

                ItemMeta game3_meta = game3.getItemMeta();
                game3_meta.setDisplayName(ChatColor.of("#F1981E") +""+ChatColor.BOLD + "KITPVP");
                ArrayList<String> game3_lore = new ArrayList<>();
                game3_lore.add(ChatColor.of("#E8977F") + "Category: PVP");
                game3_meta.setLore(game3_lore);
                game3.setItemMeta(game3_meta);

                ItemMeta game4_meta = game4.getItemMeta();
                game4_meta.setDisplayName(ChatColor.of("#F1981E") +""+ChatColor.BOLD + "CHAMPIONS");
                ArrayList<String> game4_lore = new ArrayList<>();
                game4_lore.add(ChatColor.of("#E8977F") + "Category: TOURNAMENTS");
                game4_meta.setLore(game4_lore);
                game4.setItemMeta(game4_meta);

                ItemMeta game5_meta = game5.getItemMeta();
                game5_meta.setDisplayName(ChatColor.of("#F1981E")+""+ChatColor.BOLD + "PRISON");
                ArrayList<String> game5_lore = new ArrayList<>();
                game5_lore.add(ChatColor.of("#E8977F") + "Category: GRIND");
                game5_meta.setLore(game5_lore);
                game5.setItemMeta(game5_meta);


                String money = "%vault_eco_balance_fixed%";
                String playername = "%player_displayname%";

                //Design
                GameMenu.setItem(0, none);
                GameMenu.setItem(1, none1);
                GameMenu.setItem(2, none);
                GameMenu.setItem(3, none1);
                GameMenu.setItem(4, none);
                GameMenu.setItem(5, none1);
                GameMenu.setItem(6, none);
                GameMenu.setItem(7, none1);
                GameMenu.setItem(8, none);

                GameMenu.setItem(18, none);
                GameMenu.setItem(19, none1);
                GameMenu.setItem(20, none);
                GameMenu.setItem(21, none1);
                GameMenu.setItem(22, none);
                GameMenu.setItem(23, none1);
                GameMenu.setItem(24, none);
                GameMenu.setItem(25, none1);
                GameMenu.setItem(26, none);


                GameMenu.setItem(9, game1);
                GameMenu.setItem(11, game2);
                GameMenu.setItem(13, game3);
                GameMenu.setItem(15, game4);
                GameMenu.setItem(17, game5);



                player.openInventory(GameMenu);


            }else{
                player.sendMessage(ChatColor.of("#F23700") + "You do not have required permissions to use this command!");
            }}
        return false;}


    @EventHandler
    public void GamemodeSelector(InventoryClickEvent event) {
        if(event.getView().getTitle().equalsIgnoreCase(ChatColor.of("#78B5DA") + "GameMenu") && event.getCurrentItem() != null) {

            if (event.getCurrentItem().getType() == Material.BROWN_STAINED_GLASS_PANE) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                } else {
                    event.setCancelled(true);
                }
            }

            if (event.getCurrentItem().getType() == Material.YELLOW_STAINED_GLASS_PANE) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                } else {
                    event.setCancelled(true);
                }
            }

            if (event.getCurrentItem().getType() == Material.GRASS_BLOCK) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    Bungee.sendPlayerToServer((Player) event.getWhoClicked(), "skyblock");
                    event.getWhoClicked().closeInventory();
                } else {
                    event.setCancelled(true);
                }
            }

            if (event.getCurrentItem().getType() == Material.HONEYCOMB_BLOCK) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    Bungee.sendPlayerToServer((Player) event.getWhoClicked(), "kitpvp");
                    event.getWhoClicked().closeInventory();
                } else {
                    event.setCancelled(true);
                }}
                event.setCancelled(true);
        }

    }

}
