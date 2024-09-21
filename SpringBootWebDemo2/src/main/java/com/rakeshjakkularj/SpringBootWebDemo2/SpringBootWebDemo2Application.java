package com.rakeshjakkularj.SpringBootWebDemo2;

import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWebDemo2Application {

	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootWebDemo2Application.class, args);
		System.out.println("Hello World!");
//		Tomcat tomcat = new Tomcat();
//		tomcat.setPort(8081);
	}

}
