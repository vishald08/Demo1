package com.tppg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DemoDevOps1Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoDevOps1Application.class, args);
	}

}
