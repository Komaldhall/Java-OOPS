package com.kd.zookeeperpart2;

public class BatTest {
	public static void main(String[] args) {
		Bat b=new Bat();
		b.attackTown();
		b.attackTown();
		b.attackTown();
		b.eatHuman();
		b.eatHuman();
		b.fly();
		b.fly();
		int energy=b.displayEnergy();
		System.out.println("Energy Level is :"+energy);
		
	}

}
