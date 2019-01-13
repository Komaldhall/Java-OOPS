package com.kd.objectmasterpart2;

public class Samurai extends Human {
	
	public static int number=0;
	public Samurai() {
		super();
		this.health = 200;
		number+=1;
	}
	
	public void deathBlow(Human h){
		h.health=0;
		this.health=this.health/2;
	}
	public void mediate(){
		this.health=this.health*2;		
		
	}
	public static void howMany(){
		System.out.println("Samurai's count is "+number);
	}
}
