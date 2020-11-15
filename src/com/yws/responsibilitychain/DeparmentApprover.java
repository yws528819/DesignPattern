package com.yws.responsibilitychain;

public class DeparmentApprover extends Approver{

	public DeparmentApprover(String name) {
		super(name);
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		if (request.getPrice() <= 5000) {
			System.out.println("请求编号ID = " + request.getId() + "被" + this.name + "处理");
		}else {
			approver.processRequest(request);
		}
	}

}
