package com.example.app;

import com.example.password.PasswordGenerator;

public class Main {

    public static void main(String[] args) {
        PasswordGenerator generator = new PasswordGenerator();

        String password = generator.generatePassword(12);

        System.out.println("Password: " + password);
        System.out.println("Length: " + password.length());
    }
}