package spring.injectUsingMethodReplcer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring/injectUsingMethodReplcer/config.xml");
        Car c=ac.getBean("car_1",Car.class);
        System.out.println(c.getEngine());
	}
}
