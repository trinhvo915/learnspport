package my.com.entity;

import javax.persistence.*;
import java.util.List;

@Entity(name = "monhoc")
public class MonHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idmonhoc;
    private String nameMonHoc;

    @OneToMany(mappedBy = "monHoc")
    private List<Chuong> listChuong;

    public MonHoc() {
    }

    public MonHoc(Integer idmonhoc, String nameMonHoc) {
        this.idmonhoc = idmonhoc;
        this.nameMonHoc = nameMonHoc;
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
