package me.MASTRIO.ReignOfKingdoms.Commands.Kingdom;

import me.MASTRIO.ReignOfKingdoms.Config;
import me.MASTRIO.ReignOfKingdoms.Kingdoms;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class KingdomCreateSubCommand {

  public static void help(Player player) {

    player.sendMessage( ChatColor.YELLOW +"> create/crt (Creates a new kingdom)");

  }

  public static void create(String kingdomName, Player player) {

    try {

      if (!(Kingdoms.kingdoms.get(player.getUniqueId()) == null)) {

        player.sendMessage(net.md_5.bungee.api.ChatColor.GREEN + "Created new kingdom: " + net.md_5.bungee.api.ChatColor.LIGHT_PURPLE + kingdomName);
        player.getLocation().getBlock().setType(Material.BELL);

        Kingdoms.kingdoms.put(player.getUniqueId(), kingdomName);
        Kingdoms.balance.put(kingdomName, Config.startingBalance);

      }

    } catch (Exception e) {

      player.sendMessage(ChatColor.RED + "" + ChatColor.ITALIC + "Cannot create kingdom, you need to specify a kingdom name");

    }

  }

}
