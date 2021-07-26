package spring.InjectPrimitiveValues;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
       public static void main (String args[]) {
    	   System.out.println("My Fisrt Spring project: Injecting Primitive values");

    	   // Traditional method: Tightly coupled
    	   System.out.println("1. Using Old method");
    	   Student st=new Student();
    	   st.setStudentId(1);
    	   st.setStudentName("Arunendra");
    	   st.setStudentAddress("Chandauli");
    	   System.out.println(st);

    	   System.out.println("2. Using Spring xml");
    	   // Using Spring Framework : Loosely coupled
    	   ApplicationContext ac=new ClassPathXmlApplicationContext("spring/Students/config.xml");
    	   Student student_1=(Student) ac.getBean("student_1");
    	   Student student_2=(Student) ac.getBean("student_2");
    	   System.out.println(student_1+"\n"+student_2);
       }
}