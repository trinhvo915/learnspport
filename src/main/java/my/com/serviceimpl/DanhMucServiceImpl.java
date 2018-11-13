package my.com.serviceimpl;

import my.com.entity.MonHoc;

import java.util.ArrayList;

public interface DanhMucServiceImpl {
    ArrayList<MonHoc> listDanhMuc();
    MonHoc findName(String name);
    String  SaveorUpdate(MonHoc monHoc);
    MonHoc findById(Integer id);
}
