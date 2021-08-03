package com.javaoop.zookeeper;

public class GorillaTest {

	public static void main(String[] args) {
		Gorilla gorilla = new Gorilla();
		gorilla.displayEnergy();
		gorilla.throwSomething();
		gorilla.throwSomething();
		gorilla.throwSomething();
		System.out.println("---------- After 3 throws ----------");
		gorilla.displayEnergy();
		gorilla.eatBananas();
		gorilla.eatBananas();
		System.out.println("---------- After eating 2 bananas ----------");
		gorilla.displayEnergy();
		gorilla.climb();
		System.out.println("---------- After climbing ----------");
		gorilla.displayEnergy();

	}

}
