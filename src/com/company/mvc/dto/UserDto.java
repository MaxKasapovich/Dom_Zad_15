package com.company.mvc.dto;

import com.company.mvc.models.Positions;

public class UserDto {

    private String name;
    private String pass;
    private String login;
    private Positions role = Positions.ANONYMOUS;

    public UserDto(String login, String pass) {
        this.pass = pass;
        this.login = login;
    }

    @Override
    public String toString() {
        return "User info: {" +
                "Name: '" + name + '\'' +
                ", Password: '" + pass + '\'' +
                ", Login: '" + login + '\'' +
                '}';
    }

    public UserDto() {
        //EMPTY
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
