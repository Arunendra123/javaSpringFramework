package spring.injectUsingMethodLookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		// Spring creates proxy classes and 
		// by using proxy it implements interface abstract class and concrete class
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring/injectUsingMethodLookup/config.xml");
        Car c=ac.getBean("car_1",Car.class);
        Bus s=ac.getBean("bus_1",Bus.class);
        Truck t=ac.getBean("truck_1",Truck.class);
        
        System.out.println(c.getEngine().getName());
        System.out.println(s.getEngine().getName());
        System.out.println(t.getEngine().getName());
	}
}
