package com.example.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		BeanFactory applicationContext = SpringApplication.run(DemoApplication.class, args);
		IHelloService helloService = applicationContext.getBean(IHelloService.class);
		helloService.sayHello();
	}

}
