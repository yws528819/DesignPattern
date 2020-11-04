package com.yws.builder.improve;

public class HighBuilding extends HouseBuilder{

	@Override
	public void buildBase() {
		System.out.println("高楼的打地基5米");
		
	}

	@Override
	public void buildWall() {
		System.out.println("高楼的砌墙10cm");
		
	}

	@Override
	public void roffed() {
		System.out.println("高楼房子的屋顶");
		
	}

}
