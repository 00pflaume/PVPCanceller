package de.simonsator.cancelpvp;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * This plugin is made by Simonsator. You are allowed to modify the code and
 * implement it into your plugin and you are also allowed to publish the code and
 * the plugin(code can be found <a href="https://github.com/00pflaume/PVPCanceller">here </a>). If you want to integrate
 * the pvp canceller into your plugin you just need the class
 * "de.simonsator.cancelpvp.PVPListener". Please leave a note that it contains
 * parts of my code (not necessary but it would be nice). This plugin is thought
 * for people who are using one of my plugins of the Party and Friends GUI
 * series or for other plugins which need to have pvp cancelled lately, so they
 * can execute their listeners.
 * 
 * @author Simonsator
 * @version 14.12.2015
 */
public class Main extends JavaPlugin implements Listener {
	/**
	 * Initials the plugin.
	 * 
	 * @author Simonsator
	 * @version 14.12.2015
	 */
	@Override
	public void onEnable() {
		new PVPListener(this);
		System.out.println("PVP Cancler was successful activated.");
	}

	/**
	 * Disables the plugin.
	 * 
	 * @author Simonsator
	 * @version 14.12.2015
	 */
	@Override
	public void onDisable() {
		System.out.println("PVP Cancler was disabled.");
	}

}
