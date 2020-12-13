package vn.edu.iuh.webtintuc.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: DienThoai
 *
 */
@Entity

public class DienThoai implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer maDT;
	private String tenDienThoai;
	private String namSanXuat;
	private String cauHinh;
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "maNCC")
	private NhaCungCap nhacungcap;
	
	public DienThoai() {
		super();
	}   
	public Integer getMaDT() {
		return this.maDT;
	}

	public void setMaDT(Integer maDT) {
		this.maDT = maDT;
	}   
	public String getTenDienThoai() {
		return this.tenDienThoai;
	}

	public void setTenDienThoai(String tenDienThoai) {
		this.tenDienThoai = tenDienThoai;
	}   
	public String getNamSanXuat() {
		return this.namSanXuat;
	}

	public void setNamSanXuat(String namSanXuat) {
		this.namSanXuat = namSanXuat;
	}   
	public String getCauHinh() {
		return this.cauHinh;
	}

	public void setCauHinh(String cauHinh) {
		this.cauHinh = cauHinh;
	}
	public NhaCungCap getNhacungcap() {
		return nhacungcap;
	}
	public void setNhacungcap(NhaCungCap nhacungcap) {
		this.nhacungcap = nhacungcap;
	}
	public DienThoai(String tenDienThoai, String namSanXuat, String cauHinh, NhaCungCap nhacungcap) {
		super();
		this.tenDienThoai = tenDienThoai;
		this.namSanXuat = namSanXuat;
		this.cauHinh = cauHinh;
		this.nhacungcap = nhacungcap;
	}
	public DienThoai(String tenDienThoai, String namSanXuat, String cauHinh) {
		super();
		this.tenDienThoai = tenDienThoai;
		this.namSanXuat = namSanXuat;
		this.cauHinh = cauHinh;
	}
   
}
