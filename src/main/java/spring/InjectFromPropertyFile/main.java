package spring.InjectFromPropertyFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
       public static void main (String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
  
    	   ApplicationContext ac=new ClassPathXmlApplicationContext("spring/InjectFromPropertyFile/config.xml");
    	   ConnectionPool cp=ac.getBean("connection_pool",ConnectionPool.class);
    	   cp.createConnection();
       }
}