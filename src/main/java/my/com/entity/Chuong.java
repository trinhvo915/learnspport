package my.com.entity;

import javax.persistence.*;

@Entity(name = "chuong")
public class Chuong {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idchuong;
    private  String nameChuong;

    @ManyToOne
    @JoinColumn(name = "idmonhoc")
    private MonHoc monHoc;

    public Chuong() {
    }

    public Chuong(String nameChuong, MonHoc monHoc) {
        this.nameChuong = nameChuong;
        this.monHoc = monHoc;
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
