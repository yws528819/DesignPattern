package com.yws.iterator;

import java.util.Iterator;

public class ComputerColleage implements Colleage{

	Department[] departments;
	int numOfDepartment = 0;//���浱ǰ����Ķ������
	
	
	public ComputerColleage() {
		departments = new Department[5];
		addDepartment("Javaרҵ", " Javaרҵ  ");
		addDepartment("PHPרҵ", " PHPרҵ  ");
		addDepartment("������רҵ", " ������רҵ  ");
	}
	
	
	@Override
	public String getName() {
		return "�����ѧԺ";
	}

	@Override
	public void addDepartment(String name, String desc) {
		departments[numOfDepartment] = new Department(name, desc);
		numOfDepartment ++;
	}

	@Override
	public Iterator createIterator() {
		return new ComputerCollageIterator(departments);
	}


}
