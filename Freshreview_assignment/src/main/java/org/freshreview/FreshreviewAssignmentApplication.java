package org.freshreview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class FreshreviewAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreshreviewAssignmentApplication.class, args);
	}

}
