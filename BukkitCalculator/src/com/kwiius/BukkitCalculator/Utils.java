package com.kwiius.BukkitCalculator;

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
}
