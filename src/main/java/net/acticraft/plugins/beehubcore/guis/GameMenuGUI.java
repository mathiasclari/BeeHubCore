package net.acticraft.plugins.beehubcore.guis;

import fun.mcbee.api.honeyapi.BungeeSendPlayer.Bungee;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
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


                Inventory GameMenu = Bukkit.createInventory(null, 45, ChatColor.of("#738291") + "Categories Menu");

                // SetItems
                ItemStack lobby = new ItemStack(Material.CAKE, 1);
                ItemStack smp = new ItemStack(Material.GRASS_BLOCK, 1);
                ItemStack fun = new ItemStack(Material.BEACON, 1);
                ItemStack arcade = new ItemStack(Material.SLIME_BLOCK, 1);
                ItemStack pvp = new ItemStack(Material.TNT, 1);
                ItemStack prototype = new ItemStack(Material.CRAFTING_TABLE, 1);
                ItemStack none1 = new ItemStack(Material.BROWN_STAINED_GLASS_PANE, 1);
                ItemStack none2 = new ItemStack(Material.YELLOW_STAINED_GLASS_PANE, 1);




                ItemMeta lobby_meta = lobby.getItemMeta();
                lobby_meta.setDisplayName(ChatColor.of("#F1981E") + ""+ChatColor.BOLD + "LOBBY SELECTOR");
                ArrayList<String> lobby_lore = new ArrayList<>();
                lobby_lore.add(ChatColor.of("#738291") + "You can choose different lobbies");
                lobby_meta.setLore(lobby_lore);
                lobby.setItemMeta(lobby_meta);

                ItemMeta smp_meta = smp.getItemMeta();
                smp_meta.setDisplayName(ChatColor.of("#F1981E") +""+ChatColor.BOLD + "SMP CATEGORY");
                ArrayList<String> game1_lore = new ArrayList<>();
            game1_lore.add(ChatColor.of("#738291") + "All games here are grindy and fun!");
                game1_lore.add(ChatColor.of("#E8977F") +""+ChatColor.BOLD+ "GAMES:");
                game1_lore.add(ChatColor.of("#FAD5A5") + "Survival");
                game1_lore.add(ChatColor.of("#FAD5A5") + "SkyBlock");
                game1_lore.add(ChatColor.of("#FAD5A5") + "Realms");
                game1_lore.add(ChatColor.of("#FAD5A5") + "SkyTowny");
                game1_lore.add(ChatColor.of("#FAD5A5") + "Towny");
                smp_meta.setLore(game1_lore);
                smp.setItemMeta(smp_meta);

                ItemMeta fun_meta = fun.getItemMeta();
                fun_meta.setDisplayName(ChatColor.of("#F1981E") +""+ChatColor.BOLD + "FUN CATEGORY");
                ArrayList<String> game3_lore = new ArrayList<>();
            game3_lore.add(ChatColor.of("#738291") + "All games here are ment to make you laugh");
                game3_lore.add(ChatColor.of("#E8977F") +""+ChatColor.BOLD+ "CATEGORIES:");
                game3_lore.add(ChatColor.of("#FAD5A5") + "Family Games");
                fun_meta.setLore(game3_lore);
                fun.setItemMeta(fun_meta);

                ItemMeta arcade_meta = arcade.getItemMeta();
                arcade_meta.setDisplayName(ChatColor.of("#F1981E") +""+ChatColor.BOLD + "ARCADE CATEGORY");
                ArrayList<String> game4_lore = new ArrayList<>();
            game4_lore.add(ChatColor.of("#738291") + "All games here are very fun and enjoyable to play.");
                game4_lore.add(ChatColor.of("#E8977F") +""+ChatColor.BOLD+ "CATEGORIES:");
                game4_lore.add(ChatColor.of("#FAD5A5") + "Zombie Games");
                game4_lore.add(ChatColor.of("#FAD5A5") + "Tnt Games");
                game4_lore.add(ChatColor.of("#FAD5A5") + "Lucky Block Games");
                game4_lore.add(ChatColor.of("#FAD5A5") + "Building games");
                game4_lore.add(ChatColor.of("#FAD5A5") + "Party Games");
                arcade_meta.setLore(game4_lore);
                arcade.setItemMeta(arcade_meta);

                ItemMeta pvp_meta = pvp.getItemMeta();
                pvp_meta.setDisplayName(ChatColor.of("#F1981E") +""+ChatColor.BOLD + "PVP CATEGORY");
                ArrayList<String> game6_lore = new ArrayList<>();
                game6_lore.add(ChatColor.of("#738291") + "All games here are counted as PvP games.");
                game6_lore.add(ChatColor.of("#E8977F") +""+ChatColor.BOLD+ "CATEGORIES:");
                game6_lore.add(ChatColor.of("#FAD5A5") + "Shooter");
                game6_lore.add(ChatColor.of("#FAD5A5") + "Classic");
                game6_lore.add(ChatColor.of("#FAD5A5") + "BattleRoyale");
                pvp_meta.setLore(game6_lore);
                pvp.setItemMeta(pvp_meta);

                ItemMeta prototype_meta = prototype.getItemMeta();
                prototype_meta.setDisplayName(ChatColor.of("#F1981E") +""+ChatColor.BOLD + "PROTOTYPE");
                ArrayList<String> game8_lore = new ArrayList<>();
            game8_lore.add(ChatColor.of("#738291") + "All games here are under development.");
            game8_lore.add(ChatColor.of("#738291") + "Games will be chosen depending on what the community decides");
            game8_lore.add(ChatColor.of("#738291") + "Games will be added to the server,");
            game8_lore.add(ChatColor.of("#738291") + "as they are completed and will be in alpha/beta stages.");
                game8_lore.add(ChatColor.of("#E8977F") +""+ChatColor.BOLD+ "GAMES:");
                game8_lore.add(ChatColor.of("#FAD5A5") + "Mineopoly");
                game8_lore.add(ChatColor.of("#FAD5A5") + "MineEmpires");
                game8_lore.add(ChatColor.of("#FAD5A5") + "BeeLand");
                game8_lore.add(ChatColor.of("#FAD5A5") + "BeeCity");
                game8_lore.add(ChatColor.of("#FAD5A5") + "HoneyWars");
                game8_lore.add(ChatColor.of("#FAD5A5") + "CraftNite");
                prototype_meta.setLore(game8_lore);
                prototype.setItemMeta(prototype_meta);

                ItemMeta none_meta = none1.getItemMeta();
                none_meta.setDisplayName(ChatColor.of("#F1981E") +""+ChatColor.BOLD + "");
                none1.setItemMeta(none_meta);

                ItemMeta none2_meta = none2.getItemMeta();
                none2_meta.setDisplayName(ChatColor.of("#F1981E") +""+ChatColor.BOLD + "");
                none2.setItemMeta(none_meta);


                //Design
                GameMenu.setItem(40, lobby);
                GameMenu.setItem(18, smp);
                GameMenu.setItem(20, pvp);
                GameMenu.setItem(22, arcade);
                GameMenu.setItem(24, fun);
                GameMenu.setItem(26, prototype);



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
        return false;}


    @EventHandler
    public void GamemodeSelector(InventoryClickEvent event) {
        if(event.getView().getTitle().equalsIgnoreCase(ChatColor.of("#738291") + "Categories Menu") && event.getCurrentItem() != null) {

            if (event.getCurrentItem().getType() == Material.CAKE) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    Bungee.sendPlayerToServer((Player) event.getWhoClicked(), "lobby");
                } else {
                    event.setCancelled(true);
                }
            }

            if (event.getCurrentItem().getType() == Material.TNT) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    event.getWhoClicked().closeInventory();
                } else {
                    event.setCancelled(true);
                }
            }


            if (event.getCurrentItem().getType() == Material.SLIME_BLOCK) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    event.getWhoClicked().closeInventory();
                } else {
                    event.setCancelled(true);
                }
            }

            if (event.getCurrentItem().getType() == Material.BEACON) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    event.getWhoClicked().closeInventory();
                } else {
                    event.setCancelled(true);
                }
            }

            if (event.getCurrentItem().getType() == Material.CRAFTING_TABLE) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    event.getWhoClicked().closeInventory();
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




            if (event.getCurrentItem().getType() == Material.GRASS_BLOCK) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    Bukkit.dispatchCommand(event.getWhoClicked(),"survivalc");
                } else {
                    event.setCancelled(true);
                }}
                event.setCancelled(true);
        }

    }

}
