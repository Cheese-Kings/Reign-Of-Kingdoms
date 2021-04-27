package me.MASTRIO.ReignOfKingdoms.Commands.Kingdom;

import me.MASTRIO.ReignOfKingdoms.Kingdoms;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class KingdomCreateSubCommand {

  static void help(Player player) {

    player.sendMessage( ChatColor.YELLOW +"> create/crt (Creates a new kingdom)");

  }

  static boolean create(String[] args, Player player) {

    if (args[1] != null) {

      if (Kingdoms.kingdoms.get(player.getUniqueId()) != null) {

        player.sendMessage(ChatColor.GREEN + "Created new kingdom: " + ChatColor.LIGHT_PURPLE + args[1]);
        Kingdoms.kingdoms.put(player.getUniqueId(), args[1]);
        Kingdoms.balance.put(args[1], "0");
        Kingdoms.ownsKingdom.put(player.getUniqueId(), true);
        return true;

      }

    } else {

      player.sendMessage(ChatColor.RED + "" + ChatColor.ITALIC + "Cannot create kingdom, you need to specify a kingdom name when running the command");
      return true;

    }

    return true;

  }

}
