package com.example.demo.io;

import org.springframework.stereotype.Component;

import com.example.demo.IUserNotifier;

import java.util.function.Consumer;

@Component
public class StandardIO implements IUserNotifier {
    @Override
    public void notify(NotificationType type, String message) {
        Consumer<String> outputFunction = switch (type) {
            case IMMEDIATE -> System.out::println;
            default -> StandardIO::delayedOutput;
        };
        outputFunction.accept(message);
    }

    private static void delayedOutput(String message) {
        // TODO: 遅延出力
        System.out.println(message);
    }
}
