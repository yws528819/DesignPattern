package com.yws.interpreter;

import java.util.HashMap;

public class SubExpression extends SymbolExpression{

	public SubExpression(Expression left, Expression right) {
		super(left, right);
	}

	//���left �� right ���ʽ�����Ľ��
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return left.interpreter(var) - right.interpreter(var);
	}
}
