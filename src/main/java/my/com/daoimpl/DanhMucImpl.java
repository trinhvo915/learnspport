package my.com.daoimpl;

import my.com.entity.MonHoc;
import my.com.entity.Role;

import java.util.ArrayList;
import java.util.List;

public interface DanhMucImpl {
    ArrayList<MonHoc> listDanhMuc();
    void update(MonHoc monHoc);
    boolean add(MonHoc monHoc);
    List<MonHoc> findName(String name);
    MonHoc findById(Integer id);
    String deleleMonhoc(Integer id);
 }
