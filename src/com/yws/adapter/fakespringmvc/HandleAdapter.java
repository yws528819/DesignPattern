package com.yws.adapter.fakespringmvc;

public interface HandleAdapter {
	public boolean support(Object handler);
	
	public void handle(Object handler);
}

//∂‡÷÷  ≈‰∆˜¿‡
class SimpleHandleAdapter implements HandleAdapter {

	@Override
	public boolean support(Object handler) {
		return handler instanceof SimpleController;
	}

	@Override
	public void handle(Object handler) {
		SimpleController simpleController = (SimpleController) handler;
		simpleController.doSimpleHandler();
	}
}


class HttpHandleAdapter implements HandleAdapter {

	@Override
	public boolean support(Object handler) {
		return handler instanceof HttpController;
	}

	@Override
	public void handle(Object handler) {
		HttpController httpController = (HttpController) handler;
		httpController.doHttpHandler();
		
	}
}

class AnnotationHandleAdapter implements HandleAdapter {

	@Override
	public boolean support(Object handler) {
		return handler instanceof AnnotationController;
	}

	@Override
	public void handle(Object handler) {
		AnnotationController annotationController = (AnnotationController) handler;
		annotationController.doAnnotationHandler();
		
	}
	
}