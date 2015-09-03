/**
 * 
 */
package com.tata.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Tatarao Oleti
 * @Date   Jul 31, 2015
 * 
 */
@SpringBootApplication
public class WebApplication{

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(WebApplication.class);
		app.setShowBanner(true);
		app.run(args);
	}
	
}
