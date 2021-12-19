package spring.InjectReference.InnerBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
       public static void main (String args[]) {
    	   System.out.println("My Fisrt Spring project: Injecting Refence");
    	   System.out.println("2. Using Spring xml");
    	   // Using Spring Framework : Loosely coupled
    	   ApplicationContext ac=new ClassPathXmlApplicationContext("spring/InjectReference/InnerBeans/config.xml");
    	   Vehicle v_1=(Vehicle) ac.getBean("v_1");
    	   System.out.println(v_1);
       }
}