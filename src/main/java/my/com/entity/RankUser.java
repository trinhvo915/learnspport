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


}
