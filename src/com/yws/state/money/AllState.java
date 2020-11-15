package com.yws.state.money;

//完结状态
class FeedBackState extends AbstractState{

	@Override
	public String getCurrentState() {
		return StateEnum.FEED_BACK.getValue();
	}
}

//订单生成状态
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

//待付款状态
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

//已付款状态
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

//已发布状态
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

//已审核状态
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