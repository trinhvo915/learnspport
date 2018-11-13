package my.com.dao;

import my.com.daoimpl.DanhMucImpl;
import my.com.entity.MonHoc;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import java.sql.Timestamp;
import java.util.ArrayList;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class DanhMucDao implements DanhMucImpl {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    @Transactional
    public ArrayList<MonHoc> listDanhMuc() {
        try {
            Session session = sessionFactory.getCurrentSession();
            ArrayList<MonHoc> listmonhoc = new ArrayList<MonHoc>();
            String sql =" FROM monhoc";
            listmonhoc = (ArrayList<MonHoc>) session.createQuery(sql).getResultList();
            return listmonhoc;
        }catch (Exception e){
            System.out.println("Error : +"+e);
        }
        return null;
    }

    @Override
    @Transactional
    public void update(MonHoc monHoc) {
        try {
            Session session = sessionFactory.getCurrentSession();

        }catch (Exception e){
            System.out.println("Error : "+e);
        }
    }

    @Override
    @Transactional
    public boolean add(MonHoc monHoc) {
        try {
            Session session = sessionFactory.getCurrentSession();
//            String HQL = "INSERT INTO MonHoc (nameMonHoc,createday)VALUE ('"+monHoc.getNameMonHoc()+"','"+monHoc.getCreateday()+"')";
//            Query query = session.createQuery(HQL);
            session.save(monHoc);
           // query.executeUpdate();
            return true;
        }catch (Exception e){
            System.out.println("Error : "+e);
        }
        return false;
    }

    @Override
    @Transactional
    public MonHoc findName(String name) {
        try {
            Session session = sessionFactory.getCurrentSession();
            String sql = "FROM monhoc WHERE nameMonHoc = '"+name+"'";
            MonHoc monHoc =
                    (MonHoc) session.createQuery(sql);
            return monHoc;
        }catch (Exception e){
            System.out.println("Error : "+e);
        }
        return null;
    }

    @Override
    @Transactional
    public MonHoc findById(Integer id) {
        try {
            Session session = sessionFactory.getCurrentSession();
            String sql = "FROM monhoc WHERE nameMonHoc = '"+id+"'";
            MonHoc monHoc = (MonHoc) session.createQuery(sql);
            return monHoc;
        }catch (Exception e){
            System.out.println("Error : "+e);
        }
        return null;
    }

}
