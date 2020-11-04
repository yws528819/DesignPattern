package com.yws.builder.improve;
//指挥者，这里去指定制作流程，返回产品
public class HouseDirector {
	private HouseBuilder houseBuilder;
	//通过setter 传入 houseBuilder
	public void setHouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	//构造器传入 houseBuilder
	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	
	public House constructHouse() {
		houseBuilder.buildBase();
		houseBuilder.buildWall();
		houseBuilder.roffed();
		return houseBuilder.buildHouse();
	}
	
	
}
