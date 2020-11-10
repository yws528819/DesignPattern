package com.yws.iterator;

import java.util.Iterator;
import java.util.List;

public class InfoCollageIterator implements Iterator{

	List<Department> departmentList;// 信息工程学院是以List方式存放系
	int index = -1;//索引
	
	public InfoCollageIterator(List<Department> departmentList) {
		super();
		this.departmentList = departmentList;
	}

	//判断list中还有没有下一个元素
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
