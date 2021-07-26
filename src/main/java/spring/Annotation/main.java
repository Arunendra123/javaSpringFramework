package spring.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
       public static void main (String args[]) {
    	   ApplicationContext ac=new AnnotationConfigApplicationContext(StudentConfig.class);
    	   Student s_1=ac.getBean("getStudent",Student.class);
    	   System.out.println(s_1);
       }
}