package com.example.demo;

import com.example.demo.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User getUser(int id);
}
