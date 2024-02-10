package com.example.demo;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class HelloService implements IHelloService {
    @Override
    public void sayHello() {
        var emp = new Employee("Taro", LocalDate.of(1990, 10, 1), "Sales");
        System.out.println(String.format("Hello, %s!!", emp));
    }
}


record Employee(String name, LocalDate dateOfBirth, String department){

}