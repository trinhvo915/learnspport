package my.com.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity(name = "testdh")
public class DaiHocTest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_baitestdh;
    private double diem;
    private Timestamp createday;

    @ManyToOne
    @JoinColumn(name = "userid")
    private User user;

    @ManyToOne
    @JoinColumn(name = "idmonhoc")
    private MonHoc monHoc;

    @OneToMany(mappedBy = "daiHocTest")
    private List<CauHoiDaiHoc>  listdaiHocTest;

    @OneToMany(mappedBy = "daiHocTest")
    private  List<RankUser> listRankUser;

    public DaiHocTest() {
    }

    public DaiHocTest(double diem, Timestamp createday, User user, MonHoc monHoc, List<CauHoiDaiHoc> listdaiHocTest, List<RankUser> listRankUser) {
        this.diem = diem;
        this.createday = createday;
        this.user = user;
        this.monHoc = monHoc;
        this.listdaiHocTest = listdaiHocTest;
        this.listRankUser = listRankUser;
    }

    public List<CauHoiDaiHoc> getListdaiHocTest() {
        return listdaiHocTest;
    }

    public void setListdaiHocTest(List<CauHoiDaiHoc> listdaiHocTest) {
        this.listdaiHocTest = listdaiHocTest;
    }

    public List<RankUser> getListRankUser() {
        return listRankUser;
    }

    public void setListRankUser(List<RankUser> listRankUser) {
        this.listRankUser = listRankUser;
    }

    public Integer getId_baitestdh() {
        return id_baitestdh;
    }

    public void setId_baitestdh(Integer id_baitestdh) {
        this.id_baitestdh = id_baitestdh;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public MonHoc getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(MonHoc monHoc) {
        this.monHoc = monHoc;
    }
}
