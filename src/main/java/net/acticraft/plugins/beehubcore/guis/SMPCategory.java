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

public class SMPCategory implements CommandExecutor, Listener {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;


            Inventory GameMenu = Bukkit.createInventory(null, 45, ChatColor.of("#738291") + "SMP Category");

            // SetItems
            ItemStack survival = new ItemStack(Material.WOODEN_PICKAXE, 1);
            ItemStack skyblock = new ItemStack(Material.STONE_PICKAXE, 1);
            ItemStack realms = new ItemStack(Material.IRON_PICKAXE, 1);
            ItemStack skytowny = new ItemStack(Material.GOLDEN_PICKAXE, 1);
            ItemStack towny = new ItemStack(Material.DIAMOND_PICKAXE, 1);
            ItemStack back = new ItemStack(Material.ARROW, 1);
            ItemStack none1 = new ItemStack(Material.BROWN_STAINED_GLASS_PANE, 1);
            ItemStack none2 = new ItemStack(Material.YELLOW_STAINED_GLASS_PANE, 1);




            ItemMeta survival_meta = survival.getItemMeta();
            survival_meta.setDisplayName(ChatColor.of("#F1981E") + ""+ChatColor.BOLD + "SURVIVAL");
            ArrayList<String> survival_lore = new ArrayList<>();
            survival_lore.add(ChatColor.of("#738291") + "Open world survival world.");
            survival_lore.add(ChatColor.of("#738291") + "World Size 10k x 10k");
            survival_meta.setLore(survival_lore);
            survival.setItemMeta(survival_meta);

            ItemMeta skyblock_meta = skyblock.getItemMeta();
            skyblock_meta.setDisplayName(ChatColor.of("#F1981E") + ""+ChatColor.BOLD + "SKYBLOCK");
            ArrayList<String> skyblock_lore = new ArrayList<>();
            skyblock_lore.add(ChatColor.of("#738291") + "Custom skyblock islands.");
            skyblock_meta.setLore(skyblock_lore);
            skyblock.setItemMeta(skyblock_meta);

            ItemMeta realms_meta = realms.getItemMeta();
            realms_meta.setDisplayName(ChatColor.of("#F1981E") + ""+ChatColor.BOLD + "REALMS");
            ArrayList<String> realms_lore = new ArrayList<>();
            realms_lore.add(ChatColor.of("#738291") + "Custom coded realms world.");
            realms_lore.add(ChatColor.of("#738291") + "Private worlds");
            realms_meta.setLore(realms_lore);
            realms.setItemMeta(realms_meta);

            ItemMeta skytowny_meta = skytowny.getItemMeta();
            skytowny_meta.setDisplayName(ChatColor.of("#F1981E") + ""+ChatColor.BOLD + "Survival 2");
            ArrayList<String> skytowny_lore = new ArrayList<>();
            skytowny_lore.add(ChatColor.of("#738291") + "Custom resourcepack");
            skytowny_lore.add(ChatColor.of("#738291") + "Custom world generator");

            skyblock_meta.setLore(skytowny_lore);
            skytowny.setItemMeta(skytowny_meta);

            ItemMeta towny_meta = towny.getItemMeta();
            towny_meta.setDisplayName(ChatColor.of("#F1981E") + ""+ChatColor.BOLD + "TOWNY");
            ArrayList<String> towny_lore = new ArrayList<>();
            towny_lore.add(ChatColor.of("#738291") + "Earth world map");
            towny_lore.add(ChatColor.of("#738291") + "Online map");
            towny_meta.setLore(towny_lore);
            towny.setItemMeta(towny_meta);



            ItemMeta none_meta = none1.getItemMeta();
            none_meta.setDisplayName(ChatColor.of("#F1981E") +""+ChatColor.BOLD + "");
            none1.setItemMeta(none_meta);

            ItemMeta none2_meta = none2.getItemMeta();
            none2_meta.setDisplayName(ChatColor.of("#F1981E") +""+ChatColor.BOLD + "");
            none2.setItemMeta(none_meta);

            ItemMeta back_meta = back.getItemMeta();
            back_meta.setDisplayName(ChatColor.of("#F1981E") +""+ChatColor.BOLD + "BACK");
            back.setItemMeta(back_meta);


            //Design
            GameMenu.setItem(40, back);
            GameMenu.setItem(18, survival);
            GameMenu.setItem(20, skyblock);
            GameMenu.setItem(22, skytowny);
            GameMenu.setItem(24, towny);
            GameMenu.setItem(26, realms);



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
        if(event.getView().getTitle().equalsIgnoreCase(ChatColor.of("#738291") + "SMP Category") && event.getCurrentItem() != null) {

            if (event.getCurrentItem().getType() == Material.WOODEN_PICKAXE) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    Bungee.sendPlayerToServer((Player) event.getWhoClicked(), "survival");
                } else {
                    event.setCancelled(true);
                }
            }

            if (event.getCurrentItem().getType() == Material.STONE_PICKAXE) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    Bungee.sendPlayerToServer((Player) event.getWhoClicked(), "skyblock");
                } else {
                    event.setCancelled(true);
                }
            }


            if (event.getCurrentItem().getType() == Material.IRON_PICKAXE) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    Bungee.sendPlayerToServer((Player) event.getWhoClicked(), "realms");
                } else {
                    event.setCancelled(true);
                }
            }

            if (event.getCurrentItem().getType() == Material.GOLDEN_PICKAXE) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    Bungee.sendPlayerToServer((Player) event.getWhoClicked(), "survival2");
                } else {
                    event.setCancelled(true);
                }
            }

            if (event.getCurrentItem().getType() == Material.DIAMOND_PICKAXE) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();

                    Bungee.sendPlayerToServer((Player) event.getWhoClicked(), "towny");
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


            if (event.getCurrentItem().getType() == Material.ARROW) {
                if (event.getClick().equals(ClickType.RIGHT) || event.getClick().equals(ClickType.LEFT)) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    Bukkit.dispatchCommand(event.getWhoClicked(),"gamemenu");
                } else {
                    event.setCancelled(true);
                }}
            event.setCancelled(true);
        }

    }

}