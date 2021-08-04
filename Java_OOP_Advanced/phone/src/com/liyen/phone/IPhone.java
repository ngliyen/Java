package com.liyen.phone;

public class IPhone extends Phone implements Ringable {
	
	//constructor
	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}

	@Override
	public String ring() {
		// TODO Auto-generated method stub
		return "iPhone " + getVersionNumber() + " says " + getRingTone();
	}

	@Override
	public String unlock() {
		// TODO Auto-generated method stub
		return "Unlocking via facial recognition";
	}

	@Override
	public void displayInfo() {
		System.out.println("iPhone " + getVersionNumber() + " from " + getCarrier());
	}
}
