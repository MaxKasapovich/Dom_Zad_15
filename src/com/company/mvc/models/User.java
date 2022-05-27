package com.company.mvc.models;

public class User {

    private String name;
    private String pass;
    private String login;
    private Positions role;

    public User(String name, String pass, String login) {
        this.name = name;
        this.pass = pass;
        this.login = login;
        role = Positions.ANONYMOUS;
    }

    public User() {
        // EMPTY
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Positions getRole() {
        return role;
    }

    public void setRole(Positions role) {
        this.role = role;
    }
}
