package com.yws.bridge;

public class FoldedPhone extends Phone {

	public FoldedPhone(Brand brand) {
		super(brand);
	}

	@Override
	protected void open() {
		super.open();
		System.out.println(" �۵���ʽ�ֻ� ");
	}

	@Override
	protected void close() {
		super.close();
		System.out.println(" �۵���ʽ�ֻ� ");
	}

	@Override
	protected void call() {
		super.call();
		System.out.println(" �۵���ʽ�ֻ� ");
	}
}
