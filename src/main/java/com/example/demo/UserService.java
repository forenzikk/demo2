package com.example.demo;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User getUser(int id);
}
