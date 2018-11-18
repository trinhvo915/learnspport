package my.com.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity(name = "monhoc")
public class MonHoc implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idmonhoc;
    private String nameMonHoc;
    private Date createday;

    @OneToMany(mappedBy = "monHoc")
    private List<Chuong> listChuong;

    @OneToMany(mappedBy = "monHoc")
    private List<DaiHocTest> listDaiHocTest;
    public MonHoc() {

    }
    public MonHoc(Integer idmonhoc ){
        this.idmonhoc = idmonhoc;
    }
    public MonHoc(String nameMonHoc) {
        this.nameMonHoc = nameMonHoc;
    }

    public MonHoc(Integer idmonhoc, String nameMonHoc,Date createday) {
        this.idmonhoc = idmonhoc;
        this.nameMonHoc = nameMonHoc;
        this.createday = createday;
    }

    public MonHoc(String nameMonHoc, Date createday, List<Chuong> listChuong) {
        this.nameMonHoc = nameMonHoc;
        this.createday = createday;
        this.listChuong = listChuong;

    }

    public MonHoc(String nameMonHoc, Date createday) {
        this.nameMonHoc = nameMonHoc;
        this.createday = createday;
    }

    public MonHoc(String nameMonHoc, Date createday, List<Chuong> listChuong, List<DaiHocTest> listDaiHocTest) {
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

    public Date getCreateday() {
        return createday;
    }

    public void setCreateday(Date createday) {
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
