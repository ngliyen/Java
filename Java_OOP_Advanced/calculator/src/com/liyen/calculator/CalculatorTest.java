package com.liyen.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		
		calc.setOperandOne(10.5);
		calc.setOperation('+');
		calc.setOperandTwo(5.2);
		calc.performOperation();
		System.out.println(calc.getResults());
		
		Calculator calc2 = new Calculator(10.5,'-',5.2);
		
		calc2.performOperation();
		System.out.println(calc2.getResults());
		
		Calculator calc3 = new Calculator(10.5,'/',5.2);
		calc3.performOperation();
		System.out.println(calc3.getResults());
		

	}

}
