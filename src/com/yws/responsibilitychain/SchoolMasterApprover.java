package com.yws.responsibilitychain;

public class SchoolMasterApprover extends Approver{

	public SchoolMasterApprover(String name) {
		super(name);
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		if(request.getPrice() > 30000) {
			System.out.println(" ������ id= " + request.getId() + " �� " + this.name + " ����");
		}else {
			approver.processRequest(request);
		}		
	}

}
