package com.liyen.phone;

public class Galaxy extends Phone implements Ringable {
	
	//constructor
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}

	@Override
	public String ring() {
		// TODO Auto-generated method stub
		return "Galaxy " + getVersionNumber() + " says " + getRingTone();
	}

	@Override
	public String unlock() {
		// TODO Auto-generated method stub
		return "Unlocking via finger print";
	}

	@Override
	public void displayInfo() {
		System.out.println("Galaxy " + getVersionNumber() + " from " + getCarrier());
		// TODO Auto-generated method stub
	}

}
