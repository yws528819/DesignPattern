package com.yws.visitor;

public class Fail extends Action{

	@Override
	public void getManResult(Man man) {
		System.out.println(" ���˵ĸ������۸ø��ֺ�ʧ��    ");
		
	}

	@Override
	public void getWomanResult(Woman woman) {
		System.out.println(" Ů�˵ĸ������۸ø��ֺ�ʧ��      ");
		
	}

}
