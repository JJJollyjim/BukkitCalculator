package com.kwiius.BukkitCalculator;

public class CalculationParenthesis {
	public boolean leftParenthesis;
	public CalculationParenthesis(boolean left) {
		leftParenthesis = left;
	}
	
	@Override
	public String toString() {
		return leftParenthesis ? "(" : ")";
	}
}
