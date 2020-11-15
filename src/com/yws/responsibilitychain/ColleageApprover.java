package com.yws.responsibilitychain;

public class ColleageApprover extends Approver{

	public ColleageApprover(String name) {
		super(name);
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		if (request.getPrice() > 5000 && request.getPrice() <= 10000) {
			System.out.println("������ID = " + request.getId() + "��" + this.name + "����");
		}else {
			approver.processRequest(request);
		}
	}

}
