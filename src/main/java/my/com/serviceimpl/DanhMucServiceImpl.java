package my.com.serviceimpl;

import my.com.entity.MonHoc;

import java.util.ArrayList;
import java.util.List;

public interface DanhMucServiceImpl {
    ArrayList<MonHoc> listDanhMuc();
    List<MonHoc> findName(String name);
    String  SaveorUpdate(MonHoc monHoc);
    MonHoc findById(Integer id);
    String deleleMonhoc(Integer id);
}
