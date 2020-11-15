package com.yws.strategy;

public class Client {
	public static void main(String[] args) {
		Duck toyDuck = new ToyDuck();
		toyDuck.display();
		toyDuck.fly();
		
		System.out.println("==============");
		
		Duck pekingDuck = new PekingDuck();
		pekingDuck.display();
		pekingDuck.fly();
		
		System.out.println("¡¾¸ü»»·ÉÏèÄÜÁ¦¡¿");
		pekingDuck.setFlyBehavior(new GoodFlyBehavior());
		pekingDuck.fly();
	}
}
