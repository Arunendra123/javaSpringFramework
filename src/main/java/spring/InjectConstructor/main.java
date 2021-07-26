package spring.InjectConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
       public static void main (String args[]) {
    	   System.out.println("My Fisrt Spring project: Injecting Constructor");

    	   System.out.println("2. Using Spring xml");
    	   // Using Spring Framework : Loosely coupled
    	   ApplicationContext ac=new ClassPathXmlApplicationContext("spring/constructorInjection/config.xml");
    	   Person p_1=(Person) ac.getBean("p_1");
    	   System.out.println(p_1);
       }
}