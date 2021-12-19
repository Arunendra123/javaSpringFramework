package spring.InjectCollections.LinkedList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
       public static void main (String args[]) {
    	   System.out.println("My Fisrt Spring project: Injecting Collections");
    	   System.out.println("2. Using Spring xml");
    	   // Using Spring Framework : Loosely coupled
    	   ApplicationContext ac=new ClassPathXmlApplicationContext("spring/InjectCollections/LinkedList/config.xml");
    	   Emp emp_1=(Emp) ac.getBean("emp_1");
    	   System.out.println(emp_1);
    	   System.out.println(emp_1.getEmpNumber().getClass().getName());
       }
}