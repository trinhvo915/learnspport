package my.com.daoimpl;

import my.com.entity.User;

import java.util.HashMap;

public interface DangNhapUserIpml {
    User checkLogin(String username , String password);
    User checkLogin(String username);
}
