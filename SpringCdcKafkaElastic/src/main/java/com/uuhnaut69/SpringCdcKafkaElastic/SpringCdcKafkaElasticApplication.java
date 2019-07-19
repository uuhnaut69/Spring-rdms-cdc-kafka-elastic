package com.uuhnaut69.SpringCdcKafkaElastic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories
@EnableAutoConfiguration
@EnableTransactionManagement
@EntityScan
@ComponentScan
public class SpringCdcKafkaElasticApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCdcKafkaElasticApplication.class, args);
	}

}
