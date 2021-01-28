package com.microgram.home51lesson02.service;

import com.microgram.home51lesson02.DTO.UserDto;
import com.microgram.home51lesson02.exception.UserAlreadyExistException;
import com.microgram.home51lesson02.model.User;

public interface IUserService {
    User registerNewUserAccount(UserDto userDto)
            throws UserAlreadyExistException, UserAlreadyExistException;
}
