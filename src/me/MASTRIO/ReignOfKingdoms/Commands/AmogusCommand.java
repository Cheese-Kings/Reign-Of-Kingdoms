package me.MASTRIO.ReignOfKingdoms.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class AmogusCommand implements CommandExecutor {

  // Run Command
  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

    sender.sendMessage("Amogus sus imposter sus dababy sus imposter amogus among gus among us mogus amogus amongus");

    return true;

  }

}
