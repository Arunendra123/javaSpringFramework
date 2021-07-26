package spring.Annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*@Configuration
@ComponentScan(basePackages="spring.Annotation")
public class StudentConfig {

}
*/

@Configuration
public class StudentConfig {
	@Bean
	public Student getStudent() {
		return new Student();
	}
}