package cn.cc.dao;

import cn.cc.entity.User;

/**
 * Created by CC on 17/7/23.
 */
public interface UserDAO {

    User getUserEntityByAccount(User user);
}
