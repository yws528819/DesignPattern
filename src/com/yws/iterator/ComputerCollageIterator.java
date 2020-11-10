package com.yws.iterator;

import java.util.Iterator;

public class ComputerCollageIterator implements Iterator{

	Department[] departments;
	int position = 0;//遍历的位置
	
	
	public ComputerCollageIterator(Department[] departments) {
		super();
		this.departments = departments;
	}
	
	//判断是否还有下一个元素
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

	//删除的方法，默认空实现
	@Override
	public void remove() {
		
	}
	
	

}
