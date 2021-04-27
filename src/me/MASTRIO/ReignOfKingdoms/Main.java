package me.MASTRIO.ReignOfKingdoms;

import me.MASTRIO.ReignOfKingdoms.Commands.KingdomCommand;
import me.MASTRIO.ReignOfKingdoms.Commands.DebugCommand;
import org.bukkit.plugin.java.JavaPlugin;

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
    this.getCommand("kingdom").setExecutor(new KingdomCommand());
    this.getCommand("debug").setExecutor(new DebugCommand());

  }

  // Runs of plugin/server stop
  @Override
  public void onDisable() {

  }

}
