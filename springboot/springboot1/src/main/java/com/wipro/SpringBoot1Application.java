package com.wipro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot1Application implements CommandLineRunner{

	@Autowired
	private ApplicationContext applicationContext;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBoot1Application.class, args);
	}

	public void run(String... args) throws Exception {
		String[] beans = applicationContext.getBeanDefinitionNames();
        for (String bean : beans)
            System.out.println(bean);
	}

}
