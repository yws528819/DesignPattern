package com.yws.proxy.cglibproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;



public class ProxyFactory implements MethodInterceptor {
	private Object target;

	public ProxyFactory(Object target) {
		super();
		this.target = target;
	}
	
	public Object getProxyInstance() {
		//1.����һ��������
		Enhancer enhancer = new Enhancer();
		//2.���ø���
		enhancer.setSuperclass(target.getClass());
		//3.���ûص�����
		enhancer.setCallback(this);
		//4.����������󣬼��������
		return enhancer.create();
	}

	@Override
	public Object intercept(Object arg0, Method method, Object[] args, MethodProxy arg3) throws Throwable {
		System.out.println("Cglib����ģʽ~~��ʼ");
		Object retVal = method.invoke(target, args);
		System.out.println("Cglib����ģʽ~~�ύ");
		return retVal;
	}
	
}
