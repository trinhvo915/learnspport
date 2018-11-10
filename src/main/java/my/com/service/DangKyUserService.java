package my.com.service;

import my.com.dao.DangKyUserDao;
import my.com.daoimpl.DangKyUserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DangKyUserService implements DangKyUserImpl{

    @Autowired
    DangKyUserDao dangKyUserDao;


    @Override
    public boolean checkDangKy(String username, String password) {

        return false;
    }
}
