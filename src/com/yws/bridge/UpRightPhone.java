package com.yws.bridge;

public class UpRightPhone extends Phone {

	public UpRightPhone(Brand brand) {
		super(brand);
	}

	@Override
	protected void open() {
		super.open();
		System.out.println("ֱ����ʽ�ֻ�");
	}

	@Override
	protected void close() {
		super.close();
		System.out.println("ֱ����ʽ�ֻ�");

	}

	@Override
	protected void call() {
		super.call();
		System.out.println("ֱ����ʽ�ֻ�");

	}
}
