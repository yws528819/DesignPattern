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
	//  将来实际业务中，Colleage 的 add 和  University add 不一定完全一样
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
