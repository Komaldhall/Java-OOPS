package com.kd.objectmasterpart2;

public class Human {
	public int strength;
	public int stealth;
	public int intelligence;
	public int health;
	
	public Human() {
		
		this.strength = 3;
		this.stealth = 3;
		this.intelligence = 3;
		this.health = 100;
	}
	public void attack(Human h){
		h.health-=stealth;
	}

}
