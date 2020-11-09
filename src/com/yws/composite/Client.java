package com.yws.composite;

public class Client {
 public static void main(String[] args) {
	OrganizationComponent university = new University("�廪��ѧ", "�廪��ѧ");
	
	OrganizationComponent collage1 = new Collage("�����Ժ", "�����Ժ");
	OrganizationComponent collage2 = new Collage("��Ϣ����ѧԺ", "��Ϣ����ѧԺ");
	
	
	
	OrganizationComponent department1 = new Department("�������", "������̲���");
	OrganizationComponent department2 = new Department("���繤��", "���繤�̲���");
	OrganizationComponent department3 = new Department("�������ѧ�뼼��", "�������ѧ�뼼�������Ƶ�רҵ");
	
	
	OrganizationComponent department4 = new Department("ͨ�Ź���", "ͨ�Ź��̲���ѧ");
	OrganizationComponent department5 = new Department("��Ϣ����", "��Ϣ���̲���ѧ");
	
	university.add(collage1);
	university.add(collage2);
	
	collage1.add(department1);
	collage1.add(department2);
	collage1.add(department3);
	
	collage2.add(department4);
	collage2.add(department5);
	
	university.print();
	//collage1.print();
	//department1.print();
 }
}
