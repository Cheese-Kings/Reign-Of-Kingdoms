package me.MASTRIO.ReignOfKingdoms;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import java.util.HashMap;
import java.util.UUID;

public class PlayerJoin implements Listener {

  // Variables
  public static HashMap<UUID, Integer> balance = new HashMap<>();

  // Event Handler for player join
  @EventHandler
  public void onPlayerJoin(PlayerJoinEvent event) {

    // Welcome Player Message
    event.getPlayer().sendMessage(ChatColor.AQUA + "Welcome " + event.getPlayer().getName() + " back to " + ChatColor.GOLD + ChatColor.BOLD + "Reign Of Kingdoms");

    // Add player to balance HashMap
    balance.put(event.getPlayer().getUniqueId(), 0);

    // Player has kingdom?
    Kingdoms.hasKingdom.put(event.getPlayer().getUniqueId(), false);

  }

}
