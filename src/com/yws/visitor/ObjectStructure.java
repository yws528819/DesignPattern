package com.yws.visitor;

import java.util.ArrayList;
import java.util.List;
//���ݽṹ������ܶ��ˣ�Man , Woman��
public class ObjectStructure {
	//ά����һ������
	private List<Person> persons = new ArrayList<Person>();
	
	//���ӵ�List
	public void attach(Person p) {
		persons.add(p);
	}
	
	//�Ƴ�
	public void detach(Person p) {
		persons.remove(p);
	}
	
	//��ʾ�������
	public void display(Action action) {
		persons.stream().forEach(e -> e.accept(action));
	}
}
