package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        return (User) userService.getUser(id);
    }

    @PostMapping
    public User getUserFromJson(@RequestBody User user) {
        return (User) userService.getUser(user.getId());
    }
}
