package com.liyen.calculator;

public class Calculator implements java.io.Serializable {
	private double operandOne;
	private char operation;
	private double operandTwo;
	private double results;
	
	public Calculator() {}
	
	public Calculator(double operandOne, char operation, double operandTwo) {
		this.operandOne = operandOne;
		this.operation = operation;
		this.operandTwo = operandTwo;
	}

	public double getOperandOne() {
		return operandOne;
	}

	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}

	public char getOperation() {
		return operation;
	}

	public void setOperation(char operation) {
		this.operation = operation;
	}

	public double getOperandTwo() {
		return operandTwo;
	}

	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}

	public double getResults() {
		return results;
	}

	public void setResults(double results) {
		this.results = results;
	}
	
	public void performOperation() {
		char ch = getOperation();
		if (ch == '+') {
			setResults(getOperandOne() + getOperandTwo());
		}
		else if (ch =='-') {
			setResults(getOperandOne() - getOperandTwo());
		}
		else {
			System.out.println("This is not a valid operation. Only '+' or '-' is allowed.");
		}
	}

}
