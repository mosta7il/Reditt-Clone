package com.springIt.redittClone;

import org.ocpsoft.prettytime.PrettyTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.thymeleaf.extras.springsecurity5.dialect.SpringSecurityDialect;




@SpringBootApplication
@EnableTransactionManagement
public class RedittCloneApplication {

	private static final Logger log = LoggerFactory.getLogger(RedittCloneApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RedittCloneApplication.class, args);
	}

	@Bean
	PrettyTime prettyTime() {
		return new PrettyTime();
	}

	@Bean
	public SpringSecurityDialect securityDialect() {
		return new SpringSecurityDialect();
	}

}
