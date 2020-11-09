package com.yws.flyweight;

import java.util.HashMap;
import java.util.Map;

public class WebsiteFactory {
	//���ϣ��䵱�ص�����
	private Map<String, Website> pool = new HashMap<String, Website>();
	
	
	//������վ�����ͣ�����һ����վ, ���û�оʹ���һ����վ�������뵽����,������
	public Website getWebsiteCategory(String type) {
		if (pool.containsKey(type)) {
			return pool.get(type);
		}else {
			Website wbWebsite = new ConcreteWebsite(type);
			pool.put(type, wbWebsite);
			return wbWebsite;
		}
	}
	
	//��ȡ��վ����������������ж��ٸ���վ���ͣ�
	public int getWebsiteCount() {
		return pool.size();
	}
}
