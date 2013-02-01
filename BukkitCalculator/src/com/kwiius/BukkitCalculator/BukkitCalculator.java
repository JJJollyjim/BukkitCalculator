package com.kwiius.BukkitCalculator;


import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;


public class BukkitCalculator extends JavaPlugin {
	@Override
	public void onEnable() {
		Utils.log = getLogger();
		getServer().getPluginManager().registerEvents(new ChatHandler(), this);
	}

	@Override
	public void onDisable() { }

	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		if (cmd.getName().equals("c")) {
			if (args.length != 0) {
				String joined = Utils.implode(args);
				return Utils.tryCalc(joined, sender);
			} else {
				return false;
			}
		} else if(cmd.getName().equals("s")) {
			String calc;
			if(args.length == 1) {
				calc = args[0]+"*64";
				Utils.tryCalc(calc, sender);
			} else if(args.length == 2) {
				calc = args[0]+"*64+"+args[1];
				Utils.tryCalc(calc, sender);
			} else if(args.length == 3) {
				calc = args[0]+"*"+args[1]+"+"+args[2];
				Utils.tryCalc(calc, sender);
			} else {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}
}