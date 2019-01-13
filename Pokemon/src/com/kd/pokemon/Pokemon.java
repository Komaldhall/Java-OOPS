package com.kd.pokemon;

public class Pokemon {
	//name, health, and type member variables.
	public String name;
	public int health;
	public String type;
	public static int count=0;
	//getters and setters for each member variable.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	//a constructor class to set the instance's name, health, and type on creation
	public Pokemon(String name, int health, String type) {
		
		this.name = name;
		this.health = health;
		this.type=type;
		//a count static variable that keeps the number of Pokemon created in the program.
		count++;
		
	}
	public void attackPokemon(Pokemon pokemon) {
		//This method lowers the attacked Pokemon's health by 10
		pokemon.health-=10;
	}


	
}
