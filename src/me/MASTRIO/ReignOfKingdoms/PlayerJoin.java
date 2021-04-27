package me.MASTRIO.ReignOfKingdoms;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {

  // Event Handler for player join
  @EventHandler
  public void onPlayerJoin(PlayerJoinEvent event) {

    // Welcome Player Message
    event.getPlayer().sendMessage(ChatColor.AQUA + "Welcome " + event.getPlayer().getName() + " back to the " + ChatColor.GOLD + ChatColor.BOLD + "Reign Of Kingdoms");

    // Player in kingdom?
    Kingdoms.inKingdom.put(event.getPlayer().getUniqueId(), false);
    Kingdoms.ownsKingdom.put(event.getPlayer().getUniqueId(), false);



  }

}
