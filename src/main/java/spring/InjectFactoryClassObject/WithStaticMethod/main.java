package spring.InjectFactoryClassObject.WithStaticMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
       public static void main (String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
  
    	   ApplicationContext ac=new ClassPathXmlApplicationContext("spring/InjectFactoryClassObject/WithStaticMethod/config.xml");
    	   Car c_1=ac.getBean("car_1",Car.class);
    	   System.out.println(c_1.getCarName());
       }
}