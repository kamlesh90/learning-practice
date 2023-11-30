package com.example.cac;

import com.example.cac.api.JsonLog;
import com.example.cac.api.LogApi;
import com.example.cac.api.XmlLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomAutoConfigurationApplication  {
	@Autowired
	ApplicationContext context;
	public static void main(String[] args) {
		SpringApplication.run(CustomAutoConfigurationApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(){
		return args -> {
			LogApi logApi = context.getBean(JsonLog.class);
			//logApi.generate("<xml>Seeta</xml>");
			logApi.generate("{"+"name"+":"+"Ram"+"}");
		};
	}

}
