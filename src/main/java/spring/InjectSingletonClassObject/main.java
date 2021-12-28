package spring.InjectSingletonClassObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
       public static void main (String args[]) {
    	   ApplicationContext ac=new ClassPathXmlApplicationContext("spring/InjectSingletonClassObject/config.xml");
    	   TestSingleton testSingleton=ac.getBean("singletontest_1",TestSingleton.class);
    	   System.out.println(testSingleton.TestMethod());
       }
}