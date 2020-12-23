package com.idesoft.test;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.idesoft.test.model.Local;
import com.idesoft.test.repository.LocalDao;
import com.idesoft.test.service.LocalServiceImp;

@SpringBootApplication
public class TestIdesoftApplication {

	public static void main(String[] args) {
//		SpringApplication.run(TestIdesoftApplication.class, args);
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(AppConfig.class);
		LocalServiceImp local = acac.getBean(LocalServiceImp.class);
		List<Local> locales = local.findByComuna("LAS CONDES");
		for (Local local2 : locales) {
			System.out.println(local2);
		}
		
	}

}
