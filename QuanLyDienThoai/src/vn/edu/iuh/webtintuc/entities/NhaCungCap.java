package vn.edu.iuh.webtintuc.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: NhaCungCap
 *
 */
@Entity

public class NhaCungCap implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer maNCC;
	private String tenNhaCC;
	private String diaChi;
	private String soDienThoai;
	private static final long serialVersionUID = 1L;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "nhacungcap")
	private List<DienThoai> dsDienThoai;
	
	

	public NhaCungCap() {
		super();
	}   
	public Integer getMaNCC() {
		return this.maNCC;
	}

	public void setMaNCC(Integer maNCC) {
		this.maNCC = maNCC;
	}   
	public String getTenNhaCC() {
		return this.tenNhaCC;
	}

	public void setTenNhaCC(String tenNhaCC) {
		this.tenNhaCC = tenNhaCC;
	}   
	public String getDiaChi() {
		return this.diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}   
	public String getSoDienThoai() {
		return this.soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public List<DienThoai> getDsDienThoai() {
		return dsDienThoai;
	}
	public void setDsDienThoai(List<DienThoai> dsDienThoai) {
		this.dsDienThoai = dsDienThoai;
	}
	public NhaCungCap(String tenNhaCC, String diaChi, String soDienThoai) {
		super();
		this.tenNhaCC = tenNhaCC;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
	}
   
}
