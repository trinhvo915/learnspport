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

	@OneToOne
	@JoinColumn(name = "profileid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Profile profile;

	public User() {
	}

	public User(Integer userid, String username, String password, Role role) {
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.role = role;
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

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
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
