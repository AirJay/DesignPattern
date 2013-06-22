package dynamicproxy1;

import java.lang.reflect.Method;

public interface InvocationHandler {

	void invoke(Object obj,Method method);  

}
