package spring.lifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
       public static void main (String args[]) {
    	   System.out.println("My Fisrt Spring project: Life cycle");
    	   System.out.println("Using Spring xml");
    	   // Using Spring Framework : Loosely coupled
    	   AbstractApplicationContext ac=new ClassPathXmlApplicationContext("spring/lifeCycle/config.xml");
    	   Samosa s_1=(Samosa) ac.getBean("s_1");
    	   Samosa s_2=(Samosa) ac.getBean("s_2");
    	   Pepsi p_2=(Pepsi) ac.getBean("p_2");
    	   System.out.println(s_1+"\n"+s_2+"\n"+p_2);
    	   ac.registerShutdownHook();
       }
}