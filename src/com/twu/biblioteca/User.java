package com.twu.biblioteca;

public class User {
    private String id;
    private String password;
    private String name;
    private String email;

    public User(String id, String password, String name, String email) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.email = email;
    }

    public boolean logIn(String password) {
        return password.equals(this.password);
    }

    public String getId() {
        return id;
    }
}
