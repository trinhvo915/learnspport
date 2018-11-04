package my.com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="hachhang")
public class khachhang {
	@Id
	public Integer id;
	public String tenKH;
	public String diaChi;
	public double luong;
	public khachhang() {
		
	}
	public khachhang(Integer id, String name, String diachi, double luong) {
		this.id = id;
		this.tenKH = name;
		this.diaChi = diachi;
		this.luong = luong;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return tenKH;
	}
	public void setName(String name) {
		this.tenKH = name;
	}
	public String getDiachi() {
		return diaChi;
	}
	public void setDiachi(String diachi) {
		this.diaChi = diachi;
	}
	public double getLuong() {
		return luong;
	}
	public void setLuong(double luong) {
		this.luong = luong;
	}
	
	@Override
	public String toString() {
		
		return "Id : "+id+" - Ten : "+this.tenKH+" - Dia Chi : "+this.diaChi+" - Luong : "+this.luong;
	}
}
