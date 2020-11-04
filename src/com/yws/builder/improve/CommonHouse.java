package com.yws.builder.improve;

public class CommonHouse extends HouseBuilder{

	@Override
	public void buildBase() {
		System.out.println("高楼的打地基100米");
		
	}

	@Override
	public void buildWall() {
		System.out.println("高楼的砌墙20cm");
		
	}

	@Override
	public void roffed() {
		System.out.println("高楼的透明屋顶");
		
	}

}
