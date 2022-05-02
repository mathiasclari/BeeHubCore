package net.acticraft.plugins.beehubcore;

import net.acticraft.plugins.beehubcore.events.Events;
import net.acticraft.plugins.beehubcore.guis.GameMenuGUI;
import net.acticraft.plugins.beehubcore.playerlisteners.JoinMessageListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class BeeHubCore extends JavaPlugin {
    private static BeeHubCore instance;

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Events(), this);
        getServer().getPluginManager().registerEvents(new JoinMessageListener(), this);
        getServer().getPluginManager().registerEvents(new GameMenuGUI(), this);

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

