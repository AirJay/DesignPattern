package dynamicproxy;

import java.lang.reflect.InvocationHandler;
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



	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		Object result = null;
		doBefore();
		try {
			result = method.invoke(target, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		doAfter();
		return result;
	}

}
