package net.acticraft.plugins.beehubcore.ranksbenefits;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlightCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.hasPermission("beehub.flight")) {
                p.setAllowFlight(true);
                p.sendMessage("You can now fly!");
            } else {
                p.sendMessage("You don't have permission to use this command!");
            }
        }
        return true;
    }
}
