package me.MASTRIO.ReignOfKingdoms;

import me.MASTRIO.ReignOfKingdoms.Commands.KingdomCommand;
import me.MASTRIO.ReignOfKingdoms.Commands.DebCommand;
import me.MASTRIO.ReignOfKingdoms.Commands.PoopCommand;
import me.MASTRIO.ReignOfKingdoms.Events.PlayerJoin;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.Objects;

// Epic Main Class
public class Main extends JavaPlugin {

  // Variables
  public static String consoleCommand = "The console can't run this command silly";
  public static String pluginVersion = "v0.1.0";
  public FileConfiguration config = this.getConfig();

  // Runs on plugin/server startup
  @Override
  public void onEnable() {

    // Fancy Console thingy
    System.out.println("===~~---------------------------------------------------------------------------~~===\n______     _               _____  __   _   ___                 _                     \n| ___ |   (_)             |  _  |/ _| | | / (_)               | |                    \n| |_/ /___ _  __ _ _ __   | | | | |_  | |/ / _ _ __   __ _  __| | ___  _ __ ___  ___ \n|    // _ | |/ _` | '_ |  | | | |  _| |    || | '_ | / _` |/ _` |/ _ || '_ ` _ |/ __|\n| || |  __/ | (_| | | | | | |_/ / |   | ||  | | | | | (_| | (_| | (_) | | | | | |__ |\n|_| |_|___|_||__, |_| |_|  |___/|_|   |_| |_/_|_| |_||__, ||__,_||___/|_| |_| |_|___/    " + pluginVersion + "\n              __/ |                                   __/ |                          \n             |___/                                   |___/                           \n===~~---------------------------------------------------------------------------~~===");

    // Config
    config.addDefault("doJoinMessage", true);
    config.options().copyDefaults(true);
    saveConfig();

    // Register Events
    getServer().getPluginManager().registerEvents(new PlayerJoin(), this);

    // Register Commands
    Objects.requireNonNull(this.getCommand("kingdom")).setExecutor(new KingdomCommand());
    Objects.requireNonNull(this.getCommand("deb")).setExecutor(new DebCommand());
    Objects.requireNonNull(this.getCommand("poop")).setExecutor(new PoopCommand());

    // More Config stuff
    Config.doJoinMessage = config.getBoolean("doJoinMessage");
    System.out.println("Loaded Reign Of Kingdoms Config");

  }

  // Runs of plugin/server stop
  @Override
  public void onDisable() {

  }

}
