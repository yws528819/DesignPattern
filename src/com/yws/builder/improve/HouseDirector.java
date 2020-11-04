package com.yws.builder.improve;
//ָ���ߣ�����ȥָ���������̣����ز�Ʒ
public class HouseDirector {
	private HouseBuilder houseBuilder;
	//ͨ��setter ���� houseBuilder
	public void setHouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	//���������� houseBuilder
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
