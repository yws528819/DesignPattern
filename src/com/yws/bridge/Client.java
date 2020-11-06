package com.yws.bridge;

public class Client {
	public static void main(String[] args) {
		//С��ֱ���ֻ�
		Phone phone = new UpRightPhone(new XiaoMi());
		phone.open();
		phone.call();
		phone.close();
		
		System.out.println("====================");
		//Vivo�۵��ֻ�
		phone = new FoldedPhone(new Vivo());
		phone.open();
		phone.call();
		phone.close();
	}
}
