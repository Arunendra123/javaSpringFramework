package spring.stereoType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
       public static void main (String args[]) {
    	   ApplicationContext ac=new ClassPathXmlApplicationContext("spring/stereoType/config.xml");
    	   Student s_1=ac.getBean("student",Student.class);
    	   System.out.println(s_1);
       }
}