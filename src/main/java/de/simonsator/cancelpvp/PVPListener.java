package de.simonsator.cancelpvp;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * The actually PVP canceller Class. If you want to implement the PVP Canceller
 * into your plugin you just need this class. Just create a new instance of this
 * class(you do not even need to save the object). This class is all you need.
 * For more informations see the documentation of the main class.
 * 
 * @author Simonsator
 * @version 14.12.2015
 */
public class PVPListener implements Listener {
	/**
	 * Initials the PVP Canceller, by regestring the Event.
	 * 
	 * @author Simonsator
	 * @version 14.12.2015
	 * @param pPlugin
	 *            The plugin
	 */
	public PVPListener(JavaPlugin pPlugin) {
		pPlugin.getServer().getPluginManager().registerEvents(this, pPlugin);
	}

	/**
	 * The actually PVP canceller.
	 * 
	 * @author Simonsator
	 * @version 14.12.2015
	 * @param pEvent
	 *            The PVP Event.
	 */
	@EventHandler(priority = EventPriority.LOWEST)
	public void onEntityDamageByEntityEvent(EntityDamageByEntityEvent pEvent) {
		pEvent.setCancelled(true);
	}
}
