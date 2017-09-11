package com.spring.services.register;

import com.spring.dao.UserDao;
import com.spring.dao.UserRoleDao;
import com.spring.models.User;
import com.spring.models.UserRole;
import org.springframework.beans.factory.annotation.Autowired;

public class RegisterServiceImpl implements RegisterService {

    @Autowired
    UserDao userDao;

    @Autowired
    UserRoleDao userRoleDao;

    public void register(User user) {
        userDao.create(user);
        userRoleDao.create(new UserRole(user.getUsername(), "ROLE_MEMBER"));
    }
}
