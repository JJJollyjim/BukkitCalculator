package com.kwiius.BukkitCalculator;

public class CalculationOperator {
	public OperatorType type;
	public int precedence;
	public boolean leftAssociative = true;
	
	public CalculationOperator(OperatorType t) {
		setInstanceVars(t);
	}
	
	public CalculationOperator(char c) {
		switch (c) {
		case '+':
			setInstanceVars(OperatorType.PLUS);
			break;
		case '-':
			setInstanceVars(OperatorType.MINUS);
			break;
		case '*':
			setInstanceVars(OperatorType.MULTIPLY);
			break;
		case '/':
			setInstanceVars(OperatorType.DIVIDE);
			break;
		case '%':
			setInstanceVars(OperatorType.MODULO);
			break;
		case '^':
			setInstanceVars(OperatorType.POWER);
			break;
		}
	}
	
	private void setInstanceVars(OperatorType t) {
		this.type = t;
		switch (t.type) {
		case 1:
			// +
			this.precedence = 1;
			this.leftAssociative = true;
			break;
		case 2:
			// -
			this.precedence = 1;
			this.leftAssociative = true;
			break;
		case 3:
			// *
			this.precedence = 2;
			this.leftAssociative = true;
			break;
		case 4:
			// /
			this.precedence = 2;
			this.leftAssociative = true;
			break;
		case 5:
			// %
			this.precedence = 2;
			this.leftAssociative = true;
			break;
		case 6:
			// ^
			this.precedence = 3;
			this.leftAssociative = false;
			break;
		}
	}
	
	public enum OperatorType {
		PLUS(1), MINUS(2), MULTIPLY(3), DIVIDE(4), MODULO(5), POWER(6);
		
		int type;
		OperatorType(int type) {
			this.type = type;
		}
	}
}
