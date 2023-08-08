package com.yash.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

//import com.yash.demo.Dao.CustomRepositoryImpl;

@SpringBootApplication
//@EnableJpaRepositories(repositoryBaseClass = CustomRepositoryImpl.class)
public class JpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

}
