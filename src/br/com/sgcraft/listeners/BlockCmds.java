package br.com.sgcraft.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class BlockCmds implements Listener {
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerCommandPreprocess(final PlayerCommandPreprocessEvent e) {
        final Player p = e.getPlayer();
        if ((e.getMessage().equalsIgnoreCase("/plugins") || e.getMessage().equalsIgnoreCase("/pl")) && !e.getPlayer().hasPermission("sgcraft.cmdbypass")) {
            e.setCancelled(true);
            p.sendMessage("§cChame SARDINHA#1021 no Discord para ter essa informação!");
        }
        if ((e.getMessage().equalsIgnoreCase("/help") || e.getMessage().equalsIgnoreCase("/?")) && !e.getPlayer().hasPermission("sgcraft.cmdbypass")) {
            e.setCancelled(true);
        }
        if (e.getMessage().equalsIgnoreCase("/version") && !e.getPlayer().hasPermission("sgcraft.cmdbypass")) {
            e.setCancelled(true);
        }
        if (e.getMessage().equalsIgnoreCase("/nuke") && !e.getPlayer().hasPermission("sgcraft.cmdbypass")) {
            e.setCancelled(true);
        }
        if (e.getMessage().equalsIgnoreCase("/bukkit:?") && !e.getPlayer().hasPermission("sgcraft.cmdbypass")) {
            e.setCancelled(true);
        }
        if (e.getMessage().equalsIgnoreCase("/?") && !e.getPlayer().hasPermission("sgcraft.cmdbypass")) {
            e.setCancelled(true);
        }
        if (e.getMessage().equalsIgnoreCase("/ver") && !e.getPlayer().hasPermission("sgcraft.cmdbypass")) {
            e.setCancelled(true);
        }
        if (e.getMessage().equalsIgnoreCase("/pex") && !e.getPlayer().hasPermission("sgcraft.cmdbypass")) {
            e.setCancelled(true);
        }
        if (e.getMessage().equalsIgnoreCase("/about") && !e.getPlayer().hasPermission("sgcraft.cmdbypass")) {
            e.setCancelled(true);
        }
        if (e.getMessage().equalsIgnoreCase("/castelo") && !e.getPlayer().hasPermission("sgcraft.cmdbypass")) {
            e.setCancelled(true);
            p.sendMessage("§cDesculpe, nesse servidor não temos Castelo!");
        }
        if (e.getMessage().equalsIgnoreCase("/criativo")) {
            e.getPlayer().chat("/warp criativo");
            e.setCancelled(true);
            return;
        }
        if (e.getMessage().equalsIgnoreCase("/terrenos")) {
            e.getPlayer().chat("/warp criativo");
            e.setCancelled(true);
            return;
        }
        if (e.getMessage().equalsIgnoreCase("/construir")) {
            e.getPlayer().chat("/warp criativo");
            e.setCancelled(true);
            return;
        }
        if (e.getMessage().equalsIgnoreCase("/cidade")) {
            e.getPlayer().chat("/warp criativo");
            e.setCancelled(true);
            return;
        }
        if (e.getMessage().equalsIgnoreCase("/fim")) {
            e.getPlayer().chat("/enderchest");
            e.setCancelled(true);
            return;
        }
        if (e.getMessage().equalsIgnoreCase("/mutar")) {
            e.getPlayer().chat("/litebans:mute");
            e.setCancelled(true);
            return;
        }
        if (e.getMessage().equalsIgnoreCase("/desmutar")) {
            e.getPlayer().chat("/litebans:unmute");
            e.setCancelled(true);
            return;
        }
}
}
