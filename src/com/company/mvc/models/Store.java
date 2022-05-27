package com.company.mvc.models;

public class Store {

    private String name;
    private String url;
    private User[] users;
    private User authorizedUser;

    public Store(String name, String url, User[] users) {
        this.name = name;
        this.url = url;
        this.users = users;
    }

    public Store() {
        // EMPTY
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public User getAuthorizedUser() {
        return authorizedUser;
    }

    public void setAuthorizedUser(User authorizedUser) {
        this.authorizedUser = authorizedUser;
    }

    public boolean login(String login, String pass) {
        for (int i = 0; i < users.length; i++) {
            if (login.equals(users[i].getLogin()) && pass.equals(users[i].getPass())){
                authorizedUser = users[i];
                return true;
            }
        }
        return false;
    }

    public void getCurrentUserRights(){
        switch (authorizedUser.getRole()){
            case CHIEF -> System.out.println("Chief can manage personnel and prices.");
            case ADMIN -> System.out.println("Administrator can add products and edit their description.");
            case MANAGER -> System.out.println("Store manager can communicate with customers.");
            case CLIENT -> System.out.println("Client can buy goods and enjoy discount.");
            case ANONYMOUS -> System.out.println("Anonymous user can buy goods and/or log in.");
        }
    }

    public void logOut() {
        authorizedUser = null;
        System.out.println("User has logged out.");
    }
}



