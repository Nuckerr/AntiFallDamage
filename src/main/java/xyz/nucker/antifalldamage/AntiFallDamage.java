package xyz.nucker.antifalldamage;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.nucker.antifalldamage.Events.DeveloperVerification;
import xyz.nucker.antifalldamage.Events.FallDamage;

public final class AntiFallDamage extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        log("AntiFallDamage is enabling");
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new FallDamage(), this);
        getCommand("antifalldamage").setExecutor(new AntiFallDamage());
        getServer().getPluginManager().registerEvents(new DeveloperVerification(), this);
        log("AntiFallDamage is enabled");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        log("AntiFallDamage is disabled");
    }





    public static String msg(String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }
    public static void log(String string) {
        Bukkit.getLogger().info(ChatColor.translateAlternateColorCodes('&', string));
    }
}
