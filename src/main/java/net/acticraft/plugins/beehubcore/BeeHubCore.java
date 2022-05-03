package net.acticraft.plugins.beehubcore;

import net.acticraft.plugin.api.beeapi.BeeAPI;
import net.acticraft.plugin.api.beeapi.mysql.BeeMySQL;
import net.acticraft.plugins.beehubcore.BlockReplaceListener.BlockReplace;
import net.acticraft.plugins.beehubcore.events.Events;
import net.acticraft.plugins.beehubcore.guis.GameMenuGUI;
import net.acticraft.plugins.beehubcore.playerlisteners.JoinMessageListener;
import net.acticraft.plugins.beehubcore.scoreboard.ScoreBoard;
import org.bukkit.plugin.java.JavaPlugin;

public final class BeeHubCore extends JavaPlugin {
    private static BeeHubCore instance;

    @Override
    public void onEnable() {
        instance = this;

        getServer().getPluginManager().registerEvents(new Events(), this);
        getServer().getPluginManager().registerEvents(new JoinMessageListener(), this);
        getServer().getPluginManager().registerEvents(new GameMenuGUI(), this);
        getServer().getPluginManager().registerEvents(new ScoreBoard(), this);
        getServer().getPluginManager().registerEvents(new BlockReplace(), this);

        getCommand("gamemenu").setExecutor(new GameMenuGUI());



    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public static BeeHubCore getInstance() {
        return instance;
    }

}

