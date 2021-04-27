package me.MASTRIO.ReignOfKingdoms.Commands.Kingdom;

import me.MASTRIO.ReignOfKingdoms.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class KingdomCommand implements CommandExecutor {

  // Variables
  public static Player player;

  // Run Command
  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

    if (sender instanceof Player) {

      // Variables
      player = (Player) sender;

      // If no argument
      if (args[0] == null || args[0].equals("help")) {

        player.sendMessage(ChatColor.RED + "~~~~~~ Kingdom Command - Help ~~~~~~");
        player.sendMessage( ChatColor.YELLOW +"> help (Shows this list)");
        KingdomBalanceSubCommand.help(player);
        KingdomCreateSubCommand.help(player);
        player.sendMessage(ChatColor.RED + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

      }

      // Balance
      if (args[0].equals("balance") || args[0].equals("bal")) {

        KingdomBalanceSubCommand.balance(player);

      }

      // Create
      if (args[0].equals("create") || args[0].equals("crt")) {

        KingdomCreateSubCommand.create(args, player);

      }

    } else {

      sender.sendMessage(Main.consoleCommand);

    }

    return true;

  }

}
