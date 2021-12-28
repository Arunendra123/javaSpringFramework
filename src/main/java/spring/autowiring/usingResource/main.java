package spring.autowiring.usingResource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
       public static void main (String args[]) {

    	   ApplicationContext ac=new ClassPathXmlApplicationContext("spring/autowiring/usingResource/config.xml");
    	   Emp e_1=ac.getBean("e_1",Emp.class);
    	   System.out.println(e_1);
       }
}