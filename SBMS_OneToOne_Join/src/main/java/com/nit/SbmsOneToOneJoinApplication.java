package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.service.EmployeeAddress;

@SpringBootApplication
public class SbmsOneToOneJoinApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SbmsOneToOneJoinApplication.class, args);
		
		EmployeeAddress employeeAddress = run.getBean(EmployeeAddress.class);
		
		employeeAddress.empAddress();
	}

}
