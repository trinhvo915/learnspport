package my.com.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

@Entity(name = "chuong")
public class Chuong implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idchuong;
    private  String nameChuong;
    private Timestamp createday;

    @ManyToOne
    @JoinColumn(name = "idmonhoc")
    private MonHoc monHoc;

    @OneToMany(mappedBy = "chuong")
    private List<BaiHoc> listBaiHoc;

    public Chuong() {
    }

    public Chuong(String nameChuong, MonHoc monHoc) {
        this.nameChuong = nameChuong;
        this.monHoc = monHoc;
    }

    public List<BaiHoc> getListBaiHoc() {
        return listBaiHoc;
    }

    public void setListBaiHoc(List<BaiHoc> listBaiHoc) {
        this.listBaiHoc = listBaiHoc;
    }

    public Timestamp getCreateday() {
        return createday;
    }

    public void setCreateday(Timestamp createday) {
        this.createday = createday;
    }

    public Integer getIdchuong() {
        return idchuong;
    }

    public void setIdchuong(Integer idchuong) {
        this.idchuong = idchuong;
    }

    public String getNameChuong() {
        return nameChuong;
    }

    public void setNameChuong(String nameChuong) {
        this.nameChuong = nameChuong;
    }

    public MonHoc getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(MonHoc monHoc) {
        this.monHoc = monHoc;
    }
}
