package com.example.demo;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.persistence.Entity;

import com.example.entity.Entity0001;
import com.example.service.DemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan( {"com.example"})
@EntityScan(basePackages = "com.example.entity")
@EnableJpaRepositories("com.example.repository") 
public class DemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		ApplicationContext applicationContext =  SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	ApplicationContext applicationContext;

	@Override
    public void run(String... args) {
        long startTime = System.currentTimeMillis();
		DemoService ds = applicationContext.getBean(DemoService.class);
		ds.runDemo();
		long totalTime = System.currentTimeMillis() - startTime;
		System.out.println("done "  + totalTime + "ms");
    }

}
