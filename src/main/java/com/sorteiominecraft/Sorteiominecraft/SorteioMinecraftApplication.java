package com.sorteiominecraft.Sorteiominecraft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Profile;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SorteioMinecraftApplication {

	public static void main(String[] args) {
		SpringApplication.run(SorteioMinecraftApplication.class, args);
	}

}
