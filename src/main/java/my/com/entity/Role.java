package my.com.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
@Entity(name = "role")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer roleid;
	private String username;
	private Timestamp createday;

	@OneToMany(mappedBy = "role")
	private List<User> userList;


	public Role() {
	}
	public Role(Integer roleid, String username) {

		this.roleid = roleid;
		this.username = username;
	}

	public Timestamp getCreateday() {
		return createday;
	}

	public void setCreateday(Timestamp createday) {
		this.createday = createday;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public Integer getRoleid() {
		return roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
