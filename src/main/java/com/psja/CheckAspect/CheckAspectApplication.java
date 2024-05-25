package com.psja.CheckAspect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class CheckAspectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheckAspectApplication.class, args);
	}

}
