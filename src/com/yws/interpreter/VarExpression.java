package com.yws.interpreter;

import java.util.HashMap;

public class VarExpression extends Expression{

	private String key;// key=a,key=b,key=c
	
	public VarExpression(String key) {
		super();
		this.key = key;
	}


	// var ����{a=10, b=20}
	// interpreter ���� �������ƣ����ض�Ӧֵ
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return var.get(key);
	}

}
