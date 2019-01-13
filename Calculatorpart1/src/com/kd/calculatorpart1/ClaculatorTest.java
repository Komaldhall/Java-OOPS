package com.kd.calculatorpart1;

public class ClaculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1= new Calculator();
		
		c1.setOperandOne(10.5);

		c1.setOperation("+");

		c1.setOperandTwo(5.2);

		c1.performOperation();

		c1.getResults();

	}

}
