package com.example.demo;

import java.time.LocalDate;

import org.springframework.stereotype.Component;
import com.example.demo.IUserNotifier.NotificationType;

@Component
public class HelloService implements IHelloService {

    private final IUserNotifier notification;

    public HelloService(IUserNotifier notification){
        this.notification = notification;
    }


    @Override
    public void sayHello() {
        var emp = new Employee("Taro", LocalDate.of(1990, 10, 1), "Sales");
        this.notification.notify(NotificationType.NORMAL, String.format("Hello, %s!!", emp));
    }
}


record Employee(String name, LocalDate dateOfBirth, String department){}