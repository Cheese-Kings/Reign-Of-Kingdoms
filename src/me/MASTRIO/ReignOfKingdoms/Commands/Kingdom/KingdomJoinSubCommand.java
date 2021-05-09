package me.MASTRIO.ReignOfKingdoms.Commands.Kingdom;

import me.MASTRIO.ReignOfKingdoms.Config;
import me.MASTRIO.ReignOfKingdoms.Kingdoms;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class KingdomJoinSubCommand {

  public static void help(Player player) {

    player.sendMessage( ChatColor.YELLOW +"> join/jn (Joins an existing kingdom)");

  }

  public static void join(String kingdomName, Player player) {

    try {

      if (Kingdoms.kingdomList.get(kingdomName).equalsIgnoreCase(kingdomName)) {

        if (Kingdoms.kingdoms.get(player.getUniqueId()) != null) {

          Kingdoms.kingdoms.put(player.getUniqueId(), kingdomName);
          Kingdoms.balance.put(kingdomName, Config.startingBalance);

        }

      }

    } catch (Exception e) {

      player.sendMessage(ChatColor.RED + "" + ChatColor.ITALIC + "Cannot join kingdom, it either doesn't exist or your bad at spelling");

    }

  }

}
