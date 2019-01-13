package com.kd.objectmasterpart1;

public class HumanTest {
	public static void main(String[] args){
		Human h1=new Human();
		Human h2=new Human();
		//h1 is current Human and h2 is attacked Human
		h1.attack(h2);
		System.out.println("Health of attacked Human is: "+h2.health+" and attacking human is: "+h1.health);
	}

}
