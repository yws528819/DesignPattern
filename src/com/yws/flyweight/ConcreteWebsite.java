package com.yws.flyweight;

public class ConcreteWebsite extends Website{

	//����Ĳ��֣��ڲ�״̬
	private String type;//��վ��������̬�����ͣ�
	
	public ConcreteWebsite(String type) {
		super();
		this.type = type;
	}



	@Override
	protected void use(User user) {
		System.out.println("��վ�ķ�����ʽΪ��" + type + "��ʹ��..ʹ������" + user.getName());
		
	}
}
