package com.smsmode.demosmsmode.service.impl;

import com.smsmode.demosmsmode.model.User;
import com.smsmode.demosmsmode.repository.UserRepository;
import com.smsmode.demosmsmode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void save(User user) {
        userRepository.save(user);

    }

    @Override
    public User findUserByID(String ID) {
        return userRepository.findById(ID).orElse(null);
    }
}
