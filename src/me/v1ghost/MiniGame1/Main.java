package me.v1ghost.MiniGame1;

import org.bukkit.plugin.java.JavaPlugin;

import me.v1ghost.MiniGame1.threads.StartCountdown;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		new Thread(new StartCountdown()).start();
		
	}
	
	public static void start() {

	}
	
	public static void stop() {
		
	}
}