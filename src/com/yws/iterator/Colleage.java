package com.yws.iterator;

import java.util.Iterator;

public interface Colleage {

	public String getName();
	
	//����ϵ�ķ���
	public void addDepartment(String name, String desc);
	
	//����һ��������������
	public Iterator createIterator();
	
}
