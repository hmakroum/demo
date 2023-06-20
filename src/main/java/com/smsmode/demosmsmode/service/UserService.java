package com.smsmode.demosmsmode.service;

import com.smsmode.demosmsmode.model.User;

public interface UserService {
    public void save(User user);

    public User findUserByID(String ID);
}
