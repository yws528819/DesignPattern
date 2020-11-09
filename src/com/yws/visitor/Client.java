package com.yws.visitor;

public class Client {
	public static void main(String[] args) {
		ObjectStructure objectStructure = new ObjectStructure();
		objectStructure.attach(new Man());
		objectStructure.attach(new Woman());
		
		
		objectStructure.display(new Success());
		System.out.println("===========");
		objectStructure.display(new Fail());
		
		System.out.println("=======给的是待定的测评========");
		objectStructure.display(new Wait());
	}
}
