package my.com.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity(name = "profile")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer profileid;
    private String name;
    private String image;
    private String email;
    private Timestamp createday;
    private Timestamp ngaysinh;

    @OneToOne
    @JoinColumn(name = "userid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private User user;


    public Profile() {

    }

    public Profile(Integer profileid, String name, String image, String email, Timestamp createday, Timestamp ngaysinh,User user) {
        this.profileid = profileid;
        this.name = name;
        this.image = image;
        this.email = email;
        this.createday = createday;
        this.ngaysinh = ngaysinh;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getProfileid() {
        return profileid;
    }

    public void setProfileid(Integer profileid) {
        this.profileid = profileid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getCreateday() {
        return createday;
    }

    public void setCreateday(Timestamp createday) {
        this.createday = createday;
    }

    public Timestamp getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Timestamp ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
}
