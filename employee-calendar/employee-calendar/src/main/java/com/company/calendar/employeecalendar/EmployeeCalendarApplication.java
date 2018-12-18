package com.company.calendar.employeecalendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.company.calendar.employeecalendar.repository")
@SpringBootApplication
public class EmployeeCalendarApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeCalendarApplication.class, args);
	}
}
