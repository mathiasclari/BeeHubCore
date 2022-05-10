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


                Inventory GameMenu = Bukkit.createInventory(null, 54, ChatColor.of("#FFBF00") + "Game Menu");

                // SetItems
                ItemStack lobby = new ItemStack(Material.BOOKSHELF, 1);
                ItemStack kitpvp = new ItemStack(Material.WOODEN_SWORD, 1);
                ItemStack survival = new ItemStack(Material.MOSSY_COBBLESTONE, 1);
                ItemStack skyblock = new ItemStack(Material.GRASS_BLOCK, 1);
                ItemStack eggwars = new ItemStack(Material.DRAGON_EGG, 1);
                ItemStack skywars = new ItemStack(Material.ENDER_EYE, 1);
                ItemStack murdermystery = new ItemStack(Material.BOW, 1);
                ItemStack rplace = new ItemStack(Material.YELLOW_CONCRETE, 1);

                ItemStack prototype = new ItemStack(Material.ANVIL, 1);

                ItemStack creative = new ItemStack(Material.BRICKS, 1);
                ItemStack buildbattle = new ItemStack(Material.CRAFTING_TABLE, 1);
                ItemStack classic = new ItemStack(Material.JUKEBOX, 1);
                ItemStack horror = new ItemStack(Material.SOUL_SOIL, 1);
                ItemStack rpg = new ItemStack(Material.RAW_GOLD_BLOCK, 1);

                ItemStack prison = new ItemStack(Material.IRON_BARS, 1);
                ItemStack factions = new ItemStack(Material.IRON_SWORD, 1);
                ItemStack champions = new ItemStack(Material.BLAZE_POWDER, 1);
                ItemStack towny = new ItemStack(Material.BEACON, 1);
                ItemStack lucky = new ItemStack(Material.SPONGE, 1);





                ItemMeta lobby_meta = lobby.getItemMeta();
                lobby_meta.setDisplayName(ChatColor.of("#F1981E") + ""+ChatColor.BOLD + "MAIN LOBBY");
                lobby.setItemMeta(lobby_meta);

                ItemMeta kitpvp_meta = kitpvp.getItemMeta();
                kitpvp_meta.setDisplayName(ChatColor.of("#F1981E") +""+ChatColor.BOLD + "KITPVP");
                kitpvp.setItemMeta(kitpvp_meta);

                ItemMeta survival_meta = survival.getItemMeta();
                survival_meta.setDisplayName(ChatColor.of("#F1981E") +""+ChatColor.BOLD + "SURVIVAL");
                survival.setItemMeta(survival_meta);

                ItemMeta skyblock_meta = skyblock.getItemMeta();
                skyblock_meta.setDisplayName(ChatColor.of("#F1981E") +""+ChatColor.BOLD + "SKYBLOCK");
                skyblock.setItemMeta(skyblock_meta);

                ItemMeta eggwars_meta = eggwars.getItemMeta();
                eggwars_meta.setDisplayName(ChatColor.of("#F1981E") +""+ChatColor.BOLD + "EGGWARS");
                eggwars.setItemMeta(eggwars_meta);

                ItemMeta skywars_meta = skywars.getItemMeta();
                skywars_meta.setDisplayName(ChatColor.of("#F1981E") +""+ChatColor.BOLD + "SKYWARS");
                skywars.setItemMeta(skywars_meta);

                ItemMeta murdermystery_meta = murdermystery.getItemMeta();
                murdermystery_meta.setDisplayName(ChatColor.of("#F1981E") +""+ChatColor.BOLD + "MURDER MYSTERY");
                murdermystery.setItemMeta(murdermystery_meta);

                ItemMeta rplace_meta = rplace.getItemMeta();
                rplace_meta.setDisplayName(ChatColor.of("#F1981E") +""+ChatColor.BOLD + "r/PLACE");
                rplace.setItemMeta(rplace_meta);

                ItemMeta prototype_meta = prototype.getItemMeta();
                prototype_meta.setDisplayName(ChatColor.of("#F1981E") +""+ChatColor.BOLD + "PROTOTYPE");
                ArrayList<String> game1_lore = new ArrayList<>();
                game1_lore.add(ChatColor.of("#E8977F") +""+ChatColor.BOLD+ "GAMES:");
                game1_lore.add(ChatColor.of("#FAD5A5") + "SteveKart");
                game1_lore.add(ChatColor.of("#FAD5A5") + "DyingCraft");
                game1_lore.add(ChatColor.of("#FAD5A5") + "Mineopoly");
                game1_lore.add(ChatColor.of("#FAD5A5") + "MineWars");
                game1_lore.add(ChatColor.of("#FAD5A5") + "MineEmpires");
                game1_lore.add(ChatColor.of("#FAD5A5") + "BeeLand");
                prototype_meta.setLore(game1_lore);
                prototype.setItemMeta(prototype_meta);

                ItemMeta creative_meta = creative.getItemMeta();
                creative_meta.setDisplayName(ChatColor.of("#F1981E") +""+ChatColor.BOLD + "CREATIVE");
                creative.setItemMeta(creative_meta);

                ItemMeta buildbattle_meta = buildbattle.getItemMeta();
                buildbattle_meta.setDisplayName(ChatColor.of("#F1981E") +""+ChatColor.BOLD + "BUILD BATTLE");
                buildbattle.setItemMeta(buildbattle_meta);

                ItemMeta classic_meta = classic.getItemMeta();
                classic_meta.setDisplayName(ChatColor.of("#F1981E") +""+ChatColor.BOLD + "CLASSIC");
                ArrayList<String> classic_lore = new ArrayList<>();
                classic_lore.add(ChatColor.of("#E8977F") +""+ChatColor.BOLD+ "GAMES:");
                classic_lore.add(ChatColor.of("#FAD5A5") + "VillagerDefense");
                classic_lore.add(ChatColor.of("#FAD5A5") + "Zombies");
                classic_meta.setLore(classic_lore);
                classic.setItemMeta(classic_meta);

                ItemMeta horror_meta = horror.getItemMeta();
                horror_meta.setDisplayName(ChatColor.of("#F1981E") +""+ChatColor.BOLD + "HORROR ADVENTURE");
                horror.setItemMeta(horror_meta);

                ItemMeta rpg_meta = rpg.getItemMeta();
                rpg_meta.setDisplayName(ChatColor.of("#F1981E") +""+ChatColor.BOLD + "RPG GAMES");
                rpg.setItemMeta(rpg_meta);

                ItemMeta prison_meta = prison.getItemMeta();
                prison_meta.setDisplayName(ChatColor.of("#F1981E") +""+ChatColor.BOLD + "PRISON");
                prison.setItemMeta(prison_meta);

                ItemMeta factions_meta = factions.getItemMeta();
                factions_meta.setDisplayName(ChatColor.of("#F1981E") +""+ChatColor.BOLD + "FACTIONS");
                factions.setItemMeta(factions_meta);

                ItemMeta champions_meta = champions.getItemMeta();
                champions_meta.setDisplayName(ChatColor.of("#F1981E") +""+ChatColor.BOLD + "CHAMPIONS");
                ArrayList<String> champions_lore = new ArrayList<>();
                champions_lore.add(ChatColor.of("#E8977F") +""+ChatColor.BOLD+ "GAMES:");
                champions_lore.add(ChatColor.of("#FAD5A5") + "HungerGames");
                champions_lore.add(ChatColor.of("#FAD5A5") + "WoolWars");
                champions_lore.add(ChatColor.of("#FAD5A5") + "ParkourTag");
                champions_lore.add(ChatColor.of("#FAD5A5") + "ACErace");
                champions_meta.setLore(champions_lore);
                champions.setItemMeta(champions_meta);

                ItemMeta towny_meta = towny.getItemMeta();
                towny_meta.setDisplayName(ChatColor.of("#F1981E") +""+ChatColor.BOLD + "TOWNY");
                towny.setItemMeta(towny_meta);

                ItemMeta lucky_meta = lucky.getItemMeta();
                lucky_meta.setDisplayName(ChatColor.of("#F1981E") +""+ChatColor.BOLD + "LUCKYWARS");
                lucky.setItemMeta(lucky_meta);

                //Design
                GameMenu.setItem(4, lobby);
                GameMenu.setItem(10, kitpvp);
                GameMenu.setItem(11, survival);
                GameMenu.setItem(12, skyblock);
                GameMenu.setItem(13, eggwars);
                GameMenu.setItem(14, skywars);
                GameMenu.setItem(15, murdermystery);
                GameMenu.setItem(16, rplace);

                GameMenu.setItem(22, prototype);

                GameMenu.setItem(29, creative);
                GameMenu.setItem(30, buildbattle);
                GameMenu.setItem(31, classic);
                GameMenu.setItem(32, horror);
                GameMenu.setItem(33, rpg);

                GameMenu.setItem(38, prison);
                GameMenu.setItem(39, factions);
                GameMenu.setItem(40, champions);
                GameMenu.setItem(41, towny);
                GameMenu.setItem(42, lucky);



                player.openInventory(GameMenu);


            }else{
                player.sendMessage(ChatColor.of("#F23700") + "You do not have required permissions to use this command!");
            }}
        return false;}


    @EventHandler
    public void GamemodeSelector(InventoryClickEvent event) {
        if(event.getView().getTitle().equalsIgnoreCase(ChatColor.of("#FFBF00") + "Game Menu") && event.getCurrentItem() != null) {

            if (event.getCurrentItem().getType() == Material.BOOKSHELF) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    Bungee.sendPlayerToServer((Player) event.getWhoClicked(), "lobby");
                } else {
                    event.setCancelled(true);
                }
            }

            if (event.getCurrentItem().getType() == Material.WOODEN_SWORD) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    Bungee.sendPlayerToServer((Player) event.getWhoClicked(), "kitpvp");
                } else {
                    event.setCancelled(true);
                }
            }

            if (event.getCurrentItem().getType() == Material.MOSSY_COBBLESTONE) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    Bungee.sendPlayerToServer((Player) event.getWhoClicked(), "survival");
                    event.getWhoClicked().closeInventory();
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

            if (event.getCurrentItem().getType() == Material.DRAGON_EGG) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    Bungee.sendPlayerToServer((Player) event.getWhoClicked(), "eggwars");
                    event.getWhoClicked().closeInventory();
                } else {
                    event.setCancelled(true);
                }
            }

            if (event.getCurrentItem().getType() == Material.ENDER_EYE) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    Bungee.sendPlayerToServer((Player) event.getWhoClicked(), "skywars");
                    event.getWhoClicked().closeInventory();
                } else {
                    event.setCancelled(true);
                }
            }

            if (event.getCurrentItem().getType() == Material.BOW) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    Bungee.sendPlayerToServer((Player) event.getWhoClicked(), "murdermystery");
                    event.getWhoClicked().closeInventory();
                } else {
                    event.setCancelled(true);
                }
            }

            if (event.getCurrentItem().getType() == Material.YELLOW_CONCRETE) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    Bungee.sendPlayerToServer((Player) event.getWhoClicked(), "rplace");
                    event.getWhoClicked().closeInventory();
                } else {
                    event.setCancelled(true);
                }
            }

            if (event.getCurrentItem().getType() == Material.ANVIL) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    Bungee.sendPlayerToServer((Player) event.getWhoClicked(), "prototype");
                    event.getWhoClicked().closeInventory();
                } else {
                    event.setCancelled(true);
                }
            }

            if (event.getCurrentItem().getType() == Material.BRICKS) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    Bungee.sendPlayerToServer((Player) event.getWhoClicked(), "creative");
                    event.getWhoClicked().closeInventory();
                } else {
                    event.setCancelled(true);
                }
            }

            if (event.getCurrentItem().getType() == Material.CRAFTING_TABLE) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    Bungee.sendPlayerToServer((Player) event.getWhoClicked(), "buildbattle");
                    event.getWhoClicked().closeInventory();
                } else {
                    event.setCancelled(true);
                }
            }

            if (event.getCurrentItem().getType() == Material.JUKEBOX) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    Bungee.sendPlayerToServer((Player) event.getWhoClicked(), "classic");
                    event.getWhoClicked().closeInventory();
                } else {
                    event.setCancelled(true);
                }
            }

            if (event.getCurrentItem().getType() == Material.SOUL_SOIL) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    Bungee.sendPlayerToServer((Player) event.getWhoClicked(), "horror");
                    event.getWhoClicked().closeInventory();
                } else {
                    event.setCancelled(true);
                }
            }

            if (event.getCurrentItem().getType() == Material.RAW_GOLD_BLOCK) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    Bungee.sendPlayerToServer((Player) event.getWhoClicked(), "rpg");
                    event.getWhoClicked().closeInventory();
                } else {
                    event.setCancelled(true);
                }
            }

            if (event.getCurrentItem().getType() == Material.IRON_BARS) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    Bungee.sendPlayerToServer((Player) event.getWhoClicked(), "prison");
                    event.getWhoClicked().closeInventory();
                } else {
                    event.setCancelled(true);
                }
            }

            if (event.getCurrentItem().getType() == Material.IRON_SWORD) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    Bungee.sendPlayerToServer((Player) event.getWhoClicked(), "factions");
                    event.getWhoClicked().closeInventory();
                } else {
                    event.setCancelled(true);
                }
            }
            if (event.getCurrentItem().getType() == Material.BLAZE_POWDER) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    Bungee.sendPlayerToServer((Player) event.getWhoClicked(), "champions");
                    event.getWhoClicked().closeInventory();
                } else {
                    event.setCancelled(true);
                }
            }
            if (event.getCurrentItem().getType() == Material.BEACON) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    Bungee.sendPlayerToServer((Player) event.getWhoClicked(), "towny");
                    event.getWhoClicked().closeInventory();
                } else {
                    event.setCancelled(true);
                }
            }

            if (event.getCurrentItem().getType() == Material.SPONGE) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    Bungee.sendPlayerToServer((Player) event.getWhoClicked(), "lucky");
                    event.getWhoClicked().closeInventory();
                } else {
                    event.setCancelled(true);
                }}
                event.setCancelled(true);
        }

    }

}
