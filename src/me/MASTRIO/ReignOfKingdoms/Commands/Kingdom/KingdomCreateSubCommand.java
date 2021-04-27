package me.MASTRIO.ReignOfKingdoms.Commands.Kingdom;

import me.MASTRIO.ReignOfKingdoms.Kingdoms;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class KingdomCreateSubCommand {

  public static void help(Player player) {

    player.sendMessage( ChatColor.GREEN +"> create/crt (Creates a new kingdom)");

  }

  public static void create(String[] args, Player player) {

    try {

      if (!(Kingdoms.kingdoms.get(player.getUniqueId()) == null)) {

        player.sendMessage(ChatColor.GREEN + "Created new kingdom: " + ChatColor.LIGHT_PURPLE + args[1]);
        Kingdoms.kingdoms.put(player.getUniqueId(), args[1]);
        Kingdoms.balance.put(args[1], "0");
        Kingdoms.ownsKingdom.put(player.getUniqueId(), true);

      }

    } catch (Exception e) {

      player.sendMessage(ChatColor.RED + "" + ChatColor.ITALIC + "Cannot create kingdom, you need to specify a kingdom name");

    }

  }

}
