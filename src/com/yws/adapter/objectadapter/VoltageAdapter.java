package com.yws.adapter.objectadapter;

//��������
public class VoltageAdapter implements IVoltage5V{
	
	private Voltage220V Voltage220V;
	
	//ͨ������������һ��Voltage220V ʵ��
	public VoltageAdapter(Voltage220V voltage220v) {
		Voltage220V = voltage220v;
	}


	@Override
	public int output5V() {
		int desV = 0;
		if (Voltage220V != null) {
			int srcV = Voltage220V.output220V();
			desV = srcV / 40;
		}
		return desV;
	}

}
