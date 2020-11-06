package com.yws.bridge;

public class Client {
	public static void main(String[] args) {
		//小米直立手机
		Phone phone = new UpRightPhone(new XiaoMi());
		phone.open();
		phone.call();
		phone.close();
		
		System.out.println("====================");
		//Vivo折叠手机
		phone = new FoldedPhone(new Vivo());
		phone.open();
		phone.call();
		phone.close();
	}
}
