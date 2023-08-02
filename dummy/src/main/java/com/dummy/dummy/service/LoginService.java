package com.dummy.dummy.service;

import com.dummy.dummy.entity.Login;
import com.dummy.dummy.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private LoginRepository loginRepository;

    public Login save(Login login){
        return loginRepository.save(login);
    }
}
