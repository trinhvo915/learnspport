package my.com.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity(name = "comment")
public class Comment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer commentid;
    private String content;
    private Timestamp createday;

    @ManyToOne()
    @JoinColumn(name = "userid")
    private User user;

    @ManyToOne
    @JoinColumn(name = "idbaihoc")
    private BaiHoc baiHoc;

    public Comment() {
    }

    public Comment(Integer commentid, String content, Timestamp createday, User user, BaiHoc baiHoc) {
        this.commentid = commentid;
        this.content = content;
        this.createday = createday;
        this.user = user;
        this.baiHoc = baiHoc;
    }

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public BaiHoc getBaiHoc() {
        return baiHoc;
    }

    public void setBaiHoc(BaiHoc baiHoc) {
        this.baiHoc = baiHoc;
    }
}
