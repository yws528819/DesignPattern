package com.yws.composite;

import java.util.ArrayList;
import java.util.List;

public class University extends OrganizationComponent{

	private List<OrganizationComponent> list = new ArrayList<OrganizationComponent>();
	
	public University(String name, String desc) {
		super(name, desc);
	}
	
	@Override
	protected void add(OrganizationComponent organizationComponent) {
		list.add(organizationComponent);
	}

	@Override
	protected void remove(OrganizationComponent organizationComponent) {
		list.remove(organizationComponent);
	}


	@Override
	protected void print() {
		System.out.println("=======" + getName() + "=======");
		list.stream().forEach(e -> e.print());
		
	}

}
