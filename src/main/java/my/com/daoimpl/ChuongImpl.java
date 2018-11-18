package my.com.daoimpl;

import my.com.entity.Chuong;

import java.util.ArrayList;
import java.util.List;

public interface ChuongImpl {
    ArrayList<Chuong> listChuong();
    ArrayList<Chuong> listChuong(Integer idMonHoc);
    void update(Chuong chuong);
    boolean add(Chuong chuong);
    List<Chuong> findName(String name);
    Chuong findById(Integer id);
    String deleleChuong(Integer id);
}
