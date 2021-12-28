package spring.Pnamespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
       public static void main (String args[]) {
    	   ApplicationContext ac=new ClassPathXmlApplicationContext("spring/Pnamespace/config.xml");
    	   Student student_1=(Student) ac.getBean("student_1");
    	   Student student_2=(Student) ac.getBean("student_2");
    	   System.out.println(student_1+"\n"+student_2);
    	   
    	   //P namespace==> property dependency injection
    	   //C namespace==> constructor dependency injection
       }
}