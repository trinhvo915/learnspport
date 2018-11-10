package my.com.service;

import my.com.dao.DangNhapUserDao;
import my.com.daoimpl.DangNhapUserIpml;
import my.com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DangNhapUserService implements DangNhapUserIpml {
    @Autowired
    DangNhapUserDao dangNhapUserDao;
    // class nay se xu ly login
    public User checkLogin(String username, String password) {
        User user = dangNhapUserDao.checkLogin(username,password);
        return user;
    }

    @Override
    public User checkLogin(String username) {
        User user = dangNhapUserDao.checkLogin(username);
        return user;
    }

}
