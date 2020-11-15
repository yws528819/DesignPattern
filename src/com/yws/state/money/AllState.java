package com.yws.state.money;

//���״̬
class FeedBackState extends AbstractState{

	@Override
	public String getCurrentState() {
		return StateEnum.FEED_BACK.getValue();
	}
}

//��������״̬
class GenerateState extends AbstractState {

	@Override
	public void checkEvent(Context context) {
		context.setState(new ReviewedState());
	}

	@Override
	public void checkFailEvent(Context context) {
		context.setState(new FeedBackState());
	}

	@Override
	public String getCurrentState() {
		return StateEnum.GENERATE.getValue();
	}
	
}

//������״̬
class NotPayState extends AbstractState {

	@Override
	public void payOrderEvent(Context context) {
		context.setState(new PaidState());
	}

	@Override
	public void feedBackEvent(Context context) {
		context.setState(new FeedBackState());
	}

	@Override
	public String getCurrentState() {
		return StateEnum.NOT_PLAY.getValue();
	}
}

//�Ѹ���״̬
class PaidState extends AbstractState {

	@Override
	public void feedBackEvent(Context context) {
		context.setState(new FeedBackState());
	}

	@Override
	public String getCurrentState() {
		return StateEnum.PAID.getValue();
	}
}

//�ѷ���״̬
class PublishedState extends AbstractState {

	
	
	@Override
	public void acceptOrderEvent(Context context) {
		context.setState(new NotPayState());
	}

	@Override
	public void noPeopleAcceptEvent(Context context) {
		context.setState(new FeedBackState());
	}

	@Override
	public String getCurrentState() {
		return StateEnum.PUBLISHED.getValue();
	}
}

//�����״̬
class ReviewedState extends AbstractState {

	@Override
	public void makePriceEvent(Context context) {
		context.setState(new PublishedState());
	}

	@Override
	public String getCurrentState() {
		return StateEnum.REVIEWED.getValue();
	}
	
}