package me.MASTRIO.ReignOfKingdoms;

import me.MASTRIO.ReignOfKingdoms.Commands.Kingdom.KingdomCommand;
import me.MASTRIO.ReignOfKingdoms.Commands.DebugCommand;
import me.MASTRIO.ReignOfKingdoms.Commands.PoopCommand;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

// Epic Main Class
public class Main extends JavaPlugin {

  // Variables
  public static String consoleCommand = "The console can't run this command silly";

  // Runs on plugin/server startup
  @Override
  public void onEnable() {

    // Events
    getServer().getPluginManager().registerEvents(new PlayerJoin(), this);

    // Commands
    Objects.requireNonNull(this.getCommand("kingdom")).setExecutor(new KingdomCommand());
    Objects.requireNonNull(this.getCommand("debug")).setExecutor(new DebugCommand());
    Objects.requireNonNull(this.getCommand("poop")).setExecutor(new PoopCommand());

  }

  // Runs of plugin/server stop
  @Override
  public void onDisable() {

  }

}
