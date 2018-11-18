package my.com.service;

import my.com.dao.ChuongDao;
import my.com.daoimpl.ChuongImpl;
import my.com.entity.Chuong;
import my.com.serviceimpl.ChuongServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ChuongService implements ChuongServiceImpl {
    @Autowired
    ChuongDao chuongDao;

    @Override
    public ArrayList<Chuong> listDanhMuc() {
        ArrayList<Chuong> chuongs = chuongDao.listChuong();
        if(chuongs.size() != 0){
            return  chuongs;
        }
        return null;
    }

    @Override
    public List<Chuong> findName(String name) {
        return null;
    }

    @Override
    public ArrayList<Chuong> listChuong(Integer idMonHoc) {
        ArrayList<Chuong> chuongs = chuongDao.listChuong(idMonHoc);
        if(chuongs.size()!=0){
            return chuongs;
        }
        return null;
    }

    @Override
    public String SaveorUpdate(Chuong monHoc) {
        return null;
    }

    @Override
    public Chuong findById(Integer id) {
        return null;
    }

    @Override
    public String deleleChuong(Integer id) {
        String check = chuongDao.deleleChuong(id);
        if(check.equals("successful")){
            return check;
        }
        return null;
    }
}
