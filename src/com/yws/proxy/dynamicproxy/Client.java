package com.yws.proxy.dynamicproxy;

public class Client {
	public static void main(String[] args) {
		ITeacherDao teacherDao = (ITeacherDao) new ProxyFactory(new TeacherDao()).getProxyInstance();
		teacherDao.teach();
	}
}
