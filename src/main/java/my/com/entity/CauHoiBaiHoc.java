package my.com.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Entity(name = "cauhoi")
public class CauHoiBaiHoc implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_cauhoi;
    private String cauhoi;
    private String dapan_A;
    private String dapan_B;
    private String dapan_C;
    private String dapan_D;
    private String dapandung;
    private String image;
    private Date createday;

    @ManyToOne
    @JoinColumn(name = "id_baitest")
    private TestBaiHoc testBaiHoc;

    public CauHoiBaiHoc() {
    }

    public CauHoiBaiHoc(Integer id_cauhoi, String cauhoi, String dapan_A, String dapan_B, String dapan_C, String dapan_D, String dapandung, String image, Date createday, TestBaiHoc testBaiHoc) {
        this.id_cauhoi = id_cauhoi;
        this.cauhoi = cauhoi;
        this.dapan_A = dapan_A;
        this.dapan_B = dapan_B;
        this.dapan_C = dapan_C;
        this.dapan_D = dapan_D;
        this.dapandung = dapandung;
        this.image = image;
        this.createday = createday;
        this.testBaiHoc = testBaiHoc;
    }

    public Integer getId_cauhoi() {
        return id_cauhoi;
    }

    public void setId_cauhoi(Integer id_cauhoi) {
        this.id_cauhoi = id_cauhoi;
    }

    public String getCauhoi() {
        return cauhoi;
    }

    public void setCauhoi(String cauhoi) {
        this.cauhoi = cauhoi;
    }

    public String getDapan_A() {
        return dapan_A;
    }

    public void setDapan_A(String dapan_A) {
        this.dapan_A = dapan_A;
    }

    public String getDapan_B() {
        return dapan_B;
    }

    public void setDapan_B(String dapan_B) {
        this.dapan_B = dapan_B;
    }

    public String getDapan_C() {
        return dapan_C;
    }

    public void setDapan_C(String dapan_C) {
        this.dapan_C = dapan_C;
    }

    public String getDapan_D() {
        return dapan_D;
    }

    public void setDapan_D(String dapan_D) {
        this.dapan_D = dapan_D;
    }

    public String getDapandung() {
        return dapandung;
    }

    public void setDapandung(String dapandung) {
        this.dapandung = dapandung;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getCreateday() {
        return createday;
    }

    public void setCreateday(Date createday) {
        this.createday = createday;
    }

    public TestBaiHoc getTestBaiHoc() {
        return testBaiHoc;
    }

    public void setTestBaiHoc(TestBaiHoc testBaiHoc) {
        this.testBaiHoc = testBaiHoc;
    }
}
