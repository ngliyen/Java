package com.liyen.pokemon;

public class PokemonTest {

	public static void main(String[] args) {
		Pokedex pokedex = new Pokedex();
		Pokemon charmander = pokedex.createPokemon("Charmander", 200, "fire");
		Pokemon bulbasaur = pokedex.createPokemon("Bulbasaur", 400, "grass");
		
		System.out.println("----- Charmander -----");
		System.out.println(pokedex.pokemonInfo(charmander));
		System.out.println("----- Bulbasaur -----");
		System.out.println(pokedex.pokemonInfo(bulbasaur));
		
		charmander.attackPokemon(bulbasaur);
		System.out.println("----- Charmander attacks Bulbasaur -----");
		System.out.println("----- Bulbasaur -----");
		System.out.println(pokedex.pokemonInfo(bulbasaur));
		
		System.out.println("----- List Pokemon -----");
		pokedex.listPokemon();
		
		System.out.println("----- Get Pokemon Count -----");
		System.out.println(Pokemon.getCount());
		
	}

}
