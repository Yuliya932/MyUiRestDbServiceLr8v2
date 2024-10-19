package ru.maslova.MyUiRestDbServiceLr8v2.service;

import org.springframework.stereotype.Service;
import ru.maslova.MyUiRestDbServiceLr8v2.dto.UserDto;
import ru.maslova.MyUiRestDbServiceLr8v2.entity.User;

import java.util.List;


public interface UserService {
    void saveUser (UserDto userDto);

    User findUserByEmail (String email);

    List<UserDto> findAllUsers();
}
