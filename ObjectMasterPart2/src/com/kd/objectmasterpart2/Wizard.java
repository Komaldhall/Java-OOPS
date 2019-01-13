package com.kd.objectmasterpart2;

public class Wizard extends Human {

	public Wizard() {
		super();
		this.health = 50;
		this.intelligence = 8;
	}
	
	public void heal(Human h) {
		this.intelligence-=2;
		h.health+=2;
		
	}
	public void fireball(Human h) {
		h.health-=this.intelligence*3;
		this.intelligence-=1;
		
	}
	
	

}
