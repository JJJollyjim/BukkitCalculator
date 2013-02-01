package com.kwiius.BukkitCalculator;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class BukkitCalculator extends JavaPlugin {
	public static Logger log;

	@Override
	public void onEnable() {
		log = getLogger();
	}

	@Override
	public void onDisable() { }

	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		if (cmd.getName().equals("c")) {
			if (args.length != 0) {
				String joined = Utils.implode(args);
				
				//Calculate!
				return tryCalc(joined, sender);
			} else {
				return false;
			}
		} else if(cmd.getName().equals("s")) {
			String calc;
			if(args.length == 1) {
				calc = args[0]+"*64";
				tryCalc(calc, sender);
			} else if(args.length == 2) {
				calc = args[0]+"*64+"+args[1];
				tryCalc(calc, sender);
			} else if(args.length == 3) {
				calc = args[0]+"*"+args[1]+"+"+args[2];
				tryCalc(calc, sender);
			} else {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}
	
	boolean tryCalc(String input, CommandSender sender) {
		try {
			String output = Calculator.calculate(input);
			if (output == null) {
				return false;
			} else {
				sender.sendMessage(ChatColor.YELLOW + output);
			}
		} catch (NumberFormatException e) {
			sender.sendMessage(ChatColor.RED + "Error: "
					+ e.getMessage());
			return false;
		} catch (Exception e) {
			sender.sendMessage(ChatColor.RED + "Error: "
					+ e.getMessage());
			return false;
		}
		return true;
	}
}