package com.yws.decorator;

public abstract class Drink {

	private String desc;//����
	private float price = 0.0f;
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	//������õĳ��󷽷�
	//������ʵ��
	public abstract float cost();
}
