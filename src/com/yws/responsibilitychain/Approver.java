package com.yws.responsibilitychain;

public abstract class Approver {
	
	Approver approver;//��һ��������
	String name;//����
	public Approver(String name) {
		super();
		this.name = name;
	}
	//������һ��������
	public void setApprover(Approver approver) {
		this.approver = approver;
	}
	
	//������������ķ������õ�һ�����󣬴������������
	public abstract void processRequest(PurchaseRequest request);
}
