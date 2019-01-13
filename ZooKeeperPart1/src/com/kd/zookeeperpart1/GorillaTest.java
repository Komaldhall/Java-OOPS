package com.kd.zookeeperpart1;

public class GorillaTest {
	public static void main(String[] args) {
        Gorilla gor = new Gorilla();
        gor.throwSomething();
        gor.throwSomething();
        gor.throwSomething();
        gor.eatBananas();
        gor.eatBananas();
        gor.climb();
        int energy=gor.displayEnergy();
        System.out.println("Energy Level is: "+energy);
        
    }

}
