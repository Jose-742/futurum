package br.gov.to.egefaz.futurum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class FuturumApplication {

	public static void main(String[] args) {
		SpringApplication.run(FuturumApplication.class, args);
	}

}
