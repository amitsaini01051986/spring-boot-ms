package org.shopping.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Amit Saini
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class CustomerApiApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(CustomerApiApp.class, args);
	}

}
