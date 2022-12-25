package com.ebissys.waterwatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WaterwatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(WaterwatchApplication.class, args);
		
	}

}
