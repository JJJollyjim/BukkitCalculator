package com.kwiius.BukkitCalculator;

import java.util.logging.Logger;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class BukkitCalculator extends JavaPlugin {
	public static Logger log;

	//Test
	//Test2
	
	@Override
	public void onEnable() {
		log = getLogger();
		log.info("onEnable Called");
	}

	@Override
	public void onDisable() {
		log.info("onDisable Called");
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		if (cmd.getName().equals("c")) {
			if (args.length != 0) {
				String joined = Utils.implode(args);
				Calculator.Calculate(joined);
			} else {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}
}