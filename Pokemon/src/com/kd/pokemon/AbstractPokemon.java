package com.kd.pokemon;

public abstract class AbstractPokemon implements PokemonInterface{
	private String name;
	private int health;
	private String type;
	public Pokemon createPokemon(String name, int health, String type) {
		//This method creates and returns Pokemon.
		this.name=name;
		this.health=health;
		this.type=type;
		return ???;
		
	}
	public String pokemonInfo(Pokemon pokemon) {
		//This method returns a String with the name, health, and type of the pokemon.
		String poke=pokemon.name;
		poke+=pokemon.health;
		poke+=pokemon.type;
		return poke;
		
		
		
	}

}
