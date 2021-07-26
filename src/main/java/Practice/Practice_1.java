package Practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class Practice_1 {
	public static void main(String args[]) {
		ConfigurableApplicationContext cac=SpringApplication.run(Practice_1.class, args);
		PropertiesTest pt=cac.getBean(PropertiesTest.class);
		pt.printProperties();
	}
}

@Configuration
@ComponentScan(basePackages = { "Practice.*" })
@PropertySource("classpath:practice_1.properties")
class PropertiesTest{
	 
	 @Autowired
	 private Environment env;
	 
     public void printProperties() {
    	 String httpTimeoutValue = env.getProperty("http.session.timeout");
         System.out.print(httpTimeoutValue);
     }
}
