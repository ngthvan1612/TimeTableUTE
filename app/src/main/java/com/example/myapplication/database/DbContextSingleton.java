package com.example.myapplication.database;

public class DbContextSingleton {
    private static DbContext instance;

    public static DbContext getInstance() {
        if (instance == null) {
            instance = new DbContext();
        }

        return instance;
    }
}
