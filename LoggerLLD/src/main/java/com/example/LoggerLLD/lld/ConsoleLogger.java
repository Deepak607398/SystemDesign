package com.example.LoggerLLD.lld;

public class ConsoleLogger implements LogObserver {
    @Override
    public void log(String message) {
        System.out.println("CONSOLE MESSAGE : "+ message);
    }
}
