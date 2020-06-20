package xyz.nucker.antifalldamage.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.plugin.Plugin;
import xyz.nucker.antifalldamage.AntiFallDamage;

import static xyz.nucker.antifalldamage.AntiFallDamage.log;
import static xyz.nucker.antifalldamage.AntiFallDamage.msg;

public class FallDamage implements Listener {

    Plugin plugin = AntiFallDamage.getPlugin(AntiFallDamage.class);

    @EventHandler
    public void onFallDamage(EntityDamageEvent e){
        if(e.getEntity() instanceof Player) {
            Player p = (Player) e.getEntity();
            if(e.getCause().equals(EntityDamageEvent.DamageCause.FALL)) {
                if (p.hasPermission(plugin.getConfig().getString("permission"))) {
                    e.setCancelled(true);
                    p.sendMessage(msg(plugin.getConfig().getString("falldamage-message")));
                }else {
                    p.sendMessage(msg(plugin.getConfig().getString("permission-message")));
                }
            }
        }
    }

}
