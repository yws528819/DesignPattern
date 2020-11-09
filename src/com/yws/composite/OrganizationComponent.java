package com.yws.composite;

public abstract class OrganizationComponent {
	private String name;
	private String desc;
	
	public OrganizationComponent(String name, String desc) {
		super();
		this.name = name;
		this.desc = desc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	protected void add(OrganizationComponent organizationComponent) {
		throw new UnsupportedOperationException();
	}
	
	protected void remove(OrganizationComponent organizationComponent) {
		throw new UnsupportedOperationException();
	}
	
	//方法prin，做成抽象的，子类都要实现
	protected abstract void print();
}
