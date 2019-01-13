package com.kd.phone;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	return("Galaxy "+getVersionNumber()+" says "+getRingTone());
        // your code here
    }
    @Override
    public String unlock() {
    	return("Galaxy "+getVersionNumber()+" is getting unlocked!!");
        // your code here
    }
    @Override
    public void displayInfo() {
    	System.out.println("Galaxy "+getVersionNumber()+" from "+getCarrier());
        // your code here            
    }
}