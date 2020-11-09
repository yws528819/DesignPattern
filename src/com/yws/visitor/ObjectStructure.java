package com.yws.visitor;

import java.util.ArrayList;
import java.util.List;
//数据结构，管理很多人（Man , Woman）
public class ObjectStructure {
	//维护了一个集合
	private List<Person> persons = new ArrayList<Person>();
	
	//增加到List
	public void attach(Person p) {
		persons.add(p);
	}
	
	//移除
	public void detach(Person p) {
		persons.remove(p);
	}
	
	//显示测评情况
	public void display(Action action) {
		persons.stream().forEach(e -> e.accept(action));
	}
}
