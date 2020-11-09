package com.yws.composite;

import java.util.ArrayList;
import java.util.List;

public class Collage extends OrganizationComponent{

	private List<OrganizationComponent> list = new ArrayList<OrganizationComponent>();
	
	public Collage(String name, String desc) {
		super(name, desc);
	}
	
	@Override
	protected void add(OrganizationComponent organizationComponent) {
	//  ����ʵ��ҵ���У�Colleage �� add ��  University add ��һ����ȫһ��
		list.add(organizationComponent);
	}

	@Override
	protected void remove(OrganizationComponent organizationComponent) {
		list.remove(organizationComponent);
	}


	@Override
	protected void print() {
		System.out.println("---------" + getName() + "---------");
		list.stream().forEach(e -> e.print());
		
	}
}
