package com.company.mvc.controller;

import com.company.mvc.dto.UserDto;
import com.company.mvc.dto.UsersDataDto;
import com.company.mvc.models.Store;
import com.company.mvc.service.LoginService;

public class Controller {
    public void execute(Store store){
        LoginService loginService = new LoginService();
        UserDto userDto = loginService.createUserDto();
        UsersDataDto usersDataDto = loginService.createUserDataDto(store);
        loginService.tryLogin(userDto, usersDataDto);
    }
}
