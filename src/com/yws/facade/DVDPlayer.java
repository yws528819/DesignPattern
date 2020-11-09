package com.yws.facade;

public class DVDPlayer {
	private static DVDPlayer dvdPlayer = new DVDPlayer();
	
	private DVDPlayer() {
		
	}
	
	public static DVDPlayer getInstance() {
		return dvdPlayer;
	}
	
	public void on() {
		System.out.println(" dvd on ");
	}
	public void off() {
		System.out.println(" dvd off ");
	}
	public void play() {
		System.out.println(" dvd is playing ");
	}
	public void pause() {
		System.out.println(" dvd pause ... ");
	}
}
