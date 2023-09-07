package com.conghuy.lms.service;

import com.conghuy.lms.entity.User;
import com.conghuy.lms.entity.UserRole;

import java.util.Set;

public interface UserService {

    //creating user

    public User createUser (User user, Set<UserRole> userRoles);


}
