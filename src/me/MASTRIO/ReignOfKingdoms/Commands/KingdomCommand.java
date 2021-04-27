package me.MASTRIO.ReignOfKingdoms.Commands;

import me.MASTRIO.ReignOfKingdoms.Kingdoms;
import me.MASTRIO.ReignOfKingdoms.PlayerJoin;
import me.MASTRIO.ReignOfKingdoms.Main;
import org.bukkit.ChatColor;
import org.bukkit.World;
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

      // Balance
      if (args[0].equals("balance")) {

        player.sendMessage(ChatColor.GREEN + "Your balance is: " + ChatColor.YELLOW + PlayerJoin.balance.get(player.getUniqueId()));
        return true;

      }

      // Create
      if (args[0].equals("create")) {

        if (args[1] != null) {

          if (Kingdoms.kingdomName.get(player.getUniqueId()) != null) {

            player.sendMessage(ChatColor.GREEN + "Created new kingdom: " + ChatColor.LIGHT_PURPLE + args[1]);
            Kingdoms.kingdomName.put(player.getUniqueId(), args[1]);
            return true;

          }

        } else {

          player.sendMessage(ChatColor.RED + "" + ChatColor.ITALIC + "Cannot create kingdom, you need to specify a name for it when running the command");
          return true;

        }

      }

    } else {

      sender.sendMessage(Main.consoleCommand);

    }

    return true;

  }

}
