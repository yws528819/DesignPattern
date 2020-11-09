package com.yws.composite;

public class Client {
 public static void main(String[] args) {
	OrganizationComponent university = new University("清华大学", "清华大学");
	
	OrganizationComponent collage1 = new Collage("计算机院", "计算机院");
	OrganizationComponent collage2 = new Collage("信息工程学院", "信息工程学院");
	
	
	
	OrganizationComponent department1 = new Department("软件工程", "软件工程不错");
	OrganizationComponent department2 = new Department("网络工程", "网络工程不错");
	OrganizationComponent department3 = new Department("计算机科学与技术", "计算机科学与技术是老牌的专业");
	
	
	OrganizationComponent department4 = new Department("通信工程", "通信工程不好学");
	OrganizationComponent department5 = new Department("信息工程", "信息工程不好学");
	
	university.add(collage1);
	university.add(collage2);
	
	collage1.add(department1);
	collage1.add(department2);
	collage1.add(department3);
	
	collage2.add(department4);
	collage2.add(department5);
	
	university.print();
	//collage1.print();
	//department1.print();
 }
}
