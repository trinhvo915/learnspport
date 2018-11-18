package my.com.service;

import my.com.dao.DanhMucDao;
import my.com.daoimpl.DanhMucImpl;
import my.com.entity.MonHoc;
import my.com.serviceimpl.DanhMucServiceImpl;
import my.com.utils.ConvertTimesamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class DanhMucService implements DanhMucServiceImpl {

    @Autowired
    DanhMucDao danhMucDao;
    @Override
    public ArrayList<MonHoc> listDanhMuc() {
        ArrayList<MonHoc> list = danhMucDao.listDanhMuc();
        return list;
    }

    @Override
    public List<MonHoc> findName(String name) {
        return danhMucDao.findName(name);
    }
    @Override
    public MonHoc findById(Integer id) {
        return danhMucDao.findById(id);
    }

    @Override
    public String deleleMonhoc(Integer id) {
        return  danhMucDao.deleleMonhoc(id);
    }

    @Override
    public String SaveorUpdate(MonHoc monHoc) {
        if(findName(monHoc.getNameMonHoc())==null&&findById(monHoc.getIdmonhoc())==null){ //findById(monHoc.getIdmonhoc())==null &&
           String name = monHoc.getNameMonHoc();
            java.sql.Date date1 = ConvertTimesamp.converStringtoDate();
            //MonHoc monHoc1 = new MonHoc(name,date1);
            boolean check=  danhMucDao.add(monHoc);
            System.out.println("Check :" +check);
            return "add";
        }else{
            danhMucDao.update(monHoc);
            return "update";
        }
    }

}
