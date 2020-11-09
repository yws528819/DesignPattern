package com.yws.flyweight;

import java.util.HashMap;
import java.util.Map;

public class WebsiteFactory {
	//集合，充当池的作用
	private Map<String, Website> pool = new HashMap<String, Website>();
	
	
	//根据网站的类型，返回一个网站, 如果没有就创建一个网站，并放入到池中,并返回
	public Website getWebsiteCategory(String type) {
		if (pool.containsKey(type)) {
			return pool.get(type);
		}else {
			Website wbWebsite = new ConcreteWebsite(type);
			pool.put(type, wbWebsite);
			return wbWebsite;
		}
	}
	
	//获取网站分类的数量（池中有多少个网站类型）
	public int getWebsiteCount() {
		return pool.size();
	}
}
