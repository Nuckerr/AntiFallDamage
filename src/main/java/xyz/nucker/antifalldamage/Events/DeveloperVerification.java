package xyz.nucker.antifalldamage.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import static xyz.nucker.antifalldamage.AntiFallDamage.msg;

public class DeveloperVerification implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        if(e.getPlayer().getUniqueId().equals("68f34c4f-d00c-40fb-858d-b5a876601072")) {
            e.getPlayer().sendMessage(" ");
            e.getPlayer().sendMessage(msg("&6This server uses Anti Fall Damage"));
            e.getPlayer().sendMessage(" ");
        }
    }

}
