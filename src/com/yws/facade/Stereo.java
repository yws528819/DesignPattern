package com.yws.facade;

public class Stereo {
	private static Stereo stereo = new Stereo();
	
	private Stereo() {
		
	}
	public static Stereo getInstance() {
		return stereo;
	}
	
	public void on() {
		System.out.println(" Stereo on ");
	}
	
	public void off() {
		System.out.println(" Screen off ");
	}
	
	public void up() {
		System.out.println(" Screen up.. ");
	}
}
