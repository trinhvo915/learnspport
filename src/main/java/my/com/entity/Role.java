package my.com.entity;

import java.util.ArrayList;
import java.util.List;

public class Role {
	private Integer idRole;
	private String nameRole;
	List<Person> listUser =new ArrayList<Person>();
	
	
	public Integer getIdRole() {
		return idRole;
	}
	public void setIdRole(Integer idRole) {
		this.idRole = idRole;
	}
	public String getNameRole() {
		return nameRole;
	}
	public void setNameRole(String nameRole) {
		this.nameRole = nameRole;
	}
	public List<Person> getListUser() {
		return listUser;
	}
	public void setListUser(List<Person> listUser) {
		this.listUser = listUser;
	}  
	
	
}
