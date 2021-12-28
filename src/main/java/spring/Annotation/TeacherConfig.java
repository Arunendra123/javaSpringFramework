package spring.Annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TeacherConfig {
   @Bean
   public Teacher getTeacher() {
	   return new Teacher();
   }
}
