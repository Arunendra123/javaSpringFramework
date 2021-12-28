package spring.Annotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import de.codecentric.boot.admin.client.config.SpringBootAdminClientAutoConfiguration;

@Configuration
@Import({TeacherConfig.class,StudentConfig.class,SpringBootAdminClientAutoConfiguration.class})
public class UnivercityConfig {
}
