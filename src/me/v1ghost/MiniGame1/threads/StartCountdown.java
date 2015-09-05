package me.v1ghost.MiniGame1.threads;

import org.bukkit.Bukkit;

import me.v1ghost.MiniGame1.Main;
import me.v1ghost.MiniGame1.utils.ChatUtilities;

public class StartCountdown implements Runnable {

	private static int timeUntilStart;

	public void run() {
		timeUntilStart = 60;
			for(;timeUntilStart >= 0; timeUntilStart--) {
				if (timeUntilStart == 0) {
			        Main.start();
		          break;
			}
		
		        if (timeUntilStart % 10==0 || timeUntilStart < 10) {
		        	ChatUtilities.broadcast(timeUntilStart + " seconds intil game starts!");
		        }
		        
	            try {
	            	Thread.sleep(1000);
	            }catch(InterruptedException e) {
	            e.printStackTrace();
	            Bukkit.shutdown();
		        }
			}
		}
	}
