package vn.edu.iuh.webphim.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Category
 *
 */
@Entity

public class Category implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer maTheLoai;
	private String tenTheLoai;
	private String moTa;
	private static final long serialVersionUID = 1L;

	@OneToMany(fetch = FetchType.EAGER,mappedBy = "theloai")
	private List<Film> dsfilm;
	public Category() {
		super();
	}   
	public Integer getMaTheLoai() {
		return this.maTheLoai;
	}

	public void setMaTheLoai(Integer maTheLoai) {
		this.maTheLoai = maTheLoai;
	}   
	public String getTenTheLoai() {
		return this.tenTheLoai;
	}

	public void setTenTheLoai(String tenTheLoai) {
		this.tenTheLoai = tenTheLoai;
	}   
	public String getMoTa() {
		return this.moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public List<Film> getDsfilm() {
		return dsfilm;
	}
	public void setDsfilm(List<Film> dsfilm) {
		this.dsfilm = dsfilm;
	}
	public Category(String tenTheLoai, String moTa) {
		super();
		this.tenTheLoai = tenTheLoai;
		this.moTa = moTa;
	}
   
}
