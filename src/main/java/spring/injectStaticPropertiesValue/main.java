/**
 * 
 */
package spring.injectStaticPropertiesValue;

import org.springframework.beans.factory.config.MethodInvokingFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ArDubey
 *
 */
public class main {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring/injectStaticPropertiesValue/config.xml");
	    Student s1=ac.getBean("s_1",Student.class);
	    System.out.println(s1);
	}

}
