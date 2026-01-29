package com.example.bai2_ss8_module4.service;

import com.example.bai2_ss8_module4.model.User;
import com.example.bai2_ss8_module4.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
