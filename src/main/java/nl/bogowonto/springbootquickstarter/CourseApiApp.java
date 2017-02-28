package nl.bogowonto.springbootquickstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Tell spring this is a spring application by adding annotation. 
@SpringBootApplication // starting point of spring-boot application. 
public class CourseApiApp {

	// Here is where the application bootstrap
	public static void main(String[] args) {
		// In this method, tells spring-boot to start this application and create Servlet container and host this application in this container and make it available.
		SpringApplication.run(CourseApiApp.class, args);
	}

}
