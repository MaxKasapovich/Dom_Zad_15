package com.company.mvc.view;

import com.company.mvc.dto.UserDto;

public class LoginResponse {

    public  void printLogOutInfo(UserDto userDto) {
        System.out.println("User: " + userDto.getName() + " has logged out.");
    }

    public void printCurrentUserRights(UserDto userDto){
        System.out.println("Hello: " + userDto.getName() + ". You've logged in successfully");
        System.out.println(userDto.toString());
        switch (userDto.getRole()){
            case CHIEF -> System.out.println("Chief can manage personnel and prices.");
            case ADMIN -> System.out.println("Administrator can add products and edit their description.");
            case MANAGER -> System.out.println("Store manager can communicate with customers.");
            case CLIENT -> System.out.println("Client can buy goods and enjoy discount.");
            case ANONYMOUS -> System.out.println("Anonymous user can buy goods and/or log in.");
        }
    }

    public void printWrongData() {
        System.out.println("Invalid username and/or password.");
    }
}
