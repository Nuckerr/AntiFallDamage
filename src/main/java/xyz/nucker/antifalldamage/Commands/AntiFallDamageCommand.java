package xyz.nucker.antifalldamage.Commands;

import net.md_5.bungee.api.chat.BaseComponent;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import xyz.nucker.antifalldamage.AntiFallDamage;


import static xyz.nucker.antifalldamage.AntiFallDamage.msg;

public class AntiFallDamageCommand implements CommandExecutor {

    Plugin plugin = AntiFallDamage.getPlugin(AntiFallDamage.class);

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player p = (Player) sender;
            if(p.hasPermission("antifalldamage.command")) {
                if(args.length < 0) {
                    p.sendMessage(msg("&aAntiFallDamage developed by Nucker"));
                    p.sendMessage(msg("&aWebsite: &bnucker.xyz"));
                }else if(args.length == 0) {
                    if(args[0].equalsIgnoreCase("reload")) {
                        plugin.reloadConfig();
                        p.sendMessage(msg("&aAntiFallDamage has been reloaded"));
                    }else if(args[0].equalsIgnoreCase("rl")) {
                        plugin.reloadConfig();
                        p.sendMessage(msg("&aAntiFallDamage has been reloaded"));
                    }
                }else{
                    p.sendMessage(msg("&aAntiFallDamage developed by Nucker"));
                    p.sendMessage(msg("&aWebsite: &bnucker.xyz"));
                }
            }else {
                p.sendMessage(msg("You do not have permission"));
            }
        }
        return true;
    }
}
