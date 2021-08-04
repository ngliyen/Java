package com.liyen.pokemon;

public abstract class AbstractPokemon implements PokemonInterface {
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon pokemon = new Pokemon(name, health, type);
//		pokemon.setName(name);
//		pokemon.setHealth(health);
//		pokemon.setType(type);
		return pokemon;
	}
	
	
	public String pokemonInfo(Pokemon pokemon) {
		String name = "Name: " + pokemon.getName() + "; ";
		String health = "Health: " + pokemon.getHealth() + "; ";
		String type = "Type: " + pokemon.getType();
		return name + health + type;
	}
}
