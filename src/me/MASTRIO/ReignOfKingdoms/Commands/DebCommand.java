package me.MASTRIO.ReignOfKingdoms.Commands;

import me.MASTRIO.ReignOfKingdoms.Commands.Kingdom.KingdomCreateSubCommand;
import me.MASTRIO.ReignOfKingdoms.Config;
import me.MASTRIO.ReignOfKingdoms.Kingdoms;
import me.MASTRIO.ReignOfKingdoms.Main;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DebCommand implements CommandExecutor {

  // Run Command
  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

    if (sender instanceof Player) {

      Player player = (Player) sender;
      World world = player.getWorld();

      if (args[0].equals("balance")) {

        Kingdoms.balance.put(Kingdoms.kingdoms.get(player.getUniqueId()), args[1]);
        player.sendMessage(ChatColor.RED + "Set your balance to " + args[1]);

      }

      if (args[0].equals("reset")) {

        Kingdoms.kingdoms.clear();
        Kingdoms.balance.clear();

      }

      if (args[0].equalsIgnoreCase("getBiome")) {

        player.sendMessage(ChatColor.GOLD + "Your biome is: " + ChatColor.LIGHT_PURPLE + world.getBiome((int) player.getLocation().getX(), (int) player.getLocation().getY()));

      }

    } else {

      sender.sendMessage(Main.consoleCommand);

    }

    return true;

  }

}
