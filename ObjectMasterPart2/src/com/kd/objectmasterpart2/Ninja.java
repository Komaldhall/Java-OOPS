package com.kd.objectmasterpart2;

public class Ninja extends Human {
	

	public Ninja() {
		super();
		this.stealth = 10;
	}
	public void steal(Human h){
		h.health-=this.stealth;
		this.stealth+=h.health;
		
	}
	public void runAway() {
		this.health-=10;
	}

}
