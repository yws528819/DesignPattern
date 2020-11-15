package com.yws.interpreter;

import java.util.HashMap;
import java.util.Stack;

public class Caculator {
	// ������ʽ
	private Expression expression;

	// ���캯�����Σ�������
	public Caculator(String expStr) {
		// ���������Ⱥ�˳��
		Stack<Expression> stack = new Stack<Expression>();
		//���ʽ��ֳ��ַ�����
		char[] charArray = expStr.toCharArray();// [a, +, b]
		
		Expression left = null;
		Expression right = null;
		//�������ǵ��ַ����飬 ������  [a, +, b]
		//��Բ�ͬ�������������
		for (int i=0; i < charArray.length; i++) {
			switch (charArray[i]) {
			case '+' :
				left = stack.pop();// ��stackȡ��left => "a"
				right = new VarExpression(String.valueOf(charArray[++i]));// ȡ���ұ��ʽ "b"
				stack.push(new AddExpression(left, right));
				break;
			case '-' :
				left = stack.pop();
				right = new VarExpression(String.valueOf(charArray[++i]));//
				stack.push(new SubExpression(left, right));
				break;
			default:
				//�����һ�� Var �ʹ���Ҫ�� VarExpression ���󣬲�push�� stack
				stack.push(new VarExpression(String.valueOf(charArray[i])));
				break;
			}
		}
		//������������ charArray �����stack �͵õ����Expression
		this.expression = stack.pop();
	}
	
	public int run(HashMap<String, Integer> var) {
		//��󽫱��ʽa+b�� var = {a=10,b=20}
		//Ȼ�󴫵ݸ�expression��interpreter���н���ִ��
		return expression.interpreter(var);
	}
	
	
}
