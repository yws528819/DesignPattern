package com.yws.responsibilitychain;

public class DeparmentApprover extends Approver{

	public DeparmentApprover(String name) {
		super(name);
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		if (request.getPrice() <= 5000) {
			System.out.println("������ID = " + request.getId() + "��" + this.name + "����");
		}else {
			approver.processRequest(request);
		}
	}

}
