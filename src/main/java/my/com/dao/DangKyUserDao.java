package my.com.dao;

import my.com.daoimpl.DangKyUserImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Scope(proxyMode =  ScopedProxyMode.TARGET_CLASS)
public class DangKyUserDao implements DangKyUserImpl {
    @Autowired
    SessionFactory sessionFactory;

    @Override
    @Transactional
    public boolean checkDangKy(String username, String password) {
        Session session = sessionFactory.getCurrentSession();

        return false;
    }
}
