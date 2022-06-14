package net.acticraft.plugins.beehubcore.ranksbenefits;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor{
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.hasPermission("bee.fly")) {
                if(p.isFlying()){
                    p.setAllowFlight(false);
                    p.sendMessage(ChatColor.of("#FFBF00") + "You can no longer " + ChatColor.of("#F28C28") + "Fly");
                }else if(p.isFlying() == false){
                    p.sendMessage(ChatColor.of("#FFBF00") + "You can now " + ChatColor.of("#F28C28") + "Fly");
                    p.setAllowFlight(true);
                }
            }else{
                sender.sendMessage(ChatColor.of("#2255DF") + "You do not have permission to execute this command!");
            }
        }
        return true;}
}
