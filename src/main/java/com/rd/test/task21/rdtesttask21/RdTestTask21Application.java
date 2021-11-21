package com.rd.test.task21.rdtesttask21;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import lombok.extern.slf4j.Slf4j;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * @author hemak
 *
 */
@EnableSwagger2
@Slf4j
@EnableScheduling
@SpringBootApplication
@ComponentScan("com.rd.test.task21")
public class RdTestTask21Application {

	public static void main(String[] args) {
		SpringApplication.run(RdTestTask21Application.class, args);
		log.info("Application Started******");

	}
}
