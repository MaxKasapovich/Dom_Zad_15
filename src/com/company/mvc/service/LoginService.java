package com.company.mvc.service;

import com.company.mvc.dto.UserDto;
import com.company.mvc.dto.UsersDataDto;
import com.company.mvc.models.Store;
import com.company.mvc.view.LoginRequest;
import com.company.mvc.view.LoginResponse;

public class LoginService {

    public UserDto createUserDto(){
        LoginRequest loginRequest = new LoginRequest();
        UserDto userDto = loginRequest.createLogInData();
        return userDto;
    }

    public boolean isAuthorised(UserDto userDto, UsersDataDto usersDataDto){
        for (int i = 0; i < usersDataDto.getUsers().length; i++) {
            if (userDto.getLogin().equals(usersDataDto.getUsers()[i].getLogin()) && userDto.getPass().equals(usersDataDto.getUsers()[i].getPass())){
                userDto.setName(usersDataDto.getUsers()[i].getName());
                userDto.setLogin(usersDataDto.getUsers()[i].getLogin());
                userDto.setPass(usersDataDto.getUsers()[i].getPass());
                userDto.setRole(usersDataDto.getUsers()[i].getRole());
                return true;
            }
        }
        return false;
    }

    public UsersDataDto createUserDataDto(Store store){
        UsersDataDto usersDataDto = new UsersDataDto();
        usersDataDto.setUsers(store.getUsers());
        return usersDataDto;
    }

    public void tryLogin (UserDto userDto, UsersDataDto usersDataDto) {
        LoginResponse loginResponse = new LoginResponse();
        if (isAuthorised(userDto, usersDataDto)){
            loginResponse.printCurrentUserRights(userDto);
            loginResponse.printLogOutInfo(userDto);
        }else {
           loginResponse.printWrongData();
        }
    }
}
