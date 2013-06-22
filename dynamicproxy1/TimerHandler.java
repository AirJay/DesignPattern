package dynamicproxy1;

import java.lang.reflect.Method;

public class TimerHandler implements InvocationHandler {

	private Object target;

	public TimerHandler(Object target) {
		this.target = target;
	}

	

	private void doBefore() {
		System.out.println("before method invoke : " + System.currentTimeMillis());
	}

	private void doAfter() {
		System.out.println("after method invoke : " + System.currentTimeMillis());
	}



	public void invoke(Object obj, Method method) {
		
		doBefore();
		try {
			method.invoke(target);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		doAfter();
				
	}

}
