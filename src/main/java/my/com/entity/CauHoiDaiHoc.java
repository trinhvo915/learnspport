package my.com.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity(name = "cauhoidh")
public class CauHoiDaiHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_cauhoiDH;
    private String cauhoi;
    private String dapan_A;
    private String dapan_B;
    private String dapan_C;
    private String dapan_D;
    private String dapandung;
    private String image;
    private Timestamp createday;

    @ManyToOne
    @JoinColumn(name = "id_baitestdn")
    private DaiHocTest daiHocTest;

    public CauHoiDaiHoc() {
    }

    public CauHoiDaiHoc(String cauhoi, String dapan_A, String dapan_B, String dapan_C, String dapan_D, String dapandung, String image, Timestamp createday, TestBaiHoc testBaiHoc) {
        this.cauhoi = cauhoi;
        this.dapan_A = dapan_A;
        this.dapan_B = dapan_B;
        this.dapan_C = dapan_C;
        this.dapan_D = dapan_D;
        this.dapandung = dapandung;
        this.image = image;
        this.createday = createday;
    }

    public Integer getId_cauhoiDH() {
        return id_cauhoiDH;
    }

    public void setId_cauhoiDH(Integer id_cauhoiDH) {
        this.id_cauhoiDH = id_cauhoiDH;
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

    public Timestamp getCreateday() {
        return createday;
    }

    public void setCreateday(Timestamp createday) {
        this.createday = createday;
    }


}
