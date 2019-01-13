package com.kd.phone;

public class Iphone extends Phone implements Ringable {
   
    public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	return("IPhone "+getVersionNumber()+" says "+getRingTone());
        // your code here
    }
    @Override
    public String unlock() {
    	return("IPhone "+getVersionNumber()+" is getting unlocked!!");
        // your code here
    }
    @Override
    public void displayInfo() {
    	System.out.println("IPhone "+getVersionNumber()+" from "+getCarrier());
        // your code here            
    }
}
