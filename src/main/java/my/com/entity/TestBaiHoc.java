package my.com.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

@Entity(name = "testbaihoc")
public class TestBaiHoc implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_baitest;
    private double diem;
    private Timestamp createday;

    @ManyToOne
    @JoinColumn(name = "idbaihoc")
    private BaiHoc baiHoc;

    @OneToMany(mappedBy = "testBaiHoc")
    private List<CauHoiBaiHoc> listCauHoiBaiHoc;


    public TestBaiHoc() {
    }

    public TestBaiHoc(double diem, Timestamp createday, BaiHoc baiHoc) {
        this.diem = diem;
        this.createday = createday;
        this.baiHoc = baiHoc;
    }

    public List<CauHoiBaiHoc> getListCauHoiBaiHoc() {
        return listCauHoiBaiHoc;
    }

    public void setListCauHoiBaiHoc(List<CauHoiBaiHoc> listCauHoiBaiHoc) {
        this.listCauHoiBaiHoc = listCauHoiBaiHoc;
    }

    public Integer getId_baitest() {
        return id_baitest;
    }

    public void setId_baitest(Integer id_baitest) {
        this.id_baitest = id_baitest;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public Timestamp getCreateday() {
        return createday;
    }

    public void setCreateday(Timestamp createday) {
        this.createday = createday;
    }

    public BaiHoc getBaiHoc() {
        return baiHoc;
    }

    public void setBaiHoc(BaiHoc baiHoc) {
        this.baiHoc = baiHoc;
    }
}
