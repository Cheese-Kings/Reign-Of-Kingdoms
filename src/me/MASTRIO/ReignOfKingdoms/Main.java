package me.MASTRIO.ReignOfKingdoms;

import me.MASTRIO.ReignOfKingdoms.Commands.AmogusCommand;
import me.MASTRIO.ReignOfKingdoms.Commands.KingdomCommand;
import me.MASTRIO.ReignOfKingdoms.Commands.DebCommand;
import me.MASTRIO.ReignOfKingdoms.Events.PlayerJoin;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

// Epic Main Class
public class Main extends JavaPlugin {

  // Variables
  public static String consoleCommand = "The console can't run this command silly";
  public static String pluginVersion = "v0.0.1";
  public FileConfiguration config = this.getConfig();

  // Runs on plugin/server startup
  @Override
  public void onEnable() {

    // Fancy Console thingy
    System.out.println(ChatColor.GOLD + "===~~-------------------------------------------------------------------------------------~~===");
    System.out.println(ChatColor.LIGHT_PURPLE + "______     _               _____  __   _   ___                 _                     ");
    System.out.println(ChatColor.LIGHT_PURPLE + "| ___ |   (_)             |  _  |/ _| | | / (_)               | |                    ");
    System.out.println(ChatColor.LIGHT_PURPLE + "| |_/ /___ _  __ _ _ __   | | | | |_  | |/ / _ _ __   __ _  __| | ___  _ __ ___  ___ ");
    System.out.println(ChatColor.LIGHT_PURPLE + "|    // _ | |/ _` | '_ |  | | | |  _| |    || | '_ | / _` |/ _` |/ _ || '_ ` _ |/ __|");
    System.out.println(ChatColor.LIGHT_PURPLE + "| || |  __/ | (_| | | | | | |_/ / |   | ||  | | | | | (_| | (_| | (_) | | | | | |__ |");
    System.out.println(ChatColor.LIGHT_PURPLE + "|_| |_|___|_||__, |_| |_|  |___/|_|   |_| |_/_|_| |_||__, ||__,_||___/|_| |_| |_|___/    " + ChatColor.BLUE + pluginVersion);
    System.out.println(ChatColor.LIGHT_PURPLE + "              __/ |                                   __/ |                          ");
    System.out.println(ChatColor.LIGHT_PURPLE + "             |___/                                   |___/                           ");

    // Config
    config.addDefault("doJoinMessage", true);
    config.addDefault("startingBalance", 50);
    config.addDefault("doMemberLimit", true);
    config.addDefault("memberLimit", 10);
    config.options().copyDefaults(true);
    saveConfig();

    // Register Events
    getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
    System.out.println(ChatColor.GREEN + "Loaded Events");

    // Register Commands
    this.getCommand("kingdom").setExecutor(new KingdomCommand());
    this.getCommand("deb").setExecutor(new DebCommand());
    this.getCommand("amogus").setExecutor(new AmogusCommand());
    System.out.println(ChatColor.YELLOW + "Loaded Commands");

    // More Config stuff
    Config.doJoinMessage = config.getBoolean("doJoinMessage");
    Config.startingBalance = String.valueOf(config.getInt("startingBalance"));
    Config.doMemberLimit = config.getBoolean("doMemberLimit");
    Config.memberLimit = config.getInt("memberLimit");
    System.out.println(ChatColor.AQUA + "Loaded Config");

    System.out.println(ChatColor.GOLD + "===~~-------------------------------------------------------------------------------------~~===");
  }

  // Runs of plugin/server stop
  @Override
  public void onDisable() {

  }

}
