package com.javaoop.objectmaster;

public class Human {
	private int strength;
	private int stealth;
	private int intelligence;
	private int health;
	
	public Human() {
		strength = 3;
		stealth = 3;
		intelligence = 3;
		health = 100;
	}
	
	// getter
	public int getStrength() {
		return strength;
	}
	
	public int getStealth() {
		return stealth;
	}
	
	public int getIntelligence() {
		return intelligence;
	}
	
	public int getHealth() {
		return health;
	}
	
	// setter
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public void attack(Human target) {
		target.health  -= this.strength;
	}
	
}
