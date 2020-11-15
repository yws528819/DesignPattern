package com.yws.interpreter;

import java.util.HashMap;

public class SubExpression extends SymbolExpression{

	public SubExpression(Expression left, Expression right) {
		super(left, right);
	}

	//求出left 和 right 表达式相减后的结果
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return left.interpreter(var) - right.interpreter(var);
	}
}
