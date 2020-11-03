package com.yws.prototype.deep;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Sheep implements Cloneable, Serializable{
	private String name;
	private int age;
	private String color;
	
	public Fish friend;//�Ƕ���, ��¡�ǻ���δ���
	
	
	public Sheep(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Sheep [name=" + name + ", age=" + age + ", color=" + color + "]";
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Sheep sheep = (Sheep) super.clone();
		sheep.friend = (Fish) this.friend.clone();
		return sheep;
	}
	
	
	public Object deepClone() {
		//����������
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			//���л�
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this);//��ǰ��������Զ������ķ�ʽ���
			
			//�����л�
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			Sheep sheep = (Sheep) ois.readObject();
			return sheep;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			//�ر���
			try {
				bos.close();
				oos.close();
				bis.close();
				ois.close();
			} catch (IOException e1) {
				System.out.println(e1.getMessage());
			}
		}
	}
}
