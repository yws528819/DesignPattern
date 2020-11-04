package com.yws.adapter.classadapter;

public class VoltageAdapter extends Voltage220V implements IVoltage5V{

	@Override
	public int output5V() {
		int srcV = output220V();
		int desV = srcV / 40;
		return desV;
	}

}
