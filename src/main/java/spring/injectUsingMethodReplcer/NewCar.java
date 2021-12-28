package spring.injectUsingMethodReplcer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class NewCar implements MethodReplacer {
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		return "This is Car with new feature";
	}
  
}
