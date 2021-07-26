package spring.autowiring.usingAutoWiredAndQualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
       public static void main (String args[]) {
    	   System.out.println("My Fisrt Spring project: Injecting Constructor");

    	   System.out.println("2. Using Spring xml");
    	   // Using Spring Framework : Loosely coupled
    	   ApplicationContext ac=new ClassPathXmlApplicationContext("spring/autowiring/usingAutoWiredAndQualifier/config.xml");
    	   Emp e_1=ac.getBean("e_1",Emp.class);
    	   System.out.println(e_1);
       }
}