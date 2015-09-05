package me.v1ghost.MiniGame1.utils;

import static org.bukkit.ChatColor.*;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class ChatUtilities {

	public static void broadcast(String msg) {
		for (Player player : Bukkit.getOnlinePlayers())
			player.sendMessage(starter() + msg);

	}

	private static String starter() {
		return DARK_GRAY + "[" + RED + "Main" + DARK_GRAY + "] " + WHITE;

	}
}
