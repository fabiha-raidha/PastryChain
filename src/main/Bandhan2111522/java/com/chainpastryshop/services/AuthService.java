package com.chainpastryshop.services;

public class AuthService {
    public boolean register(String username, String email, String password, String confirmPassword) {
        if (password.equals(confirmPassword) && !username.isEmpty() && !email.isEmpty()) {
            System.out.println("User registered successfully!");
            return true;
        }
        return false;
    }
}

