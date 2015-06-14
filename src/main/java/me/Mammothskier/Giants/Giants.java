package me.Mammothskier.Giants;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import me.Mammothskier.Giants.entity.Entities;
import me.Mammothskier.Giants.files.FileHandler;
import me.Mammothskier.Giants.files.Files;
import me.Mammothskier.Giants.util.Metrics;
import me.Mammothskier.Giants.util.NMSUtils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Giants extends JavaPlugin {
	private static FileHandler fileHandler;
	public final Logger log = Logger.getLogger("Minecraft");
	
	@Override
	public void onEnable() {
		
		String version = NMSUtils.getBukkitVersion();
		if ("v1_7_R3".equals(version)) {
			Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Giants] " + "Minecraft server version v1_7_R3 found. Enabling Giant Zombies.");
			Entities.GiantZombie = true;
			me.Mammothskier.Giants.entity.nms.v1_7_R3.CustomEntityType.registerEntities();
		} else if ("v1_7_R4".equals(version)) {
			Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Giants] " + "Minecraft server version v1_7_R4 found. Enabling Giant Zombies.");
			Entities.GiantZombie = true;
			me.Mammothskier.Giants.entity.nms.v1_7_R4.CustomEntityType.registerEntities();
		} else if ("v1_8_R1".equals(version)) {
			Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Giants] " + "Minecraft server version v1_8_R1 found. Enabling Giant Zombies.");
			Entities.GiantZombie = true;
			me.Mammothskier.Giants.entity.nms.v1_8_R1.CustomEntityType.registerEntities();
		} else if ("v1_8_R2".equals(version)) {
			Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Giants] " + "Minecraft server version v1_8_R2 found. Enabling Giant Zombies.");
			Entities.GiantZombie = true;
			me.Mammothskier.Giants.entity.nms.v1_8_R2.CustomEntityType.registerEntities();
		} else {
			Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Giants] " + ChatColor.RED + "Minecraft server version " + version + "does not support Giant Zombies.Disabling Giant Zombies");
			Entities.GiantZombie = false;
		}
		
		PluginDescriptionFile pdf = this.getDescription();
		Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Giants] " + ChatColor.GREEN + pdf.getName() + " Version " + pdf.getVersion() + " Has Been Enabled!");
		
		try {
		    Metrics metrics = new Metrics(this);
		    metrics.start();
		} catch (IOException e) {
		    // Failed to submit the stats :-(
		}
		
		this.getCommand("giants").setExecutor(new Commands(this));
		new Entities(this);
		fileHandler = new FileHandler(this);
		updateEntities();
	}
	
	@Override
	public void onDisable() {
		String version = NMSUtils.getBukkitVersion();
		if ("v1_7_R3".equals(version)) {
			me.Mammothskier.Giants.entity.nms.v1_7_R3.CustomEntityType.unregisterEntities();
		} else if ("v1_7_R4".equals(version)) {
			me.Mammothskier.Giants.entity.nms.v1_7_R4.CustomEntityType.unregisterEntities();
		} else if ("v1_8_R1".equals(version)) {
			me.Mammothskier.Giants.entity.nms.v1_8_R1.CustomEntityType.unregisterEntities();
		} else if ("v1_8_R2".equals(version)) {
			me.Mammothskier.Giants.entity.nms.v1_8_R2.CustomEntityType.unregisterEntities();
		}
	}

	public static String getProperty(Files file, String path) {
		return fileHandler.getProperty(file, path);
	}
	
	public static List<String> getPropertyList(Files file, String path) {
		return fileHandler.getPropertyList(file, path);
	}

	public static FileHandler getFileHandler() {
		return fileHandler;
	}
	
	public static void updateEntities() {
		if (Entities.GiantZombie == true && getProperty(Files.CONFIG, "Giants Configuration.Entities.Giant Zombie").equalsIgnoreCase("false")) 
			Entities.GiantZombie = false;
		if (getProperty(Files.CONFIG, "Giants Configuration.Entities.Giant Slime").equalsIgnoreCase("true")) {
			Entities.GiantSlime = true;
		} else {
			Entities.GiantSlime = false;
		}
		if (getProperty(Files.CONFIG, "Giants Configuration.Entities.Giant Lava Slime").equalsIgnoreCase("true")) {
			Entities.GiantLavaSlime = true;
		} else {
			Entities.GiantLavaSlime = false;
		}
		if (getProperty(Files.CONFIG, "Giants Configuration.Entities.Giant Jockey.Warning.Enabled").equalsIgnoreCase("true")) {
			Entities.GiantLavaSlime = true;
		} else {
			Entities.GiantLavaSlime = false;
		}		
		
	}
}
