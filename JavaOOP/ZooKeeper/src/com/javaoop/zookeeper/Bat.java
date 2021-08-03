package com.javaoop.zookeeper;

public class Bat extends Mammal {
//	protected int energyLevel = 300;
	

	public Bat() {
		energyLevel += 200;
	}
	
	public void fly() {
		System.out.println("The bat is taking off!");
		energyLevel -= 50;
	}

	public void eatHumans() {
		System.out.println("So- well, never mind");
		energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("Town's on fire");
		energyLevel -= 100;
	}
	
	

}
