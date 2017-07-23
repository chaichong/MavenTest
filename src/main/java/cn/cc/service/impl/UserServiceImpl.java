package cn.cc.service.impl;

import cn.cc.dao.UserDAO;
import cn.cc.entity.User;
import cn.cc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by CC on 17/7/23.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    public User getUserEntityByAccount(User user) {
        return userDAO.getUserEntityByAccount(user);
    }
}
