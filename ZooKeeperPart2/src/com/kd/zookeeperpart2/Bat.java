package com.kd.zookeeperpart2;


public class Bat extends Mammal {

	public Bat() {
		super();
		this.elevel = 300;
	}
	public void fly(){
		System.out.println("sound a bat taking off");
		elevel-=50;
		
	}
	public void eatHuman() {
		System.out.println("so- well, never mind");
		elevel+=25;
		
	}
	public void attackTown() {
		System.out.println("sound of a town on fire");
		elevel-=100;
		
	}
}
