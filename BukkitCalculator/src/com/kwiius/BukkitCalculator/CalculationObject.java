package com.kwiius.BukkitCalculator;

public class CalculationObject {
	public CalculationOperator calculationOperator;
	public CalculationNumber number;
	public CalculationParenthesis parenthesis;
	public int calculationObjectType;
	
	public CalculationObject(CalculationOperator op) {
		calculationOperator = op;
		number = null;
		parenthesis = null;
		calculationObjectType = 1;
	}

	public CalculationObject(CalculationNumber num) {
		number = num;
		calculationOperator = null;
		parenthesis = null;
		calculationObjectType = 2;
	}

	public CalculationObject(CalculationParenthesis p) {
		parenthesis = p;
		calculationOperator = null;
		number = null;
		calculationObjectType = 3;
	}
	
	@Override
	public String toString() {
		switch (calculationObjectType) {
		case 1:
			return calculationOperator.toString();
		case 2:
			return number.toString();
		case 3:
			return parenthesis.toString();
		default:
			return "";
		}
	}
}
