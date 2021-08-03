package com.javaoop.objectmaster;

public class Samurai extends Human {
	private static int numberOfSamurai = 0;

	public Samurai() {
		this.setHealth(200);
		numberOfSamurai++;
	}
	
	public void deathBlow(Human target) {
		target.setHealth(0); // kills the target
		this.setHealth(this.getHealth()/2);
	}
	
	public void meditate() {
		this.setHealth(this.getHealth()*3/2);
	}
	
	public static int howMany() {
		return numberOfSamurai;
	}

}
