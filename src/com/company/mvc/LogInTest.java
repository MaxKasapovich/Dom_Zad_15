package com.company.mvc;

import com.company.mvc.controller.Controller;
import com.company.mvc.models.Positions;
import com.company.mvc.models.User;
import com.company.mvc.models.Store;

public class LogInTest {

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
            Controller controller = new Controller();
            controller.execute(store);
        }
    }
}
