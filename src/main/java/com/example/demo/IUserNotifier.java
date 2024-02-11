package com.example.demo;

public interface IUserNotifier {
    enum Timing{
        IMMEDIATE,
        DELAYED,
        NORMAL
    }

    void notify(Timing type, String msg);
}
