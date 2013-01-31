package com.kwiius.BukkitCalculator;

public class CalculationOperator {
	public char operator;
	public int precedence;
	public boolean leftAssociative = true;
	
	public CalculationOperator(char c) {
		operator = c;
		
		switch (operator) {
		case '+':
			this.precedence = 1;
			this.leftAssociative = true;
			break;
		case '-':
			this.precedence = 1;
			this.leftAssociative = true;
			break;
		case '*':
			this.precedence = 2;
			this.leftAssociative = true;
			break;
		case '/':
			this.precedence = 2;
			this.leftAssociative = true;
			break;
		case '%':
			this.precedence = 2;
			this.leftAssociative = true;
			break;
		case '^':
			this.precedence = 3;
			this.leftAssociative = false;
			break;
		}
	}
	
	@Override
	public String toString() {
		return String.valueOf(operator);
	}
}
