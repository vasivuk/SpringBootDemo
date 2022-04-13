package com.example.demo.repository;

public class asd {
    private static asd ourInstance = new asd();

    public static asd getInstance() {
        return ourInstance;
    }

    private asd() {
    }
}
