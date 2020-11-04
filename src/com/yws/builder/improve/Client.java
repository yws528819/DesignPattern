package com.yws.builder.improve;

public class Client {
	public static void main(String[] args) {
		HouseDirector houseDirector = new HouseDirector(new HighBuilding());
		House highHouse = houseDirector.constructHouse();
		
		System.out.println("=======");
		
		houseDirector = new HouseDirector(new CommonHouse());
		House commonHouse = houseDirector.constructHouse();
	}
}
