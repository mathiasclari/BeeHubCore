package net.acticraft.plugins.beehubcore;

import fun.mcbee.api.honeyapi.Regions.Region;
import fun.mcbee.api.honeyapi.Regions.Regions;
import net.acticraft.plugins.beehubcore.BlockReplaceListener.BlockReplace;
import net.acticraft.plugins.beehubcore.events.Events;
import net.acticraft.plugins.beehubcore.guis.GameMenuGUI;
import net.acticraft.plugins.beehubcore.guis.SMPCategory;
import net.acticraft.plugins.beehubcore.guis.Tempmenu;
import net.acticraft.plugins.beehubcore.hubregion.HubRegion;
import net.acticraft.plugins.beehubcore.playerlisteners.JoinMessageListener;
import net.acticraft.plugins.beehubcore.ranksbenefits.FlightCommand;
import net.acticraft.plugins.beehubcore.scoreboard.ScoreBoard;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class BeeHubCore extends JavaPlugin {
    private static BeeHubCore instance;

    private final YamlConfiguration conf = new YamlConfiguration();
    public String servername = getConfig().getString("servername");
    public String serverid = getConfig().getString("serverid");


    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();

        getServer().getPluginManager().registerEvents(new Events(), this);
        getServer().getPluginManager().registerEvents(new JoinMessageListener(), this);
        getServer().getPluginManager().registerEvents(new GameMenuGUI(), this);
        getServer().getPluginManager().registerEvents(new ScoreBoard(), this);
        getServer().getPluginManager().registerEvents(new BlockReplace(), this);
        getServer().getPluginManager().registerEvents(new SMPCategory(), this);
        getServer().getPluginManager().registerEvents(new Tempmenu(), this);
        getServer().getPluginManager().registerEvents(new HubRegion(), this);

        //getCommand("gamemenu").setExecutor(new GameMenuGUI());
        //getCommand("survivalc").setExecutor(new SMPCategory());
        getCommand("gamemenu").setExecutor(new Tempmenu());
        getCommand("pfly").setExecutor(new FlightCommand());

        Location loc1 = new Location(Bukkit.getWorld("world"), 193, 0, -369);
        Location loc2 = new Location(Bukkit.getWorld("world"), -503, 250, 327);
        Region hub = new Region("hub", loc1, loc2);
        Regions.addRegion(hub);


    }

    @Override
    public void onDisable() {
    }
    public static BeeHubCore getInstance() {
        return instance;
    }

}

