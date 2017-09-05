package com.spring.services.login;

import com.spring.models.User;

public interface LoginService {
    String[] validate(User user);
}
