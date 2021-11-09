package com.cybertek.service;

import com.cybertek.dto.UserDTO;
import com.cybertek.entity.User;

import java.util.List;

public interface UserService {
    //Describe business logic here
    // Get, save, delete all users etc.
    UserDTO save (UserDTO user);
    UserDTO findByID (String username);
    List<UserDTO> findAll();
    void delete (UserDTO user);
    void deleteByID (String username);

}
