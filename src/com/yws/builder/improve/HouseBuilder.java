package com.yws.builder.improve;

//����Ľ�����
public abstract class HouseBuilder {
	protected House house = new House();
	
	//�����������д�ã�����ķ���
	public abstract void buildBase();
	public abstract void buildWall();
	public abstract void roffed();
	
	//���췿�Ӻã� ����Ʒ(����) ����
	public House buildHouse() {
		return house;
	}
	
}
