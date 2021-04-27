package me.MASTRIO.ReignOfKingdoms.Commands.Kingdom;

import me.MASTRIO.ReignOfKingdoms.Kingdoms;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class KingdomBalanceSubCommand {

  static void help(Player player) {

    player.sendMessage( ChatColor.YELLOW +"> balance/bal (Checks your Kingdoms Balance)");

  }

  static boolean balance(Player player) {

    player.sendMessage(ChatColor.GREEN + "Your balance is: " + ChatColor.YELLOW + Kingdoms.getUserBalance(player));
    return true;

  }

}
