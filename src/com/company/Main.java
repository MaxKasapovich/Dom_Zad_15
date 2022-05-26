package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("Elon Musk","qwerty1","Musk");
        user1.setRole(Positions.CHIEF);

        User user2 = new User("Joseph Biden","qwerty2","Biden");
        user2.setRole(Positions.ADMIN);

        User user3 = new User("Dmitri Rogozin","qwerty3","Rogozin");
        user3.setRole(Positions.MANAGER);

        User user4 = new User("Volodimir Zelensky","qwerty4","Zelensky");
        user4.setRole(Positions.CLIENT);

        User user5 = new User("Boris Johnson","qwerty5","Johnson");
        user5.setRole(Positions.CLIENT);

        User[] users = {user1,user2,user3,user4,user5};

        Store store = new Store("SpaceX","www.spaceX.com",users);

        while (true){
            tryLogin(store);
        }
    }

    public static void tryLogin(Store store) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter login: ");
        String login = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = scanner2.nextLine();

        if(store.login(login,password)){
            store.getCurrentUserRights();
            store.logOut();
        } else {
            System.out.println("Invalid username and/or password.");
        }
    }
}
