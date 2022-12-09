package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class BootmvcProj01SchedulingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootmvcProj01SchedulingApplication.class, args);
	}

}
