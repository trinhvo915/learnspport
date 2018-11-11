package my.com.entity;

import javax.persistence.*;
import java.util.List;
@Entity(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userid;
	private String username;
	private String password;

	@ManyToOne
	@JoinColumn(name = "roleid")
	private Role role;

	@OneToOne(mappedBy = "user")
	private Profile profile;

	@OneToMany(mappedBy = "user")
	private List<Comment> listComment;

	@OneToMany(mappedBy = "user")
	private List<DaiHocTest> listDaiHocTest;
	public User() {
	}

	public User(Integer userid, String username,
                String password, Profile profile) {
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.profile = profile;
	}

	public User(Integer userid, String username, String password) {
		this.userid = userid;
		this.username = username;
		this.password = password;
	}
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

    public User(String username, String password,
                Role role, Profile profile,
                List<Comment> listComment) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.profile = profile;
        this.listComment = listComment;
    }

	public User(String username, String password, Role role, Profile profile, List<Comment> listComment, List<DaiHocTest> listDaiHocTest) {
		this.username = username;
		this.password = password;
		this.role = role;
		this.profile = profile;
		this.listComment = listComment;
		this.listDaiHocTest = listDaiHocTest;
	}

	public List<DaiHocTest> getListDaiHocTest() {
		return listDaiHocTest;
	}

	public void setListDaiHocTest(List<DaiHocTest> listDaiHocTest) {
		this.listDaiHocTest = listDaiHocTest;
	}

	public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public List<Comment> getListComment() {
        return listComment;
    }

    public void setListComment(List<Comment> listComment) {
        this.listComment = listComment;
    }

    public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return this.userid + this.username + this.password ;
	}
}
