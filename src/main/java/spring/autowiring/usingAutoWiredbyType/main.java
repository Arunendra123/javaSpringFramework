package spring.autowiring.usingAutoWiredbyType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
       public static void main (String args[]) {
    	   ApplicationContext ac=new ClassPathXmlApplicationContext("spring/autowiring/usingAutoWiredbyType/config.xml");
    	   Car c_1=ac.getBean("car_1",Car.class);
    	   System.out.println(c_1);
       }
}