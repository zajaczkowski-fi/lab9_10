package com.example;

public class App {

    public static void main(String[] args) {
        String password = "admin123"; // hardcoded secret – SECURITY VULNERABILITY
        System.out.println("Hello, GitHub CI!");
        System.out.println("Password: " + password); // sensitive info logged
    }

    public void unusedMethod() {
    }
}
