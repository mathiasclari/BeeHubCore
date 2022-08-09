package net.acticraft.plugins.beehubcore.scoreboard;

import fun.mcbee.api.honeyapi.ScoreBoard.BeeScoreboard;
import net.acticraft.plugins.beehubcore.BeeHubCore;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


public class ScoreBoard implements Listener {
    private final Map<UUID, BeeScoreboard> boards = new HashMap<>();



    public ScoreBoard() {
        Bukkit.getServer().getScheduler().runTaskTimer(BeeHubCore.getInstance(), () -> {
            for (BeeScoreboard board : this.boards.values()) {
                updateBoard(board);
            }
        }, 0, 20);
    }

    @EventHandler

    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();

        BeeScoreboard beesc = new BeeScoreboard(player);

        beesc.updateTitle(ChatColor.of("#FFBF00")+""+ChatColor.BOLD + "McBee");

        this.boards.put(player.getUniqueId(), beesc);


    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        Player player = e.getPlayer();

        BeeScoreboard beesc = this.boards.remove(player.getUniqueId());

        if (beesc != null) {
            beesc.delete();
        }

    }

    //TODO do a scoreboard
    private void updateBoard(BeeScoreboard lobbysb) {
        lobbysb.updateLines(
                "",
                ChatColor.of("#738291")+""+ChatColor.BOLD+"| "+ChatColor.of("#F28C28")+""+ChatColor.BOLD+"Name: " + ChatColor.of("#FAD5A5")+lobbysb.getPlayer().getName(),
                ChatColor.of("#738291")+""+ChatColor.BOLD+"| "+ChatColor.of("#F28C28")+""+ChatColor.BOLD+"Ping: " + ChatColor.of("#FAD5A5")+lobbysb.getPlayer().getPing(),
                "",
                ChatColor.of("#738291")+""+ChatColor.BOLD+"| "+ChatColor.of("#F28C28")+""+ChatColor.BOLD+"Flight: " + ChatColor.of("#FAD5A5")+ (lobbysb.getPlayer().isFlying() ? "Yes" : "No"),
                "",
                ChatColor.of("#738291")+""+ChatColor.BOLD+"| "+ChatColor.of("#F28C28")+""+ChatColor.BOLD+"Server: " + ChatColor.of("#FAD5A5")+ BeeHubCore.getInstance().serverid,
                ChatColor.of("#738291")+""+ChatColor.BOLD+"| "+ChatColor.of("#F28C28")+""+ChatColor.BOLD+"Lobby: " + ChatColor.of("#FAD5A5")+BeeHubCore.getInstance().servername,
                ChatColor.of("#738291")+""+ChatColor.BOLD+"| "+ChatColor.of("#F28C28")+""+ChatColor.BOLD+"Time: " + ChatColor.of("#FAD5A5")+BeeHubCore.getInstance().prefix,
                "",
                ChatColor.of("#FFBF00")+""+ChatColor.BOLD + "discord.gg/mcbee"


        );


    }

}

