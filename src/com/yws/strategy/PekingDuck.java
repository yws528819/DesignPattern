package com.yws.strategy;

public class PekingDuck extends Duck{

	public PekingDuck() {
		flyBehavior = new BadFlyBehavior();
	}
	
	@Override
	public void display() {
		System.out.println("~~±±¾©Ñ¼~~~");
		
	}

}
