package com.example.adb2c.spring_boot_login_azure_ad_b2c;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
@EnableMethodSecurity
public class Started {

	public static void main(String[] args) {
		SpringApplication.run(Started.class, args);
	}

}
