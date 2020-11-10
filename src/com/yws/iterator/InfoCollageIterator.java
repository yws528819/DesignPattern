package com.yws.iterator;

import java.util.Iterator;
import java.util.List;

public class InfoCollageIterator implements Iterator{

	List<Department> departmentList;// ��Ϣ����ѧԺ����List��ʽ���ϵ
	int index = -1;//����
	
	public InfoCollageIterator(List<Department> departmentList) {
		super();
		this.departmentList = departmentList;
	}

	//�ж�list�л���û����һ��Ԫ��
	@Override
	public boolean hasNext() {
		if (index < departmentList.size() -1 ) {
			index ++;
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		return departmentList.get(index);
	}

	@Override
	public void remove() {
		
	}

	
}
