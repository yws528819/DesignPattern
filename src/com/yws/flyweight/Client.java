package com.yws.flyweight;

public class Client {
	public static void main(String[] args) {
		//����һ������
		WebsiteFactory factory = new WebsiteFactory();
		//�ͻ�Ҫһ����������ʽ��������վ
		Website website1 = factory.getWebsiteCategory("����");
		website1.use(new User("tom"));
		//�ͻ�Ҫһ���Բ�����ʽ��������վ
		Website website2 = factory.getWebsiteCategory("����");
		website2.use(new User("jack"));
		//�ͻ�Ҫһ����������ʽ��������վ
		Website website3 = factory.getWebsiteCategory("����");
		website3.use(new User("king"));
		
		System.out.println("��վ�ķ��๲=" + factory.getWebsiteCount());

	}
}
