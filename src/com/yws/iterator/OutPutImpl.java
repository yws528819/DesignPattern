package com.yws.iterator;

import java.util.Iterator;
import java.util.List;

public class OutPutImpl {
	List<Colleage> list;

	public OutPutImpl(List<Colleage> list) {
		super();
		this.list = list;
	}
	
	public void printColleage() {
		Iterator<Colleage> iterator = list.iterator();
		while(iterator.hasNext()) {
			Colleage collage = iterator.next();
			System.out.println("====" + collage.getName() + "===");
			printDepartment(collage.createIterator());
			
			
		}
	}
	
	//输出学院输出系
	public void printDepartment(Iterator it) {
		while(it.hasNext()) {
			Department department = (Department) it.next();
			System.out.println(department.getName());
		}
	}
}
