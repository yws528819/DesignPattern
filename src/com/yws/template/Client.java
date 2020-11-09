package com.yws.template;

public class Client {
	public static void main(String[] args) {
		SoyaMilk soyaMilk1 = new RedBeanSoyaMilk();
		soyaMilk1.make();
	
		System.out.println("===========");
		
		SoyaMilk soyaMilk2 = new PeanutSoyaMilk();
		soyaMilk2.make();
	}
}
