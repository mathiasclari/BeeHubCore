package net.acticraft.plugins.beehubcore.guis;

import fun.mcbee.api.honeyapi.BungeeSendPlayer.Bungee;
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

import java.util.ArrayList;

public class Tempmenu implements CommandExecutor, Listener {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;


            Inventory GameMenu = Bukkit.createInventory(null, 45, ChatColor.of("#738291") + "Game Selector");

            // SetItems
            ItemStack skyblock = new ItemStack(Material.GRASS_BLOCK, 1);
            ItemStack rplace = new ItemStack(Material.ORANGE_WOOL, 1);
            ItemStack creative = new ItemStack(Material.BRICKS, 1);
            ItemStack none1 = new ItemStack(Material.BROWN_STAINED_GLASS_PANE, 1);
            ItemStack none2 = new ItemStack(Material.YELLOW_STAINED_GLASS_PANE, 1);


            ItemMeta skyblock_meta = skyblock.getItemMeta();
            skyblock_meta.setDisplayName(ChatColor.of("#F1981E") + "" + ChatColor.BOLD + "SKYBLOCK");
            ArrayList<String> skyblock_lore = new ArrayList<>();
            skyblock_lore.add(ChatColor.of("#738291") + "Custom skyblock islands.");
            skyblock_meta.setLore(skyblock_lore);
            skyblock.setItemMeta(skyblock_meta);

            ItemMeta skytowny_meta = creative.getItemMeta();
            skytowny_meta.setDisplayName(ChatColor.of("#F1981E") + "" + ChatColor.BOLD + "Creative");
            ArrayList<String> skytowny_lore = new ArrayList<>();
            skytowny_lore.add(ChatColor.of("#738291") + "Claim your plot!");

            skyblock_meta.setLore(skytowny_lore);
            creative.setItemMeta(skytowny_meta);

            ItemMeta towny_meta = rplace.getItemMeta();
            towny_meta.setDisplayName(ChatColor.of("#F1981E") + "" + ChatColor.BOLD + "r/Place");
            ArrayList<String> towny_lore = new ArrayList<>();
            towny_lore.add(ChatColor.of("#738291") + "Canvas map");
            towny_lore.add(ChatColor.of("#738291") + "Inspired by Reddit");
            towny_meta.setLore(towny_lore);
            rplace.setItemMeta(towny_meta);


            ItemMeta none_meta = none1.getItemMeta();
            none_meta.setDisplayName(ChatColor.of("#F1981E") + "" + ChatColor.BOLD + "");
            none1.setItemMeta(none_meta);

            ItemMeta none2_meta = none2.getItemMeta();
            none2_meta.setDisplayName(ChatColor.of("#F1981E") + "" + ChatColor.BOLD + "");
            none2.setItemMeta(none_meta);


            //Design
            GameMenu.setItem(40, none1);
            GameMenu.setItem(20, skyblock);
            GameMenu.setItem(22, creative);
            GameMenu.setItem(24, rplace);


            //DesignNone
            GameMenu.setItem(0, none1);
            GameMenu.setItem(1, none2);
            GameMenu.setItem(2, none1);
            GameMenu.setItem(3, none2);
            GameMenu.setItem(4, none1);
            GameMenu.setItem(5, none2);
            GameMenu.setItem(6, none1);
            GameMenu.setItem(7, none2);
            GameMenu.setItem(8, none1);

            GameMenu.setItem(36, none1);
            GameMenu.setItem(37, none2);
            GameMenu.setItem(38, none1);
            GameMenu.setItem(39, none2);
            GameMenu.setItem(41, none2);
            GameMenu.setItem(42, none1);
            GameMenu.setItem(43, none2);
            GameMenu.setItem(44, none1);


            player.openInventory(GameMenu);


        }
        return false;
    }


    @EventHandler
    public void GamemodeSelector(InventoryClickEvent event) {
        if(event.getView().getTitle().equalsIgnoreCase(ChatColor.of("#738291") + "Game Selector") && event.getCurrentItem() != null) {

            if (event.getCurrentItem().getType() == Material.GRASS_BLOCK) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    Bungee.sendPlayerToServer((Player) event.getWhoClicked(), "skyblock");
                } else {
                    event.setCancelled(true);
                }
            }


            if (event.getCurrentItem().getType() == Material.BRICKS) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    Bungee.sendPlayerToServer((Player) event.getWhoClicked(), "creative");
                } else {
                    event.setCancelled(true);
                }
            }

            if (event.getCurrentItem().getType() == Material.ORANGE_WOOL) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    Bungee.sendPlayerToServer((Player) event.getWhoClicked(), "rplace");
                } else {
                    event.setCancelled(true);
                }
            }

            if (event.getCurrentItem().getType() == Material.YELLOW_STAINED_GLASS_PANE) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    event.getWhoClicked().closeInventory();
                } else {
                    event.setCancelled(true);
                }
            }

            if (event.getCurrentItem().getType() == Material.BROWN_STAINED_GLASS_PANE) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    event.getWhoClicked().closeInventory();
                } else {
                    event.setCancelled(true);
                }
            }

            event.setCancelled(true);
        }

    }

}

