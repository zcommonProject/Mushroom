package net.cn.mgw.provide.user.service.impl;

import net.cn.mgw.provide.user.dao.UserMapper;
import net.cn.mgw.provide.user.entity.User;
import net.cn.mgw.provide.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userDao;

    public int insert(User user) throws Exception {
        System.out.println("hello user service impl");
        System.out.println(this.userDao);
        this.userDao.insert(user);
        return 0;
    }
}
