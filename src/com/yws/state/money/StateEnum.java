package com.yws.state.money;

/**
 * 状态枚举类
 * @author mayn
 *
 */
public enum StateEnum {
	//订单生成
	GENERATE(1, "GENERATE"),
	//已审核
	REVIEWED(2, "REVIEWED"),
	//已发布
	PUBLISHED(3, "PUBLISHED"),
	//待付款
	NOT_PLAY(4, "NOT_PLAY"),
	//已付款
	PAID(5, "PAYD"),
	//已完结
	FEED_BACK(6, "FEED_BACK");
	
	
	
	
	private int key;
	private String value;
	private StateEnum(int key, String value) {
		this.key = key;
		this.value = value;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
