package my.com.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity(name = "rank_user")
public class RankUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_Rank;
    private Timestamp createday;
    private Integer indexRank;

    @ManyToOne
    @JoinColumn(name = "id_baitestdh")
    private DaiHocTest daiHocTest;

    public RankUser() {
    }

    public RankUser(Timestamp createday, Integer indexRank, DaiHocTest daiHocTest) {
        this.createday = createday;
        this.indexRank = indexRank;
        this.daiHocTest = daiHocTest;
    }

    public Integer getId_Rank() {
        return id_Rank;
    }

    public void setId_Rank(Integer id_Rank) {
        this.id_Rank = id_Rank;
    }

    public Timestamp getCreateday() {
        return createday;
    }

    public void setCreateday(Timestamp createday) {
        this.createday = createday;
    }

    public Integer getIndexRank() {
        return indexRank;
    }

    public void setIndexRank(Integer indexRank) {
        this.indexRank = indexRank;
    }

    public DaiHocTest getDaiHocTest() {
        return daiHocTest;
    }

    public void setDaiHocTest(DaiHocTest daiHocTest) {
        this.daiHocTest = daiHocTest;
    }
}
