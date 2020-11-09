package com.yws.proxy.staticproxy;

public class Client {

	public static void main(String[] args) {
		ITeacherDao teacherDao = new TeacherDaoProxy(new TeacherDao());
		teacherDao.teach();
	}

}
