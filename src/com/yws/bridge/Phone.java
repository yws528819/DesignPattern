package com.yws.bridge;

public abstract class Phone {
	//¾ÛºÏÆ·ÅÆ
	private Brand brand;

	public Phone(Brand brand) {
		super();
		this.brand = brand;
	}
	
	protected void open() {
		brand.open();
	}
	
	protected void close() {
		brand.close();
	}
	
	protected void call() {
		brand.call();
	}
}
