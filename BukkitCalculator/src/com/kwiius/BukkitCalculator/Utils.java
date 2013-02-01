package com.kwiius.BukkitCalculator;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.kwiius.BukkitCalculator.Calculation.Calculator;

public class Utils {
	public static String implode(String[] s, String glue) {
		int k = s.length;
		if (k == 0)
			return null;
		StringBuilder out = new StringBuilder();
		out.append(s[0]);
		for (int x = 1; x < k; ++x)
			out.append(glue).append(s[x]);
		return out.toString();
	}

	public static String implode(String[] s) {
		int k = s.length;
		if (k == 0)
			return null;
		StringBuilder out = new StringBuilder();
		out.append(s[0]);
		for (int x = 1; x < k; ++x)
			out.append(s[x]);
		return out.toString();
	}

	public static Integer parseInt(String data) {
		Integer val = null;
		try {
			val = Integer.parseInt(data);
		} catch (NumberFormatException nfe) {
		}
		return val;
	}

	public static Integer parseInt(String data, int defaultInt) {
		Integer val = defaultInt;
		try {
			val = Integer.parseInt(data);
		} catch (NumberFormatException nfe) {
		}
		return val;
	}

	public static Logger log;

	static boolean tryCalc(String input, CommandSender sender) {
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

	static String tryCalcR(String input) {
		try {
			return Calculator.calculate(input);
		} catch (NumberFormatException e) {
			return null;
		} catch (Exception e) {
			return null;
		}
	}
}
