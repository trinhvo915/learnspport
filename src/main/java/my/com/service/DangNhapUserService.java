package my.com.service;

import my.com.dao.DangNhapUserDao;
import my.com.daoimpl.DangNhapUserIpml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DangNhapUserService implements DangNhapUserIpml {
    @Autowired
    DangNhapUserDao dangNhapUserDao;
    // class nay se xu ly login
    public boolean checkLogin(String username, String password) {
        boolean checklogin = dangNhapUserDao.checkLogin(username,password);
        return checklogin;
    }

    @Override
    public boolean checkdk(String username, String password) {

        return false;
    }
}
