package com.yws.responsibilitychain;
//请求类
public class PurchaseRequest {
	private int type; //请求类型
	private float price;//请求金额
	private int id;
	public PurchaseRequest(int type, float price, int id) {
		super();
		this.type = type;
		this.price = price;
		this.id = id;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
