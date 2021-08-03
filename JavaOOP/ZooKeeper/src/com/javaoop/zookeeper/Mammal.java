package com.javaoop.zookeeper;

public class Mammal {
	protected int energyLevel = 100;
	
	public void Mammal() {}
	
	public void Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	// getter
	public int displayEnergy() {
		System.out.println("Energy Level: " + energyLevel);
		return energyLevel;
	}

}
