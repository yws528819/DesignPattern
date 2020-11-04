package com.yws.adapter.fakespringmvc;

import java.util.ArrayList;
import java.util.List;

public class DispatchServlet {
	
	public static List<HandleAdapter> list = new ArrayList<HandleAdapter>();
	
	public DispatchServlet() {
		list.add(new SimpleHandleAdapter());
		list.add(new HttpHandleAdapter());
		list.add(new AnnotationHandleAdapter());
		
	}
	
	public void dispatch(Controller controller) {
		HandleAdapter handleAdapter = getHandleAdapter(controller);
		handleAdapter.handle(controller);
	}
	
	
	private HandleAdapter getHandleAdapter(Controller controller) {
		for (HandleAdapter handleAdapter : list) {
			if (handleAdapter.support(controller)) {
				return handleAdapter;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		new DispatchServlet().dispatch(new AnnotationController());
	}
}
