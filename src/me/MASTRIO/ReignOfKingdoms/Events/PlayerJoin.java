package me.MASTRIO.ReignOfKingdoms.Events;

import me.MASTRIO.ReignOfKingdoms.Config;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {

  public static PlayerJoinEvent EVENT;

  // Event Handler for player join
  @EventHandler
  public void onPlayerJoin(PlayerJoinEvent event) {

    EVENT = event;

    // Welcome Player Message
    if (Config.doJoinMessage) {

      event.getPlayer().sendMessage(ChatColor.AQUA + "Welcome back " + PlayerJoin.EVENT.getPlayer().getName() + " to the " + ChatColor.GOLD + ChatColor.BOLD + "Reign Of Kingdoms");

    }


  }

}
