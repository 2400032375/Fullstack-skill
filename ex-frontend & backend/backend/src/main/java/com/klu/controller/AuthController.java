package com.klu.controller;

import com.klu.model.User;
import com.klu.service.UserService;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:5173")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public User register(@RequestBody @NonNull User user) {
        return userService.registerUser(user);
    }

    @PostMapping("/login")
    @Nullable
    public User login(@RequestBody @NonNull User user) {
        return userService.login(
            Objects.requireNonNull(user.getEmail(), "Email is required"),
            Objects.requireNonNull(user.getPassword(), "Password is required")
        );
    }
}
