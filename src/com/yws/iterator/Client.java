package com.yws.iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		//����ѧԺ
		List<Colleage> list = new ArrayList<Colleage>();
		list.add(new InfoColleage());
		list.add(new ComputerColleage());
		
		new OutPutImpl(list).printColleage();
	}
}
