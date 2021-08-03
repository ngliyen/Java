package com.javaoop.zookeeper;

public class Gorilla extends Mammal {
	
	public void throwSomething() {
		System.out.println("The gorilla has thrown something.");
		energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("Gorilla just ate a banana and is feeling energized.");
		energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("Gorilla has just climbed a tree and is feeling tired");
		energyLevel -=10;
	}


}
