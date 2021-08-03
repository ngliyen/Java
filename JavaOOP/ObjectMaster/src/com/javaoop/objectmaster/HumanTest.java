package com.javaoop.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human target = new Human();
		System.out.println("---------- Before attack ----------");
		System.out.println(target.getStrength());
		System.out.println(target.getStealth());
		System.out.println(target.getIntelligence());
		System.out.println(target.getHealth());
		
		Human attacker = new Human();
		attacker.attack(target);
		System.out.println("---------- After attack ----------");
		System.out.println(target.getStrength());
		System.out.println(target.getStealth());
		System.out.println(target.getIntelligence());
		System.out.println(target.getHealth());
		
		Ninja ninja = new Ninja();
		System.out.println("---------- Ninja initial data  ----------");
		System.out.println(ninja.getStrength());
		System.out.println(ninja.getStealth());
		System.out.println(ninja.getIntelligence());
		System.out.println(ninja.getHealth());
		
		System.out.println("---------- Ninja attack ----------");
		ninja.steal(target);
		System.out.println("Ninja's health: " + ninja.getHealth());
		System.out.println("Target's health: " + target.getHealth());
		
		System.out.println("---------- Ninja runaway ----------");
		ninja.runAway();
		System.out.println("Ninja's health: " + ninja.getHealth());
		
		Wizard wizard = new Wizard();
		System.out.println("---------- Wizard initial data  ----------");
		System.out.println(wizard.getStrength());
		System.out.println(wizard.getStealth());
		System.out.println(wizard.getIntelligence());
		System.out.println(wizard.getHealth());
		
		System.out.println("---------- Wizard heal ----------");
		wizard.heal(target);
		System.out.println("Target's health: " + target.getHealth());
		
		System.out.println("---------- Wizard attacks ----------");
		wizard.fireball(target);
		System.out.println("Target's health: " + target.getHealth());
		
		Samurai samurai1 = new Samurai();
		System.out.println("---------- Samurai initial data  ----------");
		System.out.println(samurai1.getStrength());
		System.out.println(samurai1.getStealth());
		System.out.println(samurai1.getIntelligence());
		System.out.println(samurai1.getHealth());
		
		System.out.println("---------- Samurai 1 death blow ----------");
		samurai1.deathBlow(target);
		System.out.println("Samurai 1's health: " + samurai1.getHealth());
		System.out.println("Target's health: " + target.getHealth());
		
		System.out.println("---------- Samurai 1 meditate ----------");
		samurai1.meditate();
		System.out.println("Samurai 1's health: " + samurai1.getHealth());
		
		Samurai samurai2 = new Samurai();
		Samurai samurai3 = new Samurai();
		Samurai samurai4 = new Samurai();
		Samurai samurai5 = new Samurai();
		Samurai samurai6 = new Samurai();
		
		System.out.println("Current number of Samurai: " + Samurai.howMany());
		
		
		
		
		
		
	}

}
