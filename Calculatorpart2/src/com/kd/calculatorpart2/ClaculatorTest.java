package com.kd.calculatorpart2;

public class ClaculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1= new Calculator();
		c1.performOperation(10.5);

		c1.performOperation("+");

		c1.performOperation(5.2);

		c1.performOperation("*");

		c1.performOperation(10);

		c1.performOperation("=");

		c1.getResults();
		

	}

}
