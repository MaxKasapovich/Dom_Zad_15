package com.company.mvc.dto;

import com.company.mvc.models.User;

public class UsersDataDto {

    private User[] users;

    public UsersDataDto(User[] users) {
        this.users = users;
    }

    public UsersDataDto() {
        // EMPTY
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }
}
