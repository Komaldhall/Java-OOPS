package com.kd.zookeeperpart1;

public class Gorilla extends Mammal {
	
	
	public void throwSomething() {
		System.out.println("a gorilla has thrown something");
		elevel-=5;
	}
	
	public void eatBananas() {
		System.out.println("gorilla's satisfied");
		elevel+=10;
		
	}
	public void climb() {
		System.out.println("gorilla has climbed a tree");
		elevel-=10;
	}

}
