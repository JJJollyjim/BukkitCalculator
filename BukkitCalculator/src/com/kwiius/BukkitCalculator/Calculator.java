package com.kwiius.BukkitCalculator;

import java.util.*;

public class Calculator {
	public static String Calculate(String calculation) {
		getTokenArray(calculation);
		return "";
	}
	
	public static CalculationObject[] getTokenArray(String calculation) {
		Scanner s = new Scanner(calculation);
		String token;
		List<String> tokens = new ArrayList<String>();
		while (null != (token = s.findInLine("\\d+|[+-/%^*()]")))
		    tokens.add(token);
		s.close();
		CalculationObject[] result = new CalculationObject[tokens.size()];
		return null;
	}
	
	/*private static CalculationObject[] shuntingYardAlgorithm(String calculation) {
		
	}*/
}
