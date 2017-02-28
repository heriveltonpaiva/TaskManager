package br.arquitetura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
@ComponentScan("br.arquitetura.controller")
@EnableJpaRepositories(basePackages = {"br.arquitetura.dao"})
@EntityScan(basePackages = {"br.arquitetura.dominio"})
public class TaskManagerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(TaskManagerApplication.class, args);	
	}
	
	@Bean
	public WebSecurityConfigurerAdapter webSecurityConfigurerAdapter(){
		return new WebSecurityConfig();
	}
}
