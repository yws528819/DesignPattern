package com.yws.flyweight;

public class ConcreteWebsite extends Website{

	//共享的部分，内部状态
	private String type;//网站发布的形态（类型）
	
	public ConcreteWebsite(String type) {
		super();
		this.type = type;
	}



	@Override
	protected void use(User user) {
		System.out.println("网站的发布形式为：" + type + "在使用..使用者是" + user.getName());
		
	}
}
