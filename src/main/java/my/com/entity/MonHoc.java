package my.com.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity(name = "monhoc")
public class MonHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idmonhoc;
    private String nameMonHoc;
    private Timestamp createday;

    @OneToMany(mappedBy = "monHoc")
    private List<Chuong> listChuong;

    @OneToMany(mappedBy = "monHoc")
    private List<DaiHocTest> listDaiHocTest;

    public MonHoc() {
    }

    public MonHoc(Integer idmonhoc, String nameMonHoc) {
        this.idmonhoc = idmonhoc;
        this.nameMonHoc = nameMonHoc;
    }

    public MonHoc(String nameMonHoc, Timestamp createday, List<Chuong> listChuong) {
        this.nameMonHoc = nameMonHoc;
        this.createday = createday;
        this.listChuong = listChuong;

    }

    public MonHoc(String nameMonHoc, Timestamp createday, List<Chuong> listChuong, List<DaiHocTest> listDaiHocTest) {
        this.nameMonHoc = nameMonHoc;
        this.createday = createday;
        this.listChuong = listChuong;
        this.listDaiHocTest = listDaiHocTest;
    }

    public List<DaiHocTest> getListDaiHocTest() {
        return listDaiHocTest;
    }

    public void setListDaiHocTest(List<DaiHocTest> listDaiHocTest) {
        this.listDaiHocTest = listDaiHocTest;
    }

    public Timestamp getCreateday() {
        return createday;
    }

    public void setCreateday(Timestamp createday) {
        this.createday = createday;
    }

    public List<Chuong> getListChuong() {
        return listChuong;
    }

    public void setListChuong(List<Chuong> listChuong) {
        this.listChuong = listChuong;
    }

    public Integer getIdmonhoc() {
        return idmonhoc;
    }

    public void setIdmonhoc(Integer idmonhoc) {
        this.idmonhoc = idmonhoc;
    }

    public String getNameMonHoc() {
        return nameMonHoc;
    }

    public void setNameMonHoc(String nameMonHoc) {
        this.nameMonHoc = nameMonHoc;
    }
}
