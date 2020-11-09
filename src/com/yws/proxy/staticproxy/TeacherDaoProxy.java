package com.yws.proxy.staticproxy;

public class TeacherDaoProxy implements ITeacherDao{
	
	private ITeacherDao target;
	
	public TeacherDaoProxy(ITeacherDao target) {
		super();
		this.target = target;
	}

	@Override
	public void teach() {
		System.out.println("��ʼ�������ĳЩ������������");
		target.teach();
		System.out.println("�ύ������");
	}

}
