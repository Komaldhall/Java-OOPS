package com.kd.calculatorpart1;

public class Calculator implements java.io.Serializable {
	private double operandone;
	
	private double operandtwo;
	private String operation;
	
	double result;
	public double getOperandOne() {
		return this.operandone;
	}

	public void setOperandOne(double operandone) {
		this.operandone = operandone;
	}

	public double getOperandTwo() {
		return this.operandtwo;
	}

	public void setOperandTwo(double operandtwo) {
		this.operandtwo = operandtwo;
	}
	
	public String getOperation() {
		return this.operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public Calculator() {
		this.operandone = 0;
		this.operandtwo = 0;
		this.operation = "";
	}

//	public Calculator(double operandone, double operandtwo) {
//		this.operandone = operandone;
//		this.operandtwo = operandtwo;
//		
//	}

	public void performOperation(){
		if (getOperation()=="+") {
			result=getOperandOne()+getOperandTwo();
		}
		else if (getOperation()=="-") {
			result=getOperandOne()-getOperandTwo();	
		}
		
	}
	
	public void getResults (){
		System.out.println("The result is "+result);
		
	}
	
}
