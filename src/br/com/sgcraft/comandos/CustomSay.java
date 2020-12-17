package br.com.sgcraft.comandos;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class CustomSay implements CommandExecutor, Listener {

	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
		if (label.equalsIgnoreCase("me")) {
			if (!sender.hasPermission("sgcraft.me") && !sender.isOp()) {
				sender.sendMessage("§cVocê não pode usar esse comando!");
				return true;
			}
			if (args.length == 0) {
				sender.sendMessage("§cUtilize: /me <mensagem>");
				return true;
			}
				String msg = "§f[§6" + sender.getName() + "§f] §7";
				for (int i = 0; i < args.length; ++i) {
					msg = String.valueOf(msg) + args[i];
					msg = String.valueOf(msg) + " ";
				}
				for(Player p : Bukkit.getOnlinePlayers()){
					p.playSound(p.getLocation(), Sound.FIREWORK_LAUNCH, 1, 0);
					}
				msg = msg.replaceAll("&([a-zA-Z0-9])", "§$1");
				Bukkit.broadcastMessage(msg);
			}
		else if (label.equalsIgnoreCase("say")) {
			if (!sender.hasPermission("sgcraft.say") && !sender.isOp()) {
				sender.sendMessage("§cVocê não pode usar esse comando!");
				return true;
			}
			if (args.length == 0) {
				sender.sendMessage("§cUtilize: /say <mensagem>");
				return true;
			}
			String msg = "§b[Server] §d";
			for (int i = 0; i < args.length; ++i) {
				msg = String.valueOf(msg) + args[i];
				msg = String.valueOf(msg) + " ";
			}
			for(Player p : Bukkit.getOnlinePlayers()){
				p.playSound(p.getLocation(), Sound.FIREWORK_LAUNCH, 1, 0);
				}
			msg = msg.replaceAll("&([a-zA-Z0-9])", "§$1");
			Bukkit.broadcastMessage(msg);
		}
		return true;
	}

}
