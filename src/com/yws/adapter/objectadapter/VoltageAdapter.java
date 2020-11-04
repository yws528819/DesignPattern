package com.yws.adapter.objectadapter;

//适配器类
public class VoltageAdapter implements IVoltage5V{
	
	private Voltage220V Voltage220V;
	
	//通过构造器传入一个Voltage220V 实例
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
