package my.com.dao;

import my.com.daoimpl.DangNhapUserIpml;
import my.com.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class DangNhapUserDao implements DangNhapUserIpml {
    @Autowired
    SessionFactory sessionFactory;

    @Override
    @Transactional
    public boolean checkLogin(String username, String password) {
        Session session = sessionFactory.getCurrentSession();
        try {
            User user = (User) session.
                    createQuery("from user where username = '"+username+"'and password ='"+password+"'")
                    .getSingleResult();

            if(user !=null) {
                return  true;
            }
        }catch (Exception e){
            System.out.println("dang nha that bai");
        }
        return false;
    }

    @Override
    public boolean checkdk(String username, String password) {
        // qr = :
        return false;
    }
}
