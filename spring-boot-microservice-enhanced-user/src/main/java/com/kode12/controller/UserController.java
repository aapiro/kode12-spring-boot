package com.kode12.controller;

import com.kode12.service.UserService;
import com.kode12.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/{userId}")
    public UserVO getById(@PathVariable("userId") int userId) {

        return userService.getById(userId);
    }

}
