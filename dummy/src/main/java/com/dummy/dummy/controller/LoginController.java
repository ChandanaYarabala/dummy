package com.dummy.dummy.controller;

import com.dummy.dummy.entity.Login;
import com.dummy.dummy.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/save")
    public Login save(@RequestBody Login login){
        return loginService.save(login);
    }
}
