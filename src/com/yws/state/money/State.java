package com.yws.state.money;
/**
 * ״̬�ӿ�
 * @author mayn
 *
 */
public interface State {
	/**
	 * ����
	 * @param context
	 */
	void checkEvent(Context context);
	
	/**
	 * ����ʧ��
	 * @param context
	 */
	void checkFailEvent(Context context);
	
	/**
	 * ���۷���
	 * @param context
	 */
	void makePriceEvent(Context context);
	/**
	 * �ӵ�
	 * @param context
	 */
	void acceptOrderEvent(Context context);
	/**
	 * ���˽ӵ�ʧЧ
	 * @param context
	 */
	void noPeopleAcceptEvent(Context context);
	/**
	 * ����
	 * @param context
	 */
	void payOrderEvent(Context context);
	/**
	 * �ӵ�����֧��ʧ��
	 * @param context
	 */
	void orderFailureEvent(Context context);
	/**
	 * ����
	 * @param context
	 */
	void feedBackEvent(Context context);
	
	String getCurrentState();
	
}
