package com.yws.builder.improve;

public class CommonHouse extends HouseBuilder{

	@Override
	public void buildBase() {
		System.out.println("��¥�Ĵ�ػ�100��");
		
	}

	@Override
	public void buildWall() {
		System.out.println("��¥����ǽ20cm");
		
	}

	@Override
	public void roffed() {
		System.out.println("��¥��͸���ݶ�");
		
	}

}
