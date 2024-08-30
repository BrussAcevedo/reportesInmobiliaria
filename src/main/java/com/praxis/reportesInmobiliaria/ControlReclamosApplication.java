package com.praxis.reportesInmobiliaria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.praxis.reportesInmobiliaria.configuration.SecurityConfig;
import com.praxis.reportesInmobiliaria.dao.UserDaoImp;
import com.praxis.reportesInmobiliaria.repository.UserRepository;
import com.praxis.reportesInmobiliaria.service.UserServiceImp;

@SpringBootApplication
public class ControlReclamosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControlReclamosApplication.class, args);
		//AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(AppConfig.class);

		//BCryptPasswordEncoder passwordEnc = new BCryptPasswordEncoder();
		
		//System.out.println(passwordEnc.encode("moderatorTst"));
		
		
		
		
	}

}
