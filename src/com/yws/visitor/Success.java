package com.yws.visitor;

public class Success extends Action{

	@Override
	public void getManResult(Man man) {
		System.out.println(" ���˵ĸ������۸ø��ֺܳɹ�    ");
	}

	@Override
	public void getWomanResult(Woman woman) {
		System.out.println(" Ů�˵ĸ������۸ø��ֺܳɹ�    ");
	}
}
