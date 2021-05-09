package me.MASTRIO.ReignOfKingdoms.Commands.Kingdom;

import me.MASTRIO.ReignOfKingdoms.Config;
import me.MASTRIO.ReignOfKingdoms.Kingdoms;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;

public class KingdomCreateSubCommand {

  public static void help(Player player) {

    player.sendMessage( ChatColor.YELLOW +"> create/crt (Creates a new kingdom)");

  }

  public static void create(String kingdomName, Player player) {

    try {

      if (!(Kingdoms.kingdoms.get(player.getUniqueId()) == null)) {

        World world = player.getWorld();

        player.getLocation().getBlock().setType(Material.BELL);

        Kingdoms.bellLocations.put(kingdomName, player.getLocation());
        Kingdoms.kingdomList.put(kingdomName, kingdomName);
        Kingdoms.kingdoms.put(player.getUniqueId(), kingdomName);
        Kingdoms.balance.put(kingdomName, Config.startingBalance);
        Kingdoms.kingdomBiomes.put(kingdomName, world.getBiome((int) player.getLocation().getX(), (int) player.getLocation().getY()));

        player.sendMessage(ChatColor.GREEN + "Created new kingdom: " + ChatColor.LIGHT_PURPLE + kingdomName + ChatColor.GREEN + " in the biome " + ChatColor.LIGHT_PURPLE + Kingdoms.kingdomBiomes.get(kingdomName));

      }

    } catch (Exception e) {

      player.sendMessage(ChatColor.RED + "" + ChatColor.ITALIC + "Cannot create kingdom, you need to specify a kingdom name");

    }

  }

}
