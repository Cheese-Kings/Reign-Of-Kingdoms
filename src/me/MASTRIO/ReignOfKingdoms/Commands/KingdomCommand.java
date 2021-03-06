package me.MASTRIO.ReignOfKingdoms.Commands;

import me.MASTRIO.ReignOfKingdoms.Commands.Kingdom.KingdomBalanceSubCommand;
import me.MASTRIO.ReignOfKingdoms.Commands.Kingdom.KingdomCreateSubCommand;
import me.MASTRIO.ReignOfKingdoms.Commands.Kingdom.KingdomJoinSubCommand;
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

    try {

      if (sender instanceof Player) {

        // Variables
        player = (Player) sender;

        // If no argument
        if (args[0].equalsIgnoreCase("help")) {

          help();

        }

        // Balance
        if (args[0].equalsIgnoreCase("balance") || args[0].equalsIgnoreCase("bal")) {

          KingdomBalanceSubCommand.balance(player);

        }

        // Create
        if (args[0].equalsIgnoreCase("create") || args[0].equalsIgnoreCase("crt")) {

          KingdomCreateSubCommand.create(args[1], player);

        }

        if (args[0].equalsIgnoreCase("join") || args[0].equalsIgnoreCase("jn")) {

          KingdomJoinSubCommand.join(args[1], player);

        }

      } else {

        sender.sendMessage(Main.consoleCommand);

      }

    } catch (Exception e) {

      help();

    }

    return true;

  }

  static void help() {

    player.sendMessage(ChatColor.GOLD + "~~~~~~ Kingdom Command - Help ~~~~~~");
    player.sendMessage(ChatColor.YELLOW + "> help (Shows this list)");
    KingdomBalanceSubCommand.help(player);
    KingdomCreateSubCommand.help(player);
    KingdomJoinSubCommand.help(player);
    player.sendMessage(ChatColor.GOLD + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

  }

}
