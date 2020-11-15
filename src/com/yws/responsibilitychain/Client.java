package com.yws.responsibilitychain;

public class Client {
	public static void main(String[] args) {
		//创建一个请求
		PurchaseRequest request = new PurchaseRequest(1, 31000, 1);
		//创建相关的审批人
		DeparmentApprover deparmentApprover = new DeparmentApprover("张主任");
		ColleageApprover colleageApprover = new ColleageApprover("李院长");
		ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("王副校");
		SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("佟校长");
		//需要将各个审批级别的下一个设置好 (处理人构成环形: )
		deparmentApprover.setApprover(colleageApprover);
		colleageApprover.setApprover(viceSchoolMasterApprover);
		viceSchoolMasterApprover.setApprover(schoolMasterApprover);
		schoolMasterApprover.setApprover(deparmentApprover);
		
		deparmentApprover.processRequest(request);
		schoolMasterApprover.processRequest(request);
	}
}
