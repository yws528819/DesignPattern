package com.yws.flyweight;

public class Client {
	public static void main(String[] args) {
		//创建一个工厂
		WebsiteFactory factory = new WebsiteFactory();
		//客户要一个以新闻形式发布的网站
		Website website1 = factory.getWebsiteCategory("新闻");
		website1.use(new User("tom"));
		//客户要一个以博客形式发布的网站
		Website website2 = factory.getWebsiteCategory("博客");
		website2.use(new User("jack"));
		//客户要一个以新闻形式发布的网站
		Website website3 = factory.getWebsiteCategory("博客");
		website3.use(new User("king"));
		
		System.out.println("网站的分类共=" + factory.getWebsiteCount());

	}
}
