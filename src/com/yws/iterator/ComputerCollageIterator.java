package com.yws.iterator;

import java.util.Iterator;

public class ComputerCollageIterator implements Iterator{

	Department[] departments;
	int position = 0;//������λ��
	
	
	public ComputerCollageIterator(Department[] departments) {
		super();
		this.departments = departments;
	}
	
	//�ж��Ƿ�����һ��Ԫ��
	@Override
	public boolean hasNext() {
		if (position >= departments.length || departments[position] == null) {
			return false;
		}else {
			return true;
		}
	}
	
	@Override
	public Object next() {
		Department department = departments[position];
		position++;
		return department;
	}

	//ɾ���ķ�����Ĭ�Ͽ�ʵ��
	@Override
	public void remove() {
		
	}
	
	

}
