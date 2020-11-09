package com.yws.facade;

public class TheaterLight {
	private static TheaterLight theaterLight = new TheaterLight();
	
	private TheaterLight() {
		
	}
	
	public static TheaterLight getInstance() {
		return theaterLight;
	}
	
	public void on() {
		System.out.println(" TheaterLight on ");
	}

	public void off() {
		System.out.println(" TheaterLight off ");
	}

	public void dim() {
		System.out.println(" TheaterLight dim.. ");
	}

	public void bright() {
		System.out.println(" TheaterLight bright.. ");
	}
}
