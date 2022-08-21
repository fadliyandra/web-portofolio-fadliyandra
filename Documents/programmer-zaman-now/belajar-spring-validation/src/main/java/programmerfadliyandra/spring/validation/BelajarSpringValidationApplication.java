package programmerfadliyandra.spring.validation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import programmerfadliyandra.spring.validation.properties.DatabaseProperties;

@EnableConfigurationProperties({
		DatabaseProperties.class
})

@SpringBootApplication
public class BelajarSpringValidationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BelajarSpringValidationApplication.class, args);
	}

}
