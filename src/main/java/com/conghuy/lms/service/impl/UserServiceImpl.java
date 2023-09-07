package com.conghuy.lms.service.impl;

import com.conghuy.lms.entity.User;
import com.conghuy.lms.entity.UserRole;
import com.conghuy.lms.repository.RoleRepository;
import com.conghuy.lms.repository.UserRepository;
import com.conghuy.lms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;


    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {

        User local = this.userRepository.findByUsername(user.getUsername());
        if (local != null){
            System.out.println("User is already three !!");
            throw new Exception("User already present !!");
        }else {
            for(UserRole ur:userRoles){
                roleRepository.save(ur.getRole());
            }

            user.getUserRoles().addAll(userRoles);
            local = this.userRepository.save(user);

        }
        return local;
    }
}
