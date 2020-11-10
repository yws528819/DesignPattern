package com.yws.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoColleage implements Colleage{
	
	List<Department> departments;

	public InfoColleage() {
		departments = new ArrayList<Department>();
		addDepartment("��Ϣ��ȫרҵ", " ��Ϣ��ȫרҵ ");
		addDepartment("���簲ȫרҵ", " ���簲ȫרҵ ");
		addDepartment("��������ȫרҵ", " ��������ȫרҵ ");
	}
	
	
	@Override
	public String getName() {
		return "��Ϣ����ѧԺ";
	}

	@Override
	public void addDepartment(String name, String desc) {
		departments.add(new Department(name, desc));
		
	}

	@Override
	public Iterator createIterator() {
		return new InfoCollageIterator(departments);
	}

}
