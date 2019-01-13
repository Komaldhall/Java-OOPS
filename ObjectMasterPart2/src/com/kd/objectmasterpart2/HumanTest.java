package com.kd.objectmasterpart2;

public class HumanTest {
	public static void main(String[] args){
		Human h1=new Human();
		Human h2=new Human();
		//h1 is current Human and h2 is attacked Human
		h1.attack(h2);
		System.out.println("Health of attacked Human is: "+h2.health+" and attacking human is: "+h1.health);
	
		Wizard w = new Wizard();
		w.heal(h2);
//		w.fireball(h2);
		System.out.println("Wizard heals Human to obtain health "+h2.health+" by reducing its intelligence to "+w.intelligence);
		Samurai s1= new Samurai();
		s1.mediate();
		Samurai s2= new Samurai();
		s2.deathBlow(h2);
		
		Samurai.howMany();
		Ninja n = new Ninja();
		n.runAway();
		System.out.println("Ninja's Health is "+n.health);
	}

}
