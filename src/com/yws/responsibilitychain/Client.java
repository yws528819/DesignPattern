package com.yws.responsibilitychain;

public class Client {
	public static void main(String[] args) {
		//����һ������
		PurchaseRequest request = new PurchaseRequest(1, 31000, 1);
		//������ص�������
		DeparmentApprover deparmentApprover = new DeparmentApprover("������");
		ColleageApprover colleageApprover = new ColleageApprover("��Ժ��");
		ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("����У");
		SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("١У��");
		//��Ҫ�����������������һ�����ú� (�����˹��ɻ���: )
		deparmentApprover.setApprover(colleageApprover);
		colleageApprover.setApprover(viceSchoolMasterApprover);
		viceSchoolMasterApprover.setApprover(schoolMasterApprover);
		schoolMasterApprover.setApprover(deparmentApprover);
		
		deparmentApprover.processRequest(request);
		schoolMasterApprover.processRequest(request);
	}
}
