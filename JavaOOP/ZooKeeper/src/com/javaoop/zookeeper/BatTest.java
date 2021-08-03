package com.javaoop.zookeeper;

public class BatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bat bat = new Bat();
		bat.displayEnergy();
		bat.attackTown();
		bat.attackTown();
		bat.attackTown();
		System.out.println("---------- After attacking 3 towns ----------");
		bat.displayEnergy();
		bat.eatHumans();
		bat.eatHumans();
		System.out.println("---------- After eating 2 humans ----------");
		bat.displayEnergy();
		bat.fly();
		bat.fly();
		System.out.println("---------- After flying twice ----------");
		bat.displayEnergy();

	}

}
