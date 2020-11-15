package com.yws.state.money;

/**
 * ״̬ö����
 * @author mayn
 *
 */
public enum StateEnum {
	//��������
	GENERATE(1, "GENERATE"),
	//�����
	REVIEWED(2, "REVIEWED"),
	//�ѷ���
	PUBLISHED(3, "PUBLISHED"),
	//������
	NOT_PLAY(4, "NOT_PLAY"),
	//�Ѹ���
	PAID(5, "PAYD"),
	//�����
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
