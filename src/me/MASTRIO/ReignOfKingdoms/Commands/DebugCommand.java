package me.MASTRIO.ReignOfKingdoms.Commands;

import me.MASTRIO.ReignOfKingdoms.Kingdoms;
import me.MASTRIO.ReignOfKingdoms.PlayerJoin;
import me.MASTRIO.ReignOfKingdoms.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DebugCommand implements CommandExecutor {

  // Run Command
  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

    if (sender instanceof Player) {

      Player player = (Player) sender;

      if (args[0].equals("balance")) {

        Kingdoms.balance.put(Kingdoms.kingdoms.get(player.getUniqueId()), args[2]);
        player.sendMessage(ChatColor.RED + "Set your balance to " + args[2]);

      }

    } else {

      sender.sendMessage(Main.consoleCommand);

    }

    return true;

  }

}
