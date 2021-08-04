package com.liyen.pokemon;

import java.util.ArrayList;

public class Pokedex extends AbstractPokemon {
	private ArrayList<Pokemon> myPokemons = new ArrayList<Pokemon>();
	
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon pokemon = super.createPokemon(name, health, type);
		myPokemons.add(pokemon);
		return pokemon;
	}
	
	public void listPokemon() {
		for (Pokemon pokemon : myPokemons) {
			System.out.println(pokemon.getName());
		}
	}
}
