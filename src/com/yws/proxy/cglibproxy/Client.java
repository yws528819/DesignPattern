package com.yws.proxy.cglibproxy;

public class Client {
	public static void main(String[] args) {
		TeacherDao dao = (TeacherDao) new ProxyFactory(new TeacherDao()).getProxyInstance();
		dao.teach();
	}
}
