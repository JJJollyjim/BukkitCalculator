package com.kwiius.BukkitCalculator.Calculation;

public class CalculationNumber {
	public int number;
	public CalculationNumber(int n) {
		number = n;
	}
	
	@Override
	public String toString() {
		return String.valueOf(number);
	}
}
