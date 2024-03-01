package com.company.juniorcrudservice.controller;

import com.company.juniorcrudservice.dto.UserDto;
import com.company.juniorcrudservice.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("users")
public class UserController {

    private final UserService userService;

    @GetMapping("/first")
    public UserDto getFirstUser() {
        return userService.getFirstOne();
    }
}
