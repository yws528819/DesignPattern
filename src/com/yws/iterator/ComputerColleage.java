package com.yws.iterator;

import java.util.Iterator;

public class ComputerColleage implements Colleage{

	Department[] departments;
	int numOfDepartment = 0;//保存当前数组的对象个数
	
	
	public ComputerColleage() {
		departments = new Department[5];
		addDepartment("Java专业", " Java专业  ");
		addDepartment("PHP专业", " PHP专业  ");
		addDepartment("大数据专业", " 大数据专业  ");
	}
	
	
	@Override
	public String getName() {
		return "计算机学院";
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
