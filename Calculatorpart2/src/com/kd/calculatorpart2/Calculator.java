package com.kd.calculatorpart2;

public class Calculator implements java.io.Serializable {
	
	
	private String cal="";
	


	public void performOperation(double num){
		cal+=num;
		
	}
	public void performOperation(String str){
		if (str!="=") {
		cal+=str;
		}
		else {
			
		}
		
		
	}
	
	public void getResults (){
		System.out.println("The result is "+cal);
		
	}
	
}
