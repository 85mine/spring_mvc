package com.spring.services.register;

import com.spring.dao.UserDao;
import com.spring.models.User;
import org.springframework.beans.factory.annotation.Autowired;

public class RegisterServiceImpl implements RegisterService {

    @Autowired
    UserDao userDao;

    public void register(User user) {
        userDao.create(user);
    }
}
