package spring.lifeCycleByUsingAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
       public static void main (String args[]) {
    	   System.out.println("My Fisrt Spring project: Life cycle");
    	   System.out.println("Using Spring Annotation");
    	   ApplicationContext ac=new ClassPathXmlApplicationContext("spring/lifeCycleByUsingAnnotation/config.xml");
    	   Samosa s_1=(Samosa) ac.getBean("s_1");
    	   System.out.println(s_1+"\n");
       }
}