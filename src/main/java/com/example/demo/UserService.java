package com.example.demo;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User getUser(int id);
}
