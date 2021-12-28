package spring.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
       public static void main (String args[]) {
    	   ApplicationContext ac=new AnnotationConfigApplicationContext(UnivercityConfig.class);
    	   Student s_1=ac.getBean("getStudent",Student.class);
    	   System.out.println(s_1);
    	   
    	   Teacher s_2=ac.getBean("getTeacher",Teacher.class);
    	   System.out.println(s_2);
       }
}