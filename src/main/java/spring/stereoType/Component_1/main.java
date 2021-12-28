package spring.stereoType.Component_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
       public static void main (String args[]) {
    	   ApplicationContext ac=new ClassPathXmlApplicationContext("spring/stereoType/Component_1/config.xml");
    	   Student s_1=ac.getBean("student",Student.class);
    	   System.out.println(s_1);
       }
       
       //DAO          --> Repository
       //Controller   --> Controller
       //Util Class   --> Component
       //Business     --> Service
}