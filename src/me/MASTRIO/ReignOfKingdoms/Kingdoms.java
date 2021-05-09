package me.MASTRIO.ReignOfKingdoms;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.entity.Player;
import java.util.HashMap;
import java.util.UUID;

public class Kingdoms {

  // Variables
  public static HashMap<UUID, String> kingdoms = new HashMap<>();
  public static HashMap<String, String> balance = new HashMap<>();
  public static HashMap<String, Location> bellLocations = new HashMap<>();
  public static HashMap<String, String> kingdomList = new HashMap<>();
  public static HashMap<String, Biome> kingdomBiomes = new HashMap<>();

  // Get the users kingdom balance
  public static String getUserBalance(Player player) {

    return Kingdoms.balance.get(Kingdoms.kingdoms.get(player.getUniqueId()));

  }

}
