package com.revature.springfitness;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The @SpringBootApplication annotation enables automatic configuration of a Spring App. Spring Boot is its own
 * project within Spring, and it is possible to create a running Spring app without using Spring Boot by using a
 * BeanFactory or ApplicationContext (which extends BeanFactory), which are objects representing the Spring Context,
 * and are objects through which Spring Beans can be retrieved from the IOC container (inversion-of-control.) Beans
 * are objects that are instantiated & managed by the Spring IOC container rather than the developer, allowing for
 * Spring to conduct Dependency Injection, where an instantiated object is automatically injected into a class where
 * the @Autowired annotation is present.
 */
@SpringBootApplication
public class Application {
	/**
	 * The main method will contain the SpringApplication.run method, which uses the containing class
	 * (Application.class) as the configuration class. Any custom configuration of Beans (such as determining
	 * how a bean should be instantiated with @Bean, instead of using the bean's default constructor.) It will
	 * automatically start all Controllers of the application.
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

}