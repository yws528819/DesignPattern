package com.yws.responsibilitychain;

public abstract class Approver {
	
	Approver approver;//下一个处理者
	String name;//名字
	public Approver(String name) {
		super();
		this.name = name;
	}
	//设置下一个处理者
	public void setApprover(Approver approver) {
		this.approver = approver;
	}
	
	//处理审批请求的方法，得到一个请求，处理是子类完成
	public abstract void processRequest(PurchaseRequest request);
}
