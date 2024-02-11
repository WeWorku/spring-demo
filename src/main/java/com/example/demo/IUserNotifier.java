package com.example.demo;

public interface IUserNotifier {
    enum NotificationType{
        IMMEDIATE,
        DELAYED,
        NORMAL
    }

    void notify(NotificationType type, String msg);
}
