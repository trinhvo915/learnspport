package my.com.serviceimpl;

import my.com.entity.Chuong;

import java.util.ArrayList;
import java.util.List;

public interface ChuongServiceImpl {
    ArrayList<Chuong> listDanhMuc();
    List<Chuong> findName(String name);
    ArrayList<Chuong> listChuong(Integer idMonHoc);
    String  SaveorUpdate(Chuong monHoc);
    Chuong findById(Integer id);
    String deleleChuong(Integer id);
}
