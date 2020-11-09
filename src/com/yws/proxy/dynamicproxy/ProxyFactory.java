package com.yws.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
	private Object target;

	public ProxyFactory(Object target) {
		super();
		this.target = target;
	}
	
	//˵��
	/*
	 *  public static Object newProxyInstance(ClassLoader loader,
                                      Class<?>[] interfaces,
                                      InvocationHandler h)
                                      
        //1. ClassLoader loader �� ָ����ǰĿ�����ʹ�õ��������, ��ȡ�������ķ����̶�
        //2. Class<?>[] interfaces: Ŀ�����ʵ�ֵĽӿ����ͣ�ʹ�÷��ͷ���ȷ������
        //3. InvocationHandler h : ���鴦��ִ��Ŀ�����ķ���ʱ���ᴥ�����鴦��������, ��ѵ�ǰִ�е�Ŀ����󷽷���Ϊ��������
	 */
	public Object getProxyInstance() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("JDK��̬����ʼ~~");
				//������Ƶ���Ŀ�����ķ���
				Object retVal = method.invoke(target, args);
				System.out.println("JDK��̬�����ύ");
				return retVal;
			}
		});
	}
}
