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
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

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
            session.update(monHoc);
        }catch (Exception e){
            System.out.println("Error : "+e);
        }
    }

    @Override
    @Transactional
    public boolean add(MonHoc monHoc) {
        try {
            Session session = sessionFactory.getCurrentSession();
//            MonHoc monHoc1 = new MonHoc();
//            monHoc1.setNameMonHoc(monHoc.getNameMonHoc());
//            monHoc1.setCreateday(monHoc.getCreateday());
//            String HQL = "INSERT INTO MonHoc (nameMonHoc,createday)VALUE ('"+monHoc.getNameMonHoc()+"','"+monHoc.getCreateday()+"')";
//            Query query = session.createQuery(HQL);
            //session.save(monHoc);
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
    public List<MonHoc> findName(String name) {
        try {
            Session session = sessionFactory.getCurrentSession();
//            String sql = "FROM monhoc WHERE nameMonHoc = '"+name+"'";
//            MonHoc monHoc = (MonHoc) session.createQuery(sql);
            String hql = "from my.com.entity.MonHoc o where 1=1 ";
            if(name != null){
                hql +=" and o.nameMonHoc = '"+ name+"'";
            }
            List result = session.createQuery(hql).list();
            if( result.size() !=0){
                return  result;
            }
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
            MonHoc monHoc = (MonHoc)session.get(MonHoc.class,(Serializable)id);
            //String sql = "FROM monhoc WHERE idmonhoc = '"+id+"'";
            //MonHoc monHoc = (MonHoc) session.createQuery(sql);
            return monHoc;
        }catch (Exception e){
            System.out.println("Error : "+e);
        }
        return null;
    }

    @Override
    @Transactional
    public String deleleMonhoc(Integer id) {
        try {
            MonHoc monHoc = findById(id);
            if(monHoc !=null){
                Session session = sessionFactory.getCurrentSession();
                session.delete(monHoc);
                return "successful";
            }
        }catch (Exception e){
            System.out.println("Error : "+e);
        }
        return null;
    }

}
