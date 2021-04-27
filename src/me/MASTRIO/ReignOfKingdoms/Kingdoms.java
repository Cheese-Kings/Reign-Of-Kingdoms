package me.MASTRIO.ReignOfKingdoms;

import org.bukkit.entity.Player;
import java.util.HashMap;
import java.util.UUID;

public class Kingdoms {

  // Variables
  public static HashMap<UUID, Boolean> inKingdom = new HashMap<>();
  public static HashMap<UUID, Boolean> ownsKingdom = new HashMap<>();
  public static HashMap<UUID, String> kingdoms = new HashMap<>();
  public static HashMap<String, String> balance = new HashMap<>();

  // Get the users kingdom balance
  public static String getUserBalance(Player player) {

    return Kingdoms.balance.get(Kingdoms.kingdoms.get(player.getUniqueId()));

  }

}
