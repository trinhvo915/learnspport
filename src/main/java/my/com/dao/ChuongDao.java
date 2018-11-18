package my.com.dao;

import my.com.daoimpl.ChuongImpl;
import my.com.entity.Chuong;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ChuongDao implements ChuongImpl {
    @Autowired
    SessionFactory sessionFactory;

    @Override
    @Transactional
    public ArrayList<Chuong> listChuong() {
        try {
            Session session = sessionFactory.getCurrentSession();
            ArrayList<Chuong> chuongs = new ArrayList<Chuong>();
            String sql = " FROM chuong";
            chuongs = (ArrayList<Chuong>) session.createQuery(sql).getResultList();
            return chuongs;
        }catch (Exception e){
            System.out.println("Error : "+e);
        }
        return null;
    }

    @Override
    public ArrayList<Chuong> listChuong(Integer idMonHoc) {
        try {
            Session session = sessionFactory.getCurrentSession();
            ArrayList<Chuong> chuongs = new ArrayList<Chuong>();
            String sql = "FROM chuong WHERE monHoc.idmonhoc ='"+idMonHoc+"'";
            chuongs = (ArrayList<Chuong>) session.createQuery(sql).getResultList();
            if(chuongs.size()!=0){
                return chuongs;
            }
        }catch (Exception e){
            System.out.println("Error : "+e);
        }
        return null;
    }

    @Override
    @Transactional
    public void update(Chuong chuong) {

    }

    @Override
    @Transactional
    public boolean add(Chuong chuong) {
        return false;
    }

    @Override
    @Transactional
    public List<Chuong> findName(String name) {
        return null;
    }

    @Override
    @Transactional
    public Chuong findById(Integer id) {
        try {
            Session session = sessionFactory.getCurrentSession();
            Chuong chuong = session.get(Chuong.class,(Serializable) id);
            return chuong;
        }catch (Exception e){
            System.out.println("Error : "+e);
        }
        return null;
    }

    @Override
    @Transactional
    public String deleleChuong(Integer id) {
        try {
            Session session = sessionFactory.getCurrentSession();
            Chuong chuong = findById(id);
            if(chuong!=null){
                session.delete(chuong);
                return "successful";
            }
        }catch (Exception e){
            System.out.println("Error : "+e);
        }
        return null;
    }
}
